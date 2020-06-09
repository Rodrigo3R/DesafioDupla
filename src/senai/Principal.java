package senai;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	static List<String> nomeFuncionarios = new ArrayList<String>();
	static List<String> profissaoFuncionarios = new ArrayList<String>();
	static List<String> nomeClientes = new ArrayList<String>();
	static List<String> telefoneClientes = new ArrayList<String>();
	static List<String> servicos = new ArrayList<String>();
	static List<String> ValorServicos = new ArrayList<String>();
	static List<String> vendas = new ArrayList<String>();
	static List<String> valorVenda = new ArrayList<String>();
	
	public static void main(String[] args) {
	
		StringBuffer menu = new StringBuffer();
		
		int resposta = -1;
		
		while( resposta != 0) {
		
			menu.append("1 - Cadastrar funcionario\n");
			menu.append("2 - Alterar funcionario\n");
			menu.append("3 - Listar funcionarios\n");
			menu.append("4 - Cadastrar cliente\n");
			menu.append("5 - Alterar cliente\n");
			menu.append("6 - Listar clientes\n");
			menu.append("7 - Cadastrar serviço\n");
			menu.append("8 - Alterar serviço\n");
			menu.append("9 - Listar serviço\n");
			menu.append("10 - Efetuar venda\n");
			menu.append("11 - Listar vendas\n");
			menu.append("0- Sair\n");
			
			resposta = jopInt(menu.toString());
			
		}

	}
	

	public static Integer jopInt(String mensagem) {

		Integer numero = 0;
		return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
		
	}

}
