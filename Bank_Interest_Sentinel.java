public class Bank_Interest_Sentinel{
    public static void main(String [] args){
        double myMoney = 25.0;
        int years = 0;
            while(myMoney < 1000000) {
                myMoney = myMoney * 1.05;
                years++;
                System.out.println("After " + years + " years, I have " + myMoney);
            }
        System.out.println("It took " + years + " years to get a million dollars");
    }
}