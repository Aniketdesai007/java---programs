public class stack {
   private int top;
   private int size;
   private int []arr;
        stack(int size){
                this.size=size;
                arr=new int[this.size];
                top=-1;
        }
        public void push(int data){
            if(top==size-1){
                System.out.println("stack is full");
            }
            else{
                top++;
                arr[top]=data;
            }
        }
        public int pop(){
            int value;
            if(top==-1){
                System.out.println("empty");
                return -1;
            }else{
                value=top--;

return arr[value];

            }    
        }
        public void peek(){
            if(top==-1||top>=size){
                System.out.println("no element present");
            }else{
                  System.out.println("toped element is "+arr[top]);
            }
          
        }
        public void display(){
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);

            }
        }
public boolean isfull(){
    return top==size-1;
}

    public static void main(String[] args) {
stack obj=new stack(5);
obj.push(4);
obj.push(9);
obj.push(4);obj.display();
obj.pop();
obj.push(9);
obj.push(9);

obj.display();

System.out.println(obj.isfull())
;

        
    }
}
