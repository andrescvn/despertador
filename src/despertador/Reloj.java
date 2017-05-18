/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

/**
 * user menu
 *
 * @author acomesanavila
 */
public class Reloj {

    public static LocalTime hora;
    public static LocalTime alarma;

    /**
     * +
     * menu
     */
    public void main() {
        hora = LocalTime.of(0, 0);
        alarma=LocalTime.of(9,58);
        Boolean quedarse = true;
        Timer timer = new Timer();
        TimerTask task;
        task = new TimerTask() {
            @Override
            public void run() {
                if (alarma.getHour() == (LocalTime.now().getHour()+hora.getHour())
                        && alarma.getMinute() == (LocalTime.now().getMinute()+hora.getMinute())
                        && Botonera.alarmActive == true
                        && Altavoz.ringON==true) {
                    Altavoz.playSound();
                } else {
                    Display.showHr();
                }
            }
        };
        timer.schedule(task, 10, 10000);
        do {
            int option = Integer.parseInt(JOptionPane.showInputDialog(" 1) Alarma on\n 2) Alarma off \n 3) Configurar hora \n 4) Configurar Alarma \n 5) Parar alarma \n 6) Salir"
                    ));
            switch (option) {
                case 1:Botonera.alarmON();
                    break;
                case 2:Botonera.alarmOFF();
                    break;
                case 3:
                    Botonera.configHr();
                    break;
                case 4:
                    Botonera.configAlarm();
                    break;
                case 5:
                    Botonera.stopAlarm();
                    break;
                case 6:
                    quedarse=false;
                    break;
            }
        } while (quedarse);
        timer.cancel();
    }
}
