

//vamos a crear una tiendita de mascotas de adopcion

public class Animal {
    /*
     * Pricipio de encapsulamiento
     * es poder restringir el acceso a los datos, vaos a poder agrupar en una clase
     * el acceso a los diferentes atributos y metodos de la clase, para que no puedan 
     * ser modificados
     * 
     */

     //definir las variables

     private String nombre, raza, tipo_alimento;
     private int edad;

     //se debe crear el constructor, el constructor nos sirve para poder declarar
     ///la existencia de una clase, para poder inicializar las variables para crear
     //instancias de una clase - es un constructor

     public Animal(){
        //este es un constructor por defecto 

     }

     //cuando existe una construccion del objeto de acuerdo a los necesidades por parte del usuario
     //es necesario ocupar las sobre carga del constructor

     //metodo para registar la mascota
     public Animal(String nom, String raza, String tipo_alimento, int edad){
        //pero como son privados los atributos, debemos de ener una forma de acceso
        //la palabra reservada this, os sirve para poder acceder a los atributos privados

        this.nombre = nom;
        this.raza = raza;
        this.tipo_alimento = tipo_alimento;
        this.edad = edad;
     }


     //para poder modificar los valores de la asignacion, es necesario utilizar
     //los metodos gtter and setter
     //get ---- obtener ---- recibir
     //set ---- asignar --- enviar

     //metodos get y set por cada variable

     public String getNombre(){
        return nombre;

     }
     public void setNombre(String nom){
        this.nombre = nom;
     }
     public String getRaza(){
        return raza;

     }
     public void setRaza(String raza){
        this.raza = raza;

     }
      public String getTipo_Alimento(){
        return tipo_alimento;

     }
     public void setTipo_Alimento(String tipo_alimento){
        this.tipo_alimento = tipo_alimento;

     }
      public int getEdad(){
        return edad;

     }
     public void setEdad(int edad){
        this.edad = edad;

     }

}

