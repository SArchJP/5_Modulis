package com.company;

public class Engine {
    private static final int KC = 50;
    private static final int DJ = 40;
    private static final int PA = 60;
    private static final int EH = 35;
    private static final int FG = 30;

    public Engine() {
    }

    public String result(int savings, int support) {
        int savingsTotal = savings + (support * 3);
        if (savingsTotal >= 60)
            return "Dainius nusipirks bilietą P arba A sektoriuje, bilietas kainuos 60 eurų";
        if (savingsTotal >= 50)
            return "Dainius nusipirks bilietą K arba C sektoriuje, bilietas kainuos 50 eurų";
        if (savingsTotal >= 40)
            return "Dainius nusipirks bilietą D arba J sektoriuje, bilietas kainuos 40 eurų";
        if (savingsTotal >= 35)
            return "Dainius nusipirks bilietą E arba H sektoriuje, bilietas kainuos 35 eurų";
        if (savingsTotal >= 30)
            return "Dainius nusipirks bilietą F arba G sektoriuje, bilietas kainuos 30 eurų";

        return "Dainius nusipirkti bilietą NEGALĖS";
    }

    @Override
    public String toString() {
        return "PA sektoriaus kaina " + PA
                + "eur, KC sektoriaus kaina " + KC
                + "eur, DJ sektoriaus kaina " + DJ
                + "eur, EH sektoriaus kaina " + EH
                + "eur, FG setoriaus kaina " + FG;
    }
}
