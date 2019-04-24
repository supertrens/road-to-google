package quickUnion;

public class QuickUnion {
  private final int[] ids;

  public QuickUnion(int size) {
    this.ids = new int[size];
    for(int i = 0 ; i < size; i++){
      ids[i] = i;
    }
  }

  public void union(int p , int q){
    int i = root(p);
    int j = root(q);

    ids[i] = j;
  }

  public boolean isConnected(int p , int q){
     return root(p) == root(q);
  }

  private int root(int i){
    while(i != ids[i]){
      i = ids[i];
    }

    return i;
  }

  public void displayArray(){
    for (int id : ids){
      System.out.print(id);
    }

    System.out.println("\n");
  }

}
