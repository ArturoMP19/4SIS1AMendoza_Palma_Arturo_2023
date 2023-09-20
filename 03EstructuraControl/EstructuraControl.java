 /*
  * vamos a crear un programa mediante el cual debebamos tener un meno
  de seleccion para elegir alguna de las 14 opciones siguientes:
  1- Bono o descuento por edad
  2- Convertir numeros decimales  binarios
  3- Convertir temperaturas
  4- Numeros de positivos o negativos
  5- tiendita
  6- Area o perimetro
  7- Tabla
  8- Factorial
  9- Dibujitos
  10- Figura basica
  11- Patron
  12- Diamante
  13- Calculadora
  14- Salir

  */
//declarar son las librerias que vamos a ocupar 
//se debe estructutrar el tipo de datos acorde a su entrada
//si es entero obtenerlo como entero, si char obtenerlo como caracter
import java.util.Scanner;

class EstructuraControl{
  //si declaramos aqui las variables son globales
   //metodo pricipal
   public static void main(String[] args){
      //el manejo de objeto, nos ayuda a poder instancear,(mandando a llamar al objeto)
      //para hacer una instancia, es necesario 1- indentificar el tipo de objeto
      //2-nombrar al objeto
      //3-Crear al objeto
      Scanner entrada = new Scanner(System.in);
      //crear una instancia del objeto de la entrada por defecto a la computadora
      //vamos a identificar con Scanner el tipo de dato que se esta instanceando 
      //entrada es el objeto que va apoder identificar si es int,double,flot,etc

      //es declarar a las variables que se van a utilizar en el programa 
      //las variables son de dos tipos globales y locales
      //si la declaro dentro del metodo es local
      
      int opcion, numbinario, total, cantidadproducto, num1;
      float precio, resultado = 0, compra = 0;
      String nombreproducto;
      String binario = "";
      char letra ;                 

      do {
         //aqui va todo el programa 
         System.out.println ("Bienvenido al programa:3");
         System.out.println ("Elije alguna opcion deseada");
         System.out.println ("1- Descuento por edad ");
         System.out.println ("2- Covertir nuemro decimal a binario");
         System.out.println ("3- Covertir Temperaturas");
         System.out.println ("4- numeros positivos y negativos ");
         System.out.println ("5- tiendita");//jimmy
         System.out.println ("6- Area y Perimetro");
         System.out.println ("7- tabla");//jimmy
         System.out.println ("8- Factorial");
         System.out.println ("9- Dibujito");//jimmy
         System.out.println ("10- Figura Hueca");
         System.out.println ("11- Patrones de Codigo");
         System.out.println ("12- Diamante ");
         System.out.println ("13- calculadora");
         System.out.println ("14- Salir");      

         //aqui adentro de preguntar
         System.out.println("Deseas repetir el programa?, escribe s para si ");
         //vamos a leer el primer caracter de la entrada por defectode de la computadora 
         letra = entrada.next().charAt(0);
      }while(letra == 's' || letra == 'S');



   }

}










































