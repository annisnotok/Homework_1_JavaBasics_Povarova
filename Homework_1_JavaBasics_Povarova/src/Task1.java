import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task1 {

    private static void printArray(int[] array)
    {
        for(int arr:array)
        {
            System.out.println(arr);
        }
        System.out.println();
    }

    private static int[] createIntArray(int length){
        Random rnd = new Random();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = rnd.nextInt(100);
        }
        return arr;
    }

    //Сортировка целочисленного массива методом пузырька
    private static void bubbleSort(int[] arr){
        for(int i=0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] =  arr[j];
                    arr[j] =  temp;
                }
            }
        }
    }

    private static int BinarySearch(int[] arr, int first, int last, int el){
        int index = -1, middle;
        while (first <= last){
            middle = (first + last) / 2;
            if (arr[middle] > el)
                last = middle - 1;
            else if (arr[middle] < el)
                first = middle + 1;
            else if (arr[middle] == el) {
                index = middle;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args){
        //Сортировка пузырьком
        int[] a1 = createIntArray(7);
        printArray(a1);
        bubbleSort(a1);
        printArray(a1);
        //Бинарный поиск
        int[] a2 = {67, 31, 62, 78, 94, 23, 48, 9, 0, 54, 6, 92};
        bubbleSort(a2);
        printArray(a2);
        System.out.println("Элемент со значением 6 находится под индексом " + BinarySearch(a2, 0, a2.length-1,6));
    }

}
