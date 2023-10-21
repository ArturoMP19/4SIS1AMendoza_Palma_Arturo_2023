public class Cuyos extends Animal{

    public Cuyos(){

    }

    public Cuyos(String nombre, String raza, String tipo_alimento, int edad){
        super(nombre, raza, tipo_alimento, edad);
    }

    public void mostrarCuyo(){
        System.out.println("El nommbre del cuyo es: " + getNombre() + "\n"
        + "La raza del cuyo es : " + getRaza() + "\n"
        + "Se alimenta de : " + getTipo_Alimento() + "\n"
        + "El cuyo tiene la edad de : " + getEdad() + "\n" );
        
    }
    
}
