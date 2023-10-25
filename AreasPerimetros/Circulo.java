package AreasPerimetros;

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        AreaCir();
        PerimetroCir();
    }

    private void AreaCir() {
        this.perimetro = Math.PI * radio * radio;
    }

    private void PerimetroCir() {
        this.perimetro = 2 * Math.PI * radio;
    }
}
