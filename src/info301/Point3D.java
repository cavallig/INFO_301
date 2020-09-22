package info301;

public class Point3D extends Point2D {

    private int z ;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z ;
    }

    @Override
    public String toString() {
        //1- chaine retour
        String tostr = "" ;
        //2-
        tostr += super.toString() ;
        tostr += this.z ;

        //return "(" + this.getX() + "," + this.getY() + "," +  this.z + ")" ;
        return tostr ;

    }

    public static void main(){
        Point3D p3d = new Point3D(3,4,5) ;
        System.out.print(p3d);
    }
}
