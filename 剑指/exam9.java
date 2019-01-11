public class exam9 {
    /*
    斐波那契数列
    递归或者循环
    现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
    n<=39

     */

    //递归
    public int Fibonacci(int n) {

        if(n==1||n==0)
            return n;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }


//动态规划
    public int Fibonacci2(int n) {
        if(n <=1)
            return n;
        int f1=0;
        int f2=1;
        int temp;
        for(int i=2;i<=n;i++){
             temp=f2;
             f2=f1+f2;
             f1=temp;


        }
        return  f2;
    }

    public static void main(String[] args) {
        exam9 ex=new exam9();
        System.out.println(ex.Fibonacci(5));
        System.out.println(ex.Fibonacci2(5));
    }
}


