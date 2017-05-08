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

    static boolean ringON;
    String melodia;

    /**
     * play the alarm
     */
    public void playSound() {
        if (Botonera.alarmActive == true && Reloj.hora == Reloj.alarma && ringON == true) {
            System.out.println(melodia);
        }

    }
}
