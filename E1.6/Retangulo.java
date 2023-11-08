public class Retangulo extends Quadrado {
    private double altura;
    private double lado;

    public Retangulo(double lado, double altura) {
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        return lado * altura;
    }

    public double calcularPerimetro(){
        return 2 * (lado + altura);
    }
}