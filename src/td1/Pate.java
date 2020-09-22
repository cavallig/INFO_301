package td1;

/**
 *
 */
public class Pate {
    //Type de pate
    public static int FEUILLETE = 1 ;
    public static int BRISEE = 2 ;
    public static int SABLEE = 3 ;

    private int type;

    Pate(int type){
      this.type = type ;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String str = "" ;

        /**
        switch (this.type){
            case: Pate.FEUILLETE
                    str = "Feuilletée" ;
                    break;
            case: Pate.BRISEE
                    str = "Brisée" ;
                    break;
            case: Pate.FEUILLETE
                    str = "Sablee" ;
                    break;
        }
         **/

        return str ;
    }
}

