public class Matematic {
	static double precoEmbalagem = 10;

	public static double valorVenda(double valorProduto, double margemLucro) {
		return valorProduto * ((margemLucro / 100) + 1);
	}

	public static double lucroLiquido(double valorProduto, double valorVenda) {
		return valorVenda - valorProduto;
	}
}


