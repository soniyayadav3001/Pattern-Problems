public class Pattern {
    public static void main(String[] args) {
        int i , space ,j;
for(i = 1; i<10;i++){
	for(space=1;space<=10-i;space++){
		System.out.print(" ");
	}
	for(j =1;j<=i;j++){
		System.out.print(" *");
	}
	System.out.println();
}	
    }
}
