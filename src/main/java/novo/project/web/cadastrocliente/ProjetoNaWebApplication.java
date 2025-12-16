package novo.project.web.cadastrocliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjetoNaWebApplication {

    @GetMapping("/")
    public String cadastro() {
        return """
        <h2>Cadastro de Cliente</h2>
        Nome Cliente:<br>
        RG:<br>
        CPF/CNPJ:<br>
        Idade:<br>
        Fone:<br>
        Endereço:<br>
        Data de Nascimento:<br>
        CEP:<br>
        UF:<br>
        Naturalidade:
        """;
    }
}
