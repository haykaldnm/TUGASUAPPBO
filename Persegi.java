class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    void printInfo() {
        System.out.println("Persegi");
        System.out.println("Sisi: " + getSisi());
        System.out.println("Luas: " + hitungLuas());
    }
}