package pbc.example.primeiros.passos;

import org.springframework.stereotype.Component;

@Component
public class calculadora {
    
    public float somar(float a, float b) {
        return a + b;
    }

    public float subtrair(float a, float b) {
        return a - b;
    }

    public float multiplicar(float a, float b) {
        return a * b;
    }

    public float dividir(float a, float b) {
        return a / b;
    }
}
