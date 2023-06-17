class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    @Override
    void printInfo() {
        System.out.println("Lingkaran");
        System.out.println("Jari-jari: " + getJariJari());
        System.out.println("Luas: " + hitungLuas());
    }
}
