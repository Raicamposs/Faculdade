/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastro;
import TelaMenu.*;
/**.
 *
 * @author Raiane Campos
 */
public class TelaPrincipal {

  
    Alunos[] novoAluno = new Alunos[10];
    public int matricula = 0;

    public int matricula() {
        return matricula++;
    }

    public static void main(String[] argas) {
     
      TelaMenu.MenuPrincipal menu = new  TelaMenu.MenuPrincipal();
      menu.setVisible(true);
      

    }

}
