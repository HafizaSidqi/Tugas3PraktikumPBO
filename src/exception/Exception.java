/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ikhsan
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner pilih = new Scanner(System.in);
        double p_balok =0, l_balok =0, t_balok = 0;
        double r_kerucut = 0, t_kerucut = 0;
        double a_segitiga= 0, t_segitiga=0, t_limas=0;
    
        Volume volume = new Volume();
        int pilihan;
        
        System.out.println("PILIHAN : ");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Limas Segitiga");
        System.out.println("Masukkan Pilihan = ");
        pilihan = pilih.nextInt();            //input pilihan
        
        //switch case
        switch (pilihan)
        {
            case 1 :    
                    try{
                        Scanner pjg_balok = new Scanner(System.in);
                        System.out.println("Masukkan Panjang");
                        p_balok = pjg_balok.nextDouble();
                        
                        Scanner lbr_balok = new Scanner(System.in);
                        System.out.println("Masukkan Lebar");
                        l_balok = lbr_balok.nextDouble();
                        
                        Scanner tg_balok = new Scanner(System.in);
                        System.out.println("Masukkan Tinggi");
                        t_balok = tg_balok.nextDouble();
                    } catch(InputMismatchException a){
                        System.out.println("Terjadi kesalahan saat proses input, Coba Lagi");
                        Scanner pjg_balok = new Scanner(System.in);
                        System.out.println("Masukkan Panjang");
                        p_balok = pjg_balok.nextDouble();
                        
                        Scanner lbr_balok = new Scanner(System.in);
                        System.out.println("Masukkan Lebar");
                        l_balok = lbr_balok.nextDouble();
                        
                        Scanner tg_balok = new Scanner(System.in);
                        System.out.println("Masukkan Tinggi");
                        t_balok = tg_balok.nextDouble();
                    } finally {
                       double volume_balok = volume.balok(p_balok, l_balok, t_balok);
                       System.out.println("Volume Balok = "+ volume_balok);
                    }
                    break;

            
            case 2 :    
                    try{
                        Scanner jari2 = new Scanner(System.in);
                        System.out.println("Masukkan Jari-jari");
                        r_kerucut = jari2.nextDouble();
                        
                        Scanner tg_kerucut = new Scanner(System.in);
                        System.out.println("Masukkan tinggi");
                        t_kerucut = tg_kerucut.nextDouble();
                    } catch(InputMismatchException b) {
                        System.out.println("Terjadi kesalahan saat proses input, Coba Lagi");
                        Scanner jari2 = new Scanner(System.in);
                        System.out.println("Masukkan Jari-jari");
                        r_kerucut = jari2.nextDouble();
                        
                        Scanner tg_kerucut = new Scanner(System.in);
                        System.out.println("Masukkan tinggi");
                        t_kerucut = tg_kerucut.nextDouble();
                    } finally {
                        double volume_kerucut = volume.kerucut(r_kerucut, t_kerucut);
                        System.out.println("Volume = "+ volume_kerucut);
                    }
                    break;
                    
            case 3 :    
                    try{
                        Scanner als_segitiga = new Scanner(System.in);
                        System.out.println("Masukkan Alas Segitiga");
                        a_segitiga = als_segitiga.nextDouble();
                        
                        Scanner tg_segitiga = new Scanner(System.in);
                        System.out.println("Masukkan tinggi segitiga");
                        t_segitiga = als_segitiga.nextDouble();
                        
                        Scanner tg_limas = new Scanner(System.in);
                        System.out.println("Masukkan tinggi limas");
                        t_limas = tg_limas.nextDouble();
                    } catch(InputMismatchException c) {
                        System.out.println("Terjadi kesalahan saat proses input, Coba Lagi");
                        Scanner als_segitiga = new Scanner(System.in);
                        System.out.println("Masukkan Alas Segitiga");
                        a_segitiga = als_segitiga.nextDouble();
                        
                        Scanner tg_segitiga = new Scanner(System.in);
                        System.out.println("Masukkan tinggi segitiga");
                        t_segitiga = als_segitiga.nextDouble();
                        
                        Scanner tg_limas = new Scanner(System.in);
                        System.out.println("Masukkan tinggi limas");
                        t_limas = tg_limas.nextDouble();
                    } finally{
                        double volume_limas = volume.limas_segitiga(a_segitiga, t_segitiga, t_limas);
                        System.out.println("Volume = " + volume_limas);
                    }
                    break;
        }
    }
    
}
