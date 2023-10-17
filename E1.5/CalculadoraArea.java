public class CalculadoraArea {
    public static void main(String[] args){
        FormaGeometrica[] exemplo = new FormaGeometrica[3];
        exemplo[0] = new Circulo(3.1);
        exemplo[1] = new Retangulo(3.1, 4.6);
        exemplo[2] = new Triangulo(3, 5.1);

        exemplo[0].calcularArea();
        exemplo[1].calcularArea();
        exemplo[2].calcularArea();
    }
}
