package Un_Programa_Sencillo_De_Herencia;

import java.time.temporal.ChronoUnit;

public class Cuadrado extends Rectangulo{

    /*
    QUE SE ESPECIALICE NO SIGNIFICA QUE SEA MÁS COMPLEJO

    La subclase es la superclase pero más específica.
    Un cuadrado y un rectángulo tiene ancho y alto, pero hemos específicado que
    en el cuadrado el ancho y el alto son iguales, es decir que solo tendremos en cuenta
    el lado.

    La subclase puede tener tantos o más atributos(datos) que la superclase,
    pero nunca menos: datos(subclase) >= datos(superclase)

    En este ejercicio, la subclase tiene tantos datos/atributos como la superclase,
    pero hemos especificado que tanto el ancho y alto son iguales en el segundo método constructor.
     */

    //Métodos
    public Cuadrado(){
        /* Esto es lo que sucede por defecto, los parametros suministrados a Cuadrado
           serán suministrados a la superclase.

        super();
        */
    }

    public Cuadrado(double lado){
        //Método para encapsulado protected
        ancho = lado;
        largo = lado;


        /*
        En este caso, el encapsulado protected
        es la mejor opción ya que en la clase anterior no hay ningún requisito
        de setters.
         */

        /* Método para encapsulado private
        setLargo(lado);
        setAncho(lado);
        */

        /* Método para encapsulado private anterior
        super.setLargo(lado);
        super.setAncho(lado);
        */


        /* Igual que en la línea 15, 16 pero con redundancia
        super.ancho = lado;
        super.largo = lado;
        */
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                '}';
    }
}
