public class exam4 {
    /*
    将字符串中的空格替换为20%
    使用StringBuffer
     */
    public String replace(StringBuffer str){
        StringBuffer res=new StringBuffer();
        int len=str.length()-1;
        //从后往前写入
        for(int i=len;i>=0;i--){
            if(str.charAt(i)==' '){
                res.append("02%");
            }
            else{
                res.append(str.charAt(i));
            }
        }

       return res.reverse().toString();
    }
    public static void main(String[] args) {
        String str="we are happy";
        StringBuffer sb=new StringBuffer(str);
        exam4 exam=new exam4();
        System.out.println(exam.replace(sb));

    }
}
