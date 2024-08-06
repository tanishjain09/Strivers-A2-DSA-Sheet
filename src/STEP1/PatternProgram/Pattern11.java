package STEP1.PatternProgram;
/*
1
01
101
0101
10101
 */
public class Pattern11 {
    static void pattern11(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n =5;
        pattern11(n);
    }
}
