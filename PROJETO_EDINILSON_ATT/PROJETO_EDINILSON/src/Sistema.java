import java.util.Scanner;

public class Sistema {
	
	
	public static int logar(Usuario adm) {
		String retorno=null;
		String user,password;
		Scanner leitor = new Scanner(System.in);
		
		int valorTipoAluno = 0;
		int logou = 0;
		
		do {
			System.out.println("------LOGIN------");
			System.out.println("Insira seu Usuario: ");
			user = leitor.nextLine();
			System.out.println("Insira sua senha: ");
			password = leitor.nextLine();
			
		
			if(user.equalsIgnoreCase("admin")&& password.equalsIgnoreCase("admin")) {
				logou++;
	
				System.out.println("Seja bem vindo admin");
				retorno = "admin";
			}else if(adm.getNumUsuarios()>1){
				for(int i = 1;i<adm.getNumUsuarios();i++) {
					if(adm.getUsers()[i].getUsuario().equals(user) && adm.getUsers()[i]
							.getSenha().equals(password)) {
						retorno = adm.getUsers()[i].getTipoUsuario();
						System.out.println("Seja bem vindo, "+adm.getUsers()[i].getTipoUsuario()
								+" "+adm.getUsers()[i].getUsuario());
						logou++;
						break;
					} 
					
				
				}
			}

			if(logou==0) {
				System.out.println("Usuario ou senha incorretos");
			}
		}while(logou==0);
			
			
		
		
		if(retorno!=null && retorno.equalsIgnoreCase("professor") ) {
			valorTipoAluno = 1;
		}
		else if(retorno!=null && retorno.equalsIgnoreCase("aluno")) {
			valorTipoAluno = 2;
		}
		else if(retorno!=null && retorno.equalsIgnoreCase("admin")) {
			valorTipoAluno = 3;
		}

		return valorTipoAluno;
		
		

		
	}
}
