class Jubah {
    private int Kekuatan;
    private int Kesehatan;

    public Jubah(String name, int Kekuatan, int Kesehatan) {
        this.Kekuatan = Kekuatan;
        this.Kesehatan = Kesehatan;
    }

    public int getAddKesehatan() {
        return this.Kekuatan * 10 + this.Kesehatan;
    }
}