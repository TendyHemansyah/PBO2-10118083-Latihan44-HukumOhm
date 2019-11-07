/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan44.hukumohm;

/**
 *
 * @author  
 * Nama     : Tendy Hermansyah
 * Kelas    : IF-2
 * Nim      : 10118083
 * Deskripsi Tugas: Hukum Ohm
 */
public class Baterai {
    private float kuatArus, hambatan;

    public Baterai(){
        System.out.println("===== Hukum Ohm =====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar\n"
                + "akan berbanding lurus dengan beda potensial\npada ujung-ujung "
                + "kawat penghantar tersebut\nasalkan suhu kawat dijaga konstan.\n");
    }
    
    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    
        System.out.println("Kuat Arus : " + kuatArus + " ampere");
        System.out.println("Hambatan : " + hambatan + " ohm");
        System.out.println("Hasil Tegangan : " + hitungTegangan() + " volt");
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public final float hitungTegangan(){
        return hambatan * kuatArus;
    }
    
}
