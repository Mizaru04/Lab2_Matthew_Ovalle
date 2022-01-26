public class Point {
    private double xCoordinate = 0.0;
    private double yCoordinate = 0.0;

    public Point(double xCoordinate, double yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public void setXCoordinate(double xCoordinate){
        this.xCoordinate = xCoordinate;
    }
    public void setYCoordinate(double yCoordinate) {
    }

    public double getXCoordinate(){
        return this.xCoordinate;
    }
    public double getYCoordinate() {
        return this.yCoordinate;
    }
}
