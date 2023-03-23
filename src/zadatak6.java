public class zadatak6 {
    public static void main(String[] args) {

        int numberA = 50;
        int numberB = 50;
        int numberC = 50;
        int numberD = 50;



        if ((numberA > 0) && (numberB > 0) || (numberC > 0) && (numberD > 0)) {
            int sumABCD = numberD+numberB+numberC+numberA;
            if (sumABCD>100) {
                 if (sumABCD%2==0){
                     sumABCD /=2 ;
                 }
                 else {
                     sumABCD=sumABCD-1;
                     if (sumABCD%2==0){
                         sumABCD /=2 ;

                     }
                     else {
                         System.out.println("The number is still not divisible by 2");
                     }
                 }


            }
        }




    }
}
