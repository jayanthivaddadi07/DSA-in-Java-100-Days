public class Insertionsort {
    public static void main(String[] args) {
        int[] arr={23,1,5,7,3,9,2};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j =i-1;
        
        while( j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    
    for(int a:arr){
    System.out.println(a);
    }
}
}
