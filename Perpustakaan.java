package librarysystem;

public class Perpustakaan {
    private ArrayList<Buku> koleksiBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    public void tampilkanBuku() {
        for (Buku buku : koleksiBuku) {
            System.out.println(buku.getJudul() + " - " + buku.getPenulis() + " (" + buku.getTahunTerbit() + ")");
        }
    }
}
