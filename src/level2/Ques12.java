package level2;

public class Ques12 {
    public static void main(String[] args) {
      int a=1;
      int b=8;
      int c=3;
      int max;
      if(a<b){
          max=b;
      }else{
          max = a;
      }
      if(max<c){
          System.out.println(c);
      }else{
          System.out.println(max);
      }
    }
}
