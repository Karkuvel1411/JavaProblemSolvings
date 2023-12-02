package Oops;

public class Poly {
    public static void main(String[] args) {
        MethodOver obj1 =new MethodOver();
        obj1.minimum(5,6);
        obj1.minimum(1,2,3);
    }
}
class MethodOver{
    void minimum(int a,int b){
        if(a>b){
            System.out.println(b);
        }else{
            System.out.println(a);
        }
    }
    void minimum(int a,int b,int c){
        System.out.println(a);
    }
}
