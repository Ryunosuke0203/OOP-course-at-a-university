public class Draw09 {

    public static void main(String[] args) {
        ColorPoint p = new Rectangle();
        p.setColor(255, 0, 0);
        p.x = 100;
        p.y = 100;
        p.draw();

        p = new Oval();
        p.setColor(0, 255, 0);
        p.x = 200;
        p.y = 100;
        p.draw();
    }
    
}
