import java.util.Arrays;

public class bubblesort {
    public static int[] bsrt(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            boolean swapped =false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped=false){
                break;
            }   
        }
          return arr;

    }
  public static void main(String[] args){
    int arr[]={9,6,3,7,2};
    int[] res=bsrt(arr);
    System.out.print("the sorted array is:"+Arrays.toString(arr));

  }
}

   