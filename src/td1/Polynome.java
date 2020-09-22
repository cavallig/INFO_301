package td1;

import java.util.ArrayList;

public class Polynome {
    private ArrayList<Monome> poly;

    public Polynome() {
        this.poly = new ArrayList<Monome>();
    }

    public void ajouterMonome(Monome m) {
        this.poly.add(m);
    }

    /**
     * redéfintion
     *
     * @return
     */
    @Override
    public String toString() {
        String str = "";
        int nb_monome = this.poly.size();
        Monome m;

        for (int i = 0; i < nb_monome; i++) {
            m = (Monome) this.poly.get(i);
            str += m;
            if( i < (nb_monome-1))
                str += "+" ;
        }

        return str;
    }

    public static void main(String args[]){
        Polynome p = new Polynome() ;
        p.ajouterMonome(new Monome(0,3));
        p.ajouterMonome(new Monome(1,7));
        p.ajouterMonome(new Monome(3,9));

        System.out.print( p );
    }
}
