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
public class KiraBMI {
public static void main(String[] args){
    
    double bmi;
    String Ulasan;
    Scanner input = new Scanner(System.in);

    System.out.println("Masukkan berat badan anda dalam ukuran kg: ");
    double berat=input.nextDouble();

    System.out.println("Masukkan tinggi anda dalam ukuran meter: ");
    double tinggi=input.nextDouble();

    bmi=berat/(tinggi*tinggi);
    
    if (bmi < 18.5){
        Ulasan="kurang daripada yang sepatutnya";
        
    }else if (bmi < 25){
        Ulasan="normal";
    
    }else if (bmi < 30){
        Ulasan="berlebihan";
        
    }else{
        Ulasan="terlalu gemuk";
    }
    System.out.println("Anda mempunyai berat badan yang "+Ulasan);
}
}
