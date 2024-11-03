public class Pion {
    private int pozX;
    private int pozY;
    private TablaSah tabla;

    public Pion(int pozX, int pozY, TablaSah tabla) {
        this.pozX = pozX;
        this.pozY = pozY;
        this.tabla = tabla;

        // Setează poziția pionului pe tablă
        tabla.setElement(pozX, pozY, 1); // 1 reprezintă pionul
    }

    public void mutare(int i, int j) {
        // Verificăm dacă poziția țintă este în limitele tablei
        if (i < 0 || i >= TablaSah.nrlini || j < 0 || j >= TablaSah.nrcol) {
            System.out.println("Mutare invalidă: Poziție în afara tablei.");
            return;
        }

        // Mutare simplă: pionul se poate muta cu un pas înainte
        if (tabla.getElement(i, j) == 0 && j == pozY && i == pozX + 1) {
            tabla.setElement(pozX, pozY, 0); // Eliberăm poziția curentă
            pozX = i;
            pozY = j;
            tabla.setElement(i, j, 1); // Mutăm pionul la noua poziție
            System.out.println("Mutare validă la poziția: (" + i + ", " + j + ")");
            return;
        }

        // Capturare pe diagonală
        if (tabla.getElement(i, j) != 0 && Math.abs(j - pozY) == 1 && i == pozX + 1) {
            tabla.setElement(pozX, pozY, 0); // Eliberăm poziția curentă
            pozX = i;
            pozY = j;
            tabla.setElement(i, j, 1); // Capturăm piesa inamică
            System.out.println("Capturare validă la poziția: (" + i + ", " + j + ")");
            return;
        }

        System.out.println("Mutare invalidă: Poziția țintă este ocupată sau mutare ilegală.");
    }
}
