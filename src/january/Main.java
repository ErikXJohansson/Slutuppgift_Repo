package january;

public class Main {

    public static void main(String[] args) {
        int num = 3; // entered by user through scanner
        int multiplyingByThree = adding(num);
        System.out.println("Value entered multiplied by 3: " + multiplyingByThree + ".");
        int multiplyingByThreeTimesThree = calculation(num);
        System.out.println("Value entered multiplied by 3 times 3: " + multiplyingByThreeTimesThree + ".");

    }

    public static int adding(int number) {
        return number * 3;
    }

    public static int calculation(int number) {
        return number * 3 * 3 * 3;
    }
}
