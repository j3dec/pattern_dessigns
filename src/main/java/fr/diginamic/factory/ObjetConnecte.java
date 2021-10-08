package fr.diginamic.factory;

public class ObjetConnecte {

    public ObjetConnecte(int limitVolt) {
        this.limitVolt = limitVolt;
    }

    public int getLimitVolt() {
        return limitVolt;
    }

    public void setLimitVolt(int limitVolt) {
        this.limitVolt = limitVolt;
    }

    private int limitVolt;

}
