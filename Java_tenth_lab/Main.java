public class Main {
  public static void main(String[] args) {
    try {
      Triple<Integer> triple = new Triple<Integer>(1, 2, 3);

      System.out.println(triple);

      System.out.println("Min: " + triple.min());
      System.out.println("Max: " + triple.max());
      System.out.println("Mean: " + triple.mean());
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }

    System.out.println("\n");

    try {
      Triple<String> triple = new Triple<String>("Maria", "Kate", "Vika");

      System.out.println(triple);

      System.out.println("Min: " + triple.min());
      System.out.println("Max: " + triple.max());
      System.out.println("Mean: " + triple.mean());
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
  };
};