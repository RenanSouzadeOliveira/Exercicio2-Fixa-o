package Interface;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface extends JFrame{
	JLabel lbltexto = new JLabel("Teorema de Pitagoras");
	JLabel lblformula = new JLabel("c'' = a'' + b''");
	
	JLabel lblA = new JLabel("Cateto a");
	JLabel lblB = new JLabel("Cateto b");
	JLabel lblC = new JLabel("Hipotenusa");
	
	JTextField txtA = new JTextField();
	JTextField txtB = new JTextField();
	JTextField txtC = new JTextField();
	
	JButton btnCalculo = new JButton("Calcular");
	double a, b;
	public Interface (){
		super("Teorema de Pitagoras");
		Calculo calc = new Calculo();
		
		Container paine = this.getContentPane();
		
		paine.add(lblA); // label
		lblA.setBounds(20,60,245,40);
		
		paine.add(txtA);// caixa
		txtA.setBounds(100,70,140,20);
		
		paine.add(lblB);// label
		lblB.setBounds(20,100,245,40);
		
		paine.add(txtB);// caixa
		txtB.setBounds(100,110,140,20);
		
		paine.add(lblC);// label
		lblC.setBounds(20,140,245,40);
		
		paine.add(txtC);// caixa
		txtC.setBounds(100,150,140,20);
		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 a = Double.parseDouble(txtA.getText());
				 b = Double.parseDouble(txtB.getText());
				 txtC.setText("" + calc.pit(a, b));
			 }
		 });
		btnCalculo.setBounds(90,200,90,20);
		
		txtC.setEditable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(300, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		Interface inte = new Interface();
	}
}
