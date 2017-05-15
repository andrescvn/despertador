/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

/**
 *
 * @author acomesanavila
 */
public class Despertador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Botonera bot = new Botonera();
        Display.showHr();
        Botonera.configHr();
        Botonera.plusMin();
    }

}
