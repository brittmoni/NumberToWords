public class NumberToWords {

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int num = number;

        while(number >= 0) {
            int lastDigit = num % 10;

            switch(lastDigit) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }

            num /= 10;

            if(num == 0) {
                break;
            }
        }
    }

    public static void reverse(int number) {

    }

    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }

        return -1;
    }
}
