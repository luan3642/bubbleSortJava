/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

/**
 *
 * @author luan Magalhães
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {5, 4, 2, 1, 8};

        int[] arrayOrdenado = bubbleSort(array);

        for (int j : arrayOrdenado) {
            System.out.println(j);
        }
    }

    private static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }

        return array;
    }

    private static int[] bubbleSortMelhorado(int[] array) {
        for (int i = 1; i <= array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] < array[j]) {
                    int aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                }
            }
        }

        return array;
    }

    private static int[] bubbleSortMelhoradoFazTroca(int[] array) {
        int n = 1;
        boolean deveFazerTroca = true;

        while (n <= array.length && deveFazerTroca) {
            deveFazerTroca = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    deveFazerTroca = true;
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
            n++;
        }

        return array;
    }

}
