package gui;
import info301.Point2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Fenêtre d'affichage des objets grphiques
 * _ ajouter des btn
 * _ calcul du centre
 * _ Creation d'une figure
 * _ Ajout de la figure au centre
 * _ ajout de la calss cercle
 */
public class Gui extends JFrame {


    public static void main(String args[]){
        Gui geom = new Gui() ;
        geom.setSize(new Dimension(800,600));
        geom.setTitle("GEOM");

        GeomCanvas geomcan = new GeomCanvas() ;
        geomcan.setC(Color.pink) ;
        geomcan.addPoint(new Point2D(100,100));
        geomcan.addPoint(new Point2D(200,200));

        //test ajout de polygones
        ArrayList<Point2D> pt_carre = new ArrayList<Point2D>() ;
        pt_carre.add(new Point2D(100,100)) ;
        pt_carre.add(new Point2D(200,100)) ;
        pt_carre.add(new Point2D(200,200)) ;
        pt_carre.add(new Point2D(100,200)) ;
        Polygone carre = new Polygone(pt_carre) ;
        geomcan.addPolygone(carre) ;

        //ajout d'un actionListener
        MouseAdapter addFigureAL = new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.out.println("[" + e.getX() + ", " + e.getY() + "]") ;
            }
        } ;

        geom.setTitle("GEOM");
        geom.setLayout(new BorderLayout());
        geom.add(geomcan, BorderLayout.CENTER) ;
        JButton btn = new JButton("Carre") ;
        btn.addMouseListener(addFigureAL);
        geom.add(btn, BorderLayout.SOUTH) ;
        geom.setVisible(true);

    }
}