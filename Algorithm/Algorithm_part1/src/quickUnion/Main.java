package quickUnion;

public class Main {
  public static void main(String[] args) {
    QuickUnion quickUnion = new QuickUnion(10);

    quickUnion.displayArray();

    quickUnion.union(4,3);
    quickUnion.union(3,8);
    quickUnion.union(6,5);
    quickUnion.union(9,4);
    quickUnion.union(5,0);
    quickUnion.union(7,2);
    quickUnion.union(6,1);
    quickUnion.union(7,3);


    quickUnion.displayArray();
    System.out.println(quickUnion.isConnected(8,9));

  }
}
