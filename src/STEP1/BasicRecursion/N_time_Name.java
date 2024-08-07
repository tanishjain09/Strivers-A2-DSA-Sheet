package STEP1.BasicRecursion;

public class N_time_Name {
    static void nTimes(int n){
        if(n == 0){
            return;
        }
        System.out.println("Tanish");
        nTimes(n-1);
    }

    public static void main(String[] args) {
        nTimes(5);
    }
}
