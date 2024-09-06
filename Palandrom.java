import java.util.Arrays;

public class Palandrom {
    public static void main(String[] args) {
       String str="abbcbba";
       char []a=str.toCharArray();
       System.out.println(a[0]);
       int start=0;
       int end=a.length-1;
       boolean flag=true;
       while(start<end){
            if(a[start]==a[end]){
                start++;
                end--;

            }else{
                flag=false;
                break;
            }
       }
       if(flag){
            System.out.println("it  is palandrom");
       }else{
        System.out.println("not");
       }
   


    }
}
