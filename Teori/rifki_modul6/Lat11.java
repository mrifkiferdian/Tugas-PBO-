/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rifki_modul6;

/**
 *
 * @author mhdri
 */
public class Lat11 {
    public static void main(String[] args) {
        int p = 3;
        int hasil = 1;
        
        int i = 1;
        do{
            hasil = hasil * 5;
            System.out.println(5 + "^" + i + "=" + hasil);
            i++;
        }while(i<=p);
        
    }
}