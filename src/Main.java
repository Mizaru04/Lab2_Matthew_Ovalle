public class Main {
    public static void main(String[] args) {
        Point startPoint = new Point(0, 0);
        Point endPoint = new Point(3, 4);
        Line line = new Line(startPoint, endPoint);

        endPoint.setXCoordinate(10);

        System.out.println("The length of the line is " + line.getLength());

        Point endPoint2 = line.getEndPoint();
        endPoint2.setXCoordinate(10);

        System.out.println("The length of the line is " + line.getLength());
    }
}