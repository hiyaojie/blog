class Lottery {
	public static void main(String[] args){
		int n = 100;
		int[] numbers = new int[n];
		for(int i=0;i<n;i++){
			numbers[i]=i+1;
		}
		int[] result = new int[5];
		for(int i=0;i<result.length;i++){
			int r = (int)(Math.random()*n);
			result[i] = numbers[r];
			numbers[r] = numbers[n-1];
			n--;
		}
		for(int r:result){
			System.out.println(r);
		}
	}
}