package Cylinder;
/*
 * ClassName TestCylinder 
 * Version information 1.0 
 * Date 04/04/2014 
 * @author Raiane Campos 
 * Copyright notice class destinada a testar os objetos das classes Circle
 */

public class TestCylinder {

    public static void main(String[] args) {

        // Declaração dos objetos
        Cylinder cilindro[] = new Cylinder[3];

        // Construção dos objetos  
        cilindro[0] = new Cylinder(2, 10);
        cilindro[1] = new Cylinder(3, 20);
        cilindro[2] = new Cylinder(5, 7);

        //Utilização dos  metodos dos objeto Cylinder.
        for (int i = 0; i < cilindro.length; i++) {
            System.out.println("------------------------Cylinder " + (i + 1) + "------------------------------");
            System.out.println(cilindro[i].toString());
            System.out.printf("Altura = %.2f. \nVolume = %.2f. \nArea = %.2f. \n",
                    cilindro[i].getHeight(),
                    cilindro[i].getVolume(),
                    cilindro[i].getArea());
        }

    }
}
