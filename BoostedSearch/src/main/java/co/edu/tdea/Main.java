package co.edu.tdea;
import java.awt.EventQueue;

import co.edu.tdea.logins.Login;

public class Main {
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		}		
			
	}
	


