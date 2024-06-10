package views;

 import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import presentations.PaineisPresentation;

 
  
public class Tela extends JFrame{
	public static int x=500;
	public static int y=350;
 
	PainelDireito painelDireito=new PainelDireito();
 	PainelEsquerdo painelEsquerdo= new PainelEsquerdo();
	PaineisPresentation painelPresentation=new PaineisPresentation(painelEsquerdo,painelDireito);
 	 
public Tela(){
 	painelEsquerdo.setPainelPresentation(painelPresentation);
 	painelDireito.setPainelPresentation(painelPresentation);
 	painelEsquerdo.inicializar();
 	painelDireito.inicializar();
 	setTitle("Lista de itens");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(new GridBagLayout());
  	setPreferredSize(new Dimension(x,y));
	GridBagConstraints constrains=new GridBagConstraints();
	constrains.weightx=1.5;
	constrains.weighty=1;
	constrains.anchor=GridBagConstraints.CENTER;
	constrains.fill=GridBagConstraints.BOTH;
  	setLocationRelativeTo(null);
 	add(painelEsquerdo  ,constrains);
	constrains.weightx=1;
	constrains.weighty=1;
	add(painelDireito,constrains);
	pack();
 	setVisible(true);
	 
}
}
