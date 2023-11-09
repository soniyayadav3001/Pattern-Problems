import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
        int number=1;
        int i;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++;
            }
            
            System.out.println();
        }
        
    }

}
