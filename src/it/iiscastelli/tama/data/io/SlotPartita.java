/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.iiscastelli.tama.data.io;

import it.iiscastelli.tama.data.ContatoriZoo;
import it.iiscastelli.tama.data.TamaZoo;
import it.iiscastelli.tama.data.save.DatiTamaZoo;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Ely
 */
public class SlotPartita extends Slot {

    private File file;
    private TamaZoo zoo;

    public SlotPartita(int numero, File file) throws IOException {
        super(numero);
        this.file = file;
        caricaZoo();
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public TamaZoo getZoo() {
        return zoo;
    }

    public void setZoo(TamaZoo zoo) {
        this.zoo = zoo;
    }

    public String getDataOra() {
        Date dataOra = new Date(file.lastModified());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        return formato.format(dataOra);
    }

    public ContatoriZoo getContatori() {
        return zoo.contaTama();
    }

    public long getDimensione() {
        return file.length();
    }

    private void caricaZoo() throws IOException {
        try {
            FileInputStream file = new FileInputStream(this.file);
            BufferedInputStream buffer = new BufferedInputStream(file);
            ObjectInputStream reader = new ObjectInputStream(buffer);
            DatiTamaZoo dati = (DatiTamaZoo) reader.readObject();
            zoo = new TamaZoo(dati);
            reader.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new IOException();
        }
    }

}
