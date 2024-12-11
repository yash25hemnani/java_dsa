package com.LC_Strings;

public class Atoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("1337c0d3"));
    }

    static int myAtoi(String s){
        int num = 1;
        int i = 0;
        boolean negative = false;
        boolean sign_checked = false;

        if(!(s.charAt(0) >= (int)('0') && s.charAt(0) <= (int)('9'))){
            if ((s.charAt(0) != '-')){
                return 0;
            }
        }

        while(i <= s.length()-1){
            if(s.charAt(i) == ' '){
                i++;
                continue;
            }

            if(!sign_checked && s.charAt(i) == '-'){
                if (s.charAt(i) == '-'){
                    negative = true;
                    i++;
                    continue;
                }
            }
            sign_checked = true;

            if(s.charAt(i) >= (int)('0') && s.charAt(i) <= (int)('9')){
                if (num == 1 || num == -1){
                    if (((int)(s.charAt(i)) - (int)('0')) != 0 ){
                        if(((int)(s.charAt(i)) - (int)('0')) == 1){
                            num *= 10;
                        } else {
                            num *= ((int)(s.charAt(i)) - (int)('0'));
                        }
                    }
                    i++;
                    continue;
                }
                num *= 10;
                num += ((int)(s.charAt(i)) - (int)('0'));
                i++;
            } else {
                break;
            }
        }

        return (negative) ? (-1*num) : (num);
    }
}
