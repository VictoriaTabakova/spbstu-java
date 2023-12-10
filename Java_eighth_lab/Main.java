import java.lang.reflect.*;
import java.util.Scanner;

public class Main {
  public static void printInfo(Class<?> cls) {
    System.out.println("Class name: " + cls.getName());

    System.out.println("Package name: " + cls.getPackage().getName());

    Field[] fields = cls.getDeclaredFields();

    System.out.println("Declared fields:");

    for (Field field : fields) {
      System.out.println("  " + field.getType().getName() + " " + field.getName());
    }

    Constructor<?>[] constructors = cls.getDeclaredConstructors();

    System.out.println("Declared constructors:");

    for (Constructor<?> constructor : constructors) {
      System.out.print("  " + constructor.getName() + "(");

      Parameter[] parameters = constructor.getParameters();

      for (int index = 0; index < parameters.length; index += 1) {
        System.out.print(parameters[index].getType().getName() + " " + parameters[index].getName());

        if (index < parameters.length - 1) {
          System.out.print(", ");
        }
      }

      System.out.println(")");
    }

    Method[] methods = cls.getDeclaredMethods();

    System.out.println("Declared methods:");

    for (Method method : methods) {
      System.out.print("  " + method.getReturnType().getName() + " " + method.getName() + "(");

      Parameter[] parameters = method.getParameters();

      for (int index = 0; index < parameters.length; index += 1) {
        System.out.print(parameters[index].getType().getName() + " " + parameters[index].getName());

        if (index < parameters.length - 1) {
          System.out.print(", ");
        }
      }

      System.out.println(")");
    }
  };

  public static void main(String[] args) {
    printInfo(Student.class);

    System.out.print("\n");
    printInfo(Scanner.class);

    System.out.print("\n");
    printInfo(Math.class);
  };
};