
//para poder aplicar la herencia a una clase, se utiliza la palabra reservada 
//extens
public class Michi extends Animal{

    //como puede heredar todas las caracteristicas de la clase padre

    private int num_vidas;

    public Michi(){

    }

    //aplico la sobrecarga
    public Michi(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        //y para poder acceder aa la clase padre utiliza la palabra reservada super
        super(nombre, raza, tipo_alimento, edad);
        this.num_vidas = num_vidas;
    }


    //get y set 
    public void setNum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }

    public int getNum_vidas(){
        return num_vidas;
    }

    public void mostrarmichi(){
        System.out.println("El nommbre del michi es: " + getNombre() + "\n"
            + "La raza del michi es : " + getRaza() + "\n"
            + "Se alimenta de : " + getTipo_Alimento() + "\n"
            + "El michi tiene la edad de  : " + getEdad() + "\n"
            + "El nombre del mchi es : " + getNombre() + "\n"
            + "Las vidas del michi son : " + num_vidas + "\n");
    }
}