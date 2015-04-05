
package BookVersion2;
import Book.Author;

/*
* ClassName TestAutor 
* Version information 1.2
* Date 04/04/2014 
* @author Raiane Campos 
* Copyright notice class destinada a testar os objetos da class Author */

public class TestAutor {

    public static void main(String[] args) {

        // Declaração dos objetos
        Author author[];

        // Construção dos objetos   
        author = new Author[2];
        author[0] = new Author("Nelson Rubens", "nelsonrubens@example.com", 'm');
        author[1] = new Author("Katarina Braga", "katarinabraga@example.com", 'f');

        // Utilização dos objetos
        for (int i = 0; i < author.length; i++) {
            try {
                System.out.println("-------------------------Autor " + (1 + i) + "----------------------------");
                System.out.println(author[i].getName() + " - " + author[i].getGender());
                System.out.println(author[i].getEmail());
                author[i].setEmail("newemail@example.com");
                System.out.println(author[i].toString());
            } catch (java.lang.NullPointerException erro) {
                System.out.println("Sem Registro!");
            }
        }

    }
}
