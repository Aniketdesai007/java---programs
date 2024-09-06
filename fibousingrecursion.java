public class fibousingrecursion {
    public static int fibooo(int n1,int n2,int pos){
      int sum=0;
        if(pos<1){
return sum;            
        }
            sum=n1+n2;
            n1=n2;
            n2=sum;
            pos--;
            fibooo(n1, n2, pos);


    }
    public static void main(String[] args) {
        int position=5;
        int n1=0,n2=1;
       int res= fibooo(n1,n2,position);
       System.out.println(res);
    }
}
