import java.util.Random;

public class Matrice {
    private int nrLines;
    private int nrCols;
    private Complex[][] matrice;
    public Matrice(int nrLines, int nrCols) {
        this.nrLines = nrLines;
        this.nrCols = nrCols;
        matrice = new Complex[nrLines][nrCols];
        Random rand = new Random();
        for (int i = 0; i < nrLines; i++) {
            for (int j = 0; j < nrCols; j++) {
                matrice[i][j]=new Complex(rand.nextInt(10),rand.nextInt(10));}
        }
    }
    public int getNrLines() { return nrLines; }
    public int getNrCols() { return nrCols; }
    public void setNrLines(int nrLines) { this.nrLines = nrLines; }
    public void setNrCols(int nrCols) { this.nrCols = nrCols; }
    public Complex[][] getMat(){ return matrice; }
    public void afisare(){
        for (int i = 0; i < nrLines; i++) {
            for (int j = 0; j < nrCols; j++) {
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
        }
    }
    public Matrice adunareMatrice(Matrice other){
        Matrice rez= new Matrice(nrLines,nrCols);
        for (int i = 0; i < nrLines; i++) {
            for (int j = 0; j < nrCols; j++) {
                rez.matrice[i][j]=this.matrice[i][j].adunare(other.matrice[i][j]);
            }
        }
        return rez;
    }
    public Matrice scadereMatrice(Matrice other){
        Matrice rez= new Matrice(nrLines,nrCols);
        for (int i = 0; i < nrLines; i++) {
            for (int j = 0; j < nrCols; j++) {
                rez.matrice[i][j]=this.matrice[i][j].scadere(other.matrice[i][j]);
            }
        }
        return rez;
    }

    public Matrice inmultireMatrice(Matrice other){
        Matrice rez= new Matrice(nrLines,nrCols);
        for (int i = 0; i < nrLines; i++) {
            for (int j = 0; j < nrCols; j++) {
                rez.matrice[i][j]=this.matrice[i][j].inmultire(other.matrice[i][j]);
            }
        }
        return rez;
    }

    public Matrice scalarMatrice(int scalar){
        Matrice rez= new Matrice(nrLines,nrCols);
        for (int i = 0; i < nrLines; i++) {
            for (int j = 0; j < nrCols; j++) {
                rez.matrice[i][j]=this.matrice[i][j].inmultireScalar(scalar);
            }
        }
        return rez;
    }






}
