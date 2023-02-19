public class Main {

    public static void main(String[] args) {
        System.out.println("Массив в Обратном Порядке ");
        massiv();
    }

    public static void massiv() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
    }

}