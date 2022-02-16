package ejercicio3;

/**
 * @author Jose Daniel Maza
 *
 * @version 1.0
 *
 * Clase que genera un array de enteros aleatorios
 */
public class RandomArray {
    int List[] = new  int[5];
    public void generateRandomArray(){
        for(int i = 0; i < List.length; i++){
            List[i] = (int)(Math.random()*6);
            System.out.println(List[i] + " ");
        }
    }

    /**
     *
     */
    public void bubbleSort(){
        for(int i = 0; i < List.length; i++){
            for(int j = 0; j < List.length-1; j++){
                if(List[j] > List[j+1]){
                    int temp = List[j];
                    List[j] = List[j+1];
                    List[j+1] = temp;
                }
            }
        }for (int i = 0; i < List.length; i++) {
            System.out.println(List[i] + " ");
        }

    }

    public void Quicksort(int numeros[], int left, int right) {
        System.out.println("QuickSort: ");

        int pivote = numeros[left];
        int i = left;
        int j = right;
        int aux;

        while (i < j) {
            while (numeros[i] <= pivote && i < j)
                i++;

            while (numeros[j] > pivote)
                j--;

            if (i < j) {
                aux = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = aux;
            }
        }

        numeros[left] = numeros[j];
        numeros[j] = pivote;

        if (left < j - 1)
            Quicksort(numeros, left, j - 1);

        if (j + 1 < right)
            Quicksort(numeros, j + 1, right);

        for (int k = 0; k < List.length; k++) {
            System.out.println(List[k] + " ");
        }
    }
}
