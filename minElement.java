public class minElement {
    public static void main(String[] args){
        int arr[]={33,93,34,12,43};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.print("the min element :"+min);
    }
    
}
