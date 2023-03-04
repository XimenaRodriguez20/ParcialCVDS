package hangman;

public class MultiplosDeCinco {

    public static  String siEsMultiplo(int numero) {
        String resultado = (numero % 5 == 0)? "Buzz": "No es multiplo";
        return resultado;
    }
    
}
