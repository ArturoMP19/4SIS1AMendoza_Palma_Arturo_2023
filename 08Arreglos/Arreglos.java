import java.util.Scanner;

public class Arreglos {

    private static int opcion, negativos = 0, positivos = 0, num = 0;
    private static double resulNeg = 0.0, resulPos = 0.0, Promedio = 0.0;
    private static char reinicio;
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        do {
            System.out.println("Elija una opción deseada");
            System.out.println("1. Suma de números enteros positivos y negativos y calcular el promedio");
            System.out.println("2. Dar el promedio de las posiciones pares");
            System.out.println("3. Calificaciones");
            System.out.println("4. Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    Ejercicio1();
                    break;
                case 2:
                    Ejercicio2();
                    break;
                case 3:
                    Ejercicio3();
                    break;
                default:
                    break;
            }

            System.out.println("Deseas repetir el programa, escribe s/S");
            reinicio = entrada.next().charAt(0);
        } while (reinicio == 'S' || reinicio == 's');
    }

    public static void Ejercicio1() {
        int numeros[];
        numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese los números para calcular el promedio");
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                resulPos += numeros[i];
                positivos++;
            } else {
                if (numeros[i] < 0) {
                    resulNeg += numeros[i];
                    negativos++;
                }
            }
        }

        System.out.println("La suma de los números positivos es: " + resulPos + " y su promedio es: " + resulPos / positivos);
        System.out.println("La suma de los números negativos es: " + resulNeg + " y su promedio es: " + resulNeg / negativos);
    }

    public static void Ejercicio2() {
        int numeros[];
        numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese los números para calcular la suma y promedio de los numeros pares");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i += 2) {
            num++;
            Promedio += numeros[i];
        }
        System.out.println("La suma de los números en las posiciones pares es: " + Promedio + " y el promedio es: " + Promedio / num);
    }

    public static void Ejercicio3() {
      
      int[] calificaciones = new int[10];

        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = entrada.nextInt();
        }

        
        System.out.print("Calificaciones ingresadas: ");
        for (int calificacion : calificaciones) {
            System.out.print(calificacion + " ");
        }
        System.out.println();

     
        double promedio = calcularPromedio(calificaciones);
        System.out.println("Promedio de las calificaciones: " + promedio);

        
        int calificacionMaxima = encontrarCalificacionMaxima(calificaciones);
        int calificacionMinima = encontrarCalificacionMinima(calificaciones);
        System.out.println("Calificación más alta: " + calificacionMaxima);
        System.out.println("Calificación más baja: " + calificacionMinima);

       
        int calificacionesSuperioresAlPromedio = contarCalificacionesSuperioresAlPromedio(calificaciones, promedio);
        System.out.println("Número de calificaciones superiores al promedio: " + calificacionesSuperioresAlPromedio);

     
        int alumnosAprobados = contarAlumnosAprobados(calificaciones);
        int alumnosReprobados = contarAlumnosReprobados(calificaciones);
        System.out.println("Cantidad de alumnos aprobados: " + alumnosAprobados);
        System.out.println("Cantidad de alumnos reprobados: " + alumnosReprobados);
    }

    public static double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    public static int encontrarCalificacionMaxima(int[] calificaciones) {
        int max = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] > max) {
                max = calificaciones[i];
            }
        }
        return max;
    }

    public static int encontrarCalificacionMinima(int[] calificaciones) {
        int min = calificaciones[0];
        for (int i = 1; i < calificaciones.length; i++) {
            if (calificaciones[i] < min) {
                min = calificaciones[i];
            }
        }
        return min;
    }

    public static int contarCalificacionesSuperioresAlPromedio(int[] calificaciones, double promedio) {
        int count = 0;
        for (int calificacion : calificaciones) {
            if (calificacion > promedio) {
                count++;
            }
        }
        return count;
    }

    public static int contarAlumnosAprobados(int[] calificaciones) {
        int count = 0;
        for (int calificacion : calificaciones) {
            if (calificacion >= 60) {
                count++;
            }
        }
        return count;
    }

    public static int contarAlumnosReprobados(int[] calificaciones) {
        int count = 0;
        for (int calificacion : calificaciones) {
            if (calificacion < 60) {
                count++;
            }
        }
        return count;
    }

    
}


