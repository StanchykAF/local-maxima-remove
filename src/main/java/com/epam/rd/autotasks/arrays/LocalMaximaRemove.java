package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){
        //put your code here
        //throw new UnsupportedOperationException(); //заглушка
        int[] copyArray = new int[array.length];
        int[] myArray;
        int flag = 0;
        if (array[0] <= array[1]){
            System.arraycopy(array, 0, copyArray, flag, 1);
            flag++;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if ((array[i] <= array[i - 1]) || (array[i] <= array[i + 1])) {
                System.arraycopy(array, i, copyArray, flag, 1);
                flag++;
            }
        }
        if (array[array.length - 1] <= array[array.length - 2]) {
            System.arraycopy(array, array.length - 1, copyArray, flag, 1);
            flag++;
        }
        myArray = Arrays.copyOf(copyArray, flag);
        return myArray;
    }
}
