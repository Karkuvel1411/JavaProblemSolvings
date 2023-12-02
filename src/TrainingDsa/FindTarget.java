package TrainingDsa;

public class FindTarget {
    public static void main(String[] args){
        int target =5;
        int[] array = {1,2,3,4,5};
        for(int i =0; i<array.length-1;i++){
            if(array[i]+array[i+1]==target){
                System.out.println(array[i]+" "+array[i+1]);

            }
        }
    }
}
