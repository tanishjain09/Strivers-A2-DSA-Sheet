package STEP1.PatternProgram;
/*
1      1
12    21
123  321
12344321
 */
public class Pattern12 {
    static void pattern12(int n){
        int space = 2*(n-1);
        for(int i=1; i<=n; i++){
            //numbers
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            //space
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            space -= 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        pattern12(n);
    }
}
