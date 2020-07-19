public class NumberToWords {

    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }

        int num = reverse(number);

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
         if((getDigitCount(number)) - (getDigitCount(num)) != 0) {
             for (int j = 0; j < (getDigitCount(number) - getDigitCount(num)); j++) {
                 System.out.println("Zero");
             }
         }

    }

    public static int reverse(int number) {
        int reverseNum = 0;
        int lastDigit = 0;
        int zeroToAdd = (getDigitCount(number)) - (getDigitCount(reverseNum));

        do {
            lastDigit = number % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            number /= 10;

        }
        while(number != 0);

        return reverseNum;


    }

    public static int getDigitCount(int number) {
        int count = 0;
        int num = 0;

        if(number < 0) {
            return -1;
        }

        if(number == 0) {
            count = 1;
            return count;
        }

        while(number != 0) {
            number /= 10;
            count++;
        }
        return count;


    }
}

