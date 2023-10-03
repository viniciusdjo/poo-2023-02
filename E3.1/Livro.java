public class Livro{
    private String titulo;
    private String autor;
    private int ano;
    private String editora;


public String getTitulo(){
    return titulo;
}

public void setTitulo(String titulo){
    this.titulo = titulo;
}

public String getAutor(){
    return autor;
}

public void setAutor(String autor){
    this.autor = autor;
}

public int getAno(){
    return ano;
}

public void setAno(int ano){
   this.ano = ano;
}

public String getEditora(){
    return editora;
}

public void setEditora(String editora){
    this.editora = editora;
}

public String toString(){
    return "Título: " + titulo + "\nAutor: " + autor + "\nAno: " + ano + "\nEditora: " + editora;
}
}