//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Complex nr1=new Complex(1,6);
System.out.println(nr1.toString());
Complex nr2=new Complex(1,5);
System.out.println(nr2.toString());
Complex nr3=new Complex(0,2);
nr3.inmultireScalar(3);
System.out.println(nr3.toString());
Complex nr4=new Complex(0,2);
System.out.println(nr4.toString());
Complex nr5=new Complex(0,2);
Complex nr6=new Complex(0,2);
Complex[] nrComplexe= new Complex[]{nr1,nr2,nr3,nr4,nr5,nr6};

nrComplexe[0]=nr1;
for(int i=0;i<nrComplexe.length;i++){
    System.out.println(nrComplexe[i].toString());
}
for(Complex v:nrComplexe){
    System.out.println(v.toString());
}
Matrice M1=new Matrice(3,3);
Matrice M2=new Matrice(3,3);
System.out.println("m1:");
M1.afisare();
System.out.println("m2:");
M2.afisare();
Matrice suma=M1.adunareMatrice(M2);
System.out.println("suma: ");
suma.afisare();
Matrice dif=M1.scadereMatrice(M2);
System.out.println("dif: ");
dif.afisare();
Matrice mulScal=M1.scalarMatrice(6);
System.out.println("mulScal: ");
mulScal.afisare();
    }
}