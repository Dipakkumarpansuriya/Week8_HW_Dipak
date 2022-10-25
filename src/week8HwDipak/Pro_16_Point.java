package week8HwDipak;
//16. Point

public class Pro_16_Point {
    private int x;
    private int y;

    public Pro_16_Point() {
    }
    public Pro_16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distance() {
        return distance(0, 0);
    }
    public double distance(int x, int y) {

        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Pro_16_Point secondPoint) {

        return distance(secondPoint.x, secondPoint.y);
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public static void main(String[] args) {

        Pro_16_Point first = new Pro_16_Point(6, 5);

        Pro_16_Point second = new Pro_16_Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Pro_16_Point point = new Pro_16_Point();

        System.out.println("distance()= " + point.distance());

    }
}
