/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubClass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
/**
 *
 * @author NITRO 5
 */
public abstract class Karyawan extends tambahKaryawanBaru implements GajiKaryawan{
    ArrayList<String>   kodeKaryawan            = new ArrayList<>();  
    ArrayList<String>   namaKaryawan            = new ArrayList<>();
    ArrayList<String>   golKaryawan             = new ArrayList<>();
    ArrayList<Integer>  usiaKaryawan            = new ArrayList<>();
    ArrayList<String>   statusKaryawan          = new ArrayList<>();
    ArrayList<Integer>  anakKaryawan            = new ArrayList<>();        
    ArrayList<Integer>  gajiPokokKaryawan       = new ArrayList<>();
    ArrayList<Double>   tunjanganIstriKaryawan  = new ArrayList<>();
    ArrayList<Double>   tunjanganKaryawan       = new ArrayList<>();
    ArrayList<Double>   tunjanganAnakKaryawan   = new ArrayList<>();
    ArrayList<Double>   gajiKotorKaryawan       = new ArrayList<>();
    ArrayList<Double>   potonganKaryawan        = new ArrayList<>();
    ArrayList<Double>   gajiBersihKaryawan      = new ArrayList<>();
    
    int tunjanganistrikaryawan  = 0, gajikotor,tunjangananak = 0, tunjangankaryawan       = 0, gajibersih, potong;            
    @Override
        public double TunjanganIstri() {                    
            return tunjanganistrikaryawan = (int) (gajipokok * 0.1);
        }
        public double TunjanganKaryawan() {
            if(super.usiakaryawan>30){
            tunjangankaryawan           = (int) (gajipokok * 0.15);                
            }
            return tunjangankaryawan    = (int) (gajipokok * 0.15);
        }
    @Override
        public double TunjanganAnak() {
            if(super.jumlahanakkaryawan>0){
            tunjangananak               = (int) (gajipokok * jumlahanakkaryawan * 0.05);
            }
            return tunjangananak        = (int) (gajipokok * jumlahanakkaryawan * 0.05);
        }
    @Override
        public double GajiKotor() {
            return
            gajikotor = gajipokok + tunjangankaryawan + tunjanganistrikaryawan + tunjangananak;
        }
    @Override
         public double Potongan() {
            return
            potong = (int) (gajikotor * 0.025);
        }
    @Override
        public double GajiBersih() {
            return gajibersih = gajikotor - potong;
        }   
        public void Add() throws IOException {
            Scanner dyv = new Scanner(System.in);
        System.out.println("\t\t\t\tTAMBAH DATA KARYAWAN"
                + "\n----------------------------------------------------------------------------------------");    		
    	System.out.print("Masukkan Kode Karyawan\t\t\t: ");
    	kodekaryawan    = dyv.nextLine(); 
    	System.out.print("Masukkan Nama Karyawan\t\t\t: ");
    	namakaryawan    = dyv.nextLine(); 
    	System.out.print("Masukkan Alamat\t\t\t\t: ");
    	alamatkaryawan  = dyv.nextLine();
        System.out.print("Masukkan Tahun Kelahiran (YYYY)\t\t: ");
        int tahunlahir; 
        System.out.print("Masukkan Tanggal Lahir (YYYY-MM-DD) \t: "+(tahunlahir = dyv.nextInt())+"-"+(ttlkaryawan = dyv.nextLine()));
        usiakaryawan    = 2021-tahunlahir;
        ttlkaryawan     = dyv.nextLine();
        boolean running = true;
        int counter     = 0;
        while( running ) {
            System.out.print("Masukkan Golongan (A/B/C)\t\t: ");
                    golkaryawan = dyv.nextLine();
                    if( golkaryawan.equalsIgnoreCase("A") ) {
                        gajipokok =+ 5000000;
                        running = false;
                    } else if( golkaryawan.equalsIgnoreCase("B") ) {
                        gajipokok =+ 6000000;
                        running = false;
                    } else if( golkaryawan.equalsIgnoreCase("C") ) {
                        gajipokok =+ 7000000;
                        running = false;
                    }                    
                    else{
                        System.out.println("Inputkan golongan dengan benar (A/B/C)");
                    running = true;
                    counter ++;
                    }
        }                
        boolean berjalan = true;
        while( berjalan ) {
            String statuskaryawan;
                    System.out.print("Masukkan Status Menikah (1 : Sudah / 0 : Belum)\t: ");
                    statuskaryawan = dyv.nextLine(); 
                    
                    if( statuskaryawan.equals("1") ) {
                        statusmenikahkaryawan = "Sudah Menikah";
                        System.out.println("\t(Karyawan Sudah Menikah)");
                        System.out.print("Masukkan Jumlah Anak\t\t\t: ");    
                        jumlahanakkaryawan = dyv.nextInt();
                        berjalan = false;
                    } else if( statuskaryawan.equals("0") ) {
                        statusmenikahkaryawan = "Belum Menikah";
                        System.out.println("\t(Karyawan Belum Menikah)");
                        jumlahanakkaryawan = 0;
                        berjalan = false;
                    }                   
                    else{
                        System.out.println("Inputkan status menikah dengan benar (1 : Sudah / 0 : Belum)");
                        berjalan = true;
                        counter ++;
                    }
                }
        kodeKaryawan.add(kodekaryawan);
        namaKaryawan.add(namakaryawan);
        golKaryawan.add(golkaryawan);
        usiaKaryawan.add(usiakaryawan);
        statusKaryawan.add(statusmenikahkaryawan);
        anakKaryawan.add(jumlahanakkaryawan);
        gajiPokokKaryawan.add(gajipokok);
        tunjanganIstriKaryawan.add(TunjanganIstri());
        tunjanganKaryawan.add(TunjanganKaryawan());
        tunjanganAnakKaryawan.add(TunjanganAnak());
        gajiKotorKaryawan.add(GajiKotor());
        potonganKaryawan.add(Potongan());
        gajiBersihKaryawan.add(GajiBersih());
        }
    public void Search() throws IOException {
        String simpan;
        Scanner dyv = new Scanner(System.in);  
        System.out.println("\t\t\t\tCARI DATA KARYAWAN"
                + "\n----------------------------------------------------------------------------------------");  
        System.out.print("Masukkan kode karyawan yang ingin Anda cari: ");
        simpan = dyv.nextLine();
        System.out.println("----------------------------------------------------------------------------------------"
                + "\n\t\t\t\t     DATA KARYAWAN");
        System.out.println("----------------------------------------------------------------------------------------");
        for(int i = 0; i < kodeKaryawan.size(); i ++) {
            if (kodeKaryawan.get(i).equals(simpan)){
                System.out.println("Kode Karyawan\t\t: "+kodeKaryawan.get(i));
                System.out.println("Nama Karyawan\t\t: "+namaKaryawan.get(i));
                System.out.println("Golongan\t\t: "+golKaryawan.get(i));
                System.out.println("Umur\t\t\t: "+usiaKaryawan.get(i));
                System.out.println("Status Menkah\t\t: "+statusKaryawan.get(i));
                System.out.println("Jumlah Anak\t\t: "+anakKaryawan.get(i));
                System.out.println("------------------------------------------------");
                System.out.println("Gaji Pokok\t\t: "+gajiPokokKaryawan.get(i));
                System.out.println("Tunjangan Istri/Suami\t: "+tunjanganIstriKaryawan.get(i));
                System.out.println("Tunjangan Pegawai\t: "+tunjanganKaryawan.get(i));
                System.out.println("Tunjangan Anak\t\t: "+tunjanganAnakKaryawan.get(i));
                System.out.println("------------------------------------------------ +");
                System.out.println("Gaji Kotor\t\t: "+gajiKotorKaryawan.get(i));
                System.out.println("Potongan\t\t: "+potonganKaryawan.get(i));
                System.out.println("------------------------------------------------ -");
                System.out.println("Gaji Bersih\t\t: "+gajiBersihKaryawan.get(i)); 
            }
            else{
                System.out.println("Tidak ada data karyawan dengan kode "+simpan+"!");
            }
        }       
    }
    public void View() throws IOException {
        System.out.println("\t\t\t\t      DATA KARYAWAN"
                + "\n----------------------------------------------------------------------------------------");  
        System.out.println("     KODE KARY  \tNAMA KARY\tGOL\tUSIA \tSTATUS NIKAH \tJUMLAH ANAK");
        System.out.println("----------------------------------------------------------------------------------------");

        for(int i=0;i<kodeKaryawan.size();i++) {
            System.out.println("\t"+kodeKaryawan.get(i)+"\t\t"+namaKaryawan.get(i)+"   \t\t"
            +golKaryawan.get(i)+"\t"+usiaKaryawan.get(i)+"\t"+statusKaryawan.get(i)
            +"\t    "+anakKaryawan.get(i));
        }
        System.out.println("----------------------------------------------------------------------------------------");		
    }
    public void Delete() throws IOException {
    	Scanner dyv = new Scanner(System.in);
    	String hapus;                
        System.out.println("\t\t\t\tHAPUS DATA KARYAWAN"                + "\n----------------------------------------------------------------------------------------");
        System.out.println("Masukkan kode karyawan yang ingin Anda hapus: ");
    	hapus =  dyv.nextLine();               
    	for(int i=0;i<kodeKaryawan.size();i++) {
            if (kodeKaryawan.get(i).equals(hapus)){
                kodeKaryawan.remove(i);
                namaKaryawan.remove(i);
                golKaryawan.remove(i);
                usiaKaryawan.remove(i);
                statusKaryawan.remove(i);
                anakKaryawan.remove(i);
                gajiPokokKaryawan.remove(i);
                tunjanganIstriKaryawan.remove(i);
                tunjanganKaryawan.remove(i);
                tunjanganAnakKaryawan.remove(i);
                gajiKotorKaryawan.remove(i);
                potonganKaryawan.remove(i);
                gajiBersihKaryawan.remove(i);
                System.out.println("Data Karyawan "+hapus +" berhasil dihapus!");                 
            }
            else {
                System.out.println("Tidak ada data karyawan dengan kode "+hapus+"!");
            }
        }
    }
}