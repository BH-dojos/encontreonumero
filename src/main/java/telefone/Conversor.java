package telefone;

public class Conversor {
    public char converte(char caractere) {
        if (caractere == 'A' || caractere == 'B') {
            return '2';
        }
        return caractere;
    }
}
