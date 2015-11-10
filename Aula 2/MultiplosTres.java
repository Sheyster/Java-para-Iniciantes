class MultiplosTres{
	public static void main(String[] args){

		for(int i = 1; i <= 100; i++){
			if(i % 3 ==0){
				System.out.println("Multiplos de três: " + i);
			}
		}
		
		System.out.println("-------------------------------");
		
		int multiplos = 3;
		for(int j = 1; j <= 100; j++){
			if(j == multiplos){
				System.out.println("Multiplos de três: " + j);
				multiplos += 3;
			}
		}
	}
}