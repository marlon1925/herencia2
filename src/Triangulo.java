public class Triangulo extends DosDimensiones{
    private String estilo;
    Triangulo(){
        super();
        estilo="ninguno";
    }

    Triangulo(String s, double b, double h){
        super(b,h);
        estilo = s;
    }
    Triangulo(double x){
        super(x);
        estilo="Estilo nuevo";
    }
    double area(){
        return getAltura()*getBase()/2;
    }

    void mostrarEstilo(){
        System.out.println("El triangulo tiene" + estilo);
    }
}
