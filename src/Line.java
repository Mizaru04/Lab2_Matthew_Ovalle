public class Line {
    private Point startPoint;
    private Point endPoint;
    private Point endPoint2;

    public Line(Point startPoint, Point endPoint){
        this.endPoint = new Point(getXCoordinate(),getYCoordinate());
    }

    public void setStartPoint(Point startPoint) {
    }
    public void setEndPoint(Point endPoint){
    }

    public Point getStartPoint() {
    }
    public Point getEndPoint() {
    }

    public double getLength(){
    }
}
