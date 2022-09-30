public class Recursion{
	public static void main(String[] args){
		int k=10;
		System.out.println(Sum(k));
	}
	static int Sum(int a){
		if(a>0){
			return a + Sum(a-1);
		}
		else{
			return 0;
		}
	}
} 
