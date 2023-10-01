import java.util.Scanner;
import java.lang.Math;

public class Figura{
    //variables
    double lado, altura, area, perimetro;
    int opcion;
    char letra;

    //entrada de datos

    Scanner entrada = new Scanner (System.in);

    //metodos

    public void menu(){
        //vamos haver un programa pra calcullar area y perimetro de las figuras
        do{
            System.out.println("Bienvenido al programa de calculo de areas y perimetros");
            System.out.println("Elije una opcion deseada: ");
            System.out.println("1- Cuadrado");
            System.out.println("2- Rectangulo");
            System.out.println("3- Tringulo ");
            System.out.println("Salir ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    calcularCuadrado();

                 break;
                 case 2:
                 calcularRectangulo();
                  break;
                case 3:
                 calcularTriangulo();

                  break;
                default: 
                    System.out.println("Gracias por elegir este lindo programa");
                 break;  
            }
            System.out.println("Deseas repetir el programa digita S");
             letra = entrada.next().charAt(0);
        }while(letra == 'S' || letra == 's');
    }
    public void calcularCuadrado(){
        try{
         System.out.println("Ingresa el valor del lado del cuadrado");
         lado = entrada.nextDouble();
         perimetro = lado*4;
         area = lado*lado;
         System.out.println("El perimetro es de: " + perimetro + "El area es de: " + area);
        }  catch(Exception e){
            //manejar el error
            System.out.println("Ingresa solo nummeros");
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void calcularRectangulo(){

    }

    public void calcularTriangulo(){
        
    }
}
