package novo.project.web.cadastrocliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CadastroClienteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CadastroClienteApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "<h1>Sistema online com sucesso 🚀</h1>";
    }
}
