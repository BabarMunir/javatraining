

public class AddtwoExamples {

	public static void addTwoNumbers() {
	int a = 10;
    int b = 20;
    
int result = a+b;
System.out.println(result);

}

	public static void addThreeNumbers() {
		int a = 10;
		int b = 15;
		int c = 20;
		int result = a+b+c;
		System.out.println(result);
	}

	public static void main(String[] args) {
	AddtwoExamples ae = new AddtwoExamples();
	ae.addTwoNumbers();
	ae.addThreeNumbers();
	}
}
