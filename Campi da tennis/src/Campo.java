//Il programma deve permettere di gestire le prenotazioni dei campi generici (ora e giorno, nome di chi prenota), ok
//dei campi da tennis (con in più il tipo di superficie) e i campi da paddle (con in più il numero di partecipanti).ok
//Ogni socio ha il proprio cognome, nome, data di nascita e fotografia. ok
//Attraverso un menù deve essere possibile caricare da file csv l'elenco delle prenotazioni precedenti 
//e salvare l'elenco delle prenotazioni aggiornati. Sempre da menù sarà possibile inserire un nuovo socio
//e una nuova prenotazione o modificare una prenotazione. 
//Nella finestra principale dovrà essere presente una combobox che permetta di scegliere un campo 
//e visualizzare tutte le prenotazioni di un campo. 
public class Campo {
	public Socio getS() {
		return s;
	}
	public void setS(Socio s) {
		this.s = s;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getGiorno() {
		return giorno;
	}
	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}
	public Campo(Socio s, int data, int giorno) {
		this.s = s;
		this.data = data;
		this.giorno = giorno;
	}
	public Socio s;
	public int data,giorno;

}
