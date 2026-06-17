public class maxElement {
    public static void main(String[] args){
        int arr[]={21,34,56,43,20};
        int Largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Largest){
                Largest=arr[i];
            }
        }
        System.out.println("Largest element is :"+Largest);

    }
}
