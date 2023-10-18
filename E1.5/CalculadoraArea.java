public class CalculadoraArea {
    public static double calcularAreaTotal(FormaGeometrica[] formas){
        double areaTotal = 0;
        for (FormaGeometrica forma : formas){
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
    public static void main(String[] args){
        FormaGeometrica[] exemplo = new FormaGeometrica[]{
            new Circulo(5.3),
            new Retangulo(4.3, 6.2),
            new Triangulo(3.0, 4.5)
        };
        double areaTotal = CalculadoraArea.calcularAreaTotal(exemplo);
        System.out.println("\nÁrea total: " + areaTotal + "m");
    }
}     