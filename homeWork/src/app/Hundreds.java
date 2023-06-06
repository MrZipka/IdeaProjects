public class Hundreds {
    private static final String[] hundreds = {
            "", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот",
            "восемьсот", "девятьсот"
    };

    public String getNumber (int i ){
        return hundreds[i];
    }
}

