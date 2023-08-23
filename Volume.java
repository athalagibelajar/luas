/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volume;

/**
 *
 * @author SMK TELKOM 25
 */
public class Volume {
    

        public static void main(String[] args) {
        double phi = 3.14;
        int jari = 20;
        int tinggi = 30;
        double volumeBola;
        double volumeTabung;
        double volumeKerucut;
        
        volumeBola = 4/3 * phi * (jari*jari*jari);
        System.out.println("Volume Bola = "+volumeBola+"cm^3");
        
        volumeTabung = phi * (jari*jari) * tinggi;
        System.out.println("Volume Tabung = "+volumeTabung+"cm^3");
        
        volumeKerucut = 1/3 * phi * (jari*jari) * tinggi;
        System.out.println("Volume Kerucut = "+volumeKerucut+"cm^3");
        
        
    }
    
}
