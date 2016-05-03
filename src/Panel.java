import javax.swing.*;
import java.awt.*;


public class Panel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Graphics2D g2d;
	public int[] matriz;

	public Panel (int y, int x,int[] m){
		matriz = m;
	    return;
	}
	

public  void desenhaObjeto(int obj, int pos) // Desenha objeto no Canvas
{
	if (obj == 2 && pos == 0){
		g2d.setColor(Color.blue);
		g2d.drawOval(40, 40, 60, 60);   // bola 0,0
	}
		
	else if (obj == 2 && pos == 1){
		g2d.setColor(Color.blue);
		g2d.drawOval(145, 40, 60, 60);  // bola 0,1
	}
		
	else if (obj == 2 && pos == 2){
		g2d.setColor(Color.blue);
		g2d.drawOval(250, 40, 60, 60);  // bola 0,2
	}
	
	else if (obj == 2 && pos == 3){
		g2d.setColor(Color.blue);
		g2d.drawOval(40, 145, 60, 60);  // bola 1,0
	}
	
	
	else if (obj == 2 && pos == 4){
		g2d.setColor(Color.blue);
		g2d.drawOval(145, 145, 60, 60); // bola 1,1

	}
	else if (obj == 2 && pos == 5){
		g2d.setColor(Color.blue);
		g2d.drawOval(250, 145, 60, 60); // bola 1,2
	}
	else if (obj == 2 && pos == 6){
		g2d.setColor(Color.blue);
		g2d.drawOval(40, 250, 60, 60);  // bola 2,0
	}
	else if (obj == 2 && pos == 7){
		g2d.setColor(Color.blue);
		g2d.drawOval(145, 250, 60, 60); // bola 2,1
	}
	else if (obj == 2 && pos == 8) {
		g2d.setColor(Color.blue);
		g2d.drawOval(250, 250, 60, 60); // bola 2,2
	}
	
	else if (obj == 1 && pos == 0){
		g2d.setColor(Color.red);
		g2d.drawLine(40, 40, 100, 100);  // x 0,0
 		g2d.drawLine(100, 40, 40 , 100); 
	}
		
	else if (obj == 1 && pos == 1){
		g2d.setColor(Color.red);
		g2d.drawLine(145, 40, 205, 100);  // x 0,1
		g2d.drawLine(205, 40, 145 , 100);
	}
	
	else if (obj == 1 && pos == 2){
		g2d.setColor(Color.red);
		g2d.drawLine(250, 40, 310, 100);  // x 0,2
		g2d.drawLine(310, 40, 250 , 100);
	}
	
	else if (obj == 1 && pos == 3){
		g2d.setColor(Color.red);
		g2d.drawLine(40, 145, 100, 205);  // x 1,0
 		g2d.drawLine(100, 145, 40 , 205); 
	}

	else if (obj == 1 && pos == 4){
		g2d.setColor(Color.red);
		g2d.drawLine(145, 145, 205, 205);  // x 1,1
		g2d.drawLine(205, 145, 145 , 205);
	}
	
	else if (obj == 1 && pos == 5){
		g2d.setColor(Color.red);
		g2d.drawLine(250, 145, 310, 205);  // x 1,2
		g2d.drawLine(310, 145, 250 , 205);
	}
	
	else if (obj == 1 && pos == 6){
		g2d.setColor(Color.red);
		g2d.drawLine(40, 250, 100, 310);  // x 2,0
 		g2d.drawLine(100, 250, 40 , 310);
	}
	
	else if (obj == 1 && pos == 7){
		g2d.setColor(Color.red);
		g2d.drawLine(145, 250, 205, 310);  // x 2,1
		g2d.drawLine(205, 250, 145 , 310);
	}
	
	else if (obj == 1 && pos == 8){
		g2d.setColor(Color.red);
		g2d.drawLine(250, 250, 310, 310);  // x 2,2
		g2d.drawLine(310, 250, 250 , 310);
	}
}
	
	
	public void checkVitoria(){  // checa se há um vencedor e desenha a reta da vitória
		if(matriz[0] == matriz[1] && matriz[0] == matriz[2] && matriz[2] != 0){
			g2d.setStroke(new BasicStroke(3));
			g2d.setColor(Color.orange);
			g2d.drawLine(20,70,330,70); 
			Frame.setTurno(2);
			StatusBar.atualizaTurno();
			
			
		}
		else if(matriz[3] == matriz[4] && matriz[3] == matriz[5]  && matriz[5] != 0){
			g2d.setStroke(new BasicStroke(3));
			g2d.setColor(Color.orange);
			g2d.drawLine(20,175,330,175);
			Frame.setTurno(2);
			StatusBar.atualizaTurno();
		}
		else if(matriz[6] == matriz[7] && matriz[6] == matriz[8]  && matriz[8] != 0){
			g2d.setStroke(new BasicStroke(3));
			g2d.setColor(Color.orange);
			g2d.drawLine(20,280,330,280);
			Frame.setTurno(2);
			StatusBar.atualizaTurno();
		}
		else if(matriz[0] == matriz[3] && matriz[0] == matriz[6]  && matriz[6] != 0){
			g2d.setStroke(new BasicStroke(3));
			g2d.setColor(Color.orange);
			g2d.drawLine(70,20,70,330);
			Frame.setTurno(2);
			StatusBar.atualizaTurno();
		}
		else if(matriz[1] == matriz[4] && matriz[1] == matriz[7]  && matriz[7] != 0){
			g2d.setStroke(new BasicStroke(3));
			g2d.setColor(Color.orange);
			g2d.drawLine(175,20,175,330);
			Frame.setTurno(2);
			StatusBar.atualizaTurno();
		}
		else if(matriz[2] == matriz[5] && matriz[2] == matriz[8]  && matriz[8] != 0){
			g2d.setStroke(new BasicStroke(3));
			g2d.setColor(Color.orange);
			g2d.drawLine(280,20,280,330);
			Frame.setTurno(2);
			StatusBar.atualizaTurno();
		}
		else if(matriz[0] == matriz[4] && matriz[0] == matriz[8]  && matriz[8] != 0){
			g2d.setStroke(new BasicStroke(3));
			g2d.setColor(Color.orange);
			g2d.drawLine(20,20, 330,330);
			Frame.setTurno(2);
			StatusBar.atualizaTurno();
		}
		else if(matriz[2] == matriz[4] && matriz[2] == matriz[6]  && matriz[6] != 0){
			g2d.setStroke(new BasicStroke(3));
			g2d.setColor(Color.orange);
			g2d.drawLine(330,20,20,330); 
			Frame.setTurno(2);
			StatusBar.atualizaTurno();
		}
		else{    //Caso ninguém Vença..
			int t=0;
			for (int i=0;i<9;i++)
				if(matriz[i]!=0)
					t++;
					if (t==9){
					Frame.setTurno(2);
					StatusBar.setMsg("Draw!");
					g2d.setColor(Color.orange);
					g2d.drawLine(20, 20, 175, 330);
					g2d.drawLine(175, 330,330,20);
					}
				}
		
		}

	public void paintComponent(Graphics g)//Desenha um novo Canvas
	{
		super.paintComponent(g);
		g2d=(Graphics2D) g;  
		g2d.clearRect(0, 0,360 ,420 );  
		g2d.setStroke(new BasicStroke(5));
		g2d.drawLine(120, 20, 120, 320);
		g2d.drawLine(230, 20, 230, 320);
		g2d.drawLine(20, 120, 330, 120);
		g2d.drawLine(20, 230, 330, 230);
		g2d.setColor(Color.blue);
		for(int p=0;p<9;p++)
			desenhaObjeto(matriz[p],p);
		checkVitoria();
	}
	


}
