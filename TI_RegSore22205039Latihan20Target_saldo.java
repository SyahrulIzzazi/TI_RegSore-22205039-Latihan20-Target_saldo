package ti_regsore.pkg22205039.latihan20.target_saldo;
/*
NAMA    : Syahrul Izzazi
NIM     : 22205039
PRODI   : TI RegSore
DESKRIPSI : Program perhitungan lama tabungan mencapai saldo target
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class TI_RegSore22205039Latihan20Target_saldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldoawal;
        int bunga;
        int saldotarget;
        
        System.out.print("saldo awal: Rp.");
        saldoawal = scanner.nextInt();
        System.out.print("Bunga perbulan %:");
        bunga = scanner.nextInt();
        System.out.print("saldo target:");
        saldotarget = scanner.nextInt();
        
        int bulan = (saldotarget-saldoawal)/(saldoawal*bunga/100);
       
        
        for(int i = 1;i<= bulan;i++) {
            saldoawal = saldoawal + (saldoawal * bunga/100);
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            String formattedsaldoawal = decimalFormat.format(saldoawal);
            System.out.println("Saldo di bulan ke- " +i+" Rp "+ formattedsaldoawal);
        }
    
    }
    
}
