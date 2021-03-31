package Un_Programa_Sencillo_De_Herencia;

public class ControladorHerencia {
    public static void main(String[] args) {
        Rectangulo rectangulo0 = new Rectangulo();
        Cuadrado cuadrado0 = new Cuadrado();

        Rectangulo rectangulo1 = new Rectangulo(2.3, 5.3);
        Cuadrado cuadrado1 = new Cuadrado(2.3);

        //POLIMORFISMO

        // 1. La superclase no es siempre la subclase.
        /*
        No es posible, no todos los rectangulos son cuadrados, es decir,
        en un rectángulo la anchura no siempre es igual a la altura.

        En este caso, como sí se cumple que la anchura es igual a la altura podríamos
        hacer un cast, pero sería peligroso.
        */
        //Cuadrado cuadrado2 = new Rectangulo(2.3, 2.3);

        // 2. La subclase es siempre la superclase.
        /*
        Sí es posible, todos los cuadrados son rectángulos, es decir,
        todos sus lados tienen ángulos de 90 grados.
         */
        //Rectangulo rectangulo2 = new Cuadrado(3.2);



        System.out.println("Rectángulo0: "+rectangulo0.toString());
        System.out.println("Rectángulo1: "+rectangulo1.toString());
        System.out.println("Cuadrado0: "+cuadrado0.toString());
        System.out.println("Cuadrado1: "+cuadrado1.toString());

    }
}
