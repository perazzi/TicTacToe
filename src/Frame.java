import java.awt.*; 

import javax.swing.*;

public class Frame extends JFrame{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	Defino a dimensão da minha janela
	public final int LARGURA=360; 
	public final int ALTURA=420;
	public static int[] matriz = new int[9];
	Panel pprincipal;
	MouseListener ml;
	private static int Turno=1;
	
		public Frame(){ //Defino o a posição de inicialização da janela na tela
			Toolkit tk=Toolkit.getDefaultToolkit(); 
			setLayout(new BorderLayout());
			drawNewPanel();
//			getContentPane().add(pprincipal,BorderLayout.CENTER);
			Dimension resolucao=tk.getScreenSize();
			int larguraTela=resolucao.width; 
			int alturaTela=resolucao.height;
			int x=larguraTela/2-LARGURA/2; 
			int y=alturaTela/2-ALTURA/2;
			setBounds(x,y,LARGURA,ALTURA); 
			this.setResizable(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.addMenu();
			this.addStatusBar();
			setVisible(true);
		}
	
		private void addMenu(){  // Adiciona um menu ao Frame
			new Menu(this);
	        return;
		}
	
		public void drawNewPanel(){   // Desenha um novo Painel
			pprincipal = new Panel(ALTURA, LARGURA,matriz);
			getContentPane().add(pprincipal,BorderLayout.CENTER);
			ml= new MouseListener(pprincipal);
			pprincipal.addMouseListener(ml);
			pprincipal.repaint();
//			getContentPane().add(pprincipal,BorderLayout.CENTER);		
			return;
		}
		
		private void addStatusBar(){  // adiciona StatusBar no Frame
			StatusBar statusbar = new StatusBar();
			getContentPane().add(statusbar,BorderLayout.SOUTH);
			return;
		}
		
		public static void addObject(int obj,int pos){  // insere objeto na matriz
			matriz[pos]=obj;
		}
		
		public static int getObject(int pos){ //retorna o objeto da matriz
			return matriz[pos];
		}
		
		public static int getTurno(){  // retorna o jogador da rodada
			return Turno;
		}
		public static void setTurno(int k){  // define o jogador da rodada
			Turno=k;
		}
		
		public void zeraMatriz(){  //Zera matriz quando é solicitado um novo jogo
			for (int i=0;i<9;i++){ 
            	addObject(0, i);
			}
		}
		
		public String varreMatriz(){ // Varre a matriz e transforma em um string para salvá-la em arquivo
			String valores = ""; 
			for (int i=0;i<9;i++)
				valores += Integer.toString(matriz[i]);
				return valores;	
		}
		
		public void fillMatriz(String a){  //Popula a matriz de um jogo resgatado
			for (int i = 0; i < 9; i++) {
			    matriz[i] = Character.digit(a.charAt(i), 9);
					}
		        }
		public void checkSavedTurn(){  // Checa quem é o jogador da vez de um jogo resgatado
			int t=0;
			for (int i=0;i<9;i++)
				if(matriz[i]!=0)
					t++;
			if (t%2==1)
				setTurno(0);
				else
					setTurno(1);
		}
		
		public static String getWinner(){ // Retorna quem é o Vencedor
			int t=0;
			for (int i=0;i<9;i++)
				if(matriz[i]!=0)
					t++;
			if (t%2==1)
				return ("X!");
				else
					return("O!");

		}
		
}
		
		

