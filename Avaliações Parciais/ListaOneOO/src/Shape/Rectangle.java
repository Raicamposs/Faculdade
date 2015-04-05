package Shape;

public class Rectangle extends Shape {

    /**
     * Método construtor extendido da class abstrata Shape. Você deve utiliza-lo
     * para criar o registro de um novo Rectangle.
     *
     * @author Raiane Campos
     */
    protected double width;
    protected double lenght;

    // Declaração do construtor da classe Rectangle
    public Rectangle() {
    }

    // Declaração de outro construtor da classe Rectangle
    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    // Declaração de um novo construtor da classe Rectangle
    public Rectangle(double width, double lenght, String color, boolean filled) {
        this.width = width;
        this.lenght = lenght;
        this.color = color;
        this.filled = filled;
    }

    //Declaração do método getWidth
    public double getWidth() {
        return this.width;
        /* Retorna a largura 
         * @return double - valor da largura*/
    }

    //Declaração do método setWidth
    public void setWidth(double width) {
        this.width = width;
        //Altera a largura para o valor passado como parametro
    }

    //Declaração do método getLenght
    public double getLenght() {
        return this.lenght;
        /* Retorna a tamanho
         * @return double - valor do tamanho*/
    }

    //Declaração do método setLenght
    public void setLenght(double lenght) {
        this.lenght = lenght;
        //Altera a tamanho para o valor passado como parametro
    }

    //Declaração do método getArea
    @Override
    public double getArea() {
        return (this.lenght * this.width);
        /* Retorna o valor da area do retangulo
         * @return double - valor da area*/
    }

    //Declaração do método  getPerimeter
    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.lenght);
        /* Retorna o valor do perimetro do retangulo
         * @return double - valor do perimetro */
    }

    //Declaração do método toString
    @Override
    public String toString() {
        return "Width = " + this.width + "\nLenght = " + this.lenght + "\nCor = " + this.color;
        /* Retorna os parametros do retangulo
         * @return String - Parametros */
    }
}
