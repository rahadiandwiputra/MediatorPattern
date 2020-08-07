package sample;


public class Main {

    public static void main(String[] args) {
        User robert = new User("Penyewa Buku");
        User john = new User("Penjaga Perpus");

        robert.sendMessage("Apakah  buku yang berjudul LOST tersedia disini?");
        john.sendMessage("Ada, silahkan di cari diLemari perpustakaan no 7");
    }

}
