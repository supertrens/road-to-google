package quickfind;

public class QuickFindUF {
  private int[] id;

  public QuickFindUF(int size){
    this.id = new int[size];

    for(int i = 0 ; i < size; i++){
      id[i] = i;
    }
  }

  public void union(int p , int q){

    int pid = id[p];
    int qid = id [q];

    for (int i = 0 ; i < id.length ; i++ ){
      if(id[i] == pid){
        id[i] = qid;
      }
    }

    displayArray();
  }

  public boolean isConnected(int p , int q){
    return id[p] == id[q];
  }

  private void displayArray(){
    for (int i = 0 ; i < id.length ; i++){
      System.out.print(" " + id[i]);
    }

    System.out.println("\n");
  }

}
