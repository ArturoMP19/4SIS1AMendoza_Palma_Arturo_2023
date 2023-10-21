public class Hurones extends Animal{

    public Hurones(){}

    public Hurones (String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
    }
    public void mostrarUrones(){
        System.out.println("El nommbre del huron es: " + getNombre() + "\n"
        + "La raza del huron es : " + getRaza() + "\n"
        + "Se alimenta de : " + getTipo_Alimento() + "\n"
        + "El huron tiene la edad de : " + getEdad() + "\n" );
        
    }

    
}
