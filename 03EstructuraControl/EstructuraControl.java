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
   /**
    * @param args
    */
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
      
      int opcion, numbinario, total, cantidadproducto, num1, edad;
      float precio, resultado , compra = 0, temperatura , Resultado, precioAbono, cantidad ;
      String nombreproducto;
      String binario = "";
      char letra ;                 

      do {
         //aqui va todo el programa 
         System.out.println ("Bienvenido al programa:3");
         System.out.println ("Elije alguna opcion deseada");
         System.out.println ("1- Descuento por edad ");
         System.out.println ("2- Covertir nuemro decimal a binario");//jimmy
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

         opcion = entrada.nextInt();

         //menu
         switch(opcion){
            case 1:
               System.out.println("Ingrese su edad: ");
             edad = entrada.nextInt();
             System.out.println("Ingrese la cantidad para aplicar el bono: ");
             precioAbono = entrada.nextInt();

               if (edad > 65){
                  System.out.println("Se aplico el 40 % de descuento ");
                  precioAbono *= 0.60;
               } else if (edad < 21){
                  System.out.println("Sus padres son socios? (s/n): ");
                  char respuesta = entrada.next().charAt(0);
                  if (respuesta == 's'|| respuesta == 'S'){
                     System.out.println("Se le aplicara un descuento del 45%");
                     precioAbono *= 0.55;
                  }else {
                     System.out.println("Se le aplicara un despuesto del 25%");
                     precioAbono *= 0.75;
                  }
                  System.out.println("El precio del abono es:" + precioAbono);
               }
             break;
            case 2:
               //decimal a binario
               System.out.println("Ingresa un numero positivo entero que desee convertir a binario");
               numbinario = entrada.nextInt();
               //primero tengo que saber que sea positivo
               if(numbinario > 0){
                  //se cuantas veces el numero se va a dividir entre 2?
                  while(numbinario > 0){
                     if(numbinario%2 == 0){
                        binario = "0" + binario;

                     } else {
                        binario = "1" + binario;
                     
                     }
                     numbinario = (int)numbinario/2;


                  }

               }else if(numbinario == 0 ){
                   binario = "0" + binario;
               }else {
                  binario = "No se puede convertir un  numero negativo solo positivo";
               } 
               System.out.println("el numero binario es: " + binario);
             break;
            case 3:
             System.out.print("Introduce la temperatura en grados Fahrenheit: ");
             float fahrenheit = entrada.nextFloat();
             
             double celsius = (fahrenheit - 32) * 5 / 9;
             double kelvin = (fahrenheit + 459.67) * 5 / 9;
             double rankine = fahrenheit + 459.67;

             System.out.println("Temperatura en grados Celsius: " + celsius);
             System.out.println("Temperatura en Kelvin: " + kelvin);
             System.out.println("Temperatura en Rankine: " + rankine);

             

             
             
            break;
            case 4:
             int numero;
             int contadorPositivos = 0;
             int contadorNegativos = 0;
             System.out.println("ingrese una serie de numeros y al final escriba 0 ");
             while (true) {
               numero = entrada.nextInt();
               if (numero == 0){
                  break;
               }else if (numero > 0){
                  contadorPositivos++;
               }else {
                  contadorNegativos++;
               }
             }
             System.out.println("Cantidad de nuemros positivos: " + contadorPositivos);
             System.out.println("Cantidad de numeros negativos: " + contadorNegativos);

             
             break;
            case 5:
             System.out.println("Bienvenido a la tiendita");

            
             
             System.out.println("Por favor ingrese el numero de productos que desea comprar");
             total = entrada.nextInt();


             for(int i = 1; i <= total; i++){
               System.out.println("Ingrese el nombre del producto");
               nombreproducto = entrada.next();
               System.out.println("Ingrersa el precio");
               precio = entrada.nextFloat();
               System.out.println("Ingrese la cantidad");
               cantidadproducto = entrada.nextInt();
               //operacion
               resultado = precio * cantidadproducto;
               compra = compra + resultado ; // compra += resultado
               
            }  
             System.out.println("El total de la compra es: " + compra);
             compra = 0;
             break;
            case 6:
             System.out.println("Elige la figura:");
             System.out.println("1- Rectangulo");
             System.out.println("2- Triangulo");
             System.out.println("3- Esfera ");
             System.out.println("4- cilindro ");
             int opcion1 = entrada.nextInt();
             switch(opcion1){
               case 1:
                //Rectangulo 
                System.out.println("Ingresa la base del rectangulo:");
                float baseRectangulo = entrada.nextFloat();
                System.out.println("Ingresa la altura del rectángulo: ");
                float alturaRectangulo = entrada.nextFloat();  
                
                float areaRectangulo = baseRectangulo * alturaRectangulo;
                float perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
                System.out.println("Area del rectangulo:" + areaRectangulo);  
                System.out.println("Perimetro del rectángulo: " + perimetroRectangulo);
                break;
                case 2:
                System.out.println("Ingresa la base del triángulo: ");
                float baseTriangulo = entrada.nextFloat();
                System.out.println("Ingresa la altura del triángulo: ");
                float alturaTriangulo = entrada.nextFloat();

                float areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                float perimetroTriangulo = baseTriangulo * 3;

                System.out.println("Area del triangulo: "+ areaTriangulo);
                System.out.println("Perimetro del triangulo: " + perimetroTriangulo);
                break;
                case 3:
                // Esfera
                System.out.println("Ingresa la altura del triángulo: ");
                float radioEsfera = entrada.nextFloat();

                double volumenEsfera = (4.0 / 3.0)* Math.PI * Math.pow(radioEsfera, 3);

                System.out.println("Volumen de la esfera: " + volumenEsfera);
                break;

                case 4:

                //cilindro
                System.out.println("Ingresa el radio de la base del cilindro : ");
                float radioCilindro = entrada.nextFloat();
                System.out.println("Ingresa la altura del cilindro: ");
                float alturaCilindro = entrada.nextFloat();

                double volumenCilindro = Math.PI * Math.pow(radioCilindro, 2) * alturaCilindro;
                
                System.out.println("Volumen del cilindro: " + volumenCilindro);
                break;

                default:
                System.out.println("Opción no válida.");

             }
             break;
            case 7:
             break;
            case 8:
             break;
            case 9:
             break;
            case 10:
             break;
            case 11:
             break;
            case 12:
             break;
            case 13:
             break;
            case 14:
             break;
            default:
               System.out.println("Elije la opcion");
               break;
            


         }

         //aqui adentro de preguntar
         System.out.println("Deseas repetir el programa?, escribe s para si ");
         //vamos a leer el primer caracter de la entrada por defectode de la computadora 
         letra = entrada.next().charAt(0);
      }while(letra == 's' || letra == 'S');



   }

}










































