import java.util.Scanner;

public class ClientCode {
	public static void main(String[] args) {
		int fezLogin=0;
		Scanner leitor = new Scanner(System.in);	
		
		
		int Login=0;
		int escolha;
		int EscolhaTelaPadrao=0;
		Usuario Adm = new Administrador("admin","admin","admin");
		
		do {
			System.out.println("[1] Logar");
			System.out.println("[2] Sair do sistema");
			EscolhaTelaPadrao = leitor.nextInt();
			
			if(EscolhaTelaPadrao==1) {
				Login=Sistema.logar(Adm);
			}
			
			
			if(Login==3) {
				do {
					System.out.println();
					System.out.println("[1] Cadastrar Usuario");
					System.out.println("[2] Apresentar Usuarios");
					System.out.println("[3] Remover Usuarios");
					System.out.println("[4] Sair");
					escolha = leitor.nextInt();
					switch (escolha){
						case 1:
							Adm.CadastrarUsuario();
						break;
						
						case 2:
							Adm.ApresentarUsuarios();
						break;
						
						case 3:
							Adm.removerUsuario();	
							break;
						case 4:
							System.out.println("Saindo....");
							Login=0;
							break;
						default:
							System.out.println("Opção incorreta selecionada");
							break;
						}
					}while(escolha!=4);
				
				
			}
			
			
		

		
		}while(EscolhaTelaPadrao!=2);
		
	
		}
	}

