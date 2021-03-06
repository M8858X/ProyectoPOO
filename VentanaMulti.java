import java.awt.BorderLayout;

import javax.swing.JFrame;

public class VentanaMulti extends JFrame{
	private boolean visVentanaMult;
	
	public VentanaMulti(VentanaISR frame){
		super("Calculo Multiple");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//frame= new VentanaISR();
		this.visVentanaMult=false;
				
		PanelMulti pm = new PanelMulti(this,frame);
		this.add(pm, BorderLayout.CENTER);
		WastePanel wpA = new WastePanel(900,240);
		this.add(wpA,BorderLayout.NORTH);
		WastePanel wpB = new WastePanel(900,240);
		this.add(wpB,BorderLayout.SOUTH);
		this.setResizable(false);
		
		
		this.pack();
		this.setVisible(this.visVentanaMult);
	}

	public boolean isVisVentanaMult() {
		return this.visVentanaMult;
	}

	public void setVisVentanaMult(boolean visVentanaMult) {
		this.visVentanaMult = visVentanaMult;
	}
	
}

