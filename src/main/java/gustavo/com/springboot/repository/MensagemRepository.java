package gustavo.com.springboot.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MensagemRepository {
    public String obterMensagem(){
        return "ola do repositorio";
    }
}
