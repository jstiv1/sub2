package upatras;

public class Final {
	public static void main(String[] args) {
        String sign = subtractIntegers(10, 5);
        System.out.println(sign);
    }
    
	
	// small change in the code. 
	
    public static String subtractIntegers(int a, int b) {
        int result = a - b;
        if (result >= 0) {
            return "POSITIVE";
        } else {
            return "NEGATIVE";
        }
    }
    
}
