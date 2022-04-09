package DataPegawai2;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
import java.util.Scanner;
public class KantorCabang_Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pegawai : ");
        int jumlahPegawai = input.nextInt();
        KantorCabang kc =  new KantorCabang("B0001","Mangkukusuman","Yogyakarta");
        Pegawai[] dataPegawai = new Pegawai[KantorCabang.MAX_PEGAWAI];
        kc.setPegawaiArray(dataPegawai, jumlahPegawai);
        for ( int i = 0; i<jumlahPegawai; i++){
          System.out.println("\nPegawai "+(i+1));
          System.out.print("Masukkan nama :"); 
          String nama = input.next();
          System.out.print("Masukkan ID :"); 
          int id = input.nextInt();
          System.out.print("Masukkan department :");
          String department = input.next();
          System.out.print("Masukkan gaji :"); 
          int gaji = input.nextInt();
          dataPegawai [i] = new Pegawai (id,nama,department,gaji);
        }
        System.out.println(kc.toString());
        
        System.out.print("Cari data pegawai dengan nama     : ");
        String cariNama = input.next();
        Pegawai cari = kc.findPegawai(cariNama);
        System.out.println("----------------------------\n"+
                           cari+"\n----------------------------\n");
        
        System.out.print("Cari data pegawai dengan ID: ");
        int cariID = input.nextInt();
        cari = kc.findPegawai(cariID);
        System.out.println("----------------------------\n"+
                           cari+"\n----------------------------\n");
        
        System.out.println("Tambah Data");
        System.out.print("Masukkan nama :"); 
        String nama = input.next();
        System.out.print("Masukkan ID :"); 
        int id = input.nextInt();
        System.out.print("Masukkan department :");
        String department = input.next();
        System.out.print("Masukkan gaji :"); 
        int gaji = input.nextInt();
        kc.addPegawai(new Pegawai(id, nama, department, gaji));
        System.out.println("\n#Update\n"+kc.toString());
          
        System.out.println("Hapus Data");
        System.out.print("Masukkan posisi data : ");
        kc.removePegawai(input.nextInt());
        System.out.println("\n#Update\n"+kc.toString());
          
        Pegawai terkecil = kc.getPegawaiGajiTerkecil();
        System.out.println("-----------------------------\n"+
                          "Pegawai Gaji Terkecil\n" +terkecil+
                          "\n-----------------------------");
        Pegawai terbesar = kc.getPegawaiGajiTerbesar();
        System.out.println("-----------------------------\n"+
                          "Pegawai Gaji Terbesar\n" +terbesar+
                          "\n-----------------------------");             
    }
        
}
//

//        int jumlahPegawai = 1;
//        KantorCabang kc =  new KantorCabang("B0001","Mangkukusuman","Yogyakarta");
//        Pegawai[] dataPegawai = new Pegawai[KantorCabang.MAX_PEGAWAI];
//        kc.setPegawaiArray(dataPegawai, jumlahPegawai);
//        dataPegawai [0] = new Pegawai(2153, "budi","h",12000);
//        jumlahPegawai++;
//        dataPegawai [1] = new Pegawai (2134, "ok", "ok", 1235);
//        jumlahPegawai++;
//        dataPegawai [2] = new Pegawai (2134, "ok", "ok", 1235);
//        jumlahPegawai++;