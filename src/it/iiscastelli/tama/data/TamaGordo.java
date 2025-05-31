/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.iiscastelli.tama.data;

public class TamaGordo extends Tamagotchi {

    public TamaGordo(String nome, int sazieta) {
        super(nome, MAX_AFFETTO, sazieta);
    }

    @Override
    public boolean infelice() {
        return sazieta < SOGLIA_MIN_SAZIETA;
    }

    @Override
    public boolean morto() {
        return sazieta == MIN_SAZIETA;
    }

    @Override
    public void daiCarezze(int n) {
        int diminuzioneSazieta = (int) Math.round(n * DECREMENTO_SAZIETA);
        setSazieta(sazieta - 2 * diminuzioneSazieta);
    }

    @Override
    public void daiBiscotti(int n) {
        int aumentoSazieta = (int) Math.round(n * sazieta * INCREMENTO_SAZIETA);
        setSazieta(sazieta + aumentoSazieta);
    }

    @Override
    protected String getTipo() {
        return "Tamagordo";
    }

    @Override
    public String getNomeIcona32() {
        return "src/it/iis/tama/assets/TamaGordo32.png";
    }

    @Override
    public String getNomeIcona96() {
        return "src/it/iis/tama/assets/TamaGordo96.png";
    }
}
