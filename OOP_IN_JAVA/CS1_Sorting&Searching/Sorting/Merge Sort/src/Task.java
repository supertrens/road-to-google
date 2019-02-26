import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task {

    static ArrayList data = new ArrayList();

    public static void main(String[] args)
    {
        createData();

        mergeSort(data);

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

    public static ArrayList<Double> mergeSort(ArrayList<Double> data)
    {
        mergeSortHelper(data, 0, data.size()-1);
        return data;
    }


    public static void mergeSortHelper(ArrayList<Double> data, int start, int end)
    {
        //To Do: Implement Merge Sort

    }


}