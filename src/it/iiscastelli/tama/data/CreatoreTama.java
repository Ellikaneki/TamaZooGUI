/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.iiscastelli.tama.data;

import it.iiscastelli.tama.data.save.DatiTamagotchi;

/**
 *
 * @author Ely
 */
public class CreatoreTama {

    public static Tamagotchi crea(DatiTamagotchi datiTama) {
        return switch (datiTama.tipo()) {
            case "Tamagotchi" ->
                new Tamagotchi(datiTama.nome(), datiTama.affetto(), datiTama.sazieta());
            case "Tamatriste" ->
                new TamaTriste(datiTama.nome(), datiTama.sazieta());
            case "Tamagordo" ->
                new TamaGordo(datiTama.nome(), datiTama.sazieta());
            default ->
                null;
        };
    }
}
