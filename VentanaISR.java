import javax.swing.JFrame;

import java.awt.BorderLayout;

public class VentanaISR extends JFrame{
	
	public VentanaISR() {
		super("Calculador de ISR");
		//this.setLocationRelativeTo();
		//this.setPreferredSize(new Dimension(1000,800));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		PanelDibujoISR pd = new PanelDibujoISR(this);
		this.add(pd,BorderLayout.CENTER);
		WastePanel wpA = new WastePanel(1000,200);
		this.add(wpA,BorderLayout.NORTH);
		WastePanel wpB = new WastePanel(1000,200);
		this.add(wpB,BorderLayout.SOUTH);
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String []args){
		VentanaISR window = new VentanaISR();
		
	}
	
}
