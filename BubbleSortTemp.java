public class BubbleSortTemp{
    
    public static void PrintArray(int arr[]){
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {4,2,5,3,1};
        System.out.print("Given Array : ");
        PrintArray(arr);
        int max = arr.length;
        for (int i = 0; i < max-1; i++) {
            for(int j=0; j<max-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // System.out.println();
        System.out.print("Sorted Array : ");
            PrintArray(arr);
    }
}