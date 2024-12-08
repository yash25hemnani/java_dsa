package com.LC_Strings;

public class AddStrings {
    public static void main(String[] args) {
//        System.out.println(addStrings("3876620623801494171", "6529364523802684779"));
        System.out.println(addStrings("6994", "36"));
    }

    static String addStrings(String num1, String num2) {
//        long con_num1 = 0L;
//        long con_num2 = 0L;
//
//        for (int i = 0; i < num1.length(); i++) {
//            con_num1 += (int)num1.charAt(i) - (int)('0');
//            if (i != (num1.length() - 1)){
//                con_num1 *= 10;
//            }
//
//        }
//        System.out.println(con_num1);
//        for (int i = 0; i < num2.length(); i++) {
//            con_num2 += (int)num2.charAt(i) - (int)('0');
//            if (i != (num2.length() - 1)){
//                con_num2 *= 10;
//            }
//        }
//        System.out.println(con_num2);
//        return Long.toString((con_num1 + con_num2));
//
//         The above fails for larger numbers

        // ===> We will use a two pointer approach
        // We start with a pointer for first number as well as second number
        // The pointers will point to the last numbers respectively
        // They will add the numbers and append them to a stringbuilder from the front

        int larger_pointer, smaller_pointer = 0;
        String larger_num, smaller_num = "";

        if (num1.length() > num2.length()){
            larger_pointer = num1.length() - 1;
            larger_num = num1;
            smaller_pointer = num2.length() - 1;
            smaller_num = num2;
        } else {
            larger_pointer = num2.length() - 1;
            larger_num = num2;
            smaller_pointer = num1.length() - 1;
            smaller_num = num1;
        }


        StringBuilder final_number = new StringBuilder();

        int carry = 0;

        while(smaller_pointer >= 0){

            int added_num = (int)larger_num.charAt(larger_pointer) + (int)smaller_num.charAt(smaller_pointer) - 2*((int)('0'));

            // Adding the carried number
            added_num += carry;
            // Use the carry and reset it
            carry = 0;

            // Updating the carried number
            if (added_num >= 10){
                carry = added_num/10;
                added_num = added_num%10;
            }

            final_number.insert(0, added_num);
            larger_pointer--;
            smaller_pointer--;
        }

        while(larger_pointer >= 0){
            int added_num = (int)larger_num.charAt(larger_pointer) - ((int)('0'));

            if (carry != 0){
                added_num += carry;
                carry = 0;
            }

            if (added_num >= 10){
                carry = added_num/10;
                added_num = added_num%10;
            }

            final_number.insert(0, added_num);
            larger_pointer--;
        }

        if (carry != 0){
            final_number.insert(0, carry);
            carry = 0;
        }

        return final_number.toString();
    }
}
