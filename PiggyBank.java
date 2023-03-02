public class PiggyBank {

    private double total=0.0;

    void AddPenny(int num){
        total = total + num*0.01;
    }
    void AddNickel(int num){
        total = total + num*0.05;
    }
    void AddDime(int num){
        total = total + num*0.10;
    }
    void AddQuarter(int num){
        total = total + num*0.25;
    }
    void ShowTotal(){
        System.out.println("YOUR BALANCE IS $ "+total);
    }
    void Withdraw(double amt){
        if(amt<=total){
            total = total-amt;
            System.out.println("WITHDRAW IS SUCCESSFUL.");
        }
        else
            System.out.println("NOT ENOUGH BALANCE TO WITHDRAW !!");
    }
}

