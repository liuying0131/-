public class exam3 {
    /*
    * 二维数组查找
    */

   public Boolean Find(int target,int a[][]){
       int col=a[0].length-1;

       int row=0;
       int temp;

       while(col>=0&&row<a.length){
           temp=a[row][col];//右上角的数a
           if(target<temp){
               col--;

           }
           if(target>temp){

               row++;

           }
           else if(target==temp){
              /* System.out.println(row);
               System.out.println(col);*/
               return true;
           }

       }
       return false;
   }

    public static void main(String[] args) {
        int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        exam3 exam=new exam3();
        if(exam.Find(7,a)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }




}
