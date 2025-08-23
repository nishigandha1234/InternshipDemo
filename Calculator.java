public class Calculator {
    public static void main(String[] args) {
        System.out.println("Result from addition method: " + addition(12, 4));
        System.out.println("Result from division method: " + division(12, 4));
    }

    public static int addition(int a, int b) {
        int ans = a + b;
        return ans;  // new code    
    }

    public static int division(int a, int b) {
        int div = a / b;
        return div;  
    }
}
