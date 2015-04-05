package Circle;

public class Circle {

    /**
     * Método construtor. Você deve utiliza-lo para criar o registro de um novo
     * Cicle.
     * @author Raiane Campos
     */
    protected double radius;
    private final String color;

    // Declaração do construtor da classe Cicle
    public Circle() {
        this.radius = 1;
        this.color = "red";
    }

    // Declaração de outro construtor da classe Cicle
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    //Declaração do método getRadius
    public double getRadius() {
        return this.radius;
        //retorna o raio do Circle
    }

    //Declaração do método getArea
    public double getArea() {
        return (Math.PI * Math.pow(this.radius, 2));
        //retorna a area do Circle
    }

    //Declaração do método toString
    @Override
    public String toString() {
        return "Circulo: Raio = " + this.radius + "\nCor = " + this.color;
        //retorna os parametros declarados do Circle
    }

}
