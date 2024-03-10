/*Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menghitung
Pembagi Bersama Terbesar dari dua buah bilangan a dan b yang diinput dari alat
masukan.*/

package method3;
import java.util.Scanner;
public class Method3 {
    public static int hitung(int a, int b){
        while (b != 0 ){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner method3 = new Scanner (System.in);
        
        System.out.print("Masukan angka : ");
        int a =method3.nextInt();
        System.out.print("Masukan angka : ");
        int b =method3.nextInt();
        
        int pbt = hitung(a, b);
        
        System.out.println("Pembagi dari : " + a + " dan " + b + " = " + pbt);
    }
    
}
