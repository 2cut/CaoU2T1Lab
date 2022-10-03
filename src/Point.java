public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        x = this.x;
        y = this.y;
    }

    public Point(int x) {
        x = this.x;
        y = this.x;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        x = this.x;
    }
    public void setY(int y) {
        y = this.y;
    }

    public String coordinate() {
        return ("("+x+", "+y+")");
    }

    public int quadrant() {
        if (x>0 && y>0) {
        } else {

        }
    }

}
