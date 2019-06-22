/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_miguelblanco;

import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.JTextArea;

/**
 *
 * @author migue
 */
public class administrarBarra extends Thread {

    private JProgressBar barra;
    private JTextArea test;
    private double tiempo;
    private boolean avanzar;
    private boolean vive;

    public administrarBarra(JProgressBar barra, JTextArea test, double tiempo) {
        this.barra = barra;
        this.test = test;
        this.tiempo = tiempo;
        this.avanzar = true;
        this.vive = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    @Override
    public void run() {
        while (vive) {
            if (avanzar) {
                barra.getValue();
                barra.setValue(barra.getValue() + 1);
                if (barra.getValue() == barra.getMaximum()) {
                    barra.setValue(0);
                    barra.setMaximum(0);
                    barra.setString("");
                    while (vive) {
                        test.append("Mensaje enviado");
                        avanzar = false;
                        vive = false;
                    }
                }
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}
