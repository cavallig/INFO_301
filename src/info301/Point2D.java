package info301;

public class Point2D {
    private int x, y ;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {

        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Affichage des coordonnées du point dans un repère cartésien
     * @return
     */
    public String toString(){
        return "(" + this.x + "," + this.y + ")" ;
    }
}
