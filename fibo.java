public class fibo{
    public static void main(String[] args) {
        int position=-1;
        int n1=0,n2=1;
         int result=0;
         if(position==0){
            System.out.println("0");
         }else if(position==1){
            System.out.println("1");
         }else if(position<0){
            System.out.println("invalid position");
         }
         else{
            for(int i=0;i<=position-2;i++){
           
            result=n1+n2;
        n1=n2;
        n2=result;

        }
        System.out.println(result);
         }
        
    }
}