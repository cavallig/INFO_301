package td2;

import info301.* ;

/**
 * Class definit
 *  centre Point2D
 *  rayon int (float ou double)
 *  _ ajouter la distance dans point > utiliser
 *
 */
public class Cercle {

        private Point2D centre ;
        private int rayon ;


    /**
     *
     * @param centre
     * @param rayon
     */
    public Cercle(Point2D centre, int rayon) {
            this.centre = centre;
            this.rayon = rayon;
    }

    public Point2D getCentre() {
        return centre;
    }

    public void setCentre(Point2D centre) {
        this.centre = centre;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                '}';
    }

    /**
     *
     * @param args
     */
    public static void main( String args[]){
        Point2D p = new Point2D(250.0, 250.0) ;
        Cercle c = new Cercle(p, 200) ;
        System.out.print(c) ;
    }

}
