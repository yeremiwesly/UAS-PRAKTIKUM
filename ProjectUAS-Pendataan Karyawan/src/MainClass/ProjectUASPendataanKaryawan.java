/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClass;

import java.util.Scanner;
import SubClass.Karyawan;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author NITRO 5
 */
public class ProjectUASPendataanKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    // TODO code application logic here
        Karyawan masukKerja = new Karyawan() {
            @Override
            public double TunjanganPegawai() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Scanner dyv = new Scanner(System.in);
        String opsi,jawab = "1";   
        while(jawab.equalsIgnoreCase("1") ) {        	
        	   System.out.println("\n\n----------------------------------------------------------------------------------------"
                           + "\n                              SISTEM MANAJEMEN DATA KARYAWAN PERUSAHAAN"
                           + "\n----------------------------------------------------------------------------------------"
                           + "\nMenu Utama : ");
	        System.out.println("[1]. Tambah Data ");
	        System.out.println("[2]. Hapus Data ");	
	        System.out.println("[3]. Cari Data ");
	        System.out.println("[4]. Lihat Data  ");
	        System.out.println("[5]. Exit");
	        System.out.println("\nPilih Menu Pilihan Anda : ");
	        opsi = dyv.nextLine();
	        if( opsi.equals("1") ) {
                    System.out.println("\n----------------------------------------------------------------------------------------");
                    masukKerja.Add();
                } else if( opsi.equals("2") ) {
                    System.out.println("\n----------------------------------------------------------------------------------------");
                    masukKerja.Delete();
                } else if( opsi.equals("3") ) {
                    System.out.println("\n----------------------------------------------------------------------------------------");
                    masukKerja.Search();
                } else if( opsi.equals("4") ) {
                    System.out.println("\n----------------------------------------------------------------------------------------");
                    masukKerja.View();
                } else if( opsi.equals("5") ) {
                    System.exit(0);
	        }
	        System.out.println("\n----------------------------------------------------------------------------------------"
                        + "\nPilih Aksi"
                        + "\n1. Kembali ke menu Utama \n2. Exit");
	        jawab = dyv.nextLine();
	       	System.out.println("----------------------------------------------------------------------------------------");
        }
    }
}