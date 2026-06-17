public class secondLargestElement {
    public static void main(String[] args){
          int arr[]={21,34,56,43,20};
        int Largest=arr[0];
        int secondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Largest){
                Largest=arr[i];
            }
            if(arr[i]>secondLargest && arr[i]!=Largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Largest SecondLargest element is :"+secondLargest);

    }
    
}
