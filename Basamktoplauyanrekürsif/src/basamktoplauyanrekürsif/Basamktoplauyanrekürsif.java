/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basamktoplauyanrekürsif;

/**
 *
 * @author Yusuf
 */
public class Basamktoplauyanrekürsif {

    public static int basamaktop(int a ){
    
    if(a/10==0) return a%10;
    
    else return (a%10)+basamaktop(a/10);
    
    
    
    }
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        System.out.println(basamaktop(31));
    }
    
}
