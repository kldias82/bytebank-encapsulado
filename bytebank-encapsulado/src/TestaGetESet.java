
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 252423);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		//agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador Jr");
		
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(conta.getTitular());
	}
}
