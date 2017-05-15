/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

import java.time.LocalTime;

/**
 * interfaz methods
 *
 * @author acomesanavila
 */
public class Botonera {

    static boolean alarmActive, setHR, setAlarm;

    /**
     * set the alarm ON
     */
    public void alarmON() {
        alarmActive = true;
        Altavoz.ringON = true;
    }

    /**
     * set the alarm OFF
     */
    public void alarmOFF() {
        alarmActive = false;
    }

    /**
     * config the clock hour
     */
    public static void configHr() {
        Display.showLED(true, false, true);
        Display.showHr();
    }

    /**
     * config the alarm hour
     */
    public static void configAlarm() {
        Display.showLED(false, true, true);
        Display.showAlarm();
    }

    /**
     * increase the hour
     */
    public static void plusMin() {
        if (Display.ledset == true) {
            Reloj.hora=Reloj.hora.plusMinutes(1);
            Display.showHr();
        }
    }

    /**
     * increase the minutes
     */
    public static void plushr() {
        if (Display.ledset == true) {
            Reloj.hora=Reloj.hora.plusHours(1);
            Display.showHr();
        }
    }

    /**
     * stop the alarm melody
     */
    public void stopAlarm() {
        if (Altavoz.ringON == true) {
            Altavoz.ringON = false;
        }
    }
}
