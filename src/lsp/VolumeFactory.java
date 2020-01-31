package lsp;

public class VolumeFactory {
    public static Volume calculateVolume(int length, int width, int height) {
        return new Volume(length, width, height);
    }
}