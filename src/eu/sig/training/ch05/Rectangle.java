package eu.sig.training.ch05;

/**
 * Created by apazdzioch on 22.11.16.
 */
class Rectangle {
    private int x, y, w, h;

    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public int getX() {
        return x;
    }

    public Rectangle setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Rectangle setY(int y) {
        this.y = y;
        return this;
    }

    public int getW() {
        return w;
    }

    public Rectangle setW(int w) {
        this.w = w;
        return this;
    }

    public int getH() {
        return h;
    }

    public Rectangle setH(int h) {
        this.h = h;
        return this;
    }
}
