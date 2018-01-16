/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer_User
 */
import java.util.Scanner;
public class Gaji {
public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    
    String nama;
    int bil_hari;
    int bil_jam;
    int bil_jam_ot;
    int gaji;
    
    System.out.print ("Masukkan nama anda: ");
     nama=input.nextLine();
     
    System.out.print("Masukkan bilangan jam bekerja anda: ");
    bil_jam=input.nextInt();
    while (bil_jam > 9){
        System.out.println("Bilangan jam bekerja tidak boleh melebihi 9jam, sila masukkan bilangan jam yang betul.");
    System.out.print("Masukkan bilangan jam bekerja anda: ");
    bil_jam=input.nextInt();
    }
     
    System.out.print("Masukkan bilangan hari anda bekerja: ");
    bil_hari=input.nextInt();
    while (bil_hari > 30){
        System.out.println("Bilangan hari bekerja tidak boleh melebihi 30hari, sila masukkan bilangan hari yang betul.");
    System.out.println("Masukkan bilangan hari anda bekerja:  ");
    }
    
    System.out.print("Masukkan bilangan jam bekerja lebih masa anda: ");
    bil_jam_ot=input.nextInt();
    while (bil_jam_ot > 50){
        System.out.println("Bilangan jam bekerja lebih masa tidak boleh melebihi 50jam, sila masukkan bilangan jam yang betul.");
    System.out.println("Masukkan bilangan jam bekerja lebih masa anda:  ");
    bil_jam_ot=input.nextInt();
    }
    
    gaji=(bil_jam*20)+(bil_jam_ot*15);
    
    System.out.println("=======================");
    System.out.println("Rumusan gaji:"+nama);
    System.out.println("Jumlah jam bekerja:"+bil_jam);
    System.out.println("Jumlah hari bekerja:"+bil_hari);
    System.out.println("Jumlah jam bekerja lebih masa:"+bil_jam_ot+"jam");
    System.out.println("Jumlah gaji: RM"+gaji);
    System.out.println("=======================");
} 
}
