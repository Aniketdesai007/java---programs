public class stringcompare {
    public static void strcompare(String s1,String s2){
        int count=0,num,num2=0;

        for(int i=0;i<s1.length();i++){
            num=i;
         
            if(s2.charAt(0)==s1.charAt(i)){     
                      num2=i;
count++;
                  
                    for(int  j=1;j<s2.length();j++){
                        if(s2.charAt(j)==s1.charAt(i+1)){
                            
                              count++;
                                i++;
                                if(count==s2.length()){
                                    System.out.println("found");
                                }
                                // System.out.println(count);
                            
                        }else{
                            i=num;
                            count=0;
                        break;
                    }
                    }
            }
           
        } 
        
    }
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="geek";
     strcompare(s1,s2);
   
       
      
    }
}
