
public class AdditionExample {

	public static void main(String[] args) {
		
		AdditionExample ae = new AdditionExample();
		int result1 = ae.addTwoNumbers();
		int result2 = ae.addThreeNumbers();
	    ae.addResults(result1, result2);
	    ae.addDecimals();
	}
	public static int addTwoNumbers()
    {
    	int a =10;  
   		int b =20;
		int result = a+b;
		System.out.println("sum of 2 numbers  " + result);
		return result;
	}
    public static int addThreeNumbers() {
    
    int a = 15;
    int b = 25;
    int c = 10;
    int result = a+b+c;
   	System.out.println("sum of 3 numbers   " + result);
    return result;
    } 
    
    public static int addResults(int result1, int result2) {
    int result = result1 + result2;
    System.out.println("sum of two results  " + result);
    return result;
}

  public static double addDecimals() {
    	
    	double a = 13.555;
    	double b = 11.655;
    	double result = a+b;
    	System.out.println("sum of two decimals numbers  " + result);
    	return result;
    			
    }
    
}
    