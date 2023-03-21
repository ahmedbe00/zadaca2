public class Main {
    public static void main(String[] args) {

        int MoneyInSafe = 99;
        int Receipt = 10;
        int Change = MoneyInSafe - Receipt;
        int FiftyBills ;
        int TwentyBills;
        int TenBills;
        int FiveBills;
        int TwoBills;
        int OneBills;


        if ((MoneyInSafe>100) && (Receipt>0)) {
        System.out.println("You have too much money");
        }
        else if ((Receipt==0)) /* && (MoneyInSafe>100)) */ {
            System.out.println("Did you maybe break something.");
        }
        else if ((Receipt<0)) /*oneyInSafe>100)) */ {
            System.out.println("You didnt buy anything did you”");
            System.out.println("Did you maybe break something.");
        }
        else {
            FiftyBills = Change/50;
            Change = Change%50;

            TwentyBills = Change/20;
            Change = Change%20;

            TenBills = Change/10;
            Change = Change%10;

            FiveBills = Change/5;
            Change = Change%5;

            TwoBills = Change/2;
            Change = Change%2;

            OneBills = Change/1;
            Change = Change%1;

            System.out.println("50 KM = " + FiftyBills );
            System.out.println("20 KM = " + TwentyBills );
            System.out.println("10 KM = " + TenBills );
            System.out.println("5 KM = " + FiveBills );
            System.out.println("2 KM = " + TwoBills );
            System.out.println("1 KM = " + OneBills );
        }
        int NumberOfFifthy = 3;
        int NumberOfTwenty = 1;
        int NumberOfTen = 4;
        int NumberOfFive = 2;
        int NumberOfTwo = 2;
        int NumberOfOne = 20;












        }

    }

        






