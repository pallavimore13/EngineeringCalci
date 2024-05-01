
import java.util.Scanner;

 class calci {
    public static double Add(double num1, double num2) {
        return num1 + num2;
    }

    public static double Sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double Mul(double num1, double num2) {
        return num1 * num2;
    }

    public static double Div(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return -1;
        }
    }

    public static double modulo(double num1, double num2) {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            return -1;
        }
    }

    public static double squareroot(double num1) {
        if (num1 >= 0) {
            return Math.sqrt(num1);
        } else {
            return -1;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter the first number:");
            double num1 = scan.nextDouble();

            System.out.println("Enter the operation (+, -, *, /, %, s):");
            char operation = scan.next().charAt(0);

            double result = 0;

            switch (operation) {
                case '+':
                    System.out.println("Enter the second number:");
                    double num2Add = scan.nextDouble();
                    result = Add(num1, num2Add);
                    break;

                case '-':
                    System.out.println("Enter the second number:");
                    double num2Subtract = scan.nextDouble();
                    result = Sub(num1, num2Subtract);
                    break;

                case '*':
                    System.out.println("Enter the second number:");
                    double num2Multiply = scan.nextDouble();
                    result = Mul(num1, num2Multiply);
                    break;

                case '/':
                    System.out.println("Enter the second number:");
                    double num2Divide = scan.nextDouble();
                    result = Div(num1, num2Divide);
                    break;

                case '%':
                    System.out.println("Enter the second number:");
                    double num2Modulo = scan.nextDouble();
                    result = modulo(num1, num2Modulo);
                    break;

                case 's':
                    result = squareroot(num1);
                    break;

                default:
                    System.out.println("Invalid Operation");
                    break;
            }
            System.out.println("Result: " + result);
            System.out.println("Do you want to continue (Y/N)");
            choice = scan.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        scan.close();
    }
}

		  
		  
