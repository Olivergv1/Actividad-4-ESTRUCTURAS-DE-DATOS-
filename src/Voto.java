public class Voto {
    private int idVoto;
    private ActaVotacion acta;
    
    // constructor de la clase voto
    public Voto(int idVoto){
        this.idVoto = idVoto;
    }

    // metodo para obtener el ID del voto
    public int getIdVoto() {
        return idVoto;
    }
    
    // metodo para obtener el objeto ActaVotacion asociado al bvoto
    public ActaVotacion getActa() {
        return acta;
    }
    
    //metodo para establecer el objeto ActaVotacion asociado al voto
    public void setActa(ActaVotacion acta) {
        this.acta = acta;
    }
}





