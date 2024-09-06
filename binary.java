import java.util.ArrayList;

public class binary {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
       int num=54;
       int l1,l2;
       while (num>0) {
        l1=num/2;
        l2=num%2;
        if(l2==0){
            a.add(0);
        }else{
            a.add(1);
        }
        num=l1;
        
       }
       for(int i=a.size()-1;i>=0;i--){
        System.out.print(a.get(i));
       }
    }
}
