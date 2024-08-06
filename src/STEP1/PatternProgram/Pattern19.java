package STEP1.PatternProgram;

public class Pattern19 {
    static void pattern19(int n){
        int iniS = 0;
        for(int i=1;i<=n;i++){
            //stars
            for(int j = 1; j<=n-i; j++){
                System.out.print("*");
            }
            //spaces
            for(int j =0; j<iniS; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=n-i; j++){
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }
        iniS = 8; // Initialize space count for the second part

        // Bottom part of the pattern
        for (int i = 1; i <= n; i++) {
            // Print stars before spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces in the middle
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            // Print stars after spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Decrease spaces for the next row
            iniS -= 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n =5;
        pattern19(n);
    }
}
