import java.util.Scanner;

public class evenoddmix {

    public static void result(int [] array,int n){
        int count=0,count1=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                count++;

            }
            else{
                count1++;
            }
        }
        if(count1==n){
            System.out.println("odd");
        }else if(count==n){
            System.out.println("even");
        }else{
            System.out.println("mixed");

        }
    }
    public static void freqency(int num,int [] array,int n){
        int count=0;
        for(int i=0;i<n;i++){
            if (num==array[i]) {
                count++;
            }
        }
        if(count==0){
            System.out.println("number not found");
        }else{
            System.out.println(" count of that number "+count);
        }
    }
   public static void main(String[] args) {
    int n;
   System.out.println("enter number of array element ");
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   int []array=new int[n];
   for(int i=0;i<n;i++){
    array[i]=sc.nextInt();

   }
   result(array,n);
   System.out.println("enter the number to find the frequency");
   int num=sc.nextInt();
   freqency(num,array,n);
//    System.out.println("array elements ");
//    for(int i=0;i<n;i++){
//     System.out.println(array[i]);
//    }
   } 
}
