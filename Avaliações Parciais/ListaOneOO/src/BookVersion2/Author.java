
package BookVersion2;


public class Author {

    /**
     * Método construtor. Você deve utiliza-lo para criar o registro de um novo
     * author .
     * @param email email do author
     * @param name nome do author
     * @param gender genero do author
     * @author Raiane Campos
     */
    
    private String name;
    private String email;
    private char gender;

    // Declaração do construtor da classe Autor
    public Author() {

    }

    // Declaração de outro construtor da classe Autor
    public Author(String name, String email, char gender) {

        this.name = name;
        this.email = email;
        this.gender = gender;

    }

    //Declaração do método setEmail
    public void setEmail(String email) {
        this.email = email;
        // Altera o email do author para o parametro passado
    }

    //Declaração do método  getEmail
    public String getEmail() {
        return email;
        //retorna o email do author
    }

    //Declaração do método getGender
    public char getGender() {
        return gender;
        //retorna o genero do author

    }

    //Declaração do método getName
    public String getName() {
        return name;
        //retorna o nome do author
    }

    //Declaração do método toString
    @Override
    public String toString() {
        return ("Autor: " + name + "(" + gender + ")" + "\nContato: " + email);
        //retorna todos os parametros declarados do author
    }

}
