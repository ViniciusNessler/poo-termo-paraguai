package messages;

import java.util.Map;

public class Messagens {

    public String introducao(){
        StringBuilder introducao = new StringBuilder();
        introducao.append("\nTERMO DO PARAGUAI\n");
        introducao.append("\n\n\"");
        return introducao.toString();
    }
    public String inicio(){
        StringBuilder inicio = new StringBuilder();
        inicio.append("\nDIGITE UMA PALAVRA DE ATÉ 5 CARACTERES:\n");
        return inicio.toString();
    }

    public String responderTentativa(Map<Character, Boolean> map){
        StringBuilder resposta = new StringBuilder();
        resposta.append("\n\n\"");
        resposta.append("\n\n");

        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
            Character key = entry.getKey();
            Boolean estaNaPosicaoCorreta = entry.getValue();

            if (estaNaPosicaoCorreta) {
                resposta.append("O char \"").append(key).append("\" está no lugar certo.\n");
            } else {
                resposta.append("O char \"").append(key).append("\" é existente, porém está no lugar errado.\n");
            }
        }

        resposta.append("\n\n\"");
        return resposta.toString();
    }

    public String parabens(){
        StringBuilder parabens = new StringBuilder();
        parabens.append("\n\n\"");
        parabens.append("\n\nPARABENS, VOCE ACERTOU A PALAVRA!\n");
        parabens.append("\n\n\"");
        return parabens.toString();
    }
    public String fim(){
        StringBuilder fim = new StringBuilder();
        fim.append("\n\n\"");
        fim.append("\n\nFIM DE JOGO!\n");
        fim.append("\n\n\"");
        return fim.toString();
    }



}
