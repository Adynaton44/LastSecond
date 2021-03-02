import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFileChooser;

//if  if(variabile.instanceof(CTennis)){
//scrivere prima di che classe è}
public class Elenco extends ArrayList<Campo>{

	public Elenco() {
		super();
	}

	public void scrivicsv(Finestra f) {
		JFileChooser chooser=new JFileChooser();
		chooser.setFileFilter(new CsvFileFilter());
		int n=chooser.showSaveDialog(f);
		if(n==JFileChooser.APPROVE_OPTION) {
			File file=chooser.getSelectedFile();
			FileWriter fw;
			try {
				fw = new FileWriter(file);
				for(int i=0;i<this.size();i++) {
					if(this.get(i) instanceof CTennis) {
						fw.write("Campo Tennis");//exctera
					}else {
						fw.write("Campo Paddle");//excetera
					}
				}
				fw.flush();
				fw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				}
				
			}
	public void importacsv(Finestra f) {
		JFileChooser chooser=new JFileChooser();
		chooser.setFileFilter(new CsvFileFilter());
		int n=chooser.showOpenDialog(f);
		if(n==JFileChooser.APPROVE_OPTION) {
			try {
				BufferedReader br=new BufferedReader(new FileReader(chooser.getSelectedFile()));
				String line="";
				if((line=br.readLine())!=null) {
					String[] s=line.split(",");
					if(s[1]=="Campo Tennis") {
						this.add(new CTennis(new Socio(s[3],s[4],s[5],s[6]),Integer.parseInt(s[1]),Integer.parseInt(s[2]),s[7]));
					}else {
						this.add(new CPaddle(new Socio(s[3],s[4],s[5],s[6]),Integer.parseInt(s[1]),Integer.parseInt(s[2]),Integer.parseInt(s[7])));
					}
					
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}
}
