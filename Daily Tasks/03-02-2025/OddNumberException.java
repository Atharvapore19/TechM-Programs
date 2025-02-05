package sample;

public class OddNumberException {
    public static void checkEven(int num) throws Exception {
        if (num % 2 != 0) {
            throw new Exception("Odd number detected");
        }
    }

    public static void main(String[] args) {
        try {
            checkEven(7);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
