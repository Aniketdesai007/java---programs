import java.util.Arrays;

public class bubblesort{
    static void bubbleSort(int []a){
        for(int i=0;i<a.length-1;i++){
            boolean b=false;
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                    b=true;
                }
            }
            if(!b){
                break;
            }
        }
      
       
      
    }
    public static void main(String [] args){
        int [] arr={2,3,10,24,4,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}