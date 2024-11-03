public class Complex {
    private int real;
    private int imag;
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public int getReal() {
        return real;
    }
    public int getImag() {
        return imag;
    }
    public void setReal(int real) {
        this.real = real;
    }
    public void setImag(int imag) {
        this.imag = imag;
    }
    public String toString(){
        if(imag<0){
            return real + ""+imag +"i";
        }
        else {
            return real + "+" + imag +"i";
        }

    }

    public Complex  adunare(Complex other){
        Complex returnat=new Complex(0,0);
        returnat.real=this.real+other.real;
        returnat.imag=this.imag+other.imag;
       return returnat;
    }

    public Complex scadere(Complex other){
        Complex returnat=new Complex(0,0);
        returnat.real=this.real-other.real;
        returnat.imag=this.imag-other.imag;
        return returnat;
    }
    public Complex inmultireScalar(int scalar){
        return new Complex(this.real*scalar,this.imag*scalar);
    }
    public Complex inmultire(Complex other){
        Complex returnat=new Complex(0,0);
        returnat.real=this.real*other.real- this.imag*other.imag;
        returnat.imag=this.real*other.imag + this.imag*other.real;
        return returnat;

    }

}
