package TrainingDsa;

public class DivisiblebyTwo {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6,7,8,};
        for(Integer ip: numbers){
            if(ip %2==0){
                System.out.println(ip);
            }
        }
    }
}
