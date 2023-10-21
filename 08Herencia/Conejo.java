public class Conejo extends Animal {

    public Conejo() {

    }

    public Conejo(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
    }

    public void mostrarCojeno(){
        System.out.println("El nommbre del conejo es: " + getNombre() + "\n"
        + "La raza del conejo es : " + getRaza() + "\n"
        + "Se alimenta de : " + getTipo_Alimento() + "\n"
        + "El conejo tiene la edad de : " + getEdad() + "\n" );
        
    }
    
}
