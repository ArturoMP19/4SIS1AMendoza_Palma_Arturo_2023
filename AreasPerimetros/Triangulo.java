package AreasPerimetros;

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3; 

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado1;

        AreaTri();
        PerimetroTri();
    }

    private void AreaTri() {
        this.area = 0.5 * base * altura;
    }

    private void PerimetroTri() {
        System.out.println("Escribe los tres lados del triangulo para sacar el perimetro");
        this.perimetro = lado1 + lado2 + lado3;
    }
}