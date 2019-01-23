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
    
    
    public Persoal(int telefono, String correo){
        this.correo=correo;
        this.telefono=telefono;
        
    }

    public Persoal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
            
    }
    
}
