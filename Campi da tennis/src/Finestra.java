import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Finestra extends JFrame implements ActionListener{
	
	
	public JMenuBar barra;
	public JMenu menu,visualizza,aggiungi;
	public JMenuItem salva,importa,paddle,tennis,paddle2,tennis2;
	public DialogoPaddle dialoghino;
	public DialogoTennis dialogone;
	public Elenco elenco;
	public JTable table;
	public DefaultTableModel dtm;
	public JScrollPane jsp;
	
	
	public Finestra() {
		initComp();
	}
	
	public void initComp() {
		barra=new JMenuBar();
		menu=new JMenu("Gestione");
		salva=new JMenuItem("Salva dati csv");
		salva.addActionListener(this);
		importa=new JMenuItem("Importa dati csv");
		importa.addActionListener(this);
		aggiungi=new JMenu("Aggiungi prenotazione");
		paddle=new JMenuItem("Campo di paddle");
		paddle.addActionListener(this);
		tennis=new JMenuItem("campo di tennis");
		tennis.addActionListener(this);
		aggiungi.add(tennis);
		aggiungi.add(paddle);
		visualizza=new JMenu("Visualizza Campo");
		paddle2=new JMenuItem("Campo di paddle");
		paddle2.addActionListener(this);
		tennis2=new JMenuItem("campo di tennis");
		tennis2.addActionListener(this);
		visualizza.add(tennis2);
		visualizza.add(paddle2);
		menu.add(salva);
		menu.add(importa);
		menu.add(aggiungi);
		menu.add(visualizza);
		barra.add(menu);
		Object[][] data = {};
		String[] columnNames = {"Orario", "Giorno", "Nome"};
		dtm=new DefaultTableModel(data, columnNames);
		table = new JTable(dtm);
		jsp=new JScrollPane(table);
		
		this.setJMenuBar(barra);
		this.add(jsp);
		elenco=new Elenco();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean bol=true;
	
		if(e.getSource().equals(paddle)) {
			dialoghino=new DialogoPaddle(this,true);
			elenco.add(dialoghino.ritornaCampoPaddle());
		}
		
		if(e.getSource().equals(tennis)) {
			dialogone=new DialogoTennis(this,bol);
			System.out.print("weuvu");
			elenco.add(dialogone.ritornaCampoTennis());
		}
		
		if(e.getSource().equals(salva)) {
			elenco.scrivicsv(this);
		}
		if(e.getSource().equals(importa)) {
			elenco.importacsv(this);
		}
		if(e.getSource().equals(tennis2)) {
			dtm.setRowCount(0);
			for(int i=0;i<elenco.size();i++) {
				if(elenco.get(i) instanceof CTennis){
					Object dt[] = {elenco.get(i).getData(),elenco.get(i).getGiorno(),elenco.get(i).getS().getNome()};
					dtm.addRow(dt);
				}
			}
		}
		
		if(e.getSource().equals(paddle2)) {
			dtm.setRowCount(0);
			for(int i=0;i<elenco.size();i++) {
				if(elenco.get(i) instanceof CPaddle){
					Object dt[] = {elenco.get(i).getData(),elenco.get(i).getGiorno(),elenco.get(i).getS().getNome()};
					dtm.addRow(dt);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Finestra f=new Finestra();
		f.setSize(800,800);
		f.setVisible(true);
	}
	
	

}
