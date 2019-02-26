import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task {

    static ArrayList data = new ArrayList();

    public static void main(String[] args)
    {
        createData();

        quickSort(data);

        printData();
    }


    public static void createData()
    {
        for(int i = 0; i < 10; i++)    //add 10 random doubles
        { data.add(Math.floor(Math.random()*100)/1.0); }
    }

    public static void printData()
    {
        for(int i = 0; i < data.size(); i++)   //print out elements
        { System.out.print(data.get(i).toString().substring(0,data.get(i).toString().indexOf(".")) + " "); }
    }

    public static ArrayList<Double> quickSort(ArrayList<Double> data)
    {
        quickSortHelper(data, 0, data.size()-1);
        return data;
    }

    public static void quickSortHelper(ArrayList<Double> data, int low, int high) {
      //To Do: Implement Quick Sort
    }

    //Helper method that swaps two elements in an array
    //@param data: ArrayList where elements are
    //@param index1 and index2: indeces of the two elements to be swapped
    public static void swapElements(ArrayList<Double> data, int index1, int index2)
    {
        double temp = data.get(index1);
        data.set(index1, data.get(index2));
        data.set(index2, temp);
    }

}