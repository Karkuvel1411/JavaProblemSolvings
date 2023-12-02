package DailySums;

public class GapSum {

//    static int cal(int[] ar){
//        if(ar.length < 1){
//            return -1;
//        }
//        System.out.println(ar.length);
//        int ans = 0;
//        for(int i = 0; i < ar.length -1 ;){
//            int temp = 0;
//            temp += ar[i];
//            if((i+1)<ar.length){
//                temp+=ar[i+1];
//            }
//            if((i+2)<ar.length){
//                temp+=ar[i+2];
//            }
//            System.out.println(temp);
//            ans+=temp;
//            i+=3;
//        }
//        return ans;
//    }
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8,9};
        int gap =3;
int sum =0;
int sum1=0;
int sum2 =0;
        for(int i =0;i<numbers.length;i+=gap){
             sum = sum+numbers[i];
        }
        for(int j =1;j<numbers.length;j+=gap){
            sum1 = sum1+numbers[j];
        }
        for(int k =2;k<numbers.length;k+=gap){
            sum2 = sum2+numbers[k];
        }
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println();
//        cal(numbers);

    }
}
