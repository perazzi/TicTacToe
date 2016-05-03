import javax.swing.*;


public class StatusBar extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JLabel msg;
	
	public StatusBar(){
		this.setBorder(BorderFactory.createEtchedBorder());
		msg = new JLabel("Welcome to Tic-tac-toe! Now playing: X");
		add(msg);
		return;
	}
	
	public static void atualizaTurno(){  // Atualiza o status de quem � a jogada
		if (Frame.getTurno()==1){
			setMsg("Now playing: X");
			return;
		}
			else if (Frame.getTurno()==0){
				setMsg("Now playing: O");
				return;
			}
				else{
				msg.setText("The End! Winner: "+Frame.getWinner());
				return;
			}
	}
	public static void setMsg(String s){  // Define qual mensagem ser� mostrada
		msg.setText(s);
		return;
	}
	

		
				
	}

	

