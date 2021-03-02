import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DialogoTennis extends JDialog implements ActionListener{
	
	public JLabel l1,l2,l3,l4,l5,l6,l7;
	public JTextField t1,t2,t3,t4,t5,t6,t7;
	public JButton b1,b2;
	public CTennis campo;
	
	public DialogoTennis(Finestra f,boolean modal) {
		super(f,modal);
		initC();
		this.setVisible(true);
		this.setSize(1600,600);
	}

	public void initC() {

		l1=new JLabel("Inserire ora");
		l2=new JLabel("inserire giorno");
		l3=new JLabel("Inserire nome");
		l4=new JLabel("Inserire cognome");
		l5=new JLabel("IInserire data di nascita");
		l6=new JLabel("inserire path");
		l7=new JLabel("Inserire tipo di superficie");
		t1=new JTextField(10);
		t2=new JTextField(10);
		t3=new JTextField(10);
		t4=new JTextField(10);
		t5=new JTextField(10);
		t6=new JTextField(10);
		t7=new JTextField(10);
		b1=new JButton("Salva");
		b1.addActionListener(this);
		b2=new JButton("Chiudi");
		b2.addActionListener(this);
		
		this.setLayout(new GridLayout(8,2));
		this.add(l1);this.add(t1);
		this.add(l2);this.add(t2);
		this.add(l3);this.add(t3);
		this.add(l4);this.add(t4);
		this.add(l5);this.add(t5);
		this.add(l6);this.add(t6);
		this.add(l7);this.add(t7);
		this.add(b1);this.add(b2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(b2)) {
			dispose();
		}
		//Socio s, int data, int giorno
		if(e.getSource().equals(b1)) {
			campo=new CTennis(new Socio(t3.getText(),t4.getText(),t5.getText(),t6.getText()),Integer.parseInt(t1.getText()),Integer.parseInt(t2.getText()),t7.getText());
		}
		
	}
	
	public Campo ritornaCampoTennis() {
		return campo;
	}
	
	

}
