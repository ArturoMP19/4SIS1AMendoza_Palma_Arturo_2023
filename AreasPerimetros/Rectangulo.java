package AreasPerimetros;

class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    

    public Rectangulo(double base, double altura) {
        
        this.base = base;
        this.altura = altura;
        AreaRec();
        PerimetroRec();
    }

    private void AreaRec() {
        this.area = base * altura;
    }

    private void PerimetroRec() {
        this.perimetro = 2 * (base + altura);
    }
}
