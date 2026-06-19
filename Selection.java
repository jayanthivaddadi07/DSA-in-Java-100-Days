public class Selection {
    public static void main(String[] args) {
        int[] arr={23,1,5,7,3,9,2};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minindex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;

        }
            for(int a:arr){
                System.out.println(a+" ");
            }
        }
    }
    

