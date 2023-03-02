import java.util.Scanner;

public class Main {

    public static void main(String[] arg){
        int choice = 0,amt = 0;
        double amt2 =0.0;
        Scanner input = new Scanner(System.in);
        PiggyBank piggybank = new PiggyBank();
        do{
            System.out.println("");
            System.out.println("**************************************************************");
            System.out.println("========================= My Piggy Bank ======================");
            System.out.println("1. Show total in bank \n"
            + "2. Add a penny \n"
            + "3. Add a nickel \n"
            + "4. Add a dime \n"
            + "5. Add a quarter \n"
            + "6.Take money out of the bank \n"
            + "Enter 0 to quit. \n"
            + "Enter your choice: ");

            choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("");
                    piggybank.ShowTotal();
                    break;

                case 2:
                    System.out.println("");
                    System.out.print("Enter Number of a Penny to add : ");
                    amt=input.nextInt();
                    piggybank.AddPenny(amt);
                    break;

                case 3:
                    System.out.println("");
                    System.out.print("Enter Number of Nickel to add : ");
                    amt=input.nextInt();
                    piggybank.AddNickel(amt);
                    break;

                case 4:
                    System.out.println("");
                    System.out.print("Enter Number of a Dime to add : ");
                    amt=input.nextInt();
                    piggybank.AddDime(amt);
                    break;

                case 5:
                    System.out.println("");
                    System.out.print("Enter Number of a Quarter to add : ");
                    amt=input.nextInt();
                    piggybank.AddQuarter(amt);
                    break;

                case 6:
                    System.out.println("");
                    System.out.print("Enter Amount to Withdraw : ");
                    amt2=input.nextDouble();
                    piggybank.Withdraw(amt2);
                    break;
                case 0:
                    System.out.println("");
                    System.out.print("END OF THE PROGRAM");
                    break;
                default:
                    System.out.println("Wrong Choice,try again!");
            }
        }
        while(choice!=0);

    }
}

