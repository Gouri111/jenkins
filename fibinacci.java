

public class fibinacci {
	public static void main(String[] args) {
		
		
		int sum=0;
		int n1=0;
		int n2=1;
		while(n2<=1000) {
			if(n2>=100) {
			System.out.println(n2);
			}
			sum=n1+n2;
			n1=n2;
			n2=sum;
		
		}
}
}
