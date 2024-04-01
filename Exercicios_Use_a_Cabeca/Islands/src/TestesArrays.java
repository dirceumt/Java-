public class TestesArrays {
	public static void main(String[] args) {
		int [] index = new int[4];//cria o array int com 4 indices e atribui a var index
		index[0] = 1;//atribui um valor a cada indice
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;

		String[] islands = new String[4];//cria array String com 4 indices e atribui a var islands
		islands[0] = "Bermudas";//atribui um nome a cada índice
		islands[1] = "Fiji";
		islands[2] = "Azores";
		islands[3] = "Cozumel";

		int y = 0; //atribui 0 a y, inicializando
		int ref; //declara a var ref do tipo int
		while (y<4){ //enquanto y for menor que 4
			ref = index[y];//ref recebe o valor de index na posição do numero y
			System.out.print("island = "); //imprime o nome d ailha
			System.out.println(islands[ref]);//organiza os nomes de acordo com os valores de ref que estão no index
			y = y+1;//pega o valor de y e soma+1 e orda o loop até y=4.
		}
	}
}