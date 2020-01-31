package lsp;

import static lsp.Print.printResult;

public class Main {
    public static void main(String[] args) {
        Volume volume = VolumeFactory.calculateVolume(10, 10, 5);
        showResultCalculate(volume);
    }

    private static void showResultCalculate(Volume Volume) {
        printResult(Volume.getResult() + " Adalah hasil perkalian " + Volume.toString());
    }
}