public class SelectionSort {

    public static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,1,4,2,3};
        System.out.print("Unsorted Array is : ");
        PrintArray(arr);
        for(int i=0; i<arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //Swaping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp; 
        }
        System.out.print("Sorted Array is : ");
        PrintArray(arr);
    }
}
