package com.LC_Strings;
public class IntToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(58));
    }

    static String appendValue(int multiplied){
        switch (multiplied) {
            case 4:
                return "IV";
            case 9:
                return "IX";
            case 40:
                return "XL";
            case 90:
                return "XC";
            case 400:
                return "CD";
            case 900:
                return "CM";
        }

        return "";
    }

    static String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();

        int[] maxSubtractValues = {1000, 500, 100, 50, 10, 5, 1};
        char[] relatedRoman = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};

        int tens = 1;
        int maxSubValPointer = 0;

        while(num >= 0){
            int last_digit = num%10;
            int multiplied = last_digit * tens;
            num /= 10;

            if (last_digit == 4 || last_digit == 9){
                builder.append(appendValue(multiplied));
            } else {
                // Append the character smaller than equal to multiplied
                while(multiplied >= 0){
                    for (int i = 0; i < maxSubtractValues.length - 1; i++) {
                        if (maxSubtractValues[i] <= multiplied){
                            builder.append(relatedRoman[i]);
                            multiplied -= maxSubtractValues[i];
                        }
                    }
                }

            }

            tens *= 10;
        }

        return builder.toString();
    }
}
