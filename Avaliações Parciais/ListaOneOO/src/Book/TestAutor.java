package Book;
/*
 * ClassName TestAutor 
 * Version information 1.0
 * Date 04/04/2014 
 * @author Raiane Campos 
 * Copyright notice class destinada a testar os objetos da class Author 
 */

public class TestAutor {

    public static void main(String[] args) {
        // Declaração dos objetos
        Author autor1;
        Author autor2;
        // Construção dos objetos
        autor1 = new Author("Nelson Rubens", "nelsonrubens@example.com", 'M');
        autor2 = new Author("Katarina Braga", "katarinabraga@example.com", 'M');

        // Utilização dos objetos
        System.out.println(autor1.toString());
        System.out.println(autor2.toString());

        System.out.println("------------------------------------------------------");
        System.out.println(autor1.getName());
        System.out.println(autor1.getGender());
        autor1.setEmail("segundonelsonrubens@example.com");
        System.out.println(autor1.getEmail());
        System.out.println("------------------------------------------------------");
        System.out.println(autor2.getName());
        System.out.println(autor2.getGender());
        autor2.setEmail("segundokatarinabraga@example.com");
        System.out.println(autor2.getEmail());

    }
}
