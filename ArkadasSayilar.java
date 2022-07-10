package APComputerScience;

public class ArkadasSayilar {
    public static void main(String[] args) {
        int num1 = 220;
        int num2 = 284 ;
        int counter1 = 0 ;
        int counter2 = 0 ;
        for (int i = 1; i < num1; i++) {
            if (num1%i==0){
                counter1 = counter1 + i ;
            }
        }
        for (int j = 1; j < num2; j++) {
            if (num2%j==0){
                counter2 = counter2 + j ;
            }
        }
        if (num1==counter2 && num2==counter1 ){
            System.out.println("Friendy Number");
        }
        else {
            System.out.println("Not Friendy number");
        }
    }
}
