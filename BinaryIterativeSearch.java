public class BinaryIterativeSearch implements Practice03Search{
    public int search(int[]a, int target){
        int low=0;
        int high = a.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]==target)
                return mid;
            else if(a[mid]>target)
                high = mid -1;
            else
                low = mid+1;
        }
        return -1;
    }
    public String searchName(){
        return "Binary Iterative Search";
    }


}
