public class main2 {
    public static void main(String[] args) {
        TablaSah tabla = new TablaSah();
        Pion pion = new Pion(1, 1, tabla);
        pion.mutare(2, 1);
        pion.mutare(4, 1);
        pion.mutare(3, 1);
        tabla.setElement(4, 2, 2);
        pion.mutare(4, 2);
        Nebun nebun = new Nebun(0, 2, tabla);

        // Mutăm nebunul la (3, 5) - mutare validă
        nebun.mutare(3, 5); // Ar trebui să afișeze mesajul de mutare validă

        // Încercăm o mutare invalidă la (4, 6)
        nebun.mutare(4, 6); // Ar trebui să afișeze mesajul de mutare invalidă

        // Mutăm nebunul la (2, 4) - mutare validă
        nebun.mutare(2, 4); // Ar trebui să afișeze mesajul de mutare validă

        // Capturăm o piesă pe diagonală, plasând o piesă inamică pe (1, 3)
        tabla.setElement(1, 3, 2); // 2 reprezintă o piesă inamică
        nebun.mutare(1, 3);
    }
}
