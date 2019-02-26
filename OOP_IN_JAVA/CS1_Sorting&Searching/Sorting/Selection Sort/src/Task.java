import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task {

    static ArrayList data = new ArrayList();

    public static void main(String[] args)
    {
        createData();

        selectionSort(data);

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

    public static ArrayList<Double> selectionSort(ArrayList<Double> data)
    {
        //To Do: Implement Selection Sort
        return data;
    }


    //Helper method that swaps two elements in an array
    //@param data: ArrayList where elements are
    //@param index1 and index2: indeces of the two elements to be swapped
    public static void swapElements(ArrayList<Double> data, int index1, int index2)
    {
 //implement code to swap the elements at index1 and index 2 in the ArrayList data
    }

}