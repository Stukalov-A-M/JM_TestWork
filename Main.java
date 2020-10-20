package JM_TestWork;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        calculatorChoose(input);

    }

    static void calculatorChoose (String input){
        boolean flag = false;

            for (RomanNumeral q: RomanNumeral.values()) {
                if (input.toUpperCase().contains(q.toString())) {
                    flag = true;
                    break;
                }
            }
            if (flag){
                System.out.println(new RomanCalculator().calculate(input));
            }
            else System.out.println(new ArabianCalculator().calculate(input));


    }
}
