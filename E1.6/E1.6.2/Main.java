public class Main {
    public static void main (String[] args){
        Desenho quadrado = new Quadrado();
        Desenho retangulo = new Retangulo();
        Desenho circulo = new Circulo();
        Desenho triangulo = new Triangulo();

        System.out.println(quadrado.desenhar());
        System.out.println(retangulo.desenhar());
        System.out.println(circulo.desenhar());
        System.out.println(triangulo.desenhar());
    }
}
