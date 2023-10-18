import java.util.Scanner;

public class CadenaInvertida {
    //objeto para la entrada de datos
    Scanner entrada =  new Scanner(System.in);

    public void cadenaInvertirPalabras(){

        String cadena = "";

        System.out.println("Ingresa la oracion que deseas invertir: ");

        cadena = entrada.nextLine();

        //el chiste es poder invertir la cadena que ingrese el usuario 

        String invertida = "";

        //ciclo dor

        for(int i = cadena.length()-1; i >= 0; i --){
            //obtengo los caracternrede la cadena
            char car =  cadena.charAt(i);
            //lo concateno
            invertida += car;

        }

        System.out.println("Cadena invertida es: " + invertida);
    }

}
