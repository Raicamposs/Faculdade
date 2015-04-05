package BookVersion2;

public class Book {

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
    private final String name;
    private double price;
    private int qtyInStock = 0;
    private final Author author[];
    private String listaAuthor = "";

    // declaração do construtor da classe Book 
    public Book(String name, double price, Author author[]) {

        this.name = name;
        this.price = price;
        this.author = author;
    }

    // declaração de outro construtor da classe Book 
    public Book(String name, double price, int qtyInStock, Author author[]) {

        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
        this.author = author;
    }

    //Declaração do método setName
    public String getName() {
        return this.name;
        //retorna o nome do book
    }

    //Declaração do método getAuthors
    public Author[] getAuthors() {
        return author;
        //retorna o objeto author do book
    }

    //Declaração do método getPrice
    public double getPrice() {
        return this.price;
        //retorna o preço do book
    }

    //Declaração do método setPrice
    public void setPrice(double price) {
        this.price = price;
        // Altera o preço do book para o valor passado
    }

    //Declaração do método getQtyInStock
    public int getQtyInStock() {
        return qtyInStock;
        //retorna a quantidade em estoque do book
    }

    //Declaração do método setQtyInStock
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
        // Altera o preço do book para a quantidade passado
    }

    //Declaração do método toString
    @Override
    public String toString() {

        for (Author autor1 : this.author) {//percore todo o vetor author
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
