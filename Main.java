public class Main {
    public static void main(String[] args) {
        // Buat Jagoan
        Jagoan jakaSembung = new Jagoan("Jaka Sembung");
        Jagoan pitung = new Jagoan("Si Pitung");
        // Buat Jubah
        Jubah jubahPutih = new Jubah("Jubah Putih", 7, 50);
        Jubah jubahHitam = new Jubah("Jubah Hitam", 8, 52);
        // Buat Senjata
        Senjata golok = new Senjata("Golok", 25);
        Senjata toya = new Senjata("Toya", 24);
        // Atur Jagoan dengan Jubah dan Senjata
        jakaSembung.setJubah(jubahPutih);
        jakaSembung.setSenjata(golok);
        pitung.setJubah(jubahHitam);
        pitung.setSenjata(toya);
        // Tampilkan status Jagoan
        jakaSembung.display();
        pitung.display();
        // Saling serang
        jakaSembung.serang(pitung);
        jakaSembung.serang(pitung);
        pitung.serang(jakaSembung);
        jakaSembung.serang(pitung);
        pitung.serang(jakaSembung);
    }
} 