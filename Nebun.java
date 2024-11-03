public class Nebun {
    private int pozX;
    private int pozY;
    private TablaSah tabla;

    public Nebun(int pozX, int pozY, TablaSah tabla) {
        this.pozX = pozX;
        this.pozY = pozY;
        this.tabla = tabla;

        // Setează poziția nebunului pe tablă
        tabla.setElement(pozX, pozY, 3); // 3 reprezintă nebunul
    }

    public void mutare(int i, int j) {
        // Verificăm dacă poziția țintă este în limitele tablei
        if (i < 0 || i >= TablaSah.nrlini|| j < 0 || j >= TablaSah.nrcol) {
            System.out.println("Mutare invalidă: Poziție în afara tablei.");
            return;
        }

        // Verificăm dacă nebunul se mișcă pe diagonală
        if (Math.abs(i - pozX) == Math.abs(j - pozY)) {
            // Verificăm dacă toate pozițiile intermediare sunt libere
            int xStep = (i > pozX) ? 1 : -1;
            int yStep = (j > pozY) ? 1 : -1;

            for (int x = pozX + xStep, y = pozY + yStep; x != i && y != j; x += xStep, y += yStep) {
                if (tabla.getElement(x, y) != 0) {
                    System.out.println("Mutare invalidă: Există o piesă pe diagonală.");
                    return;
                }
            }

            // Mutăm nebunul
            tabla.setElement(pozX, pozY, 0); // Eliberăm poziția curentă
            pozX = i;
            pozY = j;
            tabla.setElement(i, j, 3); // Mutăm nebunul la noua poziție
            System.out.println("Mutare validă la poziția: (" + i + ", " + j + ")");
        } else {
            System.out.println("Mutare invalidă: Nebunul se poate muta doar pe diagonală.");
        }
    }
}
