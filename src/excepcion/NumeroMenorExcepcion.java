/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;

/**
 *
 * @author Acosta
 */
public class NumeroMenorExcepcion extends Exception{

    @Override
    public String getMessage() {
        //return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
        return "Error, menor que 10";
    }
    
}
