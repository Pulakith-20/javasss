
import java.util.*;
import java.util.Arrays;

public class Array{
    
    //To pring a given set of arrays
    public static void print_array(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    // //Linear search to find index in a givn set of arrays
    // public static String linearserach(String array[],String key) {
    //     int i;
    //     for( i=0;i<array.length;i++){
    //         if(array[i]==key){
    //             return "Key is found at index "+i;
    //         }

    //     }
    //     return "Key is not found";
        
    // }
    // //To find maximum and minimum in given set of arrays
    // public static void largestnumber(int array[]) {
    //     int largestnumber=Integer.MIN_VALUE;
    //     int smallestnumber=Integer.MAX_VALUE;
    //     for(int i=0;i<(array.length);i++){
    //         if(largestnumber<array[i]){
    //             largestnumber=array[i];
    //         }
    //         if(smallestnumber>array[i]){
    //             smallestnumber=array[i];
    //         }
    //     }
    //     System.out.println(largestnumber+" small hai bc isse "+smallestnumber);
    // }
    
    // //Binary Search
    // public static int binary_search(int array[],int key) {
    //     int start=0;
    //     int end=array.length-1;
        
    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(array[mid]==key){
    //             return mid;
    //         }
    //         if(array[mid]<key){
    //             start=mid+1;   
    //         }
    //         else{
    //             end=mid-1;
    //         }
            
    //     }  
    //     return -1;
    // }
    // //Reverse array
    // public static void rev_array(int array[]){
    //     int start=0;
    //     int end=array.length-1;
    //     while(start<end){
    //         int temp1=array[start];
    //         array[start]=array[end];
    //         array[end]=temp1;
    //         start++;
    //         end--;
            
    //     }
    //     print_array(array);
    // }
    // //Pair array
    // public static void pair_array(int array[]) {
    //     int tp=0;
    //     for(int i=0;i<array.length;i++){
    //         for(int j=i+1;j<array.length;j++){
    //             System.out.print("("+array[i]+","+array[j]+")");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total pairs = "+tp);
    // }
    // //Find sum by bruteforce(O->n^3)
    // public static void subarrays_bruteforce(int array[]) {
    //     int ts=0;
        
    //     int max_sum=Integer.MIN_VALUE;
    //     for(int i=0;i<array.length;i++){
            
    //         for(int j=i;j<array.length;j++){
    //             System.out.print(" (");
    //             int sum=0;
    //             for(int k=i;k<=j;k++){
    //                 if(k!=j){
    //                     System.out.print(array[k]+" ");
    //                 }else{
    //                     System.out.print(array[k]);
    //                 }
    //                 sum+=array[k];
                    
    //             }

    //             ts++;
    //             System.out.print(") ");
    //             System.out.print(" sum = "+sum+" ,");
                
    //             if(sum>max_sum){
    //                 max_sum=sum;
    //             }
    //             System.out.println();
    //         }
    //     }   
    //     System.out.println("Total pairs = "+ts);
    //     System.out.println("Maximum sum is = "+max_sum);
    // }   
    // //Find sum by prefixsum method(O->n^2)
    // public static void subarray_prefixsum(int array[]) {
        
        
    //     int prefix_arr[]=new int[array.length];
    //     prefix_arr[0]=array[0];
    //     int max_sum=Integer.MIN_VALUE;
        
    //     for(int i=1;i<prefix_arr.length;i++){
    //         prefix_arr[i]=prefix_arr[i-1]+array[i];
    //     }
    //     for(int i=0;i<prefix_arr.length;i++){
    //         for(int j=i;j<prefix_arr.length;j++){
    //             int sum = (i==0)?prefix_arr[j]: prefix_arr[j]-prefix_arr[i-1];
                
    //             if(sum>max_sum){
    //                 max_sum=sum;
    //             }
                
    //         }
    //     }
        
    //     System.out.println(max_sum);
    // }
    // //Find sum by Kadane's Algorithm(O->n^1)
    // public static void subarray_kadanesalgo(int array[]) {
    //     int sum=0;
    //     int max_sum=Integer.MIN_VALUE;
    //     int count=0;
    //     for(int i=0;i<array.length;i++){
    //         if(array[i]>0){
    //             count++;
    //             break;
    //         }
    //     }
    //     if(count==array.length-1){
    //         for(int i=0;i<array.length;i++){
    //             sum=array[i];
    //             max_sum=Math.max(max_sum, sum);
    //         }
    //     }
    //     else{
    //         for(int i=0;i<array.length;i++){
    //             sum+=array[i];
    //             if(sum<0){
    //                 sum=0;
    //             }
    //             max_sum=Math.max(max_sum, sum);
    //         }
    //     }
        
    //     System.out.println(max_sum);
    // }
    
    // //Trapping of Rain_water(Ma'am way)
    // public static void trapping_of_rainwater(int array[]) {
    //     int trap_water=0;
    //     int max_left[] = new int[array.length];
    //     max_left[0]=array[0];
    //     for(int i=1;i<array.length;i++){
    //         max_left[i]=Math.max(max_left[i-1], array[i]);
    //     }print_array(max_left);
    //     int max_right[] = new int[array.length];
    //     max_right[array.length-1]=array[array.length-1];
    //     for(int i=array.length-2;i>=0;i--){
    //         max_right[i]=Math.max(max_right[i+1], array[i]);
    //     }
    //     for(int i=0;i<array.length;i++){
    //         trap_water+=(Math.min(max_left[i], max_right[i]))-array[i];
    //     }
    //     System.out.println("The trapped water is = "+ trap_water);   
    // }
    // //Buy and Sell Stocks
    // public static void stocks(int array[]){
    //     int n=array.length;
    //     int min_buy=Integer.MAX_VALUE;
    //     int max_profit =Integer.MIN_VALUE;
    //     int sellprice[]= new int[n];
    //     for(int i=1;i<n;i++){
    //         sellprice[i]=array[i];
    //         if(array[i]>min_buy){
    //             max_profit=Math.max(max_profit, (array[i]-min_buy));
    //         }else{
    //             min_buy=sellprice[i];
    //         }
    //     }
    //     System.out.println("The total profit is "+max_profit);
    // }
    // //If any value appears more than once return true(O->n^2)
    // public static boolean Distinct(int array[]) {
    //     for(int i=0;i<array.length;i++){
    //         for(int j=i+1;j<array.length;j++){
    //             if(array[i]==array[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
        
    // }
    // //If any value appears more than once return true(O->n)
    // public static boolean Distinct1(int array[]) {
    //     HashSet<Integer> numbers= new HashSet<Integer>();
    //     for(int i=0;i<array.length;i++){
    //         if(numbers.contains(array[i])){
    //             return true;
    //         }else{
    //             numbers.add(array[i]);
    //         }
    //     }
    //     return false;

        
    // }
    // //Return index of a rotated array(O->log n)
    // public static int indexOfarray(int array[], int target,int start,int end) {
        
    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(array[mid]==target){
    //             return mid;
    //         }
    //         else if(array[mid]<target){
    //             start=mid+1;
    //         }
    //         else{
    //             end=mid-1;
    //         }
    //     }
    //     return -1;
    // }//split array into two
    // public static int search(int array[], int target) {
    //     int min=  min_indexof_rotated_array(array);
    //     if(array[min]<=target && target<=array[array.length-1]){
    //         return indexOfarray(array, target,min,array.length-1);
    //     }
    //     else{
    //         return indexOfarray(array, target, 0, min);
    //     }
        
    // }//find min index of the rotated array
    // public static int min_indexof_rotated_array(int array[]){
    //     int start=0;
    //     int end=array.length-1;
    //     while(start<end){
    //         int mid=(start+end)/2;
    //         if(array[mid-1]>array[mid] && mid>0){
    //             return mid;
    //         }
    //         else if(array[start]<=array[mid] && array[mid]>array[end]){
    //             start=mid+1;
    //         }else{
    //             end=mid-1;
    //         }
    //     }
    //     return start;
    // }//To find the max profit for a given stock price
    // public static int  stockprice(int prices[]) {
    //     int bp=prices[0];
    //     int profit=0;
    //     int max_profit=Integer.MIN_VALUE;
    //     for(int i=1;i<prices.length;i++){
    //         int sp=prices[i];
    //         if(sp>bp){
    //             profit=sp-bp;
    //             max_profit=Math.max(max_profit, profit);
    //         }
    //         else{
    //             bp=sp;
    //         }
    //     }
    //     return max_profit;
    // }//Trapping rain water my way(lengthy)
    // public static void trappppp(int height[]) {
    //     int trap_water=0;
    //     int n=height.length;
    //     int left_max[]=new int[n];
    //     left_max[0]=height[0];
    //     for(int i=1;i<n;i++){
    //         left_max[i]=Math.max(left_max[i-1], height[i-1]);
    //     }
    //     int right_max[]=new int[n];
    //     right_max[n-1]=height[n-1];
    //     for(int i=n-2;i>=0;i--){
    //         right_max[i]=Math.max(right_max[i+1], height[i+1]);
    //     }
    //     for(int i=0;i<n;i++){
    //          int diff=(Math.min(left_max[i], right_max[i])-height[i]);
    //          if(diff>0){
    //             trap_water+=diff;
    //          }
    //     }
    //     System.out.println(trap_water);
        
    
    // }//Trappin rain water in easy way
    // public static int letstrap(int array[]) {
    //     int start = 0;
    //     int trap_water=0;
    //     int end= array.length-1;
    //     int lmax=array[0];
    //     int rmax=array[end];
    //     while(start<end){
    //         if(lmax<rmax){
    //             start++;
    //             lmax=Math.max(lmax, array[start]);
    //             trap_water+=lmax-array[start];
    //         }
    //         else{
    //             end--;
    //             rmax=Math.max(rmax,array[end]);
    //             trap_water+=rmax-array[end];
    //         }
    //     }
    //     return trap_water;
        
    // }
    // //To find the triplet whose sum is zero and not repeated
    // public static List<List<Integer>> triplets(int array[]) {
    //     List<List<Integer>> result= new ArrayList<List<Integer>>();
    //     for(int i=0;i<array.length;i++){
    //         for(int j=i+1;j<array.length;j++){
    //             for(int k=j+1;k<array.length;k++){
    //                 if(array[i]+array[j]+array[k]==0){
    //                     List<Integer> triple=new ArrayList<Integer>();
    //                     triple.add(array[i]);
    //                     triple.add(array[j]);
    //                     triple.add(array[k]);
    //                     Collections.sort(triple);
    //                     result.add(triple);
    //                 }
    //             }
    //         }
    //     }
    //     result= new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
    //     return result;
    // }
    // //Bubble sort method(O-n^2)
    // public static void Bubblesort(int array[]) {
    //     int n=array.length;
    //     // int sort_array[]=new int[n];
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n-i-1;j++){
    //             if(array[j]>array[j+1]){
    //                 int temp=array[j];
    //                 array[j]=array[j+1];
    //                 array[j+1]=temp;
    //             }
                
    //         }
    //     }
    //     print_array(array);
    // }
    // //Bubble sort method optimized(Good for best cases to save time for ex:-{1,2,3,4})
    // public static void Bubblesort1(int array[]) {
        
    //     for(int i=0;i<array.length;i++){
    //         boolean swap=false;
    //         for(int j=0;j<array.length-i-1;j++){
    //             if(array[j]>array[j+1]){
    //                 int temp=array[j];
    //                 array[j]=array[j+1];
    //                 array[j+1]=temp;
    //                 swap =true;
    //             }
    //         }
    //         if(swap==false){
    //             break;
    //         }
    //     }
    //     print_array(array);
        
    // }
    // //Selection sort method
    // public static void Selectionsort(int array[]) {
    //     for(int i=0;i<array.length-1;i++){
    //         int minpos=i;
    //         for(int j=i+1;j<array.length;j++){
    //             if(array[minpos]>array[j]){
    //                 minpos=j;
    //             }
    //         }
    //         int temp=array[i];
    //         array[i]=array[minpos];
    //         array[minpos]=temp;

    //     }
    //     print_array(array);
    // }
    // //Insertion sort method
    // public static void Insertionsort(int array[]) {
    //     for(int i=0;i<array.length-1;i++){
    //         int unsorti=array[i+1];
    //         for(int j=i;j>=0;j--){
    //             if(array[j]>unsorti){
    //                 array[j+1]=array[j];
    //                 array[j]=unsorti;
    //             }
    //         }
    //     }
    //     print_array(array);
    // }
    // //Updated Insertion sort method
    // public static void Insertionsort1(int array[]) {
    //     for(int i=1;i<array.length;i++){
    //         int curr=array[i];
    //         int prev=i-1;
    //         while(prev>=0 && array[prev]>curr){
    //             array[prev+1]=array[prev];
    //             prev--;
    //         }
    //         array[prev+1]=curr;
    //     }
    //     print_array(array);
    // }
    // //Inbuilt method
    // public static void Inbuilt(int array[]) {
    //     print_array(array);
    // }
    //
    //Counting sort
    public static void Countingsort(int array[]) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            max=Math.max(max, array[i]);
        }
        int count[]=new int[max+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                array[j]=i;
                count[i]--;
                j++;
            }
        }
        print_array(array);
    }
    //Counting sort for negative numbers
    public static void Countingsortneg(int arr[]) {
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
        print_array(arr);
    }
    //main method
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // int number[]={1,-1,0};
        // List<List<Integer>> result= Arrays.triplets(number);
        // for(int i=0;i<result.size();i++){
        //     System.out.println(result.get(i)+" ");
        // }
        int number[] = {-1,-2,1,4,1,3,2,4,3,7};
        Countingsortneg(number);
        sc.close();
    }
}