import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int count1 = 0;
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String text = sc.nextLine();
        String[] words = text.split(" ");
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
            case 4:
                a = words[0];
                b = words[1];
                c = words[2];
                d = words[3];
                break;
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
            case "IX" :
                count = count + 9;
            case "X" :
                count = count + 10;
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
            case "IX":
                count1 = count1 + 9;
            case "X":
                count1 = count1 + 10;
        }
        if (d.length() == 0)
            if ((count > 0) && (count1 > 0)) {
                switch (b) {
                    case "+":
                        System.out.print(roman[count + count1]);
                        break;
                    case "-":
                        if (count > count1) {
                            System.out.print(roman[count - count1]);
                        } else {
                            System.out.print("throws Exception //т.к. в римской системе нет отрицательных чисел");
                        }
                        break;
                    case "*":
                        System.out.print(roman[count * count1]);
                        break;
                    case "/":
                        System.out.print(roman[count / count1]);
                        break;
                    default:
                        System.out.print("throws Exception //т.к данной операции нет в списке");
                }
            }else{
                try
                {
                    count = Integer.parseInt(a.trim());
                    count1 = Integer.parseInt(c.trim());
                    if (((count > 0) && (count < 11)) && ((count1 > 0) && (count1 < 11))) {
                        switch (b) {
                            case "+":
                                System.out.print(count + count1);
                                break;
                            case "-":
                                System.out.print(count - count1);
                                break;
                            case "*":
                                System.out.print(count * count1);
                                break;
                            case "/":
                                System.out.print(count / count1);
                                break;
                            default:
                                System.out.print("throws Exception //т.к данной операции нет в списке");
                        }
                    }else{
                        System.out.println("throws Exception //т.к. ввод требует числа от 1 до 10, не более");
                    }
                }
                catch (NumberFormatException nfe)
                {
                    if (words.length < 2) {
                        System.out.println("throws Exception //т.к. строка не может быть математической операцией");
                    }else{
                        System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                    }
                }
        }else if(b.length() == 0 && c.length() == 0) {
            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
        }else{
            System.out.print("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        }
    }
