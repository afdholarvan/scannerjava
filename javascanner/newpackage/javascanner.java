package javascanner.newpackage;

import java.util.Scanner;

public class javascanner {

  public static void main(String[] args){
     String nama , warna,mesin;
     int harga,servisberkala;
     int kecepatan;
     
     Scanner key = new Scanner(System.in);
     System.out.println("   Data Mobil Pribadi   ");
     System.out.print("Nama Mobil = ");
     nama = key.nextLine();
     
     System.out.print("Warna Mobil = ");
     warna = key.nextLine();
     
     System.out.print("Jenis Mesin = ");
     mesin = key.nextLine();
     
     System.out.print("Harga = ");
     harga = key.nextInt();
     
     System.out.print("Servis berkala = " );
     servisberkala = key.nextInt();
     
     System.out.print("Kecepatan = "  );
     kecepatan = key.nextInt();
     
     System.out.println("======================");
     System.out.println("  DATA MOBIL PRIBADI   ");
     System.out.println("");
     System.out.println("Nama Mobil = " + nama);
     System.out.println("Warna MObil = " + warna);
     System.out.println("Nama Mesin = " + mesin);
     System.out.println("Harga Mobil = Rp." + harga  );
     System.out.println("Servis Berkala = " + servisberkala + "Km");
     System.out.println("Kecepatan = " + kecepatan + "Km/H");
     System.out.println("======================");
     
     
     
     
     
     
     
  }
          
  
    
    
    
    
    
}
