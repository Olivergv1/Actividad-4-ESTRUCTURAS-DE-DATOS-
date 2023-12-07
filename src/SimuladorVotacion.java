public class SimuladorVotacion {

    public static void main(String[] args){
        // primero se crean las listas doblemente enlazadas para cada partido
        ListaDobleEnlazada listaPartidoA = new ListaDobleEnlazada();
        ListaDobleEnlazada listaPartidoB = new ListaDobleEnlazada();
        
        // se crean las actas de votacion
        ActaVotacion acta1 = new ActaVotacion(5, "Revolucion ciudadana", "Presidente del ecuador");
        ActaVotacion acta2 = new ActaVotacion(4, "Alvarito Novoa", "Presidente del ecuador");
        
        // se crean n cantidad de votos
        Voto voto1 = new Voto(1);
        Voto voto2 = new Voto(2);
        Voto voto3 = new Voto(3);
        Voto voto4 = new Voto(4);
        Voto voto5 = new Voto(5);
        Voto voto6 = new Voto(6);
        Voto voto7 = new Voto(7);
        Voto voto8 = new Voto(8);
        Voto voto9 = new Voto(9);

        
        // se agregan los votos individual mente al partido 1
        listaPartidoA.insertarNodo(voto1, acta1);
        listaPartidoA.insertarNodo(voto2, acta1);
        listaPartidoA.insertarNodo(voto3, acta1);

        // se agregan los votos individual mente al partido 2
        
        listaPartidoB.insertarNodo(voto4, acta2);
        listaPartidoB.insertarNodo(voto5, acta2);
        listaPartidoB.insertarNodo(voto6, acta2);
        listaPartidoB.insertarNodo(voto7, acta2);
        listaPartidoB.insertarNodo(voto8, acta2);
        listaPartidoB.insertarNodo(voto9, acta2);

  
        // mostrar resultado de la votación
        System.out.println("Votos del Partido A (Revolucion ciudadana) : " + listaPartidoA.obtenerTotalVotos());
        System.out.println("Votos del Partido B (Alvarito Novoa): " + listaPartidoB.obtenerTotalVotos());
        System.out.println("-----------------------------------------");
        
        // mostrar el contenido de las listas del partido A
        System.out.println("Contenido de la lista del partido A:");
        listaPartidoA.mostrarLista();
        System.out.println("Informacion del Partido A:");
        mostrarInformacionActa(acta1);
        System.out.println("Votos a favor del Partido A: " + listaPartidoA.obtenerTotalVotos());
        System.out.println("------------------------------");
        
        // mostrar el contenido de las listas del partido B

        System.out.println("Contenido de la lista del partido B:");
        listaPartidoB.mostrarLista();
        System.out.println("Informacion del Partido B:");
        mostrarInformacionActa(acta2);
        System.out.println("Votos a favor del Partido B: " + listaPartidoB.obtenerTotalVotos());
        System.out.println("------------------------------");          // los separadores ayudan a comprender mejor el resultado final

        // verificamos si las listas estan vacias
        System.out.println("La lista del partido A esta vacia? " + listaPartidoA.estaVacia());
        System.out.println("La lista del partido B esta vacia? " + listaPartidoB.estaVacia());
        System.out.println("------------------------------");   
        
        
        
        // determinamos el ganador ademas de mostrar con cuanta cantidad de votos gano, si es empate se muestra el mensaje respectivo
        determinarGanador(listaPartidoA, listaPartidoB);
    }
    private static void determinarGanador(ListaDobleEnlazada listaA, ListaDobleEnlazada listaB) {
        int votosA = listaA.obtenerTotalVotos();
        int votosB = listaB.obtenerTotalVotos();

        if (votosA > votosB) {
            System.out.println("El ganador y nuevo presidente del ecuuador es el Partido A de (Revolucion ciudadana) con " + votosA + " votos" );
        } else if (votosA < votosB) {
            System.out.println("El ganador y nuevo presidente del ecuuador es el Partido B de (Alvarito Novoa) " + votosB + " votos");
        } else {
            System.out.println("Empate, no hay ganador");
        }
    }

    
    // mostramos en pantalla la informacion de las actaas respectivas 
    private static void mostrarInformacionActa(ActaVotacion acta) {
        System.out.println("Numero de lista: " + acta.getNumeroLista());
        System.out.println("Nombre de agrupacion: " + acta.getNombreAgrupacion());
        System.out.println("Dignidad: " + acta.getDignidad());
    }
   
}