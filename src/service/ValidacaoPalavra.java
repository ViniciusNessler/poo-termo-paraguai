package service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidacaoPalavra {
    public static Map<Character, Boolean> validarCaracteres(String palavraSorteada, String palavraDigitada) {
        Map<Character, Boolean> resultadoValidacao = new HashMap<>();

        palavraSorteada = palavraSorteada.toLowerCase();
        palavraDigitada = palavraDigitada.toLowerCase();

        Set<Character> caracteresSorteados = new HashSet<>();
        for (char c : palavraSorteada.toCharArray()) {
            caracteresSorteados.add(c);
        }

        Set<Character> caracteresDigitados = new HashSet<>();
        for (char c : palavraDigitada.toCharArray()) {
            caracteresDigitados.add(c);
        }

        Set<Character> caracteresComuns = new HashSet<>(caracteresSorteados);
        caracteresComuns.retainAll(caracteresDigitados);

        for (char caracter : caracteresComuns) {
            int indexSorteado = palavraSorteada.indexOf(caracter);
            int indexDigitado = palavraDigitada.indexOf(caracter);
            boolean estaNaPosicaoCorreta = indexSorteado == indexDigitado;

            resultadoValidacao.put(caracter, estaNaPosicaoCorreta);
        }

        return resultadoValidacao;
    }
}
