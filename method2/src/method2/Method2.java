/*Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menampilkan
jumlah deret bilangan genap dari batasAwal dan batasAkhir yang diinput dari alat
masukan.*/

package method2;
import java.util.Scanner;
public class Method2 {
    public static int deret(int batasAwal, int batasAkhir){

        int jumlah=0;
        
        for (int i = batasAwal;i<=batasAkhir;i++){
            if (i % 2 == 0){
                System.out.println(i);
                jumlah++;
            }
        }
        return jumlah;
    }
    
    public static void main(String[] args) {
        Scanner method2 = new Scanner (System.in);
        
        System.out.print("Masukkan batas awal : ");
        int batasAwal = method2.nextInt();
        System.out.print("Masukkan batas akhir : ");
        int batasAkhir = method2.nextInt();
        
        int jumlahderet=deret(batasAwal, batasAkhir);
        System.out.println("Jumlah deret bilangan genap dari " + batasAwal + " hingga " + batasAkhir + " yaitu ada : " + jumlahderet);
        
       method2.close();
    
    }
    
}
