public class DosDimensiones {

    private double base;
    private double altura;

    DosDimensiones(){
        base=altura=0.0;
    }
    DosDimensiones (double b,double h){
        base=b;
        altura = h;
    }

    DosDimensiones(double x){
        base=altura=x;
    }

    double getBase(){return base;}
    double getAltura(){return altura;}

    void setBase(double b){base=b;}

    void setAltura(double h){altura=h;}

    void mostrarDimensiones(){
        System.out.println("La base " + base + " y La altura es: " + altura);
    }
}
