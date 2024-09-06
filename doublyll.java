class node{
    int data;
    node prev;
    node next;
    node(int data){
        this.data=data;
        prev=null;
        next=null;
    }
}
 class doubllylinkedlist{
    node head=null;
    public void insertatbegning(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
        }else{
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }

    }
    public void insertatend(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
        }else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            newnode.prev=temp;
            temp.next=newnode;
        }
    }
   public void display(){
    if(head==null){
        System.out.println("empty ");
    }
    node temp=head;
    while (temp!=null) {
        System.out.println(temp.data);
        temp=temp.next;
        
    }
   }
}



public class doublyll {
    public static void main(String[] args) {

        doubllylinkedlist obj=new doubllylinkedlist();
        obj.display();

        obj.insertatbegning(2);
        obj.insertatbegning(1);
        obj.insertatend(5);
        obj.insertatend(6);


        obj.display();
        
    }
}
