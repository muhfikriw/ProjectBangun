/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Asus
 */
public class Lingkaran extends BangunDatar{
    // atribut jari-jari
    public double r;
    private final double phi = 22/7;
     
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        double luas = phi * r * r;
        return luas;
    }
    
    // method untuk hitung keliling
    public double hitungKeliling(){
 	double keliling = phi * 2 * r;
        return keliling;
    }
}
