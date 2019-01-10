import java.util.Stack;

public class exam7 {
    /*
    两个栈实现队列
     */
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node){
        stack1.push(node);

    }
    public int pop(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }
    public static void main(String[] args) {
        exam7 exam7=new exam7();

        exam7.push(1);
        exam7.push(2);
        exam7.push(3);
        System.out.println(exam7.pop());
        System.out.println(exam7.pop());
        System.out.println(exam7.pop());


    }
}
