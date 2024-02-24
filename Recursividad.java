public class Recursividad{

 	public static void main(String[] args) {
	
	int num = 4;
	int res = 0;

	System.out.println(res);

	}

	public static int division(int num){
	
		if(num<=1){
			return num;
		}else{


		int res = num/2;
		System.out.println(res);		
		return division(num);
		}
	}

}
