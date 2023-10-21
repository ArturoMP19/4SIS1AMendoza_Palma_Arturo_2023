public class Pez extends Animal{

    public Pez(){
    
    }

    public Pez(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
    }
    public void mostrarPez(){
        System.out.println("El nommbre del pez es: " + getNombre() + "\n"
        + "La raza del pez es : " + getRaza() + "\n"
        + "Se alimenta de : " + getTipo_Alimento() + "\n"
        + "El pez tiene la edad de : " + getEdad() + "\n" );
        
    }



    
}
