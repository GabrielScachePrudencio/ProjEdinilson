//comentario para testar o git
public class Usuario {
	private String Usuario;
	private String Senha;
	private String tipoUsuario;
	public static int NumUsuarios=0;
	
	public Usuario(String Usuario,String Senha,String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
		this.Usuario = Usuario;
		this.Senha=Senha;
		NumUsuarios++;
		
	}
	public String getUsuario() {
		return Usuario;
	}
	public String getSenha() {
		return Senha;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public int getNumUsuarios() {
		return NumUsuarios;
	}
	
	public void setNumUsuarios(int newNum) {
		NumUsuarios = newNum;
	}

	public void CadastrarUsuario() {
	
	}
	public void ApresentarUsuarios() {
		
	}
	public Usuario[] getUsers() {
		return null;
	}
	public void removerUsuario() {
		
	}
}
