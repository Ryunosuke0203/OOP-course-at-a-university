public class Draw06 {

    public static void main(String[] args) {
        Point p = new Point();
        p.move(100, 100);

        ColorPoint cp = new ColorPoint();
        cp.setColor(255, 0, 0);
        cp.move(200, 100);

        p = cp;
        p.move(300, 100);
   }
    
}


