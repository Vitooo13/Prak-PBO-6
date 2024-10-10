class Jagoan {
    private String nama;
    private int Darah;
    private int Serangan;
    private Jubah jubah;
    private Senjata senjata;
    private int level;
    private int KenaikanKesehatan;
    private int KenaikanMenyerang;

    public Jagoan(String nama) {
        this.nama = nama;
        this.Darah = 100;
        this.Serangan = 100;
        this.level = 25;
        this.KenaikanKesehatan = 20;
        this.KenaikanMenyerang = 20;
    }

    public void display() {
        System.out.println("Jagoan\t\t: " + this.nama);
        System.out.println("Level\t\t: " + this.level);
        System.out.println("MaxKesehatan\t: " + this.maxKesehatan());
        System.out.println("Menyerang\t\t: " + this.getMenyerangPower() + "\n");
    }

    public void levelUp() {
        this.level++;
    }

    public void setJubah(Jubah jubah) {
        this.jubah = jubah;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public int maxKesehatan() {
        return this.Darah + this.level * this.KenaikanKesehatan + this.jubah.getAddKesehatan();
    }

    public int getMenyerangPower() {
        return this.Serangan + this.level * this.KenaikanMenyerang + this.senjata.getMenyerang();
    }

    public void serang(Jagoan musuh) {
        System.out.println(this.nama + " menyerang " + musuh.nama + "!");
        int damage = this.getMenyerangPower() - musuh.maxKesehatan();
        System.out.println("Damage: " + damage);
        if (damage > 0) {
            System.out.println(musuh.nama + " kalah.");
        } else {
            System.out.println(musuh.nama + " masih bertahan dengan sisa Kesehatan: " + (-damage));
        }
    }
}
