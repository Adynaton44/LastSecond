
public class Socio {
	
	public String getNascita() {
		return nascita;
	}

	public void setNascita(String nascita) {
		this.nascita = nascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Socio(String nascita, String nome, String cognome, String path) {
		this.nascita = nascita;
		this.nome = nome;
		this.cognome = cognome;
		this.path = path;
	}

	public String nascita,nome,cognome,path;

}
