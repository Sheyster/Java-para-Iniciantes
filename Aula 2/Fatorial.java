import java.math.BigInteger;

class Fatorial{
	public static void main(String[] args){
		for(int i = 0; i <= 10; i++){
			System.out.println(i + " ! = " + fatorial(i));
		}
	}
	static long fatorial(long num){
		if(num <= 1){
			return 1;
		} else {
			return num * fatorial(num - 1);
		}
	}
}