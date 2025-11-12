package exceptions;

public class ColecaoInvalidaException extends Exception {
    public ColecaoInvalidaException(){
        super("Coleção Inválida. Tente novamente.");
    }
}
