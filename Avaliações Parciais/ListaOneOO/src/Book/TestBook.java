package Book;

/*
 * ClassName TestBook
 * Version information 1.2  
 * Date 04/04/2014 
 * @author Raiane Campos 
 * Copyright notice class destinada a testar os objetos das classes Author e Book 
 */
public class TestBook {

    public static void main(String[] args) {

        // Declaração dos objetos
        Author autor1;
        Author autor2;

        // Construção dos objetos
        autor1 = new Author("Nelson Rubens", "nelsonrubens@example.com", 'm');
        autor2 = new Author("Katarina Braga", "katarinabraga@example.com", 'f');

        // Declaração dos objetos 
        Book book1;
        Book book2;

        // Construção dos objetos
        book1 = new Book("Flores Artificiais", 20.0, autor1);
        book2 = new Book("O Capital no Século 21", 10.0, autor2);

        // Utilização dos objetos
        book1.setPrice(38);
        book1.setQtyInStock(3);
        System.out.println("Titulo: " + book1.getName());
        System.out.printf("Preço: R$ %.2f \n", book1.getPrice());
        System.out.println("Estoque: " + book1.getQtyInStock());
        System.out.println(book1.getAuthorName());
        System.out.println(book1.getAuthor());
        System.out.println(book1.toString());
        System.out.println("------------------------------------------------------");
        book2.setPrice(18);
        book2.setQtyInStock(5);
        System.out.println("Titulo: " + book2.getName());
        System.out.printf("Preço: R$ %.2f \n", book2.getPrice());
        System.out.println("Estoque: " + book2.getQtyInStock());
        System.out.println(book2.getAuthorName());
        System.out.println(book2.getAuthor());
        System.out.println(book2.toString());
        System.out.println("------------------------------------------------------");

    }
}
