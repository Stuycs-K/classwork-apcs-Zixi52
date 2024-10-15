public class Demo{

  /*
  Write this method third. Test it then move on
  to the others.
  */
  public static double distance(Point a, Point b){
    return Math.sqrt((a.getX() - b.getX())*(a.getX() - b.getX()) + (a.getY() - b.getY())*(a.getY() - b.getY()));
  }

  public static void main(String[]args){
    Point p1 = new Point(1,1);
    Point p2 = new Point(-1,-1);
    Point p3 = new Point(3,4);
    System.out.println( p3);
    System.out.println( distance(p1,p2));
    System.out.println( Point.distance(p1,p2));
    System.out.println( p1.distanceTo(p2));
    // equilateral triangle
    Point t1 = new Point(0,0);
    Point t2 = new Point(1,0);
    Point t3 = new Point(0.5, Math.sqrt(3) / 2.0);
    System.out.println("" + t1 + t2 + t3);
    System.out.println(t1.distanceTo(t2));
    System.out.println(t2.distanceTo(t3));
    System.out.println(t1.distanceTo(t3));
  }
}
