public class Main {
   public static void main(String[] args) {
    Student Mary = new Student("Mary", "Broun", 21, 4.8);
    Student Mark  = new Student("Mark", "Vince", 20, 4.5);

    Wrapper MaryWrapper = new Wrapper(Mary);
    Wrapper MarkWrapper = new Wrapper(Mark);

    System.out.println("Before:");
    System.out.println("Mary: " + MaryWrapper.getobj());
    System.out.println("Mark: " + MarkWrapper.getobj());

    MaryWrapper.swap(MarkWrapper);

    System.out.println("After:");
    System.out.println("Mary: " + MaryWrapper.getobj());
    System.out.println("Mark: " + MarkWrapper.getobj());
  };
};
