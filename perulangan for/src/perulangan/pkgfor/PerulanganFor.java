/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan.pkgfor;

import javax.swing.JOptionPane;

/**
 *
 * @author ACENKCOM
 */
public class PerulanganFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0, jumgenap=0, jumganjil=0;
        Boolean ulang=true;
        while(ulang){
            String data_N=JOptionPane.showInputDialog("masukan bilangan");
            int N= Integer.parseInt(data_N);
            if (N > 0) {
            if(N%2==0) {
              jumgenap=jumgenap+1;  
            }  
            else{
                jumganjil=jumganjil+1;
            }
            i=i+1;
            System.out.println("banyaknya bilangan genap sampai iterasi "+i+"="+jumgenap);
                System.out.println("banyaknya bilangan genap sampaiiterasi "+i+jumganjil);
                
            }
            else{
                ulang=false;
            }
        }
        System.out.println("perulangan selesai");
    }
    
    
}
