package com.BasicProgram;

public class ExpnEvaluation {
    public static void main(String[] args) {
        // here below evaluated in integer because operation betweeen the two integet
        // got integer.
        // 1.float a = 7/4*9/2;
        // 2.float a=7/4.0f*9/2.0f;
        /*
         * 1.solution
         * 4.0 ans
         * 7/4=1
         * 1*9=9
         * 9/2=4
         * because of float it shows 4.0
         */
        /*
         * 2.solution
         * operation between integer and float is float so
         * 7/4.0f=1.75
         * 1.75*9=15.75
         * 15.75/2.of=7.875 ans
         */
        // float a = 7/4*9/2;
        // System.out.println(a);
        float a = 7 / 4.0f * 9 / 2.0f;
        System.out.println(a);
    }
}
