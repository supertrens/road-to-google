package Bubble;

import java.time.Duration;
import java.time.Instant;

public class BubbleSort {
  public static void main(String[] args) {

    int bucket[] = {2, 10, 8, 6, 7 , 3};

    display("Before sorting " , bucket);

    Instant starts = Instant.now();

    for(int i = 0 ; i < bucket.length; i++){
      for(int j = 0; j < bucket.length - 1 - i; j++){

        // do the swap if required
        if(bucket[j] > bucket[j+1]){
          int tmp = bucket[j+1];
          bucket[j+1] = bucket[j];
          bucket[j] = tmp;
        }
      }
    }

    Instant ends = Instant.now();
    System.out.println("\n" + Duration.between(starts, ends));


    display("After sorting " , bucket);

  }

  public static void display(String beforeAfterSorting, int[] a){
    System.out.println("\n\n" + beforeAfterSorting );
    for(int i = 0 ; i< a.length ; i++)
      System.out.print(" " + a[i]);
  }
}
