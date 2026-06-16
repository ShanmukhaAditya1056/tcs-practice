public class findElement{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,8,6,7};
        int key=5;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.print("element found");
                return ;
                
            }
            
        }
        System.out.print("element not found");
    }
}