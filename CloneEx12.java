class Point2 implements Cloneable{
    int x, y;

    Point2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "x=" + x + ", y=" + y;
    }

    public Point2 clone(){
        Object obj = null;
        try{
            obj = super.clone();
        } catch (CloneNotSupportedException e){}
        return (Point2) obj;
    }
}

class CloneEx1_2 {
    public static void main(String[] args) {
        Point2 original = new Point2(3, 5);
        Point2 copy = (Point2) original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}
