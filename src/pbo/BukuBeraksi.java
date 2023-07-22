package pbo;

import java.util.Scanner;

public class BukuBeraksi {
    public static void main(String[] args) {
        //objek
        //Buku buku = new Buku ("Si Kancil","21123456");
                
        //System.out.println(buku.displayInfo());
        //System.out.println(buku.displayInfo("Cindy Fiora"));
        
        //error handling
        try{
            //io sederhana
            Scanner scanner = new Scanner(System.in);

            //array
            BukuDetail[] buku = new BukuDetail[2];

            //perulangan
            for(int i=0; i<buku.length; i++){
                System.out.print("Masukkan judul buku "+ (i+1)+": ");
                String judul = scanner.nextLine();
                System.out.print("Masukkan kode buku "+ (i+1)+": ");
                String kode = scanner.nextLine();

                //objek
                buku[i] = new BukuDetail(judul, kode);
            }

            for(BukuDetail data: buku){
                System.out.println("====================");
                System.out.println("Data Buku: ");
                System.out.println(data.displayInfo());
           }
        }catch (NumberFormatException e){
            System.out.println("Kesalahan format nomor: "+e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan format Kode: "+e.getMessage());
        }catch (Exception e) {
            System.out.println("Kesalahan umum: "+e.getMessage());
        }
    }
}
