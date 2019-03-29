package playground;

import java.time.*;

public class ThreeSum {
  public static void main(String[] args) {
    int[] a = {30 , -40 ,-20 , -10 ,40, 0, 10 , 5};

    Instant starts = Instant.now();
    count(a);
    Instant ends = Instant.now();
    System.out.println(Duration.between(starts, ends));


  }

  public static int count (int[] a){
    int count = 0 ;
    int size = a.length;

    for(int i = 0 ; i < size -2 ; i++)
      for(int j = i + 1 ; j < size -1 ; j++)
        for(int k = j+ 1 ; k < size; k++){
          if(a[i] + a[j] + a[k] == 0){
            count++;
            System.out.println("\n"+ count + " : " + a[i] + " " + a[j] + " " + a[k]);
          }
        }

    return count;
  }
}
