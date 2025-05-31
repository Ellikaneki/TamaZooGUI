/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package it.iiscastelli.tama.data.save;

import java.io.Serializable;

/**
 *
 * @author Ely
 */
public record DatiTamagotchi(String nome, int affetto, int sazieta, String tipo) implements Serializable {

}
