package recursion;

public class Recursive_power {

	public boolean isOdd(int n){
		return !isEven(n);
	}
	public boolean isEven(int n){
		return n%2 == 0;
	}
	public float power(int x,int n){
		if(n==0)
			return 1;
		else if(n<0){
			return 1/power(x,Math.abs(n));
		}
		else if(isOdd(n))
			return power(x,n-1)*x;
		else{
			float y = power(x, n/2);
			return y*y;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Recursive_power rp = new Recursive_power();
		System.out.println("4 power of base 3 = "+rp.power(3, -6));
		System.out.println("4 power of base 3 = "+rp.power(3, 6));
	}

}
