import java.util.*;
public class Basicarray {
    public static void main(String[] args) {
        // int[] arr={5,4,3,2,1};

        //sum
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);

        //Largest element
        // int largest=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>largest){
        //       largest=arr[i];
        //     }
            
        // }
        // System.out.println(largest);

        //smallest element
        // int smallest=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<smallest){
        //         smallest=arr[i];
        //     }
        // }
        // System.out.println(smallest);

        //Average of array elements
    //   int sum=0;
    //   for(int i=0;i<arr.length;i++){
    //     sum=sum+arr[i];
    //   }
    //   int avg=sum/arr.length;
    //   System.out.println(avg);

    //odd count and even count
    // int odc=0;
    // int evc=0;
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i]%2==0){
    //         evc++;
    //     }
    //     else{
    //         odc++;
    //     }   
    // }
    // System.out.println(evc);
    //     System.out.println(odc);

    //Linear Search
    // int target=3;
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i]==target){
    //         System.out.println(i);
     
    //count occurence of a particular number
    // int c=0;
    // int t=3;
    // for(int i=0;i<arr.length;i++){
    //     if((arr[i]==t)){
    //         c++;
    //     }
    // }
    // System.out.println(c);
    
    //reverse an array
    // int l=0;
    // int r=arr.length-1;
    // while(l<r){
    //     int temp=arr[l];
    //     arr[l]=arr[r];
    //     arr[r]=temp;
    //     l++;
    //     r--;
    // }
    // System.out.println(Arrays.toString(arr));
    // int[] newArr=Arrays.copyOf(arr,6);
    // System.out.println(Arrays.toString(newArr));

    //SORT an ARRAY without using Arrays.sort()
    //  int  i=0;
    //  int j=arr.length-1;
    //  while(arr[i]>arr[j]){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    //     i++;
    //     j--;
    //  }
    // for(int i=0;i<arr.length;i++){
    //     for(int j=i+1;j<arr.length;j++){
    //         if(arr[i]>arr[j]){
    //             int temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //         }
    //     }
    // }
    //  System.out.println(Arrays.toString(arr));

     //SECOND LARGEST element in array
    // int largest=Integer.MIN_VALUE;
    //  int second_largest=Integer.MIN_VALUE;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>largest){
    //             second_largest=largest;
    //           largest=arr[i];
    //         }
   // int second_largest=Integer.MIN_VALUE;
    // for(int i=0;i<arr.length;i++){
    //      else if(arr[i]>second_largest && arr[i]!=largest){
    //         second_largest=arr[i];
    //     }
    // }
    //     System.out.println(second_largest);


    //SECOND SMALLEST element in array
    // int smallest=arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<smallest){
        //         smallest=arr[i];
        //     }
        // }
        // int second_smallest=Integer.MAX_VALUE;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<second_smallest &&arr[i]!=smallest){
        //         second_smallest=arr[i];
        //                 }
        // }
        // System.out.println(second_smallest);

       //Difference between largest and smallest elements
    //    int largest=0;
    //    for(int i=0;i<arr.length;i++){
    //     if(arr[i]>largest){
    //         largest=arr[i];
    //     }
    //    }
    //    int smallest=arr[0];
    //    for(int i=0;i<arr.length;i++){
    //     if(arr[i]<smallest){
    //         smallest=arr[i];
    //     }
    //    }
    //    int Difference=largest-smallest;
    //    System.out.println(Difference);

    // FREQUENCY OF each elemnent
    int[] arr={1,2,3,2,1};
    HashMap<Integer,Integer>hm=new HashMap<>();
   for(int num:arr){
        hm.put(num,hm.getOrDefault(num,0)+1);
    }
    for(int key:hm.keySet()){
        System.out.println(key+" ->"+hm.get(key));
       

    }
// for(int num:arr){
//     if(hm.containsKey(num)){
//         hm.put(num,hm.get(num)+1);
//     }
//     else{
//         hm.put(num,1);
//     }
// }

        }
    }
    