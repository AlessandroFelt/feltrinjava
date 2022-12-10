package verifica;

public class AbbonamentoMensile {

    private String meseCorr;

    public AbbonamentoMensile(String meseCorr) {
        this.meseCorr = meseCorr;
    }

    public String getMeseCorr() {
        return meseCorr;
    }

    public void setMeseCorr(String m) {
        meseCorr = m;
    }

    public String stampa() {
        String s;
        s = meseCorr;
        return s;
    }

    public String calcolaCosto(String nome, int eta, boolean gen) {
        double costo = 0;
        String s = "";
        if (gen == true && eta > 10 && eta < 75 || gen == false && eta
                > 14 && eta < 70) {
            if (gen == true && eta > 10 && eta < 30 || gen == false && eta
                    > 14 && eta < 30) {
                costo = 10;
            } else if (gen == true && eta < 75 || gen == false && eta < 70) {
                costo = 18.5;
            }
        }
        s = "Nominativo: " + nome + "\n" + "Età: " + eta + "\n" + "Sesso: "
                + gen + "\n" + "A " + meseCorr
                + " il costo dell'abbonamento di " + nome + " sarà di "
                + costo + " euro" + "\n";
        return s;
    }
}
