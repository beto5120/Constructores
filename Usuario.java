import java.io.Serializable;

public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int userId;
	private int edad;
	private char sexo;
	private int tipo;
	private String email;
	private String tel;
	private transient String password;
	
	public Usuario() {
		System.out.println("Llamando a constructor en blanco");
	}
	
	public Usuario(int userID, String email, int userId) {
		this.userId = userId;
		this.email = email;		
	}
	
	public Usuario(String nombre, int userId, int edad, char sexo, int tipo, String email, String tel) {
		System.out.println("Llamado a constructo full");
		this.nombre = nombre;
		this.userId = userId;
		this.edad = edad;
		this.sexo = sexo;
		this.tipo = tipo;
		this.email = email;
		this.tel = tel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
