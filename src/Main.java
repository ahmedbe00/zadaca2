public class Main {
    public static void main(String[] args) {

        double MoneyInSafe = 99.99;
        double Receipt = 10.06;
        double Change = MoneyInSafe - Receipt;
        double FiftyBills;
        double TwentyBills;
        double TenBills;
        double FiveBills;
        double TwoBills;
        double OneBills;
        double Bill50cent;
        double Bill20cent;
        double Bill10cent;
        double Bill1cent;
        int numberOfFifty = 1;
        int numberOFTwenty = 3;
        int numberOfTen = 9;


        if ((MoneyInSafe > 100) && (Receipt > 0)) {
            System.out.println("You have too much money");
        } else if ((Receipt == 0)) /* && (MoneyInSafe>100)) */ {
            System.out.println("Did you maybe break something.");
        } else if ((Receipt < 0)) /*oneyInSafe>100)) */ {
            System.out.println("You didnt buy anything did you”");
            System.out.println("Did you maybe break something.");
        } else {

            FiftyBills = (Change - (Change % 50)) / 50;
            Change = Change % 50;

            TwentyBills = (Change - (Change % 20)) / 20;
            Change = Change % 20;


            TenBills = (Change - (Change % 10)) / 10;
            Change = Change % 10;

            FiveBills = (Change - (Change % 5)) / 5;
            Change = Change % 5;

            TwoBills = (Change - (Change % 2)) / 2;
            Change = Change % 2;

            OneBills = (Change - (Change % 1)) / 1;
            Change = Change % 1;

            Bill50cent = (Change - (Change % 0.5)) / 0.5;
            Change = Change % 0.5;

            Bill20cent = (Change - (Change % 0.2)) / 0.2;
            Change = Change % 0.2;

            Bill10cent = (Change - (Change % 0.1)) / 0.1;
            Change = Change % 0.1;

            Bill1cent = (Change - (Change % 0.01)) / 0.01;
            Change = Change % 0.01;

            System.out.println("50 KM = " + FiftyBills);
            System.out.println("20 KM = " + TwentyBills);
            System.out.println("10 KM = " + TenBills);
            System.out.println("5 KM = " + FiveBills);
            System.out.println("2 KM = " + TwoBills);
            System.out.println("1 KM = " + OneBills);
            System.out.println("50 cent = " + Bill50cent);
            System.out.println("20 cent = " + Bill20cent);
            System.out.println("10 cent = " + Bill10cent);
            System.out.println("1 cent = " + Bill1cent);

            // I noticed that when calculating 1 cent the program is not accurate, that is probably the accuracy you were talking about
        }


    }

}

        






