public class NotaMediaAluno {

    public static void main(String args[]) {
        notaMediaAluno();
    }

    public static void notaMediaAluno() {
        System.out.println("Notas do aluno Higor");
        int matematica = 6;
        int portugues = 4;
        int ciencias = 4;
        int geografia = 4;
        int notaMedia = (matematica + portugues + ciencias + geografia) / 4;
        System.out.println("Nota Média: " + notaMedia);

        if (notaMedia >= 0 && notaMedia <= 4) {
            System.out.println("Reprovado");
        } else if (notaMedia >= 5 && notaMedia <= 6) {
            System.out.println("Recuperação");
        } else if (notaMedia >= 7) {
            System.out.println("Aprovado");
        }
    }
}

