/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul7;

/**
 *
 * @author mhdri
 */
public class bukualamat {
     public static void main(String[] args) {
     String alamat[][] = {{"Florence", "735-1234", "Manila"}, {"Joko", "983-3333", "Java City"},{"Becca", "456-3322", "Manila"}};
int i=0;
do{
System.out.println("name    :" + alamat[i][0] );
System.out.println("Tel. #  :" + alamat[i][1] );
System.out.println("Address :" + alamat[i][2] );
System.out.println(" ");
i++;
}
while (i<3);
}
}
