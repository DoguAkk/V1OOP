package WerkboekOpdrachten.Opdracht_4_1;

public class Huisdier {
    private String naam;
    private String ras;
    private double gewicht;
    private Eigenaar baasje;

    public Huisdier(String nm, String r) {
        naam = nm;
        ras = r;
        gewicht = 0.0;
    }

    public void setBaasje(Eigenaar e) {
        baasje = e;
    }

    public Eigenaar getBaasje() {
        return baasje;
    }

    public String toString() {
        return naam + ", de " + ras + ", en weegt " + gewicht + "\n"
                + "En de eigenaar is: " + baasje;
    }

}
