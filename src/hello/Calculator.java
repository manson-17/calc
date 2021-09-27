package hello;

import java.util.Scanner;


public class Calculator {
    static int result;
    static int a;
    static int b;

    public static void main(String[] args) {
        System.out.println("Калькулятор принимает Римские и арабские цифры от 1 до 10, ввод символов через пробел");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] vvod = input.split(" ");
        String oper = vvod[1];


        if (checkRom(vvod[0])) {

                RomNum rom1 = RomNum.valueOf(vvod[0]);
                RomNum rom2 = RomNum.valueOf(vvod[2]);
                a = rom1.getTranslation();
                b = rom2.getTranslation();
                result = calculate(a, b, oper);
                String resultRom = arabToRom(result);
                System.out.println(resultRom);

        } else if (checkArab(vvod[0])) {

                a = Integer.parseInt(vvod[0]);
                b = Integer.parseInt(vvod[2]);
                result = calculate(a, b, oper);
                System.out.println(result);


        }
    }

    public static int calculate(int x, int y, String oper1) {
        int result = 0;
        switch (oper1) {
            case "+":
                result = x + y;
                break;
            case "-":
                result = x - y;
                break;
            case "*":
                result = x * y;
                break;
            case "/":
                result = x / y;
                break;
        }
        return result;

    }



    static boolean checkArab(String a) {
        String[] arab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        boolean check = false;
        for (String s : arab) {
            if (s.equals(a)) {
                check = true;
                break;
            }

        }
        return check;
    }
    static boolean checkRom(String a) {
        String[] rom = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        boolean check = false;
        for (String s : rom) {
            if (s.equals(a)) {
                check = true;
                break;
            }
        }
        return check;
    }


    static String arabToRom(int num) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String n;
        try {
            n = roman[num];
            return n;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка " + e);
        }
        return n = null;
    }

}

