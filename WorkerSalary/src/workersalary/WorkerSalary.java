
package workersalary;

public class WorkerSalary {

  public static int salary(int[][]d){
      int s=0;
      for (int i = 0; i < d.length; i++) {
           for (int j = 0; j < d[0].length; j++) {
              s+=d[i][j];
          }
          System.out.println((i+1)+"."+"worker's salary "+s*20);
           s=0;      
      }
  
  return s;
  
  }
    public static void main(String[] args) {
         int[][] dizi = {
            {2, 4, 6},
            {1, 3, 5},
            {7, 8, 9}
        };
         salary(dizi);
    }
    
}
