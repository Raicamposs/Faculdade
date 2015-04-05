package BookVersion2;

import Book.*;

public class BookTwo extends Book {

    /**
     * Método construtor. Você deve utiliza-lo para criar o registro de um novo
     * book .
     *
     * @param price preço do book
     * @param name nome do book
     * @param author um objeto autor cadastrado
     * @param qtyInStock quantidade em estoque do book
     * @throws NullPointerException
     * @author Raiane Campos
     */
    private String listaAuthor = "";

    public BookTwo(String name, double price, int qtyInStock, Author[] author) {
        super(name, price, qtyInStock, author);
    }

    public BookTwo(String name, double price, Author author[]) {
        super(name, price, author);
    }

    //Declaração do método getAuthors
    public Author[] getAuthors() {
        return vetAuthor;
//        retorna o objeto author do book
    }

    //Declaração do método toString
    @Override
    public String toString() {

        for (Author autor1 : this.vetAuthor) {//percore todo o vetor author
            try {

                this.listaAuthor += "\n" + autor1.getName();
                //armazena os dados dos authors encontrados do book

            } catch (java.lang.NullPointerException erro) {

            }
        }
        return "Livro:" + this.name + " \nPor :" + this.listaAuthor;
        //retorna o nome do livro e os parametros declarados de todos os authors
    }

    //Declaração do método printAuthors
    public void printAuthors() {
        for (Author autor1 : this.getAuthors()) {//percore todo o vetor author
            try {

                System.out.println(autor1.toString());
                //imprime os parametros declarados de todos os authors
            } catch (java.lang.NullPointerException erro) {

            }
        }

    }

}
