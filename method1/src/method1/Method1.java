/*Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, mengulang
menuliskan teks “Saya senang belajar bahasa Java” sebanyak N kali, dengan nilai N yang
akan dibaca dengan perintah inputan menggunakan perulangan for.*/
package method1;

import java.util.Scanner;
public class Method1 {
public static void perulangan(int angka) {
        for (int i = 0; i < angka; i++) {
            System.out.println("Saya senang belajar bahasa Java");
        }
    }
    
    public static void main(String[] args) {
        Scanner method1 = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        int angka = method1.nextInt();
        
        perulangan(angka);
        
        method1.close();
        
    }
    
}
