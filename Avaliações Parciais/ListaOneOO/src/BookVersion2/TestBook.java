package BookVersion2;
import Book.Author;

public class TestBook {

    public static void main(String[] args) {

        //Criando os objetos Autor.
        Author orgulhoPreconceito[] = new Author[2];
        orgulhoPreconceito[0] = new Author("Elizabeth Bennet", "elizabethbennet@example.com", 'F');
        orgulhoPreconceito[1] = new Author("Fitzwilliam Darcy", "fitzwilliamdarcy@example.com", 'F');

        Author morroDosVentosUivantes[] = new Author[1];
        morroDosVentosUivantes[0] = new Author("Emily Bronte", "emilybronte@example.com", 'F');

        Author osIncriveis[] = new Author[4];
        osIncriveis[0] = new Author("Anna Sewell", "annasewell@example.com", 'F');
        osIncriveis[1] = new Author("Boris Pasternak", "pasternak@example.com", 'M');
        osIncriveis[2] = new Author("Emily Brontë", "emilybronte@example.com", 'F');
        osIncriveis[3] = new Author("Harper Lee", "harper@example.com", 'M');

        //Criando os objetos Book.
        BookTwo book[] = new BookTwo[10];
        book[0] = new BookTwo("Orgulho e Preconceito", 33.90, orgulhoPreconceito);
        book[1] = new BookTwo("O Morro dos Ventos Uivantes", 17.80, morroDosVentosUivantes);
        book[4] = new BookTwo("Os Incriveis", 40.0, 2, osIncriveis);

        //Alterando preço e quantidade em estoque dos objeto Book.
        book[0].setPrice(38);
        book[0].setQtyInStock(3);
        book[1].setPrice(18);
        book[1].setQtyInStock(5);

        //Testando os metodos e retornando os dados dos objeto Book.
        for (int i = 0; i < book.length; i++) {
            try {
                System.out.println("----------------------Book " + (i + 1) + "--------------------------------");
                System.out.println("Titulo: " + book[i].getName());
                System.out.printf("Preço: R$ %.2f \n", book[i].getPrice());
                System.out.println("Estoque: " + book[i].getQtyInStock());
                System.out.println(book[i].toString());
             

            } catch (java.lang.NullPointerException erro) {
                System.out.println("Sem Registro!\n");
            }

        }

        //Imprime todos os autores do livro.
        book[0].printAuthors();
        book[1].printAuthors();
        book[4].printAuthors();
    }
}
