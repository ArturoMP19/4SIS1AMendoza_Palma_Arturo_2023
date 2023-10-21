public class Hamster extends Animal {

    public Hamster(){

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad){

        super(nombre, raza, tipo_alimento, edad);
    }
    public void mostrarHamster(){
        System.out.println("El nommbre del hamster es: " + getNombre() + "\n"
        + "La raza del hamster es : " + getRaza() + "\n"
        + "Se alimenta de : " + getTipo_Alimento() + "\n"
        + "El hamster tiene la edad de : " + getEdad() + " meses" + "\n");
        
    }
}
