import java.util.Scanner;

class Calculator{

        public static void main(String[] args) {
            System.out.println(calc("11 * 11"));
            System.out.println(calc("9 - X"));
            System.out.println(calc("6 * 9 + 1"));
            System.out.println(calc("21/7"));
            System.out.println(calc("IX - X"));
        }
        public static String calc(String input) {
            String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
            };
            int count = 0;
            int count1 = 0;
            int count2 = 0;
            String count3;
            String a = "";
            String b = "";
            String c = "";
            String d = "";
            String[] words = input.split(" ");
            switch (words.length) {
                case 1:
                    a = words[0];
                    break;
                case 2:
                    a = words[0];
                    b = words[1];
                    break;
                case 3:
                    a = words[0];
                    b = words[1];
                    c = words[2];
                    break;
            }
                if (words.length > 3){
                    a = words[0];
                    b = words[1];
                    c = words[2];
                    d = words[3];
            }
            switch (a) {
                case "I" :
                    count = count + 1;
                    break;
                case "II" :
                    count = count + 2;
                    break;
                case "III" :
                    count = count + 3;
                    break;
                case "IV" :
                    count = count + 4;
                    break;
                case "V" :
                    count = count + 5;
                    break;
                case "VI" :
                    count = count + 6;
                    break;
                case "VII" :
                    count = count + 7;
                    break;
                case "VIII" :
                    count = count + 8;
                    break;
                case "IX" :
                    count = count + 9;
                    break;
                case "X" :
                    count = count + 10;
                    break;
            }
            switch (c) {
                case "I":
                    count1 = count1 + 1;
                    break;
                case "II":
                    count1 = count1 + 2;
                    break;
                case "III":
                    count1 = count1 + 3;
                    break;
                case "IV":
                    count1 = count1 + 4;
                    break;
                case "V":
                    count1 = count1 + 5;
                    break;
                case "VI":
                    count1 = count1 + 6;
                    break;
                case "VII":
                    count1 = count1 + 7;
                    break;
                case "VIII":
                    count1 = count1 + 8;
                    break;
                case "IX":
                    count1 = count1 + 9;
                    break;
                case "X":
                    count1 = count1 + 10;
                    break;
            }
            if (d.length() == 0)
                if ((count > 0) && (count1 > 0)) {
                    switch (b) {
                        case "+":
                            count3 = roman[count + count1];
                            break;
                        case "-":
                            if (count > count1) {
                                count3 = roman[count - count1];
                            } else {
                                count3 = "throws Exception //т.к. в римской системе нет отрицательных чисел";
                            }
                            break;
                        case "*":
                            count3 = roman[count * count1];
                            break;
                        case "/":
                            count3 = roman[count / count1];
                            break;
                        default:
                            count3 = "throws Exception //т.к данной операции нет в списке";
                    }
                }else{
                    try
                    {
                        count = Integer.parseInt(a.trim());
                        count1 = Integer.parseInt(c.trim());
                        if (((count > 0) && (count < 11)) && ((count1 > 0) && (count1 < 11))) {
                            switch (b) {
                                case "+":
                                    count2 = count + count1;
                                    count3 = Integer.toString(count2);
                                    break;
                                case "-":
                                    count2 = count - count1;
                                    count3 = Integer.toString(count2);
                                    break;
                                case "*":
                                    count2 = count*count1;
                                    count3 = Integer.toString(count2);
                                    break;
                                case "/":
                                    count2 = count/count1;
                                    count3 = Integer.toString(count2);
                                    break;
                                default:
                                    count3 = "throws Exception //т.к данной операции нет в списке";
                            }
                        }else{
                            count3 = "throws Exception //т.к. ввод требует числа от 1 до 10, не более";
                        }
                    }
                    catch (NumberFormatException nfe)
                    {
                        if (words.length < 2) {
                            count3 = "throws Exception //т.к. строка не может быть математической операцией";
                        }else{
                            count3 = "throws Exception //т.к. используются одновременно разные системы счисления";
                        }
                    }
                }else if(b.length() == 0 && c.length() == 0) {
                count3 = "throws Exception //т.к. используются одновременно разные системы счисления";
            }else{
                count3 = "throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)";
            }
            return count3;
        }
    }
