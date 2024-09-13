package br.sesi.drp.poo;

import br.sesi.drp.poo.cabeca.Cabeca;
import br.sesi.drp.poo.inferior.MembrosInferiores;
import br.sesi.drp.poo.tronco.Tronco;

public class Pessoa {
    Cabeca cabeca;
    Tronco tronco;
    MembrosInferiores inferior;

    public Pessoa(){
        this.cabeca = new Cabeca();
        this.tronco = new Tronco();
        this.inferior = new MembrosInferiores();
    }
}