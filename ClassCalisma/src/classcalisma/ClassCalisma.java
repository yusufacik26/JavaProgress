
package classcalisma;


public class ClassCalisma {

    
    public static void main(String[] args) {
        //Reference type
       CustomerManager customermanager = new CustomerManager();
       customermanager.Add();
       customermanager.Remove();
       customermanager.Update();
    
    //value
    int sayi1= 10;
    int sayi2= 20;
    sayi2=sayi1;
    sayi1=30;
        System.out.println(sayi2);
    int [] s1= new int[] {1,2,3}; //referans numarsı 101
    int [] s2 = new int[] {4,5,6}; // referans numarası 102
    s2=s1; // burada referans numarasını 101e eşitledik bu yüzden
    s1[0]=12;// s2[0] burda 12 olur çünkü referans numarası 101
        System.out.println(s2[0]);
    
    }
    
}
