


import java.util.Scanner;
public class Principal{

  
    
    
    public static void main(String [] args){
        System.out.println("BIENVENIDO AL CENTRO DE ADOPCION" + "\n");
        //hago la instancia del michi
        Michi gato = new Michi("Bolita", "De la calle", "Croquetas bb", 1, 7);

        //lo muestro
        gato.mostrarmichi();

         //tarea hacer los siguientes animalitos
        /*
         * perros
         * hamster
         * conejos
         * cuyos
         * urones
         * otro
         * 
         * el programa debera de tener un menu donde se muestren los datos de la mascota
         * a elegir
         */
        Perros perro = new Perros("bob", "De la calle", "dogchauu", 5);

        perro.mostrarPerros();

        Hamster hamster = new Hamster("Nuguet", "Domestico", "Semillas", 9);
        
        hamster.mostrarHamster();

        Conejo conejo = new Conejo("Copo de nieve", "Arlequin", "Zanahorias", 1 );

        conejo.mostrarCojeno();

        Cuyos cuyo = new Cuyos("Pedrou", "Peruano", "Mezcla de verduras", 4);

        cuyo.mostrarCuyo();

        Hurones huron  = new Hurones("Panfilo", "Estandar", "Carne" , 9);
        huron.mostrarUrones();

        Pez pez = new Pez("Nemo", "Pez payaso","Comida para peces ", 1 );
        pez.mostrarPez();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecciona una opcion para obtener mas informacion del animal que deseas adoptar");
            System.out.println("1- Michi");
            System.out.println("2- Perro");
            System.out.println("3- Hamster");
            System.out.println("4- Conejo");
            System.out.println("5- Cuyos");
            System.out.println("6- Hurones");
            System.out.println("7- Pez");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gato.mostrarmichi();
                    break;
                case 2:
                    perro.mostrarPerros();
                    break;
                case 3:
                    hamster.mostrarHamster();
                    break;
                case 4:
                    conejo.mostrarCojeno();
                    break;
                case 5:
                    cuyo.mostrarCuyo();
                    break;
                case 6:
                    huron.mostrarUrones();
                    break;
                case 7:
                    pez.mostrarPez();
                    break;
                case 0:
                    
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción válida.");
                    break;
            }
    
        }
 
    }   
}