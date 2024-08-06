package STEP1.PatternProgram;

import static STEP1.PatternProgram.Pattern7.pattern7;
import static STEP1.PatternProgram.Pattern8.pattern8;

public class Pattern9 {
    static void pattern9(int n) {
        pattern7(n / 2);
        pattern8(n / 2);
    }

    public static void main(String[] args) {
        int  n = 9;
        pattern9(n);
    }
}
