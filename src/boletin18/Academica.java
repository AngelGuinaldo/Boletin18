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

    private int numReferencia = 2018;
    private String nome;
    private int nota;
    private Persoal alum;
    
    public Academica(String nome,int numReferencia,int nota,Persoal alum){
        this.nota=nota;
        this.nome=nome;
        this.alum=alum;
        this.numReferencia=numReferencia;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;

    }
    
    public int getNota(){
        return nota;
    }
    
    public void setNota(int nota){
        this.nota=nota;
        
    }
    
   
    public String toString (){
        
        
    }

}
