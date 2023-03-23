public class zadatak4 {
    public static void main(String[] args) {
        int NumberA = 19;
        int NumberB = 19 ;
        int SumNumbers = NumberA+NumberB;
        int SubstractionNum = NumberB-NumberA;
        int MultipleNum = NumberA*NumberB;

        if (NumberA>NumberB)  {
            System.out.println("Sum of numbers " + NumberA+ " and " + NumberB + " is "+ SumNumbers);
        }
        if (NumberB>NumberA) {
            System.out.println("Subtraction of numbers " + NumberB + " and " + NumberA + " is " + SubstractionNum);
        }
        else if (NumberB==NumberA) {
            System.out.println("Sum of multiplied numbers " + NumberB +  " is " + MultipleNum);
        }




    }
}
