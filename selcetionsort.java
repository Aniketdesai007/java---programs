import java.util.Arrays;

public class selcetionsort {
  
    static void insert(int []arr){
for(int i=0;i<arr.length;i++){
    int max=arr[0];
    int end=arr.length-i-1;
    for(int j=0;j<end;j++){
        if(max<arr[j]){
                max=arr[j];
                int temp=max;
    max=arr[end];
    arr[end]=temp;
        }
    }
    
}
for(int j=0;j<arr.length;j++){
    System.out.println(arr[j]);
}
    }
 
    public static void main(String[] args) {
        int []arr={2,6,3};
        insert(arr);
    }
}
