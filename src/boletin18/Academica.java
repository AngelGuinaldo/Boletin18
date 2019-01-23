/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import Clases.Persoal;

/**
 *
 * @author aguinaldogonzalez
 */
public class Academica {

    private static int numReferencia = 2018;
    private String nome;
    private int nota;
    private Persoal per = new Persoal();

    public Academica() {
        numReferencia++;
    }

    public Academica(String nome, int numReferencia, int nota, Persoal per) {
        this.nota = nota;
        this.nome = nome;
        this.per = per;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;

    }

}
