package Shape;

public class Square extends Rectangle {

    /**
     * Método construtor extendido da class abstrata Shape. Você deve utiliza-lo
     * para criar o registro de um novo Square.
     *
     * @author Raiane Campos
     */
    protected double side;

    // Declaração do construtor da classe Square
    public Square() {

    }

    // Declaração de outro construtor da classe Square
    public Square(double side) {

        this.side = side;
    }

    // Declaração de um novo construtor da classe Square
    public Square(double side, String colors, boolean filled) {

        this.side = side;
        this.color = colors;
        this.filled = filled;
    }

    //Declaração do método getSide
    public double getSide() {
        return this.side;
        /* Retorna o tamanho lado do quadrado
         * @return double - valor do tamanho lado*/
    }

    //Declaração do método setSide
    public void setSide(double side) {
        this.side = side;
        //Altera o lado para o valor passado como parametro
    }

    //Declaração do método setWidth
    @Override
    public void setWidth(double side) {
        this.width = side;
        //Altera a largura para o valor passado como parametro

    }

    //Declaração do método setLenght
    @Override
    public void setLenght(double side) {
        this.lenght = side;
        //Altera o tamanho para o valor passado como parametro

    }

    //Declaração do método toString
    @Override
    public String toString() {
        return "Quadrado: Side = " + this.side + "\nCor = " + this.color + "\nFilled = " + this.filled;
        /* Retorna os parametros do quadrado
         * @return String - Parametros */
    }

}
