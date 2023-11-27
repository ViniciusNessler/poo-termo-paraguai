import messages.Messagens;
import model.Palavra;
import service.ValidacaoPalavra;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Palavra palavraCorreta = new Palavra(sortearPalavra());
        System.out.println(palavraCorreta);

        Messagens messagens = new Messagens();
        System.out.println(messagens.introducao());

        int rodada = 1;
        boolean acertou = false;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println(messagens.inicio());

            Palavra palavraDigitada = new Palavra(scanner.nextLine());
            if (palavraDigitada.toString().length() != 5) {
                System.out.println("A palavra digitada deve ter no min/max 5 caracteres!");
                continue;
            }
            if (palavraDigitada.toString().equals(palavraCorreta.toString())) {
                System.out.println(messagens.parabens());
                acertou = true;
                break;
            } else {
               Map<Character, Boolean> map = ValidacaoPalavra.validarCaracteres(palavraCorreta.toString(),
                       palavraDigitada.toString());
                System.out.println(messagens.responderTentativa(map));
            }

            rodada++;
        } while (rodada <=6);
        scanner.close();
        if (rodada == 7 && !acertou)
            System.out.println(messagens.fim());
    }


    private static String sortearPalavra(){
        String[] palavras = {"Abafo", "Estar", "Irado", "Jazem"};
        Random random = new Random();
        int indiceSorteado = random.nextInt(palavras.length);

        return palavras[indiceSorteado];
    }
}