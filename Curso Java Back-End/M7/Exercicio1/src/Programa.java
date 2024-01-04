public class Programa {
    public String mensagemCurso() {
        return "Geek University";
    }

    public static void main(String[] args) {
        Programa programa = new Programa();
        String mensagem = programa.mensagemCurso();
        System.out.println(mensagem);
    }
}