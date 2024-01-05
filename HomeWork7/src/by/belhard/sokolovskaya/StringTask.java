package by.belhard.sokolovskaya;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTask {

    void one() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = sc.nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = sc.nextInt();

        StringBuilder sumString = new StringBuilder();
        StringBuilder differenceString = new StringBuilder();
        StringBuilder multiplyString = new StringBuilder();

        sumString.append(firstNumber).append(" + ").append(secondNumber).append(" = ").append(firstNumber + secondNumber);
        differenceString.append(firstNumber).append(" - ").append(secondNumber).append(" = ").append(firstNumber - secondNumber);
        multiplyString.append(firstNumber).append(" * ").append(secondNumber).append(" = ").append(firstNumber * secondNumber);

        System.out.println(sumString);
        System.out.println(differenceString);
        System.out.println(multiplyString);
        System.out.println();

        int indexSum = sumString.indexOf("=");
        sumString.replace(indexSum, indexSum + 1, "равно");
        int indexDif = differenceString.indexOf("=");
        differenceString.replace(indexDif, indexDif + 1, "равно");
        int indexMult = multiplyString.indexOf("=");
        multiplyString.replace(indexMult, indexMult + 1, "равно");

        System.out.println(sumString);
        System.out.println(differenceString);
        System.out.println(multiplyString);
    }

    void two() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = sc.nextLine();
        String link = "[A-zА-я0-9.\\-_:?#\\[\\]@!$&'()*+,;%=]+\\.com";

        Matcher matcher = Pattern.compile(link).matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    void three() {
        String text = "ahb acb aeb aeeb adcb axeb";
        String pattern = "a.b";

        Matcher matcher = Pattern.compile(pattern).matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    void four() {
        String text = "'ab abea abab abab abababab abea";
        String pattern = "(ab)+[ $]";

        Matcher matcher = Pattern.compile(pattern).matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    void five() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату формата YYYY/MM/DD HH:MM: ");
        String date = sc.nextLine();
        String pattern = "((1\\d{3})|(200\\d)|(201[0-2]))/(0?[1-9]|1[0-2])/(0?[1-9]|1[0-9]|2[0-9]|30) (0?[0-9]|1[0-9]|2[0-3]):(0?[0-9]|[1-5][0-9])";

        Matcher matcher = Pattern.compile(pattern).matcher(date);
        if (matcher.matches()) {
            System.out.println("существует");
        } else {
            System.out.println("не существует");
        }
    }
}
