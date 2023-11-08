public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(4);
        Triangulo triangulo = new Triangulo(3,4,5,2);
        Circulo circulo = new Circulo(2);
        Retangulo retangulo = new Retangulo(4,5);
        retangulo.setLado(4);

        System.out.println("\nÁrea do Quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do Quadrado: " + quadrado.calcularPerimetro());
        System.out.println("Área do Triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do Triângulo: " + triangulo.calcularPerimetro());
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro()+ "\n");
    }
}