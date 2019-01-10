public class exam8_2 {
    /*
    二分查找法求循环数组中的最小数字
     */
    public int  minNumberInRotateArray(int [] array){
        int len=array.length;
        if(len==0)
            return 0;
        int index1=0,index2=len-1;
        while(index1<index2){
            int mid=index1+(index2-index1)/2;
            if(array[mid]>array[index2]){
                index1=mid+1;
            }
            else if(array[mid]==array[index2]){
                index2=index2-1;

            }
            else {
                index2=mid;
            }
        }
        return array[index1];
    }
    public static void main(String[] args) {
        exam8_2 ex1=new exam8_2();
        int array[]={1,2,3,4,5};
        int b[]={0,1,1,1,1};
        System.out.println(ex1.minNumberInRotateArray(array));
        System.out.println(ex1.minNumberInRotateArray(b));

    }
}
