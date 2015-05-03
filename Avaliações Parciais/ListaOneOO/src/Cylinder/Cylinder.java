package Cylinder;

import Circle.Circle;

/**
 * Método construtor extendido do método construtor Circle Você deve utiliza-lo
 * para criar o registro de um novo Cylinder
 * @author Raiane Campos
 */
public class Cylinder extends Circle {

    double height = 1;

    // Declaração do construtor da classe Cylinder
    public Cylinder() {
    }

    // Declaração de outro construtor da classe Cylinder
    public Cylinder(double radius) {
        this.radius = radius;
    }

    // Declaração de um novo construtor da classe Cylinder
    public Cylinder(double radius, double height) {
        this.height = height;
        this.radius = radius;
    }

    //Declaração do método getHeight
    public double getHeight() {
        return height;
        /*retorna altura do cilindro 
         * @return double - height*/
    }

    //Declaração do método setName
    public double getVolume() {
        //V = Ab * h → V = π * r² * h 
        return super.getArea() * this.height;
        /*retorna o volume do cilindro 
         * @return double - valor do volume */
    }

    //Declaração do método getArea
    @Override
    public double getArea() {
        return (super.getArea() * 2) + (this.height * (2 * Math.PI * this.radius));
        /*retorna a area do cilindro 
         * @return double - valor da area */
    }

    //Declaração do método toString
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height= " + height;
        /* Retorna os parametros de Cylinder
         * @return String - parametros de medida*/

    }

}
