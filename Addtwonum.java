public class Addtwonum{
	public static void main(String[] args){
	int result;
	result = Sum(5,10);
	System.out.println(result);
	}
	static int Sum(int a,int b){
		if (b > a){
			return b + Sum(a,b-1);
		}
		else{
			return 0;
		}
	}
}