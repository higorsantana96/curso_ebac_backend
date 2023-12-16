public class NotaMediaAluno {

    public static void main(String args[]) {
    notaMediaAluno();
    }

    public static void notaMediaAluno() {
        System.out.println("Notas do aluno Higor");
        int matematica = 9;
        System.out.println("Matematica: " + matematica);
        int portugues = 7;
        System.out.println("Português: " + portugues);
        int ciencias = 10;
        System.out.println("Ciências: " + ciencias);
        int geografia = 6;
        System.out.println("Geografia: " + geografia);
        int notaMedia = matematica + portugues + ciencias + geografia;
        System.out.println("Nota Média: " + notaMedia / 4);
    }
}