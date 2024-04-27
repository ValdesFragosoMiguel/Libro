import java.util.Scanner; //importamos la clase Scanner

class MainLibro{ //creamos clase MainLibro
    public static void main(String[] args) { //meotodo main
        Scanner op = new Scanner(System.in); // utilizamos clase Scanner
        String titulo, autor; //declaramos vareables
        int isbn, pag;
        // Pedimos al usuario que digite los requisitos
        System.out.println("INGRESA EL ISBN: ");
        isbn = op.nextInt();
        System.out.println("INGRESA EL TITULO: ");
        titulo = op.next();
        System.out.println("INGRESA EL AUTOR: ");
        autor = op.next();
        System.out.println("INGRESA EL TOTAL DE PAGINAS: ");
        pag = op.nextInt();

        Libro libro1 = new Libro();- // creamos el objeto
 // validamos los atributos
        libro1.ISBN = isbn;
        libro1.titulo = titulo;
        libro1.autor = autor;
        libro1.paginas = pag;
//mostramos resultados
        libro1.mostrarISBN();
        libro1.mostrarTitulo();
        libro1.mostrarAutor();
        libro1.mostrarNoPaginas();
//mostramos todo
        Libro libro2 = new Libro("titulo", "autor", isbn, pag);


    }
}