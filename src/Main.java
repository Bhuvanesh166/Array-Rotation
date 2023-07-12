import java.util.Scanner;

class Rotation{
         public int[] arrayRotation(int arr[],int start,int end){

             while(start<end){
                 int temp=arr[start];
                 arr[start]=arr[end];
                 arr[end]=temp;
                 start++;
                 end--;
             }
             return arr;

         }

    public static void main(String[] args) {
           Rotation rotation=new Rotation();
        System.out.println("Enter size of the array");
        Scanner scanner=new Scanner(System.in);
        int sze=scanner.nextInt();
        System.out.println("Enter array elements");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter number of rotation");
        int k=scanner.nextInt();
        if(k>arr.length){
            k=k% arr.length;
        }
       // for (int i=0;i<k;i++){
            rotation.arrayRotation(arr,0, arr.length-1);
        rotation.arrayRotation(arr,0, k-1);
        rotation.arrayRotation(arr,k, arr.length-1);
       // }
        System.out.println("After reverse:");

        for(int i=0;i<sze;i++){
            System.out.print(arr[i]+" ");
        }
            }
}