package Un_Programa_Sencillo_De_Herencia;

public class Rectangulo {

    //Atributos
    /*
    Los tipos de datos primitivos no inicializados se les asigna 0.
    A los datos primitivos con caracteres(char) se les asigna "".
    Sin embargo, las clases son variable referenciadas y necesitan estar instaciadas,
    de lo contrario su valor es null.
     */
    protected double ancho; //Eje X
    protected double largo; //Eje Y

    //Métodos

    /**
     * Método constructor sin parámetros de entrada
     */
    public Rectangulo(){
        ancho = 0;
        largo = 0;
    }

    public Rectangulo(double ancho, double largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getArea(){
        return ancho*largo;
    }

    public double getPerimetro(){
        return 2*ancho+2*largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                '}';
    }

}
