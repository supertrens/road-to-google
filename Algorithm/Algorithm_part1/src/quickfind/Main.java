package quickfind;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    QuickFindUF qf = new QuickFindUF(10);

    qf.union(4,3);
    qf.union(3,8);
    qf.union(6,5);

    qf.union(9,4);
    qf.union(2,1);

    qf.union(9,4);
    qf.union(5,0);
    qf.union(7,2);
    qf.union(6,1);





//    System.out.println(qf.isConnected(4,2));

  }
}
