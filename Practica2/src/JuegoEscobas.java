import java.util.Scanner;

public class JuegoEscobas {
    private Personaje[] personajes=new Personaje[10];
    private int contadorPersonaje=0;

    private Reporte[] reportes=new Reporte[10];
    private int contadorReporte=0;

    private Scanner sc=new Scanner(System.in);

    public void menuPrincipal(){
        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Jugar");
            System.out.println("2. Crear Personaje");
            System.out.println("3. Ver Reporte de Partidas");
            System.out.println("4. Ver Top Puntajes");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: jugar(); break;
                case 2: crearPersonaje(); break;
                case 3: verReportes(); break;
                case 4: verTopPuntajes(); break;
                case 5: System.out.println("Saliendo del juego..."); break;
                default: System.out.println("Opción inválida.");

            }
        }   while (opcion != 5);

    }
    private void jugar(){
        if(contadorPersonaje<2){
            System.out.println("deben de haber almenos dos personajes para poder jugar");
            return;
        }
        System.out.println("seleccione su personaje");
        for(int i=0;i<personajes.length;i++){
            System.out.println((i+1) + ". " + personajes[i].getNombre()+ " ("  + personajes[i].getEscoba() + ")" );
        }
        
    }


    private void crearPersonaje(){
        if (contadorPersonaje >= personajes.length){
            System.out.println("no se pueden crear mas personajes");
            return;
        }

        System.out.println("Ingrese el codigo del personaje: ");
        String codigo = sc.nextLine();
        for (int i=0; i<personajes.length; i++){
            if  (personajes[i].getCodigo().equals(codigo)){
                System.out.println("ya existe un personaje con ese codigo");
                return;
            }
        }

        System.out.println("Ingrese el nombre del personaje: ");
        String nombre = sc.nextLine();
        for  (int i=0; i<personajes.length; i++){
            if  (personajes[i].getNombre().equalsIgnoreCase(nombre)){
                System.out.println("ya existe un personaje con ese nombre");
                return;
            }
        }

        System.out.println("seleccione la casa del personaje: ");
        System.out.println("1. Gyffindor ");
        System.out.println("2. Slytherin ");
        System.out.println("3. Ravenclaw ");
        int elegirCasa = sc.nextInt();

        String casa;
        switch (elegirCasa){
            case 1: casa = "Gryffindor";
            break;
            case 2: casa = "Slytherin";
            break;
            case 3: casa = "Ravenclaw";
            break;
            default: System.out.println("elige una opcion");
            return;
        }

        System.out.println("Seleccione modelo de escoba:");
        System.out.println("1. Nimbus 2000 (velocidad media)");
        System.out.println("2. Nimbus 2001 (velocidad alta)");
        System.out.println("3. Saeta de Fuego (velocidad muy alta)");
        int opcionEscoba = sc.nextInt();
        sc.nextLine();

        String escoba;
        switch (opcionEscoba){
            case 1: escoba = "Nimbus 2000"; 
            break;
            case 2: escoba = "Nimbus 2001";
            break;
            case 3: escoba = "Saeta de Fuego";
            break;
            default: System.out.println("elige una opcion valida");
            return;
        }
        personajes[contadorPersonaje] = new Personaje(codigo, nombre, casa, escoba);
        contadorPersonaje++;
        System.out.println("El presonaje fue creado exitosamente!...");
    }
    private void verReportes(){

    }
    private void verTopPuntajes(){

    }
}
