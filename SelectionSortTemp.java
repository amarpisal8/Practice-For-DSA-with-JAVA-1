public class SelectionSortTemp{
    
    public static void PrintArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,2,4,1,3};
        System.out.println("Original Array (Unsorted)");
        PrintArray(arr);

        for(int i=0; i<arr.length; i++){
            int midIndex = i;
            for(int j=i+1; j<arr.length-1; j++){
                if(arr[j] > arr[midIndex]){
                    midIndex = j;
                }
                int temp = arr[j];
            arr[j] = arr[midIndex];
            arr[midIndex] = temp;
            }
        }
        System.out.println("Sorted Array is");
        PrintArray(arr);
    }
} 