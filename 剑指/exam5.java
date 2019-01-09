import java.util.ArrayList;
import java.util.Stack;

class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}

public class exam5 {
    /*
    从头到尾打印链表（输入一个链表。从尾到头返回一个ArrayList）
    不改变表结构，即不可以反转链表指针
    用栈/递归实现
     */

    public ArrayList<Integer> reverseprint(ListNode listNode) {
        ArrayList<Integer> reslist=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        ListNode temp=listNode;
        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;

        }
        while (!stack.empty()){
            reslist.add(stack.pop());
        }
        return reslist;
    }
    public static void main(String args[]){
        exam5 exam5=new exam5();
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);

        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;
        System.out.println(exam5.reverseprint(node1));
    }



}
