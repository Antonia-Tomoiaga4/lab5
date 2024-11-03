public class TablaSah {
    public static final int nrlini = 8;
    public static final int nrcol = 8;
    private int[][] mat;

    public TablaSah() {
        mat = new int[nrlini][nrcol];
    }

    public int getElement(int i, int j) {
        return mat[i][j];
    }

    public void setElement(int i, int j, int element) {
        mat[i][j] = element;
    }
}

