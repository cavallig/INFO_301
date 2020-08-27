package gui;
import info301.Point2D;

import javax.swing.JFrame ;
import java.awt.*;

/**
 * Fenêtre d'affichage des objets grphiques
 */
public class Gui extends JFrame {


    public static void main(String args[]){
        Gui geom = new Gui() ;
        geom.setSize(new Dimension(800,600));
        geom.setTitle("GEOM");

        GeomCanvas geomcan = new GeomCanvas() ;
        geomcan.addPoint(new Point2D(100,100));

        geom.add(geomcan) ;
        geom.setVisible(true);

    }
}