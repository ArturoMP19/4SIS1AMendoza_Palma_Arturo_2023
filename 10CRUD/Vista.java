import java.util.*;

public class Vista {
    
    //vamos a crear nuestro menu

    public void menu(){

        Scanner entrada = new Scanner(System.in);

        //vamos a crear una instancia de perosna y del controlador
        AccionesPersona control = new AccionesPersona();

        System.out.println("Bienvenido al programa de registro de dormiditos de UTC");
        System.out.println("Elija un opcion");
        System.out.println("1. Mostrar a todos los dormiditos");
        System.out.println("2. Resgistrar un nnuevo dormidito ");
        System.out.println("3. Editar a un dormidito ");
        System.out.println("4. Despertar a un dormidito ");
        System.out.println("5. Salir");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                //mostrar a todo el resgistro de las personas
                System.out.println("mimidos");
                //es una instancia de la lista de personas
                ArrayList<Persona> listadepersonas = control.mostrarPersonas();

                //al tener la lista de personas hace falta recorreer los registros de dicha lista 
                for (Persona objeto : listadepersonas){
                    System.out.println("El id es :" + objeto.getId() + "\n" + "El nombre es: " 
                                        + objeto.getNombre() + "\n" + "La edad es: " + objeto.getEdad() + "\n");

                }
                menu();
                break;
            case 2:
                //debemos registar los datos de la perosna
                System.out.println("Ingrese el id del dormidito: ");
                int idpersona = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el nombre del domidito ");
                String nombrepersona = entrada.nextLine();
                System.out.println("Ingrese la edad del dormidito: ");
                int edadpersona = Integer.parseInt(entrada.nextLine());

                //ahora debo realizar una instancia de la persona
                Persona personaDormidita = new Persona(idpersona, nombrepersona, edadpersona);
                
                control.agregarPersona(personaDormidita);
                menu();

                break; 
            case 3:
                //primero debo de buscar a la peronsa que quiero editar por medio del id
                System.out.println("Ingresa el id del dormidito a buscar: ");
                idpersona = Integer.parseInt(entrada.nextLine());
            
                 //mando a llamar al metodo de busqueda
                Persona personabuscar = control.buscarPersona(idpersona);

                //vep la informacion
                System.out.println("La informacion del dormidito es: "
                            + "ID: " + personabuscar.getId() + "\n"
                            + "Nombre: " + personabuscar.getNombre() + "\n"
                            + "Edad" + personabuscar.getEdad() + "\n");
                //cambio los datos que desee
                System.out.println("Ingresa el nuevo domnre del dormidito");
                String nuevonombre =  entrada.nextLine();
                System.out.println("Ingresa la nnueva edad del drmidito");
                int nuevaedad = Integer.parseInt(entrada.nextLine());

                //al tener los nuevos datos debo de enviarlos 

                personabuscar.setNombre(nuevonombre);
                personabuscar.setEdad(nuevaedad);

                //ahora actualizo el registro
                control.actualizarPersona(personabuscar);
                break;
            case 4:
                System.out.println("Ingresa ael id del dormidito a despertar");
                idpersona = Integer.parseInt(entrada.nextLine());
                
                //creo la persona para eliminar
                Persona personaEliminar = control.buscarPersona(idpersona);

                //lo elimino 
                control.eliminarPersona(personaEliminar);

                System.out.println("El dormidito ya desperto");

                menu();
                break;


            default:
             System.out.println("Opcion no valida");
                break;
        }
    }
}
