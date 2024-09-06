public class queue{


    int fornt,rear,size;
    int []arr;
queue(int size){
    this.size=size;
    fornt=-1;
    rear=-1;
    arr=new int[this.size];
}
void enqueue(int data){
    if(rear==size-1&& fornt==0){
        System.out.println("full");
    }
    else if(fornt==-1&&rear==-1){
        fornt=0;
        rear++;
        arr[rear]=data;
    }
    else{
        rear++;
        arr[rear]=data;
    }
}

void display(){
    if(fornt==-1 ){
        System.out.println("empty");
    }else{
          for(int i=fornt;i<=rear;i++){
        System.out.println(arr[i]);
    }
    }
  
}


int  dequeue(){
    int value;
    if(fornt==-1){
        System.out.println("empty");
        return -1;
    }else if(fornt==rear){
        value=arr[fornt];
        fornt=-1;
        rear=-1;

    }
    else{
        value=arr[fornt];

        fornt++;
    }        return value;

}
boolean isfull(){
    if(fornt==0&&rear==size-1){
        return true;
    }
    return false;
}

    public static void main(String[] args) {
        queue obj=new queue(5);
        obj.enqueue(4);
        obj.enqueue(9);
        obj.enqueue(4);
        obj.enqueue(7);
        obj.enqueue(1);
        System.out.println("display :: ");
        obj.display();
        System.out.println("deleted value is  :: "+obj.dequeue());

        
        obj.display();
        obj.display();
        System.out.println(obj.isfull());
        
    }
}