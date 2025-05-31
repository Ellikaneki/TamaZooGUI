/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.iiscastelli.tama.data;

public class TamaTriste extends Tamagotchi {

    public TamaTriste(String nome, int sazieta) {
        super(nome, MIN_AFFETTO, sazieta);
    }

    @Override
    public boolean infelice() {
        return true;
    }

    @Override
    public boolean morto() {
        return sazieta == MIN_SAZIETA || sazieta == MAX_SAZIETA;
    }

    @Override
    public void daiCarezze(int n) {
        int diminuzioneSazieta = (int) Math.round(n * DECREMENTO_SAZIETA);
        setSazieta(sazieta - diminuzioneSazieta);
    }

    @Override
    public void daiBiscotti(int n) {
        int aumentoSazieta = (int) Math.round(n * sazieta * INCREMENTO_SAZIETA);
        setSazieta(sazieta + aumentoSazieta);
    }

    @Override
    protected String getTipo() {
        return "Tamatriste";
    }

    @Override
    public String getNomeIcona32() {
        return "src/it/iis/tama/assets/TamaTriste32.png";
    }

    @Override
    public String getNomeIcona96() {
        return "src/it/iis/tama/assets/TamaTriste96.png";
    }
}
