/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package putri_narila;

/**
 *
 * @author ACENKCOM
 */
public class Putri_narila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {30, 29, 28, 27, 26, 16, 1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        
        // Menampilkan angka secara berurutan dari index 0 hingga 4
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        // Menampilkan angka secara berurutan dari index 10 hingga 5 (dalam urutan terbalik)
        for (int i = 10; i >= 5; i--) {
            System.out.print(numbers[i] + " ");
        }
        
        // Menampilkan angka 15 (index ke-15)
        System.out.print(numbers[15]);
    
    }
    
}
