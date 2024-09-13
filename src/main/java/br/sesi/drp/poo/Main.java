package br.sesi.drp.poo;

import br.sesi.drp.poo.cabeca.Cabeca;
import br.sesi.drp.poo.cabeca.Olho;

public class Main {

    public static void main(String[] args) {
        Olho olho1 = new Olho();
        olho1.cego = true;
        olho1.diametroOlho = 2.0f;
        olho1.corIris = "azul";

        Olho olho2 = new Olho();
        olho2.cego = false;
        olho2.diametroOlho = 2.5f;
        olho2.corIris = "castanho";

        Cabeca cabeca = new Cabeca();
        cabeca.olhoDireito = olho1;
        cabeca.olhoDireito = olho2;

        Pessoa pessoa1 = new Pessoa();

        pessoa1.cabeca = cabeca;
    }
}