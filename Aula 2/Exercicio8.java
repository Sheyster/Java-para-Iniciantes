class Exercicio8 {
	public static void main(String[] args){
		 int x = 15;

		System.out.print(x + " > ");
		while (x != 1)
		{
		  if (x % 2 == 0)
		  {
			x = x / 2;
			if(x==1){
				System.out.print(x);
			} else {
				System.out.print(x + " > ");
			}
		  }
		  else
		  {
			x = 3 * x + 1;
			System.out.print(x + " > ");
		  }
		}
	}
}