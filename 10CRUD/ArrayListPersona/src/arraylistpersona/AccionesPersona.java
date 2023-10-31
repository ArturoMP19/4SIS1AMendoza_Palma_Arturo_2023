/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistpersona;

/**
 *
 * @author Amp_1
 */
import java.util.ArrayList;

public class AccionesPersona {
    /*
     * acciones persona es una clase de tipo controlador, el controlador es
     * una clase que se encarga de las acciones u operaciones que debe tener
     * el objeto que se ha creado por lo regular siempre esta asociado a 
     * las operaciones basicas
     * consultar   consult
     * registrar  register
     * actualizar   update
     * eliminar   dalete 
     * 
     * CRUD
     * 
     * ahora cuaando pensamos en las acciones de una persona, es necesario
     * guardar todos los datos de forma dinamica, por que constantemente 
     * vam a estar generando nuevos registros, para ello necitamos utilizar 
     * un tipo de objeto especial llamado 
     * 
     * Arraylist , es un arreglo dinamico de objetos , a comparacion de los otros arreglos 
     * un arreglo solo puede contener un tipo de dato por ejemploo
     * 
     * int edad [] char letras [ ]  double []
     * 
     * ArrayList al ser dinamico puede cambiar su tamano, se puede adaptar a diferentes 
     * tipos de dato , por que lo que guarda son objetos
    */

    //declaramos un obtejo te persona tipo arraylist 

    public ArrayList<Persona> listapersonas = new ArrayList<Persona>();

    //vamos a crear un metodo para guardad el registro de una persona
    public void agregarPersona (Persona p){
        //voy a ocupar a mi listaPerosna para agregarlo
        listapersonas.add(p);
    }

    //buscar una persona por su id
    public Persona buscarPersona(int id){
        //necesito una persona para saber si la encontre y otra para buscarla
        Persona encontrada = new Persona();

        //necesito recorrer el arraylist de personas donde estan registradas
        for(Persona p : listapersonas){

            if(id == p.getId()){
                encontrada = p;
            }else {
                System.out.println("No existe el registro de esa persona");
            }
        }
        return encontrada;
    }
    //actualizar los datos de una persona
    public void actualizarPersona(Persona actualizado){
        //como se hace el proceso de actualizar 
        //1 debo de buscar a la persona que quiero actualizar
        //2 ya que lo encontre debo de cambiar los datos(bprar los anteriores datos )
        //3 Actualizar los datos dde la nueva persona

        Persona actualizar = buscarPersona(actualizado.getId());

        //cammbio los datos
        listapersonas.remove(actualizar);

        //actualizo
        listapersonas.add (actualizar);
    }

    //necesito eliminar el registro de una persona
    public void eliminarPersona(Persona eliminar){
        listapersonas.remove(eliminar);
    }

    //quiero mirar la lista completa de personas
    public ArrayList<Persona> mostrarPersonas(){
        return listapersonas;
    }
}
