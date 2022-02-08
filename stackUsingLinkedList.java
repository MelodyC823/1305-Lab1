class Node {
    public int data;
    public Node next;
}

public class stackUsingLinkedList {
    Node top;
    stackUsingLinkedList(){
        top = null;
    }

    void push(int a){
        Node temp = new Node();
        temp.data = a;
        temp.next = null;

        if(top == null){
            top = temp;
        }else{
            temp.next = top;
            top = temp;
        }

    }

    int pop(){
        if(top != null){
            int temp = top.data;
            top = top.next;
            return temp;
        }else{
            return  -1;
        }
    }

    int peek(){
        if(top == null){
            return -1;
        }else
            return top.data;
    }


    public static void main(String[] args) {

        stackUsingLinkedList object_stack = new stackUsingLinkedList ();
        object_stack.push(6);
        object_stack.push(1);
        object_stack.push(7);
        object_stack.push(8);
        object_stack.pop();
        System.out.println(object_stack.peek());

    }
}
