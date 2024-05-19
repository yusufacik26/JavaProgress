/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threading.demo;

/**
 *
 * @author Yusuf
 */
public class ThreadingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      KronometreThread KT = new KronometreThread("thread");
            KronometreThread KT2 = new KronometreThread("thread2");

                  KronometreThread KT3 = new KronometreThread("thread3");
                  
                  KT2.run();
                  KT3.run();
KT.run();
    }
    
}
