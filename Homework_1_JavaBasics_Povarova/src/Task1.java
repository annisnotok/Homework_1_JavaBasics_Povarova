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

    //Сортировка целочисленного массива методом пузырька
    private static void bubbleSort(ArrayList<Integer> arr){
        for(int i=0; i < arr.size(); i++) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j - 1) > arr.get(j)) {
                    int temp = arr.get(j - 1);
                    arr.set(j - 1, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
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
