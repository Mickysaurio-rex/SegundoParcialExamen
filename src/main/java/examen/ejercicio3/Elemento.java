package examen.ejercicio3;

public class Elemento {
    String titulo;
    String categoria;

    public Elemento(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void showInfo(){
        System.out.println("**********INFORMACION DEL ELEMENTO**********");
        System.out.println("Titulo: " + titulo);
        System.out.println("Categoria: " + categoria);
    }
}
