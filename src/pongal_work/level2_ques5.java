package pongal_work;

public class level2_ques5 {
    public static void main(String[] args) {
        int n,i,pr=0;
         n =6;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                pr=(int) (Math.pow(i,2)-2);
                System.out.print(pr+" ");
            }
            else
            {
                pr=(int) (Math.pow(i,2)-1);
                System.out.printf(pr+" ");
            }
        }
    }
}
