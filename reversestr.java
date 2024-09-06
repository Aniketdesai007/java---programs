public class reversestr {
    public static void main(String[] args) {
     
      int x;
      int res=0;
long res1=0;
      int l1,l2;
       int high,low;
x=-2147483412;
high=1534236469;
low=-2147483648;
if(x>low && x<high){
  if(x<0){
    x=-x;
    while (x>0) {
      l1=x/10;//0
      l2=x%10;//1
   
      res1=l2+(res1*10);///32
      res=l2+(res*10);
   
      x=l1;//1
  
  }
  res1=-res1;
  res=-res;
  } else{
     while (x>0) {
                l1=x/10;//0
                l2=x%10;//1
             
                res1=l2+(res1*10);///32
                res=l2+(res*10);
             
                x=l1;//1
            
        }
  }    
  // if(res >= -2,147,483,648 && res<=2,147,483,647){
  
  // }
  
  
  if(res1<high && res1>low){
  
  
  
    System.out.println(res); 
  
  }else{
    System.out.println("0");
  
  }
}else{
  System.out.println("0");
}

     
     
    }
}
