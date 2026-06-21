public class Binarysearch {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,7,8,9,10};
        int key=6;
        int ans=-1;
        int l=0;
        int r=arr.length-1;
        while(l<r){
          int  mid=l+(r-l)/2;
            if(arr[mid]==key){
                System.out.println(arr[mid]); 
            }
            else if(arr[mid]>key){
                ans=arr[mid];
                 r=mid-1;
                
            }else{
               l=mid+1;
            }
        }
        System.out.println(ans);
    }    
}
