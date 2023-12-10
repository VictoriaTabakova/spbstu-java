public class Main {
  public static void main(String[] args) {
    //Сложение строк
    String firstString = "Hello,";
    String secondString = "world";

    System.out.println(firstString + " " + secondString);

    //Сравнение строк
    System.out.println(secondString.equals(secondString));

    //Сравненте строк без учета регистра
    System.out.println(secondString.equalsIgnoreCase(secondString));

    //Применение типа данных к строке
    System.out.println(String.valueOf(false));
     System.out.println(String.valueOf(0.123F));
        System.out.println(String.valueOf(false));

        //перевод строки в число
        System.out.println(Integer.parseInt("1"));//1
        System.out.println(Double.parseDouble("0.1D"));//0.1

        //Разбиение строки на массивы
        String[] lettersArray = "H; E; L; L; O; ".split("; ");
        for (String letter : lettersArray) {
            System.out.println(letter);
           
        }

        //Поиск позиции в строке
        System.out.println("Hello".indexOf('A'));

        //Изменение регистра
        System.out.println("Hello".toLowerCase());
        System.out.println("Hello".toUpperCase());
        
        StringBuilder alphabet = new StringBuilder("Hello");

        //Приведение элемента StringBuilder к String
        String alphabetString = alphabet.toString();

        //Добавление элемента в конец
        System.out.println(alphabet.append(","));

        //Добавление элемента по индексу
        System.out.println(alphabet.insert(2, "A"));

        //Удаление элемента строки по индексу
        System.out.println(alphabet.deleteCharAt(1));

        //Удаление части строки с одной позиции до другой
        System.out.println(alphabet.delete(0, 1));

        //Разворот строки
        System.out.println(alphabet.reverse());

        //Обрезка строки
        //с начала до опреленного символа
        System.out.println(alphabet.substring(1));
        //с одного идекса до другого
        System.out.println(alphabet.substring(2, 4));
    }
  }