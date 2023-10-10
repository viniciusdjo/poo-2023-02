public class TestaLivro {
    public static void main(String[] args){

        Livro livro1 = new Livro("Perigoso", "Tim Warnes", 2014, "Ciranda Cultural");
        System.out.println(livro1.toString());

        Livro livro2 = new Livro("Imperfeitos", "Christina Lauren", 2022, "Faro Editorial");
        System.out.println(livro2.toString());

        Livro livro3 = new Livro("Textos para tocar cicatrizes", "Igor Pires", 2022, "Alt");
        System.out.println(livro3.toString());
    }
}
