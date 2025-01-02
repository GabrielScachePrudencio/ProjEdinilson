import java.util.Scanner;
public class Administrador extends Usuario {
	final int valor=10;
	protected Usuario[] users;
	 
	 Scanner leitor = new Scanner(System.in);
	 
	 
	public Administrador(String Usuario,String Senha,String tipoUsuario) {
		super(Usuario,Senha,tipoUsuario);
		users = new Usuario[valor];
	}
	
	public void CadastrarUsuario() {
		String nome,senha,tipoAluno;
		
		System.out.println("Insira o nome do Usuario: ");
		nome = leitor.nextLine();
		System.out.println("Insira a senha : ");
		senha = leitor.nextLine();
		System.out.println("Insira o tipo de usuario: professor/aluno");
		tipoAluno = leitor.nextLine();
		
		users[getNumUsuarios()] = new Administrador(nome, senha, tipoAluno);
		
		
	}
	


	public Usuario[] getUsers() {
		return users;
	}
	
	public void ApresentarUsuarios() {
		if(getNumUsuarios()>1) {
			  for (int i = 1; i < getNumUsuarios(); i++) {
			       
		            System.out.println(users[i].getUsuario());
		        }
		}else {
			System.out.println("Não há usuarios a serem apresentados");
		}
	  
	        
	    }
	
	public void removerUsuario() {
		if(getNumUsuarios()>1) {
			int choice;
			int apagou=0;
			
			for(int i = 1;i<getNumUsuarios();i++) {
				System.out.println("Usuario ["+i+"]: "+users[i].getUsuario());
			}
			
			System.out.println("Digite o numero do usuario que deseja deletar: ");
			do {
				
				choice = leitor.nextInt();
				for(int i = 1;i<getNumUsuarios();i++) {
					if(users[choice]!=null) {
						apagou++;
						setNumUsuarios(getNumUsuarios()-1);
						for(int j = 1;j<getNumUsuarios();j++) {
							 users[i] = users[i + 1];
						}
					}
					
				}
				if(apagou==0) {
					System.out.println("Numero digitado incorreto, insira novamente: ");
				}
			}while(apagou==0);
			leitor.nextLine();	
		}else {
			System.out.println("Não há usuarios para serem deletados");
		}
		
	}
	
	
	
}
	
