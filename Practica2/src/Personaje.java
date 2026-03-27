public class Personaje {
    private String nombre;
    private String codigo;
    private String escoba;
    private String casa;
    private int puntos;

    public Personaje(String nombre, String codigo, String escoba, String casa) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.escoba = escoba;
        this.casa = casa;
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEscoba() {
        return escoba;
    }

    public String getCasa() {
        return casa;
    }

    public int getPuntos() {
        return puntos;
    }

    public void agregarPuntos(int puntos){
        this.puntos += puntos;
    }
}