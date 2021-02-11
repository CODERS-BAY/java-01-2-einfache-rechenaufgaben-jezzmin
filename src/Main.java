public class Main {

    public static void main(String[] args) {

        int number1 = 250;
        int number2 = 135;

        int resultPlus0 = number1 + number2;
        int resultDeficit0 = number1 - number2;
        int resultDecided0 = number1 / number2;
        int resultMultiplied0 = number1 * number2;

        System.out.printf("%d + %d = %d \n",number1,number2,resultPlus0);
        System.out.printf("%d - %d = %d \n",number1,number2,resultDeficit0);
        System.out.printf("%d : %d = %d \n",number1,number2,resultDecided0);
        System.out.printf("%d * %d = %d \n",number1,number2,resultMultiplied0);

        double number3 = 10.6;
        double number4 = 4.76;

        double resultPlus = number3 + number4;
        double resultDeficit = number3 - number4;
        double resultDecided = number3 / number4;
        double resultMultiplied = number3 * number4;

        System.out.printf("%.2f + %.2f = %.2f \n",number3,number4,resultPlus);
        System.out.printf("%.2f - %.2f = %.2f \n",number3, number4,resultDeficit);
        System.out.printf("%.2f : %.2f = %.2f \n",number3,number4,resultDecided);
        System.out.printf("%.2f x %.2f = %.2f \n",number3,number4,resultMultiplied);
    }
}