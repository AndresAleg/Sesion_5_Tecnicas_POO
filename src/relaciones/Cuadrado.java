package relaciones;

public class Cuadrado extends FiguraGeometrica {

    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    
    @Override
    public Double calcularArea() {
        return lado * lado;
    }

    @Override
    public Double calcularPerimetro() {
        return 4 * lado;
    }
    
    public Double calcularElPerimetroCirculo() {
        return lado * Math.PI;
    }
}