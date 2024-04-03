class GoodDog {
    private int size; //declara a variavel de instancia size como privada
    public int getSize(){// cria o metodo get para acessar o valor da variavel size
        return size;//retorna o valor armazenado em size
    }
    public void setSize(int s){// cria o metodo set passando como parametro o int s para poder alterar op valor de size
        size = s;// atribui o valor que sera passado como argumento a variavel int s a size.
    }
    void bark(){
        if (size >= 50){
            System.out.println("WOOLF! WOOLF!");
        }if (size >= 30 && size < 50){
            System.out.println("RUFF!, RUFF!");
        }if (size < 30){
            System.out.println("Yip!, Yip!...");
        }
    }
}
