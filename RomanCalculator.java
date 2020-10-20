package JM_TestWork;

import java.util.Arrays;
import java.util.List;

public class RomanCalculator {
    private int a;
    private int b;
    int result;


    private void sum (){
        result = a+b;
    }
    private void substract (){
        result = a-b;
    }
    private void multiply (){
        result = a*b;
    }
    private void divide (){
        result = a/b;
    }


    public void variableDefinition(List<String> expression){
        for (String s : expression) {
            if (RomanNumeral.romanToArabic(s) > 10 || RomanNumeral.romanToArabic(s) < 1) {
                throw new RuntimeException("Числа не должны быть больше 10 и меньше 1");
            }
        }
        a = RomanNumeral.romanToArabic(expression.get(0));
        b = RomanNumeral.romanToArabic(expression.get(1));

    }


    public String calculate (String string) {
        List <String> expression;

        if (string.split("\\+").length == 2){
            expression = Arrays.asList(string.split("\\+"));
            variableDefinition(expression);
            sum();
        }

        else if (string.split("-").length == 2){
            expression = Arrays.asList(string.split("-"));
            variableDefinition(expression);
            substract();
        }

        else if (string.split("\\*").length == 2){
            expression = Arrays.asList(string.split("\\*"));
            variableDefinition(expression);
            multiply();
        }

        else if (string.split("/").length == 2){
            expression = Arrays.asList(string.split("/"));
            variableDefinition(expression);
            divide();
        }
        else throw new RuntimeException("Некорректное выражение");

        return RomanNumeral.arabicToRoman(result);
    }
}

