
package hangman;


public class MultiplosDeTres {

    public static  String siEsMultiplo(int numero) {
        String resultado = (numero % 3 == 0)? "Fizz" : "No es multiplo";
        return resultado;
    }
}
