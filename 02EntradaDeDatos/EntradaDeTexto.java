//debe de tener una clase
//public class / class es lo mismo

//variable int num por defecto es publico public int num 
//Libreria 
import java.io.*;

class EntradaDeTexto{

    //debe de existir un metodo principal

    public static void mian(String[]args) throws IOException{

        //debemos de crear una estructura basica
        //declaracion
        char nombre;
        //mensaje para el usuario
        System.out.print("Por favor ingresa tu nommbre");
        //ln es para salto de linea 

        //asignar que operacion o comportamiento le voy a otorgar a la variable 
        //nombre = System.console().read();
        nombre = (char)System.in.read();

        //System es la clase del sistema
        //console() es el metodo que puede obtener datos de la consola 
        //readLine() es el metodo que puede dar lectura a los datos introducidos 
        System.out.print("Hola"+ nombre + "Bienvenido a tronar wii");

    }


}