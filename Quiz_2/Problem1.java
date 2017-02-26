import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 

		System.out.println("starting tuition: "); 
		double tuition=sc.nextDouble();
		System.out.println("percent increase: "); 
		double rate=sc.nextDouble();
		double accum = 0;
		for(int i = 0; i <= 2; i++){
			accum = accum + tuition;
			tuition = tuition * (1 + (rate/100));
		System.out.println(accum);
		}
	}

}
