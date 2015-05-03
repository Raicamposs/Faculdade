package Circle;

import Shape.Shape;

public class Circle extends Shape {

    /**
     * Método construtor extendido da class abstrata Shape. Você deve utiliza-lo
     * para criar o registro de um novo Cicle.
     * @author Raiane Campos
     */
    protected double radius;

    // Declaração do construtor da classe Cicle
    public Circle() {
        this.radius=1;
        this.color="red";

    }

    // Declaração de outro construtor da classe Cicle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Declaração de um novo construtor da classe Cicle
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    //Declaração do método getRadius
    public double getRadius() {
        return this.radius;
        //retorna o raio do Circle

    }

    //Declaração do método setRadius
    public double setRadius(double radius) {
        return this.radius = radius;
        //Altera o raio para o valor passado 
    }

    //Declaração do método getArea
    @Override
    public double getArea() {
        return (Math.PI * Math.pow(this.radius, 2));
        //Retorna a area do Circle
    }

    //Declaração do método getPerimeter
    @Override
    public double getPerimeter() {
        return (Math.PI * this.radius * 2);
        //Retorna o Perimetro do Circle
    }

    //Declaração do método toString
    @Override
    public String toString() {
        return "Circulo: Raio = " + this.radius + "\nCor = " + this.color;
        //Retorna os parametros declarados do Circle
    }

}
