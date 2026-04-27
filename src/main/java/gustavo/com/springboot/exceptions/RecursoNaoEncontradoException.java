package gustavo.com.springboot.exceptions;

public class RecursoNaoEncontradoException extends RuntimeException {
    public RecursoNaoEncontradoException(String mensagem){
        super(mensagem);
    }
}
