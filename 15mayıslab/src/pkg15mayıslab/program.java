/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg15mayıslab;

interface ProgramYazabilme{

public void programYaz();
}

interface AnalizYapabilme{

public void AnalizYap();

}


class deneme implements ProgramYazabilme,AnalizYapabilme{

    @Override
    public void programYaz() {
        System.out.println("Program Yaziliyor...");    }

    @Override
    public void AnalizYap() {
       
        System.out.println("Analiz yapiliyor...");

    }




}


public class program {
    public static void main(String[] args) {
        deneme d= new deneme();
        d.AnalizYap();
        d.programYaz();
    }
   
}
