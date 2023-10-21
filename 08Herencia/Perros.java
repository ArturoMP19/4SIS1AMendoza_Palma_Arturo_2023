public class Perros extends Animal{


    public Perros(){

    }

    public Perros (String nombre, String raza, String tipo_alimento, int edad){

        super(nombre, raza, tipo_alimento, edad);

    }

    public void mostrarPerros(){
        System.out.println("El nommbre del perro es: " + getNombre() + "\n"
        + "La raza del perro es : " + getRaza() + "\n"
        + "Se alimenta de : " + getTipo_Alimento() + "\n"
        + "El perro tiene la edad de  : " + getEdad() + "\n");
    }
 }