/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author aguinaldogonzalez
 */
public class Persoal {
    private int telefono;
    private String correo;
    private String alum;
    
    public Persoal(int telefono, String correo){
        this.correo=correo;
        this.telefono=telefono;
        
    }
    
    public String getCorreo(){
        return correo;
    }
    
}
