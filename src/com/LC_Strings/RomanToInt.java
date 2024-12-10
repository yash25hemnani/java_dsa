package com.LC_Strings;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    static int romanToInt(String s) {
        int num = 0;
        int i = 0;

        while (i < s.length()) {
            StringBuilder builder = new StringBuilder();
            builder.append(s.charAt(i));

            if (i+1 < s.length()){
                if (builder.toString().equals("I")){
                    if (Character.toString(s.charAt(i+1)).equals("V")){
                        num+=4;
                        i+=2;
                        continue;
                    } else if (Character.toString(s.charAt(i+1)).equals("X")){
                        num+=9;
                        i+=2;
                        continue;
                    }
                }

                if (builder.toString().equals("X")){
                    if (Character.toString(s.charAt(i+1)).equals("L")){
                        num+=40;
                        i+=2;
                        continue;
                    } else if (Character.toString(s.charAt(i+1)).equals("C")){
                        num+=90;
                        i+=2;
                        continue;
                    }
                }

                if (builder.toString().equals("C")){
                    if (Character.toString(s.charAt(i+1)).equals("D")){
                        num+=400;
                        i+=2;
                        continue;
                    } else if (Character.toString(s.charAt(i+1)).equals("M")){
                        num+=900;
                        i+=2;
                        continue;
                    }
                }
            }


            if (builder.toString().equals("I")){
                num+=1;
            } else if (builder.toString().equals("V")) {
                num+=5;
            } else if (builder.toString().equals("X")) {
                num+=10;
            } else if (builder.toString().equals("L")) {
                num+=50;
            } else if (builder.toString().equals("C")) {
                num+=100;
            } else if (builder.toString().equals("D")) {
                num+=500;
            } else if (builder.toString().equals("M")) {
                num+=1000;
            }

            builder = new StringBuilder();
            i++;
        }

        return num;
    }
}
