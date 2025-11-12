package exceptions;

public class NomeInvalidoException extends Exception{

    public NomeInvalidoException(){
        super("Nome Inválido. Tente novamente");
    }
    
}
