package STEP1.PatternProgram;

public class Pattern17 {
    static void patter17(int n){
        for(int i=0; i<n; i++){
            //space
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            //alphabate
            char ch = 'A';
            int breakpoint =(2*i+1) / 2;
            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);
                if(j <= breakpoint) ch++;
                else ch--;
            }
            //space
            for(int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        patter17(n);
    }
}
