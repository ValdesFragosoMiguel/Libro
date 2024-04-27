class Libro{
    String titulo, autor;
    int ISBN, paginas;

    Libro(){}

    public void mostrarISBN(){
        System.out.println("EL ISBN ES: " + this.ISBN);
    }

    public void mostrarTitulo(){
        System.out.println("EL TITULO ES: " + this.titulo);
    }

    public void mostrarAutor(){
        System.out.println("EL AUTOR DEL LIBRO ES: " + this.autor);
    }

    public void mostrarNoPaginas(){
        System.out.println("TIENE " + this.paginas + " PAGINAS");
    }
}