import java.util.Scanner;

public class Menu {
	
	DadosPessoais objDadosPessoais;
	DadosContatos objDadosContatos; 
	DadosEnderecos objDadosEnderecos; 
	
	public void exibirMenu() {
		
		int opcao = 0;
		Scanner objScanner = new Scanner(System.in);
		
		while(opcao != 5) {
		
			System.out.println("ESCOLHA UMA OPÇÃO POR NUMERO ");
			System.out.println("1 - DADOS PESSOAIS ");
			System.out.println("2 - DADOS DE CONTATOS ");
			System.out.println("3 - DADOS DE ENDEREÇO");
			System.out.println("4 - EXIIBIR DADOS ");
			System.out.println("5 - SAIR ");
			
			opcao = objScanner.nextInt();
			
			switch (opcao) {
			case 1:
				
				System.out.println("INFOME O NOME");
				objDadosPessoais = new DadosPessoais();
				objDadosPessoais.setNome(objScanner.next());
				
				System.out.println("INFOME O SOBRENOME");
				objDadosPessoais.setSobreNome(objScanner.next());
				
				System.out.println("INFOME SUA DATA DE NASCIMENTO");
				objDadosPessoais.setDataNascimento(objScanner.next());
				
				System.out.println("INFOME SEU GENERO");
				objDadosPessoais.setGenero(objScanner.next());
				
				break;
				
			case 2:
				
				System.out.println("INFORME SEU E-MAIL");
				objDadosContatos = new DadosContatos();
				objDadosContatos.setEmail(objScanner.next());
				
				System.out.println("INFOME SEU NÚMERO DE TELEFONE");
			    objDadosContatos.setTelefone(objScanner.next());
				break;
				
			case 3:
				
				System.out.println("INFOME O SEU CEP");
				objDadosEnderecos = new DadosEnderecos();
				objDadosEnderecos.setCep(objScanner.next());
				
				System.out.println("INFOME O LOGRADOURO");
				objDadosEnderecos.setLogradouro(objScanner.next());
				
				System.out.println("INFOME O NUMERO DA SUA CASA");
				objDadosEnderecos.setNumero(objScanner.next());
				
				System.out.println("INFOME SEU BAIRRO");
				objDadosEnderecos.setBairro(objScanner.next());
				
				System.out.println("INFOME A SUA CIDADE");	
				objDadosEnderecos.setCidade(objScanner.next());
				
				System.out.println("INFOME O SEU ESTADO");
				objDadosEnderecos.setEstado(objScanner.next());
				break;
				
			case 4: 
				
				System.out.println("EXIBIR DADO: ");
				
				System.out.println("DADOS PESSOAIS: ");
				System.out.println("NOME: "  + objDadosPessoais.getNome());
				System.out.println("SOBRENOME: "  + objDadosPessoais.getSobreNome());
				System.out.println("DATA DE NASCIMENTO: "  + objDadosPessoais.getDataNascimento());
				System.out.println("GENERO: "  + objDadosPessoais.getGenero());
				
				System.out.println("DADOS DE CONTATOS: ");
				System.out.println("E-MAIL: "  + objDadosContatos.getEmail());
				System.out.println("TELEFONE: "  + objDadosContatos.getTelefone() );
				
				
				System.out.println("DADOS DE ENDEREÇO: ");
				System.out.println("CEP: " + objDadosEnderecos.getCep());
				System.out.println("LOGRADOURO: " + objDadosEnderecos.getLogradouro());
				System.out.println("NUMERO: " + objDadosEnderecos.getNumero());
				System.out.println("BAIRRO: " + objDadosEnderecos.getBairro());
				System.out.println("CIDADE: " + objDadosEnderecos.getCidade());
				System.out.println("ESTADO: " + objDadosEnderecos.getEstado());
				break;
				
			case 5:
				
				System.out.println("#### OBRIGADO POR USAR O SISTEMA ##### ");
				break;
			
			default:
				System.out.println("OPÇÃO INVALIDA ");
				break;
			}
			
			
		}
	}

}
