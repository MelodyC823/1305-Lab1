public class stackUsingArray {
    Integer [] arr = new Integer[100];

    int top = -1;
    void push(int a){
        top ++;
        arr[top] = a;
    }

    int pop(){
        int temp = arr[top];
        top--;
        return temp;
    }

    int peek(){
        return arr[top];
    }

    boolean contains(int a){
        for (int i = 0 ; i< arr.length ; i++ ){
            if(a == arr[i])
                return true;
        }
        return false;
    }

    boolean isEmpty(){
        return top == -1;
    }
    int getFrequencyOf(int a){
        int frequency = 0;
        for (int i = 0 ; i< top + 1 ; i++ ){
            if(a == arr[i])
                frequency++;
        }
        return  frequency;
    }

    void clear(){
        top = -1;
    }
    int size(){
        return top + 1;
    }

    public static void main(String[] args){

        stackUsingArray object_stack = new stackUsingArray();
        object_stack.push(6);
        object_stack.push(1);
        object_stack.push(7);
        object_stack.push(8);
        object_stack.pop();
        System.out.println(object_stack.peek());

        System.out.println(        object_stack.contains(6));
        System.out.println(object_stack.isEmpty());
        object_stack.push(1);
        System.out.println(        object_stack.getFrequencyOf(1));
        object_stack.clear();
        System.out.println(object_stack.size());


    }
}
