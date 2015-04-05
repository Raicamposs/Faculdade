package Shape;
/*
 * ClassName Shape
 * Version information 1.0 
 * Date 04/04/2014 
 * @author Raiane Campos 
 * Copyright notice class abstrata
 */

public abstract class Shape {

    protected String color;
    protected boolean filled;

    // Declaração do construtor
    public Shape() {

    }

    // Declaração de outro construtor
    public Shape(String color, boolean filled) {

        this.color = color;
        this.filled = filled;
    }

    //Declaração do método getColor
    public String getColor() {
        return color;
        /* Retorna a cor do shape
         * @return String - cor */
    }

    //Declaração do método setColor
    public void setColor(String color) {
        this.color = color;
        //Altera a variavel color para o valor passado como parametro
    }

    //Declaração do método isFilled   
    public boolean isFilled() {
        return filled;
        /* Retorna se esta preenchido 
         * @return boolean - Esta preenchido*/
    }

    //Declaração do método setFilled
    public void setFilled(boolean filled) {
        this.filled = filled;
        //Altera a variavel filled para o valor passado como parametro

    }

    //Declaração do método abstrato getArea
    public abstract double getArea();

    //Declaração do método abstrato getArea
    public abstract double getPerimeter();

    //Declaração do método abstrato getArea
    @Override
    public abstract String toString();
}
