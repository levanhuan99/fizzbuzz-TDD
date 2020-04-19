public class FizzBuzz {
    public static String numberTranslate(int number) {
        if (number < 10 && number > 0) {                //chia 2 truong hop bé hơn 10 và lơn hon 10;

            if (number % 3 == 0) {
                return "Fizz "+ readNumberLessThan10(number);
            }
            if (number % 5 == 0) {
                return "Buzz "+ readNumberLessThan10(number);
            }
            else return "null";
        } else if (number > 9 && number < 100) {                        //trường hợp 2
            if (number % 3 == 0 && number % 5 == 0) {

                return "FizzBuzz and " + readNumberGreaterThan9(number);
            }
            if (number % 3 == 0) {

                return "Fizz and " +readNumberGreaterThan9(number);
            }
            if (number % 5 == 0) {
                int b = number % 10;
                int a = (number - b) / 10;

                String c = readNumberLessThan10(a);
                String d = readNumberLessThan10(b);
                return "Buzz and " + readNumberGreaterThan9(number);
            }
            else return null;

        }
        else return "out of 0-100";

    }
    private static String readNumberGreaterThan9(int number){
        int b = number % 10;
        int a = (number - b) / 10;

        String c = readNumberLessThan10(a);
        String d = readNumberLessThan10(b);

        return c+d;

    }

    private  static  String readNumberLessThan10(int number){
        String nameOfNumber="";
        switch (number){
            case 0:
                nameOfNumber="khong ";
                break;
            case 1:
                nameOfNumber="mot ";
                break;
            case 2:
                nameOfNumber="hai ";
                break;
            case 3:
                nameOfNumber="ba ";
                break;
            case 4:
                nameOfNumber="bon ";
                break;
            case 5:
                nameOfNumber="nam ";
                break;
            case 6:
                nameOfNumber="sau ";
                break;

            case 7:
                nameOfNumber="bay ";
                break;
            case 8:
                nameOfNumber="tam ";
                break;
            case 9:
                nameOfNumber="chin ";
                break;

        }
        return nameOfNumber;

    }

}
