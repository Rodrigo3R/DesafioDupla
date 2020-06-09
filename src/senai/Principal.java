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
		
		String nomeFuncionario = "";		
		String profissaoFuncionario = "";		
		int resposta = -1;
		
		while( resposta != 0) {
		
			menu = new StringBuffer();
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
			
			switch (resposta) {
			case 1: //  1 - Cadastrar funcionario
				
				nomeFuncionario = jopStr("Digite o nome do funcionário:");
				profissaoFuncionario = jopStr("Digite a profissão  do funcionário:");
				
				nomeFuncionarios.add(nomeFuncionario);
				profissaoFuncionarios.add(profissaoFuncionario);
				jop("Funcionário cadastrado com sucesso");
				
				break;
			case 2: // 2 - Alterar funcionario
				
				if (!nomeFuncionarios.isEmpty()) {
					
					nomeFuncionario = jopStr("Digite o nome do funcionário que deseja alterar:");
					for (int i = 0; i < nomeFuncionarios.size(); i++) {
						
						if(nomeFuncionarios.get(i).equalsIgnoreCase(nomeFuncionario)) {
							
							nomeFuncionario = jopStr("Digite o novo nome do funcionário:");
							nomeFuncionarios.set(i, nomeFuncionario);
							
							profissaoFuncionario =jopStr("Deseja alterar a profissão? ( S / N )");
						
							if(profissaoFuncionario.equalsIgnoreCase("s")) {
								
								profissaoFuncionario = jopStr("Digite a profissão do funcionário:");
								profissaoFuncionarios.set(i, profissaoFuncionario);
							
							}
						}
					} 
					
				}
				else {
					jop("Lista vazia");
				}
				
				break;
			case 3: // 3 - Listar funcionarios
				
				break;
			case 4: // 4 - Cadastrar cliente
				
				break;
			case 5: // 5 - Alterar cliente
				
				break;
			case 6: // 7 - Cadastrar serviço
				
				break;
			case 7: // 7 - Cadastrar serviço
				
				break;
			case 8: //8 - Alterar serviço
				
				break;
			case 9: // 9 - Listar serviço
				
				break;
			case 10: // 10 - Efetuar venda
				
				break;
			case 11: // 11 - Listar vendas
				
				break;
			
			case 0: // Sair
				
				resposta = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?");
				
				break;

			default: // opção invalida
				break;
			}
			
		}

	}
	public static String jopStr(String mensagem) {

		String retorno = "";
		return JOptionPane.showInputDialog(mensagem);
		
	}
	

	public static final Integer jopInt(String mensagem) {

		Integer numero = 0;
		return Integer.parseInt(JOptionPane.showInputDialog(mensagem));
		
	}
	
	public static final void jop(String mensagem) {

		JOptionPane.showMessageDialog(null, mensagem);
	}

}
