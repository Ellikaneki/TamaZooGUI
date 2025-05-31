/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.iiscastelli.tama.util;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.swing.JTextArea;

public class ScritturaLenta implements Runnable {

    private JTextArea textArea;
    private BlockingQueue<String> codaTesti;
    private Thread thread;

    public ScritturaLenta(JTextArea textArea) {
        this.textArea = textArea;
        codaTesti = new LinkedBlockingQueue<>();
        thread = new Thread(this);
        thread.setDaemon(true);
        thread.start();
    }

    public void scrivi(String testo) {
        codaTesti.offer(testo);
    }

    @Override
    public void run() {
        while (true) {
            try {
                String testo = codaTesti.take();
                if (testo.isEmpty()) {
                    textArea.setText(null);
                } else {
                    for (int i = 0; i < testo.length(); i++) {
                        textArea.setText(testo.substring(0, i + 1));
                        Thread.sleep(25);
                    }
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ex) {
                break;
            }
        }
    }

}
