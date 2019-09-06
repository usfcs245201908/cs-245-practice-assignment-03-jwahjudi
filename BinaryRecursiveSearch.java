public class BinaryRecursiveSearch implements Practice03Search{
    public int search(int[]a, int target){
        return privSearch(a, target, 0, a.length-1);
    }

    private int privSearch(int[]a, int target, int low, int high){
        if (low<high)
            return -1;
        int mid = (low+high)/2;
        if(a[mid]==target)
            return mid;
        if(a[mid]>target)
            return privSearch(a, target, low, mid-1);
        else
            return privSearch(a, target, mid+1, high);
    }

    public String searchName(){
        return "Binary Recursive Search";
    }
}
