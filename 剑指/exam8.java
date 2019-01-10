public class exam8 {
    /*
    旋转数组的最小数字
     */
    public int minNumberInRotateArray(int [] array) {

        int p1=0;
        int p2=array.length-1;
        int midindex=p1;
        while(array[p1]>=array[p2]){
            midindex=(p1+p2)/2;
            if(p2-p1==1){
                midindex=p2;
                break;
            }
            if(array[p1]==array[p2]&&array[p1]==array[midindex]){
                //顺序查找
                return findonebyone(array,p1,p2);
            }
            //中间数在前面的递增序列
            if(array[midindex]>=array[p1]){
                p1=midindex;

            }
            else if(array[midindex]<=array[p2]){
                p2=midindex;
            }

        }
        return array[midindex];


    }
    //顺序查找
    public int findonebyone(int array[],int p1,int p2){
        int ans=array[p1];

        for(int i=p1+1;i<=p2;i++){
            if(ans>array[i]) {
                ans = array[i];
            }

        }
        return ans;

    }
    public static void main(String[] args) {
        exam8 ex=new exam8();
        int array[]={1,2,3,4,5};
        int b[]={0,1,1,1,1};
        System.out.println(ex.minNumberInRotateArray(array));
        System.out.println(ex.minNumberInRotateArray(b));

    }
}
