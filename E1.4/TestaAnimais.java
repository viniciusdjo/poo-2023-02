public class TestaAnimais {
    public static void main (String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Boi();
        animais[1] = new Cachorro();
        animais[3] = new Boi();

        for(Animal animal: animais ){
            System.out.println(animal.som());  
        }
    }
}
