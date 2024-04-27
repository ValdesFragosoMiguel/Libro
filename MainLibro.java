import java.util.Scanner;

class MainLibro{
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        String titulo, autor;
        int isbn, pag;

        System.out.println("INGRESA EL ISBN: ");
        isbn = op.nextInt();
        System.out.println("INGRESA EL TITULO: ");
        titulo = op.next();
        System.out.println("INGRESA EL AUTOR: ");
        autor = op.next();
        System.out.println("INGRESA EL TOTAL DE PAGINAS: ");
        pag = op.nextInt();

        Libro libro1 = new Libro();

        libro1.ISBN = isbn;
        libro1.titulo = titulo;
        libro1.autor = autor;
        libro1.paginas = pag;

        libro1.mostrarISBN();
        libro1.mostrarTitulo();
        libro1.mostrarAutor();
        libro1.mostrarNoPaginas();
    }
}