/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Telas.Icones.TelaPrincipal;



/**
 *
 * @author HJP_TI-CPD2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        telaPrincipal.setExtendedState(telaPrincipal.MAXIMIZED_BOTH);
    }
    
}
