
package enbuyukeleman;


public class EnbuyukEleman {
public static int max(int d[],int i ,int max){
if(i == d.length )return max;

else if(d[i]>max) {
  max=d[i];
  return max(d,i+1,max);

}
else return max(d,i+1,max);



}
    public static void main(String[] args) {
       int d[]={1,3,4,123,34,43,4,45};
       int max=d[0];
        System.out.println(max(d,0,max));
    }
    
}
