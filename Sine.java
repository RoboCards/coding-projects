public class Sine {

	public static int factorial(int n){
		for(;n>0;n--){
			n = n * factorial(n--);
		}
		return n;
	}


	public static void main(String[] args) {
		int n = factorial(5);
		System.out.println(n);

	}


}