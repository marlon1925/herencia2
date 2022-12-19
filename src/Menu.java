public class Menu {
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo();//instancia
        miRectangulo.setX(20);
        miRectangulo.setY(10);
        miRectangulo.calcularPerimetro();
        System.out.println("\n" +miRectangulo.getPerimetro());

        miRectangulo.setX(10);
        miRectangulo.setY(50);
        miRectangulo.calcularArea();
        System.out.println("\n" +miRectangulo.getArea());

        Cuadrado miCuadrado = new Cuadrado();
        miCuadrado.setX(4);
        miCuadrado.setY(4);
        miCuadrado.calcularPerimetro();
        miCuadrado.calcularArea();
        System.out.println(miCuadrado.getPerimetro());
        System.out.println(miCuadrado.getArea());

        ColorTriangulo t1 = new ColorTriangulo("Azul", "Estilo x", 8.0,12.0);
        ColorTriangulo t2 = new ColorTriangulo("Rojo", "Estilo y", 4.0,3.0);

        System.out.println("Datos del triangulo 1");
        t1.mostrarEstilo();
        t1.mostrarDimensiones();
        t1.mostrarColor();
        System.out.println("Su area es: " + t1.area());
        System.out.println("Datos el triangulo 2 ");
        t2.mostrarEstilo();
        t2.mostrarDimensiones();
        t2.mostrarColor();
        System.out.println("Su area es: " + t2.area());
    }
}
