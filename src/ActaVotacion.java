import java.util.ArrayList;
import java.util.List;

public class ActaVotacion {
    private int numeroLista;
    private String nombreAgrupacion;
    private String dignidad;
    private ListaDobleEnlazada listaVotos;
    private List<Voto> votos;

    public ActaVotacion(int numeroLista, String nombreAgrupacion, String dignidad) {
        this.numeroLista = numeroLista;
        this.nombreAgrupacion = nombreAgrupacion;
        this.dignidad = dignidad;
        this.listaVotos = new ListaDobleEnlazada();
    }
    // metodo para agregar votos a la lista
    public void agregarVoto(Voto voto) {
        votos.add(voto);
    }
    // metodo para eliminar votos de la lista
    public void eliminarVoto(Voto voto) {
        votos.remove(voto);
    }
    // metodo que devuelve la cantidad de votos almacenados en al lista de votos
    public int obtenerVotos() {
        return listaVotos.obtenerTotalVotos();
    }

    // Getter para obtener el numero de lista
    public int getNumeroLista() {
        return numeroLista;
    }
    
    // Getter para obtener el nombre de la agrupacion 
    public String getNombreAgrupacion() {
        return nombreAgrupacion;
    }
    
    // Getter para obtener la dignidad
    public String getDignidad() {
        return dignidad;
    }

}
    


