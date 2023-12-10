public class Main {
    public enum Enum {
        ONE, TWO
    };

    public static void main(String[] args) {
        //типы данных, которые можно использовать в конструкции switch:
        int integerVariable = 8;
        char charVariable = 'A';
        Enum enumValue = Enum.TWO;
        byte byteVariable = 10;
        short shortVariable = 20;
        String day = "Monday";

        //примеры
        System.out.print("int = "+integerVariable+"\nswitch result: ");
        switch (integerVariable) {
            case 1:
                System.out.println("int is 1");
                break;
            case 2:
                System.out.println("int is 2");
                break;
            default:
                System.out.println("int is not 1 or 2");
                break;
        }
        System.out.print("\nchar = "+ charVariable +"\nswitch result: ");
        switch (charVariable) {
            case 'A':
                System.out.println("char is A");
                break;
            case 'B':
                System.out.println("char is B");
                break;
            default:
                System.out.println("char is not A or B");
                break;
        }

        System.out.print("\nshort = " + shortVariable + "\nswitch result: ");
        switch (shortVariable) {
            case 0:
                System.out.println("Variable is empty");
                break;
            case 20:
                System.out.println("Variable is 20");
                break;
            default: 
                System.out.println("Default case");
                break;
        }

        System.out.print("\nenum element = "+enumValue+"\nswitch result: ");
        switch (enumValue) {
            case ONE:
                System.out.println("ONE");
                break;
            case TWO:
                System.out.println("TWO");
                break;
            default:
                System.out.println("Check the data");
                break;
        }
        System.out.print("\nbyte = "+byteVariable+"\nswitch result: ");
        switch (byteVariable) {
            case 1:
                System.out.println("byte is 1");
                break;
            case 2:
                System.out.println("byte is 2");
                break;
            default:
                System.out.println("Check the data");
                break;
        }

        System.out.print("\nString = "+day+"\nswitch result: ");
        switch (day) {
            case "Monday":
                System.out.println("Today is rainy");
                break;
            case "Thursday":
                System.out.println("Today is sunny");
                break;
            default:
                System.out.println("Check the data");
        }

    }
}


