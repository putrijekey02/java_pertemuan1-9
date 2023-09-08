/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaslooping_putrinarila;

/**
 *
 * @author ACENKCOM
 */
public class tugas2 {
    public static void main(String[] args) {
        int batasAtas = 10; 

        int jumlahGenap = 0;
        int jumlahGanjil = 0;

        System.out.print("Bilangan Ganjil: ");
        for (int i = 1; i <= batasAtas; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                jumlahGanjil += i;
            }
        }
        System.out.println("= " + jumlahGanjil);

        System.out.print("Bilangan Genap: ");
        for (int i = 1; i <= batasAtas; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                jumlahGenap += i;
            }
        }
        System.out.println("= " + jumlahGenap);
    }
    
}
