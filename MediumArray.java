import java.util.*;

public class MediumArray {
    public static void main(String[] args) {

        //Remove duplicates from an array.
        // int[] arr={1,2,3,1,2,3};
        // // Arrays.sort(arr);
        // Set<Integer>s=new HashSet<>();
        // for(int num:arr){
        //     s.add(num);
        // }
        // System.out.println(s);

        //Move all zeros to the end.
        // int arr[]={1,0,2,0,3};
        // int j=0;
        // for(int i=0;i<arr.length;i++){
        //         if(arr[i]!=0){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //             j++;
        //         }
        //     }
        //     System.err.println(Arrays.toString(arr));
        
        //Move all negative numbers to one side
    //     int[] arr={-1,2,3,-4,-5,6};
    //     int l=0;
    //     int r=arr.length-1;
    //     while(l<r){
    //         if(arr[l]>0){
    //             l++;
    //         }
    //         else if(arr[r]<=0){
    //             r--;
    //         }
    //         else{
    //         int temp=arr[l];
    //         arr[l]=arr[r];
    //         arr[r]=temp;
    //         l++;
    //         r--;
    //     }

    // }System.out.println(Arrays.toString(arr));

    //Find the missing number from an array.
    // int[] arr={1,2,3,5};
    // int n=arr.length+1;
    // int acsum=0;
    // int exsum=n*(n+1)/2;
    // for(int num:arr){
    //     acsum+=num;
    // }
    // System.out.println(exsum-acsum);
        // int n=arr.length+1;
        // int xor1=0;
        // int xor2=0;
        // for(int num:arr){
        //     xor1^=num;
        // }
        // for(int i=1;i<=n;i++){
        //     xor2^=i;
        // }
        //  System.out.println(xor1^xor2);

        //find duplicate elements
        // int[] arr={1,2,1,2,3};
        // Set<Integer>s=new HashSet<>();
        // for(int num:arr){
        //     if(s.contains(num)){
        //     System.out.println(num);
        // }
        // else{
        //     s.add(num);
        // }
        // }

       //Find all pairs whose sum equals a target.
      // Input: [1,2,3,4,5]
    // Target = 6
    // Output:
    // 1,5
     // 2,4
    //  int[] arr={1,2,3,4,5};
    //  int target=6;
    //  for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //     if(arr[i]+arr[j]==target){
    //         System.out.println(arr[i]+" , "+arr[j]);
    //     }
    //  }
    // }

   ///////////// //Find all triplets whose sum equals a target.
    // int[] arr={1,2,3,1};
    // int target=6;
    // int n=arr.length;
    // for(int i=0;i<n;i++){
    //     for(int j=i+1;j<n;j++){
    //         for(int k=j+1;k<n;k++){
    //             if(arr[i]+arr[j]+arr[k]==target){
    //                 System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
    //             }
    //         }
    //     }
    // }

         // Arrays.sort(arr);

        // for (int i = 0; i < arr.length - 2; i++) {

        //     int left = i + 1;
        //     int right = arr.length - 1;

        //     while (left < right) {

        //         int sum = arr[i] + arr[left] + arr[right];

        //         if (sum == target) {
        //             System.out.println(
        //                     arr[i] + " " +
        //                     arr[left] + " " +
        //                     arr[right]);

        //             left++;
        //             right--;
        //         }
        //         else if (sum < target) {
        //             left++;
        //         }
        //         else {
        //             right--;
        //         }
        //     }
        // }

         //. Find the union of two arrays.
        // int a[] = {1, 2, 3};
        // int  b[] = {4, 5, 6};
        // Set<Integer>s=new HashSet<>();
        // for(int n:a){
        //     s.add(n);
        // }
        // for(int n:b){
        //     s.add(n);
        // }
        // Set<Integer>output=new HashSet<>(s);
        // System.out.println(output);

        //Find the intersection of two arrays.
        // int[] a={1,1,1};
        // int[] b={1,2,3};
        // Set<Integer>s=new HashSet<>();
        // for(int n:a){
        //     s.add(n);
        // }
        // for(int n:b){
        //     if(s.contains(n)){
        //         System.out.println(n);
        //     }
        // }

        //Merge two sorted arrays without duplicate
        // int a[] = {1,3,5,7};
        // int  b[] = {2,4,6,7};
        // Set<Integer>s=new TreeSet<>();
        // for(int n:a){
        //     s.add(n);
        // }
        // for(int n:b){
        //     s.add(n);
        // }
        // System.out.println(s);

      
        // int[] a = {1, 3, 5, 7};
        // int[] b = {2, 4, 6, 7};

        // int[] result = new int[a.length + b.length];

        // int i = 0, j = 0, k = 0;

        // while (i < a.length && j < b.length) {
        //     if (a[i] <= b[j]) {
        //         result[k++] = a[i++];
        //     } else {
        //         result[k++] = b[j++];
        //     }
        // }

        // while (i < a.length) {
        //     result[k++] = a[i++];
        // }

        // while (j < b.length) {
        //     result[k++] = b[j++];
        // }

        // System.out.println(Arrays.toString(result));

        // int[] a = {1, 3, 5, 7};
        // int[] b = {2, 4, 6, 7};
        // ArrayList<Integer> list = new ArrayList<>();
        // for (int n : a) {
        //     list.add(n);
        // }

        // for (int n : b) {
        //     list.add(n);
        // }

        // Collections.sort(list);

        // System.out.println(list);

        //Rotate an array left by one position
    //     int[] arr={1,2,3,4};
    //    int f=arr[0];
    //    for(int i=0;i<arr.length-1;i++){
    //     arr[i]=arr[i+1];
    //    }
    //   arr[arr.length-1]=f;
    //   System.out.println(Arrays.toString(arr));

      //Rotate an array right by one position.
    //   int[] arr={1,2,3,4};
    //    int l=arr[arr.length-1];
    //    for(int i=arr.length-1;i>0;i--){
    //     arr[i]=arr[i-1];
    //    }
    //   arr[0]=l;
    //   System.out.println(Arrays.toString(arr));

    // Rotate an array by k positions.
    // Left Rotation Using Extra Array
        // int[] arr = {1,2,3,4,5};
        // int k = 2;
        // int n = arr.length;

        // k = k % n;

        // int[] result = new int[n];

        // for (int i = 0; i < n; i++) {
        //     result[i] = arr[(i + k) % n];
        // }

        // System.out.println(Arrays.toString(result));

        //Right Rotation Using Extra Array
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int n = arr.length;

        k = k % n;

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = arr[i];
        }

        System.out.println(Arrays.toString(result));
    }
}

      
    


        
    

