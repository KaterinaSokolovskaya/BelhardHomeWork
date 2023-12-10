package by.belhard.sokolovskaya;

public class IntArray {

    private int[] array;

    public IntArray(){
        array = new int[10];
    }

    public IntArray(int[] array){
        this.array = array;
    }

    public IntArray(int numberOfElements){
        array = new int[numberOfElements];
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void sort(boolean isAscendingOrder){
        if (isAscendingOrder){
            for (int i = array.length - 1; i >= 0; i--){
                int iMax = i;
                for (int j = i; j >= 0; j--){
                    if (array[j] > array[iMax]){
                        iMax = j;
                    }
                }
                if (iMax != i){
                    int temp = array[iMax];
                    array[iMax] = array[i];
                    array[i] = temp;
                }
            }
        } else {
            for (int i = array.length - 1; i >= 0; i--){
                int iMin = i;
                for (int j = i; j >= 0; j--){
                    if (array[j] < array[iMin]){
                        iMin = j;
                    }
                }
                if (iMin != i){
                    int temp = array[iMin];
                    array[iMin] = array[i];
                    array[i] = temp;
                }
            }
        }

    }
}
