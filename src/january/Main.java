package january;

public class Main {

    public static void main(String[] args) {
        int num = 3; // entered by user
        int multiplyingByThree = adding(num);
        System.out.println("Value entered multiplied by 3: " + multiplyingByThree + ".");
    }
    public static int adding (int number) {
        return number*3;
    }
}
