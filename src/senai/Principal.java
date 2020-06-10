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
	static List<Double> valorServicos = new ArrayList<Double>();
	static List<String> vendas = new ArrayList<String>();
	static List<Double> valorVenda = new ArrayList<Double>();

	public static void main(String[] args) {

		StringBuffer menu = new StringBuffer();
		StringBuffer lista = new StringBuffer();

		String nomeFuncionario = "";
		String profissaoFuncionario = "";
		double valor = 0.0;
		int resposta = -1;

		while (resposta != 0) {

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
			case 1: // 1 - Cadastrar funcionario

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

						if (nomeFuncionarios.get(i).equalsIgnoreCase(nomeFuncionario)) {

							nomeFuncionario = jopStr("Digite o novo nome do funcionário:");
							nomeFuncionarios.set(i, nomeFuncionario);

							profissaoFuncionario = jopStr("Deseja alterar a profissão? ( S / N )");

							if (profissaoFuncionario.equalsIgnoreCase("s")) {

								profissaoFuncionario = jopStr("Digite a profissão do funcionário:");
								profissaoFuncionarios.set(i, profissaoFuncionario);

							}

							jop("Funcionário alterado com sucesso");

						}
					}

				} else {
					jop("Lista vazia");
				}

				break;
			case 3: // 3 - Listar funcionarios

				if (!nomeFuncionarios.isEmpty()) {
					lista = new StringBuffer();

					for (int i = 0; i < nomeFuncionarios.size(); i++) {
						lista.append(nomeFuncionarios.get(i) + "\n");
					}

					jop(lista.toString());

				} else {
					jop("Lista vazia");
				}

				break;
			case 4: // 4 - Cadastrar cliente

				nomeFuncionario = jopStr("Digite o nome do cliente:");
				profissaoFuncionario = jopStr("Digite o telefone do cliente:");

				nomeClientes.add(nomeFuncionario);
				telefoneClientes.add(profissaoFuncionario);
				jop("Cliente cadastrado com sucesso");

				break;
			case 5: // 5 - Alterar cliente

				if (!nomeClientes.isEmpty()) {

					nomeFuncionario = jopStr("Digite o nome do cliente que deseja alterar:");
					for (int i = 0; i < nomeClientes.size(); i++) {

						if (nomeClientes.get(i).equalsIgnoreCase(nomeFuncionario)) {

							nomeFuncionario = jopStr("Digite o novo nome do cliente:");
							nomeClientes.set(i, nomeFuncionario);

							profissaoFuncionario = jopStr("Digite o telefone do cliente:");
							telefoneClientes.set(i, profissaoFuncionario);
						}

						jop("Cliente modificado com sucesso");

					}

				} else {
					jop("Lista vazia");
				}

				break;
			case 6: // 7 - Listar cliente

				if (!nomeClientes.isEmpty()) {

					lista = new StringBuffer();

					for (int i = 0; i < nomeClientes.size(); i++) {

						lista.append(nomeClientes.get(i) + "\n");
					}

					jop(lista.toString());

				} else {

					jop("Lista vazia");
				}

				break;
<<<<<<< HEAD
			case 7: // 7 - Cadastrar servi�o
				
				nomeFuncionario = jopStr("Servi�o:");
				valor = Double.parseDouble(jopStr("Valor:"));

				servicos.add(nomeFuncionario);
				valorServicos.add(valor);
				
				jop("Servi�o cadastrado com sucesso");

				break;
			case 8: // 8 - Alterar servi�o
				
				  if (!servicos.isEmpty()) {
						
						nomeFuncionario = jopStr("Digite o nome do Servi�o que deseja alterar: ");
						for (int i = 0; i < servicos.size(); i++) {
							     if (servicos.get(i).equalsIgnoreCase(nomeFuncionario)) {
									      nomeFuncionario = jopStr("Digite o novo nome do Servi�o: ");
									      servicos.set(i, nomeFuncionario);
									      								      								       
									    profissaoFuncionario = jopStr("Digite o valor do servi�o: ");
									    valorServicos.set(i, Double.parseDouble(profissaoFuncionario));
										
									      jop("Servi�o modificado com sucesso");
								}
							}
						
					} else {
						jop("N�o h� nenhum funci�nario na lista!");
					}

				break;
			case 9: // 9 - Listar servi�o
				
				 if (!servicos.isEmpty()) {
						lista = new StringBuffer();
						for (int i = 0; i < servicos.size(); i++) {
							lista.append(servicos.get(i) +"\n");}
						jop(lista.toString());
					} else {
						jop("Lista vazia");
					}

				break;
			case 10: // 10 - Efetuar venda

				nomeFuncionario = jopStr("Qual produto deseja comprar?: ");
				profissaoFuncionario = jopStr("Qual o valor da venda: ");
				vendas.add(nomeFuncionario);
				valorVenda.add(Double.parseDouble(profissaoFuncionario));
				jop("Venda efetuada com sucesso!");
				
				break;
			case 11: // 11 - Listar vendas
				
				if(!vendas.isEmpty()) {
					
					lista = new StringBuffer();
					
					for (int i = 0; i < vendas.size(); i++) {
						
						lista.append(vendas.get(i) + ", valor:" + String.format("%.2f",  valorVenda.get(i) + "\n"));
					
					}
					jop(lista.toString());
					
				}
				else {
					jop("Lista vazia");
				}
				
=======
			case 7: // 7 - Cadastrar serviço
                          nomeFuncionario = jopStr("Qual serviço quer disponibilizar?: ");
				profissaoFuncionario = jopStr("Qual o valor do serviço: ");
				servicos.add(nomeFuncionario);
				ValorServicos.add(profissaoFuncionario);
				jop("Cliente cadastrado com sucesso!");
				break;
			case 8: // 8 - Alterar serviço
                          if (!servicos.isEmpty()) {
					
					nomeFuncionario = jopStr("Digite o nome do Serviço que deseja alterar: ");
					for (int i = 0; i < servicos.size(); i++) {
						     if (servicos.get(i).equalsIgnoreCase(nomeFuncionario)) {
								      nomeFuncionario = jopStr("Digite o novo nome do Serviço: ");
								      servicos.set(i, nomeFuncionario);
								      								      								       
								    profissaoFuncionario = jopStr("Digite o valor do serviço: ");
								    ValorServicos.set(i, profissaoFuncionario);
									
								      jop("Serviço modificado com sucesso");
							}
						}
					
				} else {
					jop("Não há nenhum funciónario na lista!");
				}
				break;
			case 9: // 9 - Listar serviço
                          if (!servicos.isEmpty()) {
					lista = new StringBuffer();
					for (int i = 0; i < servicos.size(); i++) {
						lista.append(servicos.get(i) +"\n");}
					jop(lista.toString());
				} else {
					jop("Lista vazia");
				}
				break;
			case 10: // 10 - Efetuar venda
                            nomeFuncionario = jopStr("Qual venda quer efetuar?: ");
				profissaoFuncionario = jopStr("Qual o valor da venda: ");
				vendas.add(nomeFuncionario);
				valorVenda.add(profissaoFuncionario);
				jop("Venda efetuada com sucesso!");
				break;
			case 11: // 11 - Listar vendas
                               if (!vendas.isEmpty()) {
					lista = new StringBuffer();
					for (int i = 0; i < vendas.size(); i++) {
						lista.append(vendas.get(i)+": ");
					    lista.append(valorVenda.get(i)+"\n");
					}
					
					jop(lista.toString());
				} else {
					jop("Lista vazia");
				}
>>>>>>> 3150719b8409dd4ea317a7c0e7ad584b661a58b5
				break;

			case 0: // Sair

				resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?");

				break;

<<<<<<< HEAD
			default: // op��o invalida
				
				jop("O numero escolhido tem que ser de 0 � 11");
=======
			default: // opção invalida
>>>>>>> 3150719b8409dd4ea317a7c0e7ad584b661a58b5
				break;
			}

		}

	}
	
	public static final Double jopDou(String msg) {
		
		double valor = 0.0;
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
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
