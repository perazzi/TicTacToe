import java.awt.event.*;
public class MouseListener extends MouseAdapter{

	private int x,y;
	Panel p;
	public MouseListener(Panel x){
		p=x;
	}
	
	 public void mouseClicked(MouseEvent e) { //Eventos e a›es do click do Mouse
		 
		 x=e.getX();
		 y=e.getY();
//		 System.out.println(e.getX());
//		 System.out.println(e.getY());
		 if(x>20 && y>20 && x<120 && y<120 && Frame.getObject(0) == 0){
			 if (Frame.getTurno()==1){
			Frame.addObject(1,0);
			 p.repaint();
			 Frame.setTurno(0);
			 StatusBar.atualizaTurno();
			 }
			 else{
				 if (Frame.getTurno()==0){
				Frame.addObject(2,0);
				 p.repaint();
				 Frame.setTurno(1);
				 StatusBar.atualizaTurno();
				 }
			 }
		 }
			 
		 	

		 if(x>122 && y>20 && x<232 && y<120 && Frame.getObject(1) == 0){
			 if (Frame.getTurno()==1){
			Frame.addObject(1,1);
			 p.repaint();
			 Frame.setTurno(0);
			 StatusBar.atualizaTurno();
			 }
			 else{
				 if (Frame.getTurno()==0){
				Frame.addObject(2,1);
				 p.repaint();
				 Frame.setTurno(1);
				 StatusBar.atualizaTurno();
				 }
			 }
		 }
	
		 
		 if(x>232 && y>20 && x<330 && y<120 && Frame.getObject(2) == 0){
			 if (Frame.getTurno()==1){
			Frame.addObject(1,2);
			 p.repaint();
			 Frame.setTurno(0);
			 StatusBar.atualizaTurno();
			 }
			 else{
				 if (Frame.getTurno()==0){
				Frame.addObject(2,2);
				 p.repaint();
				 Frame.setTurno(1);
				 StatusBar.atualizaTurno();
				 }
			 }
		 }
		 
		 if(x>20 && y>120 && x<120 && y<220 && Frame.getObject(3) == 0){
			 if (Frame.getTurno()==1){
			Frame.addObject(1,3);
			 p.repaint();
			 Frame.setTurno(0);
			 StatusBar.atualizaTurno();
			 }
			 else{
				 if (Frame.getTurno()==0){
				Frame.addObject(2,3);
				 p.repaint();
				 Frame.setTurno(1);
				 StatusBar.atualizaTurno();
				 }
			 }
		 }
		 		
		 
		 if(x>122 && y>120 && x<232 && y<220 && Frame.getObject(4) == 0){
			 if (Frame.getTurno()==1){
			Frame.addObject(1,4);
			 p.repaint();
			 Frame.setTurno(0);
			 StatusBar.atualizaTurno();
			 }
			 else{
				 if (Frame.getTurno()==0){
				Frame.addObject(2,4);
				 p.repaint();
				 Frame.setTurno(1);
				 StatusBar.atualizaTurno();
				 }
			 }
		 }
		 
		 if(x>232 && y>120 && x<330 && y<220 && Frame.getObject(5) == 0){
			 if (Frame.getTurno()==1){
			Frame.addObject(1,5);
			 p.repaint();
			 Frame.setTurno(0);
			 StatusBar.atualizaTurno();
			 }
			 else{
				 if (Frame.getTurno()==0){
				Frame.addObject(2,5);
				 p.repaint();
				 Frame.setTurno(1); 
				 StatusBar.atualizaTurno();
				 }
			 }
		 }
		 
		 if(x>20 && y>220 && x<120 && y<320 && Frame.getObject(6) == 0){
			 if (Frame.getTurno()==1){
			Frame.addObject(1,6);
			 p.repaint();
			 Frame.setTurno(0);
			 StatusBar.atualizaTurno();
			 }
			 else{
				 if (Frame.getTurno()==0){
				Frame.addObject(2,6);
				 p.repaint();
				 Frame.setTurno(1);
				 StatusBar.atualizaTurno();
				 }
			 }
		 }
		 
		 if(x>122 && y>220 && x<232 && y<320 && Frame.getObject(7) == 0){
			 if (Frame.getTurno()==1){
			Frame.addObject(1,7);
			 p.repaint();
			 Frame.setTurno(0);
			 StatusBar.atualizaTurno();
			 }
			 else{
				 if (Frame.getTurno()==0){
				Frame.addObject(2,7);
				 p.repaint();
				 Frame.setTurno(1);
				 StatusBar.atualizaTurno();
				 }
			 }
		 }
		 
		 if(x>232 && y>220 && x<330 && y<320 && Frame.getObject(8) == 0){
			 if (Frame.getTurno()==1){
			Frame.addObject(1,8);
			 p.repaint();
			 Frame.setTurno(0);
			 StatusBar.atualizaTurno();
			 }
			 else{
				 if (Frame.getTurno()==0){
				Frame.addObject(2,8);
				 p.repaint();
				 Frame.setTurno(1);
				 StatusBar.atualizaTurno();
				 }
			 }
		 }

		 
	 }
	 
	 
}
