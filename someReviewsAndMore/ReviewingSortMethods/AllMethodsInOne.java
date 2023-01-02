package ReviewingSortMethods;

/**
 *
 * @author MrDoisaac
 */
public class AllMethodsInOne {

    public static void main(String[] args) {

        int[] numbers = {100, 3, 0, 2, 3, 6, 2};
        bubbleMethod(numbers);
        insertionSort(numbers);
        selectionSort(numbers);
    }

    public static void bubbleMethod(int[] inputA) {
        for (int i = 0; i < (inputA.length - 1); i++) {

            for (int j = 0; j < (inputA.length - 1); j++) {
                if (inputA[j] > inputA[j + 1]) {
                    int aux = inputA[j];
                    inputA[j] = inputA[j + 1];
                    inputA[j + 1] = aux;
                }
            }

        }

        System.out.println("\nBubble Method");
        for (int e : inputA) {
            System.out.print(e + " ");
        }
    }

    public static void insertionSort(int[] inputA) {
        for (int i = 1; i < inputA.length; i++) {
            int aux = inputA[i];
            int j = i - 1;

            while (j >= 0 && inputA[j] > aux) {
                inputA[j + 1] = inputA[j];
                j--;
            }
            inputA[j + 1] = aux;

        }

        System.out.println("\nInsertion Sort");
        for (int e : inputA) {
            System.out.print(e + " ");
        }

    }

    public static void selectionSort(int[] inputA) {

        for (int i = 0; i < inputA.length; i++) {
            int aux = inputA[i];
            int min = i;

            for (int j = i + 1; j < inputA.length; j++) {
                if (inputA[j] < inputA[min]) {
                    min = j;
                }
            }

            inputA[i] = inputA[min];
            inputA[min] = aux;
        }

        System.out.println("\nSelection Sort");
        for (int e : inputA) {
            System.out.print(e + " ");
        }

    }
}


