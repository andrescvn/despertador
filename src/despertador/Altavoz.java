/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

/**
 * speakers methods
 *
 * @author acomesanavila
 */
public class Altavoz {

    static boolean ringON = true;
    static String melodia = "ALARMA!!!!";

    /**
     * play the alarm
     */
    public static void playSound() {
        System.out.println(melodia);
    }
}
