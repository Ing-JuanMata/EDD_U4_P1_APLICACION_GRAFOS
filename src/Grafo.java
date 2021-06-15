/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ING-JUANMATA
 */
public class Grafo {

    NodoVertice vertice;

    public Grafo() {
        vertice = null;
    }

    public boolean insertarVertice(char dato) {
        if (vertice == null) {
            vertice = new NodoVertice(dato);
            return true;
        }

        if (buscarVertice(dato) != null) {
            return false;
        }

        NodoVertice nuevo = new NodoVertice(dato);
        if (nuevo == null) {
            return false;
        }

        // el nuevo se enlaza al final de la lista de VERTICES
        irUltimo();
        vertice.sig = nuevo;
        nuevo.ant = vertice;
        return true;
    }

    private void irUltimo() {
        while (vertice.sig != null) {
            vertice = vertice.sig;
        }
    }

    private void irPrimero() {
        while (vertice.ant != null) {
            vertice = vertice.ant;
        }
    }

    public int contarVertices() {
        if (vertice == null) {
            return 0;
        }
        int i = 0;
        irPrimero();
        NodoVertice aux = vertice;
        while (aux != null) {
            i++;
            aux = aux.sig;
        }

        return i;
    }

    private NodoVertice buscarVertice(char dato) {
        if (vertice == null) {
            return null;
        }

        irPrimero();
        for (NodoVertice buscar = vertice; buscar != null; buscar = buscar.sig) {
            if (buscar.dato == dato) {
                return buscar;
            }
        }

        return null;
    }

    public boolean insertarAristas(char origen, char destino) {
        NodoVertice nodoOrigen = buscarVertice(origen);
        NodoVertice nodoDestino = buscarVertice(destino);

        if (nodoDestino == null || nodoOrigen == null) {
            return false;
        }

        return nodoOrigen.insertarArista(nodoDestino);
    }

    public boolean eliminarArista(char origen, char destino) {
        NodoVertice nodoOrigen = buscarVertice(origen);
        NodoVertice nodoDestino = buscarVertice(destino);
        if (nodoDestino == null || nodoOrigen == null) {
            return false;
        }

        return nodoOrigen.eliminarArista(nodoDestino);
    }

    public boolean unSoloVertice() {
        return vertice.ant == null && vertice.sig == null;
    }

    public boolean eliminarVertice(char dato) {
        if (vertice == null) {
            return false;
        }

        NodoVertice temp = buscarVertice(dato);
        if (temp == null) {
            return false;
        }

        if (temp.arista != null) {
            return false;
        }

        quitaAristasDeOtrosVertices(temp);

        if (temp == vertice) {
            if (unSoloVertice()) {
                vertice = null;
            } else {
                vertice = temp.sig;
                temp.sig.ant = temp.sig = null;
            }

            return true;
        }

        if (temp.sig == null) {
            temp.ant.sig = temp.ant = null;
            return true;
        }

        temp.ant.sig = temp.sig;
        temp.sig.ant = temp.ant;
        temp.sig = temp.ant = null;
        return true;
    }

    private void quitaAristasDeOtrosVertices(NodoVertice nodoEliminar) {
        irPrimero();
        for (NodoVertice buscar = vertice; buscar != null; buscar = buscar.sig) {
            buscar.eliminarArista(nodoEliminar);
        }
    }

    public boolean[][] matrizAdyacencia() {
        if (vertice == null) {
            return null;
        }
        int v = contarVertices();
        int j;
        boolean matriz[][] = new boolean[v][v];
        for (int i = 0; i < v; i++) {
            for (j = 0; j < v; j++) {
                matriz[i][j] = false;
            }
        }
        for (int i = 0; i < v; i++) {
            j = 0;
            while (i != j) {
                j++;
                vertice = vertice.sig;
            }
            NodoArista aux = vertice.arista;
            
            irPrimero();
            while (aux != null) {
                j = 0;
                while (aux.direccion != vertice) {
                    vertice = vertice.sig;
                    j++;
                }
                matriz[i][j] = true;
                aux = aux.abajo;
                irPrimero();
            }
        }
        return matriz;
    }

    public String listaAdyacencia(char dato) {
        return buscarVertice(dato).toString();
    }

    public String validar(char[] camino) {
        String res = "CAMINO NO VALIDO";
        if (camino.length == 1) {
            return buscarVertice(camino[0]) == null ? res : "CAMINO VALIDO";
        }
        for (int i = 0; i < camino.length - 1; i++) {
            if (buscarVertice(camino[i]).buscarArista(buscarVertice(camino[i + 1])) != null) {
                res = "CAMINO VALIDO";
            }
        }
        return res;
    }
}
