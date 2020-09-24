package info301;

/**
 * _ ajoute la gestion des distances
 */
public class Point2D {
    private double x, y ;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {

        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * Calcul la distance au centre
     */
    public double distance(){
        return Math.sqrt(this.x*this.x+this.y*this.y) ;
    }

    /**
     *
     * @param pt
     * @return
     */
    public double distance(Point2D pt){
        double dx = this.x - pt.getX() ;
        double dy = this.y - pt.getY() ;

        return Math.sqrt(dx*dx+dy*dy) ;
    }

    /**
     * Affichage des coordonnées du point dans un repère cartésien
     * @return
     */
    public String toString(){
        return "(" + this.x + "," + this.y + ")" ;
    }

    static public void main(String args[]){
        Point2D p = new Point2D(40.0, 20.0) ;
        System.out.println(p.distance()) ;

    }

}
