package AreasPerimetros;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
            System.out.println("Seleccione una figura:");
            System.out.println("1. Rectangulo");
            System.out.println("2. Circulo");
            System.out.println("3. Triangulo");
            System.out.println("4. Rombo");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese la base del rectangulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del rectangulo: ");
                double altura = scanner.nextDouble();
                Rectangulo rectangulo = new Rectangulo(base, altura);
                System.out.println("Área del rectangulo: " + rectangulo.getAreaRec());
                System.out.println("Perimetro del rectangulo: " + rectangulo.getPerimetroRec());
            } else if (opcion == 2) {
                System.out.print("Ingrese el radio del circulo: ");
                double radio = scanner.nextDouble();
                Circulo circulo = new Circulo(radio);
                System.out.println("Área del circulo: " + circulo.getAreaCir());
                System.out.println("Perimetro del circulo: " + circulo.getPerimetroCir());
            } else if (opcion == 3) {
                System.out.print("Ingrese la base del triangulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese la altura del triangulo: ");
                double altura = scanner.nextDouble();
                System.out.println("Ingrese la medida de los lados del triangulo para obtener el perimetro");
                double lado1 = scanner.nextDouble();
                double lado2 = scanner.nextDouble();
                double lado3 = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(base, altura, lado1, lado2, lado3);
                System.out.println("Área del triangulo: " + triangulo.getAreaTri());
                System.out.println("Perimetro del triangulo: " + triangulo.getPerimetroTri());
            } else if (opcion == 4) {
                System.out.print("Ingrese la diagonal mayor del rombo: ");
                double diagonalMayor = scanner.nextDouble();
                System.out.print("Ingrese la diagonal menor del rombo: ");
                double diagonalMenor = scanner.nextDouble();
                Rombo rombo = new Rombo(diagonalMayor, diagonalMenor);
                System.out.println("Área del rombo: " + rombo.getAreaRo());
                System.out.println("Perimetro del rombo: " + rombo.getPerimetroRo());
            } else {
                System.out.println("Opción no válida.");
            }
        
        }
    }

