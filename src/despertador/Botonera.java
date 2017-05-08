/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

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
        Display.showAlarm(Reloj.horas,Reloj.minutos);

    }

    /**
     * config the alarm hour
     */
    public static void configAlarm() {
        Display.showLED(false, true, true);
        Display.showHr(Reloj.horas,Reloj.minutos);
    }

    /**
     * increase the hour
     */
    public void plusHr(int hora) {
        if(Display.ledclock==true ||Display.ledalarm==true){
        hora++;
       
        }

    }

    /**
     * increase the minutes
     */
    public void plusMin(int minutos) {
        if(Display.ledclock==true ||Display.ledalarm==true){
        minutos++;
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
