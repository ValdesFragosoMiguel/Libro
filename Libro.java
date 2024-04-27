class Libro{ //creo la clase
    String titulo, autor; //dnado atributos
    int ISBN, paginas;

    Libro(){}

    Libro(String tit,String au,int is, int pag){ //metodo constructor del libro
        System.out.println(tit+" "+au+" "+is+" "+pag);
    }

    public void mostrarISBN(){ //mostrar isbn
        System.out.println("EL ISBN ES: " + this.ISBN);
    }

    public void mostrarTitulo(){ //mostrmos el titulo
        System.out.println("EL TITULO ES: " + this.titulo);
    }

    public void mostrarAutor(){//mostramos el autor
        System.out.println("EL AUTOR DEL LIBRO ES: " + this.autor);
    }

    public void mostrarNoPaginas(){//mostramos el numero de paginas
        System.out.println("TIENE " + this.paginas + " PAGINAS");
    }
}