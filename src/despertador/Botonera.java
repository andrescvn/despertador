/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

import javax.swing.JOptionPane;

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
    public static void alarmON() {
        alarmActive = true;
        Altavoz.ringON = true;
    }

    /**
     * set the alarm OFF
     */
    public static void alarmOFF() {
        alarmActive = false;
    }

    /**
     * config the clock hour
     */
    public static void configHr() {
        int op;
        Display.showLED(true, false, true);
        Display.showHr();
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1) hora \n 2) min \n 3) Salir"));
            switch (op) {
                case 1:
                    plushr("hora");
                    break;
                case 2:
                    plusMin("hora");
                    break;
            }
        } while (op != 3);
        Display.showLED(false, false, false);
    }

    /**
     * config the alarm hour
     */
    public static void configAlarm() {
        int op;
        Display.showLED(false, true, true);
        Display.showAlarm();
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("1) hora \n 2) min \n 3) Salir"));
            switch (op) {
                case 1:
                    plushr("alarma");
                    break;
                case 2:
                    plusMin("alarma");
                    break;
            }
        } while (op != 3);
        Display.showLED(false, false, false);
    }

    /**
     * increase the hour
     */
    public static void plusMin(String tiempo) {
        if (tiempo.equals("hora")) {
            if (Display.ledset == true) {
                Reloj.hora = Reloj.hora.plusMinutes(1);
                Display.showHr();
            }
        } else if (Display.ledset == true) {
            Reloj.alarma = Reloj.alarma.plusMinutes(1);
            Display.showAlarm();
        }
    }

    /**
     * increase the minutes
     */
    public static void plushr(String tiempo) {
        if (tiempo.equals("hora")) {
            if (Display.ledset == true) {
                Reloj.hora = Reloj.hora.plusHours(1);
                Display.showHr();
            }
        } else if (Display.ledset == true) {
            Reloj.alarma = Reloj.alarma.plusHours(1);
            Display.showAlarm();
        }
    }

    /**
     * stop the alarm melody
     */
    public static void stopAlarm() {
        if (Altavoz.ringON == true) {
            Altavoz.ringON = false;
        }
    }
}
