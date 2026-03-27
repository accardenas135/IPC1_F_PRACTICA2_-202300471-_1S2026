public class Corredor extends Thread {
    private   Personaje personaje;
    private int posicion;
    private int meta;

    public Corredor(Personaje personaje,  int meta) {
        this.personaje = personaje;
        this.posicion = 0;
        this.meta = meta;
    }
    @Override
    public void run(){
        while (posicion < meta){
            avanzar();
            try{
                Thread.sleep(VelocidadEscoba());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(personaje.getNombre() + "llego a la meta!!!");
    }

    private void avanzar(){
        posicion++;
        System.out.println(personaje.getNombre() + " avanza una posicion "+ posicion);

    }

    private int VelocidadEscoba(){
        switch (personaje.getEscoba()) {
            case "Nimbus 2000": return 3000;
            case "Nimbus 2001": return 2000;
            case "Saeta de Fuego": return 1000;
            default: return 3000;
        }
    }

    public Personaje getPersonaje(){
        return personaje;
    }

}
