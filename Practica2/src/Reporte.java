public class Reporte {
    private String jugador;
    private String jugadorPC;
    private String escobaJugador;
    private String escobaPC;
    private int puntosJugador;
    private int puntosPC;
    private String ganador;

    public Reporte(String jugador, String jugadorPC, String escobaJugador, String escobaPC, int puntosJugador, int puntosPC, String ganador) {
        this.jugador = jugador;
        this.jugadorPC = jugadorPC;
        this.escobaJugador = escobaJugador;
        this.escobaPC = escobaPC;
        this.puntosJugador = puntosJugador;
        this.puntosPC = puntosPC;
        this.ganador = ganador;
    }

    public String mostrarReporte(){
        return "Reporte del Juego:\n" +
                "Jugador: " + jugador + "\n" +
                "escoba del Jugador: " + escobaJugador + "\n" +
                "puntos jugador: " + puntosJugador + "\n" +
                "Jugador PC: " + jugadorPC + "\n" +
                "escoba del PC: " + escobaPC + "\n" +
                "puntos PC: " + puntosPC + "\n" +
                "Ganador: " + ganador;
    }
}
