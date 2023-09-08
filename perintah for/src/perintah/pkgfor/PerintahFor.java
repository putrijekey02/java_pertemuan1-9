/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perintah.pkgfor;

import javax.swing.JOptionPane;

/**
 *
 * @author ACENKCOM
 */
public class PerintahFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String data_N = JOptionPane.showInputDialog("masukan bilanangan:");
        int N = Integer.parseInt(data_N);
        int faktorial =1 ;
        for (int i=1 ; i<=N ; i++){
            faktorial = faktorial*1;     
        }
        System.out.println("Nilai"+N+"!="+faktorial);
    }
 
}
