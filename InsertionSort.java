public class InsertionSort {
    public static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,1,5,2,3};
        System.out.print("Given Array : ");
        PrintArray(arr);



        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =  key;
        }
        System.out.print("Sorted Array : ");
        PrintArray(arr);
    }
}
