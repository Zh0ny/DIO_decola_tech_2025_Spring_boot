package pbc.example.primeiros.passos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
    @Value("${nome:noreply}")
    private String nome;
    @Value("${email:}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome + "\nE-mail: " + 
        email + "\nCom telefone(s) para contato: " + telefones.getClass());	
        System.out.println("Seu cadastro foi aprovado!");
    }
}
