package lt.vtvpmc;

public class Engine {
    private static final int MAZYLIS = 1;
    private static final int KARLSONAS = 2;
    private static final int FREKENBOK = 3;

    private static final int MAZYLIS_SUVALGO = 2;
    private static final int KARLSONAS_SUVALGO = 5;
    private static final int FREKENBOK_SUVALGO = 3;

    private int uogienesViso;

    private int vizituSkaicius;


    public Engine() {
    }

    public static int getMAZYLIS() {
        return MAZYLIS;
    }

    public static int getKARLSONAS() {
        return KARLSONAS;
    }

    public static int getFREKENBOK() {
        return FREKENBOK;
    }

    public static int getMazylisSuvalgo() {
        return MAZYLIS_SUVALGO;
    }

    public static int getKarlsonasSuvalgo() {
        return KARLSONAS_SUVALGO;
    }

    public static int getFrekenbokSuvalgo() {
        return FREKENBOK_SUVALGO;
    }

    public int getUogienesViso() {
        return uogienesViso;
    }

    public void setUogienesViso(int uogienesViso) {
        this.uogienesViso = uogienesViso;
    }

    public int getVizituSkaicius() {
        return vizituSkaicius;
    }

    public void setVizituSkaicius(int vizituSkaicius) {
        this.vizituSkaicius = vizituSkaicius;
    }
}
