/**
 * 
 */

/**
 * @author Akshit
 *
 */
public class Prime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int limit=100;
		
		System.out.println("Prime numbers between 1 and  " + limit);
		
		for (int i=1;i<100;i++)
	     {
			boolean isPrime=true;
			
			
			for(int b=2;b<i;b++)
			{
				if (i%b==0){
						isPrime=false;
						break;
				}
			}
			if (isPrime){
				System.out.print(i + " ");
			}
		}

	}

}
