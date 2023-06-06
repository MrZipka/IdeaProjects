import java.util.Scanner;

public class Class {
    private static final String[] ones = {
            "", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",
            "десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
            "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"
    };

    private static final String[] tens = {
            "", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят",
            "восемьдесят", "девяносто"
    };

    private static final String[] hundreds = {
            "", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
            "восемьсот", "девятьсот"
    };

    public static String numberToWords(int number) {
        if (number == 0) {
            return "ноль";
        }

        StringBuilder result = new StringBuilder();

        if (number < 0) {
            result.append("минус ");
            number = -number;
        }

        if (number < 20) {
            result.append(ones[number]);
        } else if (number < 100) {
            int tensDigit = number / 10;
            int onesDigit = number % 10;
            result.append(tens[tensDigit]).append(" ").append(ones[onesDigit]);
        } else {
            int hundredsDigit = number / 100;
            int tensDigit = (number % 100) / 10;
            int onesDigit = number % 10;
            result.append(hundreds[hundredsDigit]).append(" ")
                    .append(tens[tensDigit]).append(" ").append(ones[onesDigit]);
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        scanner.close();

        String result = numberToWords(number);

        System.out.println(result + " рублей");
    }
}