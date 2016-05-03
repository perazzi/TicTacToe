import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;

public class Menu extends JMenuBar {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Frame fr;
	
	public Menu(Frame f){
		fr = f;
		fr.setJMenuBar(this);
		JMenu arquivo = new JMenu("File"); 
		JMenuItem novo = new JMenuItem("New Game");
		JMenuItem abrir = new JMenuItem("Open");
		JMenuItem salvar = new JMenuItem("Save");
		JMenuItem sair = new JMenuItem("Exit");
		add(arquivo);
		arquivo.add(novo);
		arquivo.add(abrir);
		arquivo.add(salvar);
		arquivo.add(sair);
		novo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            fr.zeraMatriz();
            Frame.setTurno(1);
            StatusBar.setMsg("Welcome to the Tic-tac-toe! Now playing: X");
            fr.repaint();
            
            }
        });      

		
		sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	System.exit(0);
            }
        });   
		
		
		salvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	saveFile(fr);
            }
        });
		
		abrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	openFile(fr);
            }
        });
		
	}
	
	
	private void openFile(Frame fr) {  // Abre arquivo
	      JFileChooser jfc = new JFileChooser();
	      int result = jfc.showOpenDialog(this);
	      if(result == JFileChooser.CANCEL_OPTION) return;
	      try {
	         File file = jfc.getSelectedFile();
	         BufferedReader br = new BufferedReader(new FileReader(file));
	         String s=""; int c=0;
	         while((c=br.read())!=-1) s+=(char)c;
	         br.close();
	         fr.fillMatriz(s);
	         fr.checkSavedTurn();
	         StatusBar.atualizaTurno();
	         fr.repaint();
	      } catch (Exception e) {
	         JOptionPane.showMessageDialog(this,e.getMessage(),
	         "File Error",JOptionPane.ERROR_MESSAGE);}
	   }
	
	
	
	
	
	private void saveFile(Frame fr) {  //Salva arquivo
	      JFileChooser jfc = new JFileChooser();
	      int result = jfc.showSaveDialog(this);
	      if(result == JFileChooser.CANCEL_OPTION) return;
	      File file = jfc.getSelectedFile();
	      try {
	         BufferedWriter bw = new BufferedWriter(new FileWriter(file));
	         bw.write(fr.varreMatriz());
	         bw.close();
	      }
	      catch (Exception e) {
	         JOptionPane.showMessageDialog(
	            this,
	            e.getMessage(),
	            "File Error",
	            JOptionPane.ERROR_MESSAGE
	         );
	      }
	   }
	
}
