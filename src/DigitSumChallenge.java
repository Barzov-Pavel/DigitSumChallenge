public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number 9 is " + sumDigits(9));
        System.out.println("The sum of the digits in number -1 is " + sumDigits(-1));
        System.out.println("The sum of the digits in number 10 is " + sumDigits(10));
        System.out.println("The sum of the digits in number 12345 is " + sumDigits(12345));
    }

    private static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        } else {
            int sumDigits = 0;
            while (number != 0) {
                sumDigits += number % 10;
                number /= 10;
            }

            return sumDigits;
        }
    }
}
