import java.util.ArrayList;
import java.util.Random;

public class Task1 {

    private static void printArray(ArrayList<Integer> array)
    {

        for(int arr:array)
        {
            System.out.println(arr + " ");
        }
        System.out.println();
    }

    private static ArrayList<Integer> createIntArray(int length){
        Random rnd = new Random();
        ArrayList<Integer> arr = new ArrayList<>(length);
        for(int i = 0; i < length; i++){
            arr.add(rnd.nextInt(100));
        }
        return arr;
    }

    public static void main(String[] args){
        //Сортировка пузырьком
        ArrayList<Integer> a1 = createIntArray(7);
        printArray(a1);
        //bubbleSort(a1);
        printArray(a1);
        //Сортировка бинарный поиск
        ArrayList<Integer> a2 = createIntArray(5);
        printArray(a2);
        //BinarySearchSort(a2);
        printArray(a2);
    }

}
