package DailySums;

public class Train8 {
    public static void main(String[] args) {
        int[] numbers ={4,6,10,12,24,28};

        for(int i=0;i<numbers.length;i++){
              int temp =i+1;
              if(temp%2==0){
                  if (temp!=numbers[i-1]) {
                      System.out.println(temp);
                  }
              }
        }
    }
}


// if (i!=numbers[i]) {
//         System.out.println(i);
//         }