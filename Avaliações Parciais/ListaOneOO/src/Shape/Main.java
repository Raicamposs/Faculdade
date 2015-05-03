package Shape;

import Circle.Circle;

/*
 * ClassName Main 
 * Version information 1.0 
 * Date 04/04/2014 
 * @author Raiane Campos 
 * Copyright notice class destinada a testar os objetos do pacote Shape
 */

public class Main {

    public static void main(String[] args) {

        // Declaração dos objetos
        Shape novo[] = new Shape[9];

        // Construção dos objetos
        novo[0] = new Circle();
        novo[1] = new Circle(5);
        novo[2] = new Circle(8, "blue", false);
        novo[3] = new Rectangle();
        novo[4] = new Rectangle(3, 6);
        novo[5] = new Rectangle(6, 23, "green", false);
        novo[6] = new Square();
        novo[7] = new Square(5);
        novo[8] = new Square(8, "black", false);

        // Utilização dos objetos
        for (Shape novo1 : novo) {
            System.out.println("-----------------------Novo Teste----------------------------");
            System.out.println(novo1.toString());
            System.out.printf("Area = %.2f\nPerimetro = %.2f\n", novo1.getArea(), novo1.getPerimeter());
            novo1.setColor("Red");
            novo1.setFilled(true);
            System.out.printf("Nova Cor = %s\nisFilled = %b\n", novo1.getColor(), novo1.isFilled());

        }

    }

}
