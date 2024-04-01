public class Clientes {
    private int codigo;
   private String nome;
   private String endereco;

    public static void main(String[] args) {
        Clientes cliente = new Clientes();
        cliente.nome = "João";
        cliente.codigo = 0001;
        cliente.endereco = "Rua 01";

        System.out.println(cliente.nome);
        System.out.println(cliente.codigo);
        System.out.println(cliente.endereco);

    }
}