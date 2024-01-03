public class Pattern{
    public static void main(String[]args){
        
        int n = 5;
        int m = 5;
        char ch ='A';
        int space;
        for(int i =1;i<=n;i++){
            for(space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

}
