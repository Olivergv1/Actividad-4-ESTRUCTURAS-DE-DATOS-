public class ListaDobleEnlazada {
    private Nodo cabeza;
    private Nodo cola;

    public ListaDobleEnlazada() {
        this.cabeza = null;
        this.cola = null;
    }

    // metodo para obtener el total de votos de la lista
    public int obtenerTotalVotos() {
        int totalVotos = 0;
        Nodo actual = cabeza;

        while (actual != null) {
            totalVotos ++;
            actual = actual.siguiente;
        }

        return totalVotos;
    }

    // metodo para obtener el voto en la cabeza de la lista
    public Voto obtenerCabeza() {
        return cabeza != null ? cabeza.voto : null;
    }

    
    // metodo para insertar un nuevo nodo al final de la lista
    public void insertarNodo(Voto voto, ActaVotacion acta) {
        Nodo nuevoNodo = new Nodo(voto);
        
        // se establece la relacion del voto con el acta
        voto.setActa(acta);
        nuevoNodo.voto.setActa(acta);
        
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
    }

    // metodo para eliminar un nodo de la lista
    public void eliminarNodo(Voto voto) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.voto.equals(voto)) {
                if (actual.anterior != null) {
                    actual.anterior.siguiente = actual.siguiente;
                } else {
                    cabeza = actual.siguiente;
                }

                if (actual.siguiente != null) {
                    actual.siguiente.anterior = actual.anterior;
                }

                break;  // termina el bucle después de eliminar el nodo
            }

            actual = actual.siguiente;
        }
    }

    // metodo para mostrar el contenido de la lista
    public void mostrarLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println("Voto numero : " + actual.voto.getIdVoto()); 
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    
    // metodo para verificar si la lista esta vacia
    public boolean estaVacia() {
        return cabeza == null && cola == null;
    }
    
    // clase interna nodo para representar los nodos de la lista
    public class Nodo {
        public Voto voto;
        public Nodo anterior;
        public Nodo siguiente;

        public Nodo(Voto voto) {
            this.voto = voto;
            this.anterior = null;
            this.siguiente = null;
        }

        
        // metodo para obtener el acta asociada al voto
        public ActaVotacion getActa() {
            return voto.getActa();
        }
    }
    
}
