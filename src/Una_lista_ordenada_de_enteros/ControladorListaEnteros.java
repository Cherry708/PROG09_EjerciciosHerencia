package Una_lista_ordenada_de_enteros;

public class ControladorListaEnteros {

    public static void main(String[] args) {
        ListaEnteros miLista = new ListaEnteros(10);
        ListaEnterosOrdenada miListaOrdenada = new ListaEnterosOrdenada(10);

        try {
            miLista.añadir(100);
            miLista.añadir(50);
            miLista.añadir(200);
            miLista.añadir(25);

            miListaOrdenada.añadir(100);
            miListaOrdenada.añadir(50);
            miListaOrdenada.añadir(200);
            miListaOrdenada.añadir(25);



        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println(miLista);
        System.out.println(miListaOrdenada);
    }
}

