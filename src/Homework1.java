public class Homework1 {
    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

    // Получим NumberFormatException, если в метод передадим строку, содержащую недопустимые символы
    public static int[] stringToIntArray(String str) {
        String[] strArray = str.split(" ");
        int[] array = new int[strArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        return array;
    }

    // При делении на 0 получим ArithmeticException
    public static int divide(int a, int b) {
        return a / b;
    }

    // Выход за пределы массива ArrayIndexOutOfBoundsException
    public static void printArray(int[] array) {
        for (int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /* Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя. */


}
