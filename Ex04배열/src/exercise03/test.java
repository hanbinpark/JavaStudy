package exercise03;
class Static{
	 
    public int a = 20;
    static int b = 0;
    
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[8];
		int i=0;
		int n=10;
		while(n>0) {
			a[i++] = n%2;
			n/=2;
			
		}
		for(i=7;i>=0;i--) {
			System.out.print(a[i]);
		}
	}

}
