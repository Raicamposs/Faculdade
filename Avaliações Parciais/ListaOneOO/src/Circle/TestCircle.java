package Circle;
/*
 * ClassName TestCircle
 * Version information 1.0 
 * Date 04/04/2014 
 * @author Raiane Campos 
 * Copyright notice class destinada a testar os objetos das classes Circle
 */

public class TestCircle {

    public static void main(String[] args) {

        // Declaração dos objetos
        Circle circulo1, circulo2;

        // Construção dos objetos  
        circulo1 = new Circle();
        circulo2 = new Circle(5);

        //Testando os metodos e retornando os dados dos objeto Circle.
        
        //Circle 1
        System.out.println("------------------------Circle 1------------------------------\n");
        System.out.println(circulo1.toString());
        System.out.printf("Raio do Circulo 1 = %.2f. \nArea do Circulo 1 = %.2f. \n", circulo1.getRadius(), circulo1.getArea());
        System.out.println(circulo1);

        //Circle 2
        System.out.println("\n------------------------Circle 2------------------------------\n");
        System.out.println(circulo2.toString());
        System.out.printf("Raio do Circulo 2 = %.2f. \nArea do Circulo 2 = %.2f.\n", circulo2.getRadius(), circulo2.getArea());
        System.out.println(circulo2);

    }

}
