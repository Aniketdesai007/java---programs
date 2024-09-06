import java.util.Arrays;

public class amazonquestion {
    static void insta(int []arr,int target){
            int k=arr[target];
            int count=0; 
             int c=1;
            for(int i=0;i<k;i++){
                for(int j=0;j<arr.length;j++){
                  
                    if(c<=k && c<=arr[j]){
                        count++;

                    }
                }
                c++;
            }
            System.out.println(count);
    }
    public static void main(String[] args) {
        int []a=new int[]{2,3,2,1,1,5,4,3};
        int target=2;//to get ticket of index target
        insta(a,target);
        System.out.println(Arrays.toString(a));
    }
}
