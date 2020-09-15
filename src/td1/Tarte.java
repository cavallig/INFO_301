package td1;

/**
 * Exemple création d'une instance de Tarte
 *
 * Remplacer par des valeur numériques
 */
public class Tarte {

    static int nb_instance = 0 ;

    private String garniture ;
    private String patte ;

    /**
     *
     */
    public Tarte(String garniture, String patte) {
        this.garniture = garniture;
        this.patte = patte;

        //modification d'une variable statique
        Tarte.nb_instance++ ;
    }

    @Override
    public String toString() {
        String info_tarte = "Tarte{" +
                "garniture='" + garniture + '\'' +
                ", patte='" + patte + '\'' +
                '}';
        int nb  = Tarte.nb_instance ;
        return info_tarte + "\n" + "Nb tarte: " + nb ;
    }

    static public void main(String args[]){
        Tarte tarte_fraise = new Tarte("Fraises", "Feuilleté") ;
        System.out.println(tarte_fraise);
        Tarte tarte_abricot = new Tarte("Abricot", "Feuilleté") ;
        System.out.println(tarte_abricot);
    }
}
