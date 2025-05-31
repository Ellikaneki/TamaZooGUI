/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package it.iiscastelli.tama.data;

import it.iiscastelli.tama.data.save.DatiTamagotchi;
import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Ely
 */
public class Tamagotchi implements Serializable {

    public static final int MIN_AFFETTO = 0;
    public static final int MAX_AFFETTO = 100;
    public static final int MIN_SAZIETA = 0;
    public static final int MAX_SAZIETA = 100;

    private static final int SOGLIA_MIN_AFFETTO = 30;
    protected static final int SOGLIA_MIN_SAZIETA = 30;
    private static final int SOGLIA_MAX_SAZIETA = 90;

    protected static final double INCREMENTO_SAZIETA = 0.1;
    private static final double DECREMENTO_AFFETTO = 0.25;
    protected static final double DECREMENTO_SAZIETA = 0.5;

    public static final String PROP_NOME = "nome";
    public static final String PROP_AFFETTO = "affetto";
    public static final String PROP_SAZIETA = "sazieta";

    private String nome;
    protected int affetto;
    protected int sazieta;

    private PropertyChangeSupport propertySupport;

    public Tamagotchi(String nome, int affetto, int sazieta) {
        this.nome = nome;
        this.affetto = affetto;
        this.sazieta = sazieta;
        propertySupport = new PropertyChangeSupport(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertySupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }

    public void setAffetto(int affetto) {
        int oldAffetto = this.affetto;
        if (affetto < MIN_AFFETTO) {
            this.affetto = MIN_AFFETTO;
        } else if (affetto > MAX_AFFETTO) {
            this.affetto = MAX_AFFETTO;
        } else {
            this.affetto = affetto;
        }
        propertySupport.firePropertyChange(PROP_AFFETTO, oldAffetto, this.affetto);
    }

    public void setSazieta(int sazieta) {
        int oldSazieta = this.sazieta;
        if (sazieta < MIN_SAZIETA) {
            this.sazieta = MIN_SAZIETA;
        } else if (sazieta > MAX_SAZIETA) {
            this.sazieta = MAX_SAZIETA;
        } else {
            this.sazieta = sazieta;
        }
        propertySupport.firePropertyChange(PROP_SAZIETA, oldSazieta, this.sazieta);
    }

    public int getAffetto() {
        return affetto;
    }

    public int getSazieta() {
        return sazieta;
    }

    protected String getTipo() {
        return "Tamagotchi";
    }

    public String getNomeIcona32() {
        return "src/it/iis/tama/assets/Tamagotchi32.png";
    }

    public String getNomeIcona96() {
        return "src/it/iis/tama/assets/Tamagotchi96.png";
    }

    public DatiTamagotchi getDati() {
        return new DatiTamagotchi(nome, affetto, sazieta, getTipo());
    }

    public Object[] toTableRow() {
        return new Object[]{
            getNomeIcona32(),
            nome,
            affetto,
            sazieta
        };
    }

    public void daiBiscotti(int n) {
        int aumentoSazieta = (int) Math.round(n * sazieta * INCREMENTO_SAZIETA);
        setSazieta(sazieta + aumentoSazieta);
        int diminuzioneSoddisfazione = (int) Math.round(n * DECREMENTO_AFFETTO);
        setAffetto(affetto - diminuzioneSoddisfazione);
    }

    public void daiCarezze(int n) {
        setAffetto(affetto + n);
        int diminuzioneSazieta = (int) Math.round(n * DECREMENTO_SAZIETA);
        setSazieta(sazieta - diminuzioneSazieta);
    }

    public boolean morto() {
        return affetto == MIN_AFFETTO || sazieta == MIN_SAZIETA || sazieta == MAX_SAZIETA;
    }

    public boolean infelice() {
        return affetto < SOGLIA_MIN_AFFETTO || sazieta < SOGLIA_MIN_SAZIETA || sazieta > SOGLIA_MAX_SAZIETA;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}
