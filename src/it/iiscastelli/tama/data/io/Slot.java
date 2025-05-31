/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.iiscastelli.tama.data.io;

public abstract class Slot {

    private int numero;

    public Slot(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}
