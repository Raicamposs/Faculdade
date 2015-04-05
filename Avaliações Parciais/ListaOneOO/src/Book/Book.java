package Book;

public class Book {

    /**
     * Método construtor. Você deve utiliza-lo para criar o registro de um novo
     * book .
     *
     * @author Raiane Campos
     */
    protected String name;
    protected double price;
    protected int qtyInStock = 0;
    private Author author;
    protected Author vetAuthor[];

    // Declaração do construtor da classe Book 
    public Book(String name, Double price, Author autor) {

        this.name = name;
        this.price = price;
        this.author = autor;
    }

    // Declaração de outro construtor da classe Book 
    public Book(String name, double price, int qtyInStock, Author author) {

        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
        this.author = author;
    }

    // declaração do construtor da classe Book usando um vetor
    protected Book(String name, double price, Author author[]) {

        this.name = name;
        this.price = price;
        this.vetAuthor = author;
    }

    // declaração de outro construtor da classe Book usando um vetor
    protected Book(String name, double price, int qtyInStock, Author author[]) {

        this.name = name;
        this.price = price;
        this.qtyInStock = qtyInStock;
        this.vetAuthor = author;
    }

    //Declaração do método getName
    public String getName() {
        return this.name;
        //retorna o nome do book
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

    //Declaração do método getAuthorName
    public String getAuthorName() {
        return author.getName();
        //retorna o nome do author do book
    }

    //Declaração do método getAuthor
    public Author getAuthor() {
        return author;
        //retorna o  author do book
    }

    //Declaração do método toString
    @Override
    public String toString() {
        return "Livro:" + name + " \nPor " + author;
        //retorna o nome do livro e os parametros declarados do author
    }
}
