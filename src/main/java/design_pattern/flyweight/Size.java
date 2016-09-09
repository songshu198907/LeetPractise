package design_pattern.flyweight;

/**
 * Created by songheng on 9/9/16.
 */
public class Size {
    private int length;
    private int width;

    public Size(int length, int heigth) {
        this.length = length;
        this.width = heigth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
