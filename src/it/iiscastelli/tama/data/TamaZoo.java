/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package it.iiscastelli.tama.data;

import it.iiscastelli.tama.data.save.DatiTamaZoo;
import it.iiscastelli.tama.data.save.DatiTamagotchi;
import java.beans.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ely
 */
public class TamaZoo implements Serializable {

    public static final String PROP_TAMA = "tama";
    public static final String PROP_INDICE = "indice";

    private List<Tamagotchi> zoo;

    private PropertyChangeSupport propertySupport;

    public TamaZoo() {
        zoo = new ArrayList<>();
        propertySupport = new PropertyChangeSupport(this);
    }

    public TamaZoo(DatiTamaZoo dati) {
        this();
        for (DatiTamagotchi datiTama : dati.elencoTama()) {
            zoo.add(CreatoreTama.crea(datiTama));
        }
    }

    public void aggiungi(Tamagotchi tama) {
        zoo.add(tama);
        propertySupport.firePropertyChange(PROP_TAMA, null, tama);
    }

    public Tamagotchi elimina(int indice) {
        Tamagotchi tama = zoo.remove(indice);
        propertySupport.firePropertyChange(PROP_INDICE, -1, indice);
        return tama;
    }

    public List<Tamagotchi> getList() {
        return zoo;
    }

    public Tamagotchi get(int i) {
        return zoo.get(i);
    }

    public DatiTamaZoo getDati() {
        List<DatiTamagotchi> datiTama = new ArrayList<>();
        for (Tamagotchi tama : zoo) {
            datiTama.add(tama.getDati());
        }
        return new DatiTamaZoo(datiTama);
    }

    public int conta() {
        return zoo.size();
    }

    public void svuota() {
        zoo.clear();
    }

    public boolean tuttiMorti() {
        for (Tamagotchi tama : zoo) {
            if (!tama.morto()) {
                return false;
            }
        }
        return true;
    }

    public ContatoriZoo contaTama() {
        int numTamagotchi = 0;
        int numTamaTristi = 0;
        int numTamaGordi = 0;
        int numTamaMorti = 0;
        for (Tamagotchi tama : zoo) {
            if (tama.morto()) {
                numTamaMorti++;
            } else {
                switch (tama) {
                    case TamaTriste t ->
                        numTamaTristi++;
                    case TamaGordo t ->
                        numTamaGordi++;
                    default ->
                        numTamagotchi++;
                }
            }
        }
        return new ContatoriZoo(numTamagotchi, numTamaTristi, numTamaGordi, numTamaMorti);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}
