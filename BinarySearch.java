public class BinarySearch{

    public static int BinarySearchFunction(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        while (low <= high) {
            //Do
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }else if(target > arr[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        //Otherwise
        return -1;
    }

    public static void main(String[] args){
        int arr[] = {11,22,33,44,55,66,77,88,99,110};

        int result = BinarySearchFunction(arr, 22);

        if(result != -1){
            System.out.println("Found in "+result+" index");
        }else{
            System.out.println("Not Found");
        }


    }
}