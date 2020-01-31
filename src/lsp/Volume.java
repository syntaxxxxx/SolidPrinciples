package lsp;

public class Volume {

    private int length, width, height;

    Volume(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getResult() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return "dari " + length + " * " + width + " * " + height;
    }
}
