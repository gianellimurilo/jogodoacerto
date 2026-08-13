import java.util.Random;

public class Jogo {

    Random random = new Random();

    private int valor;

    public Jogo() {
        this.valor = random.nextInt(100)+1;
    }
    public int getValor() {
        return valor;
    }
}
