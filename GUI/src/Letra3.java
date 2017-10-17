import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.DropMode;
import javax.swing.JLabel;

public class Letra3 {

	private JFrame frame;
	private JLabel lblImpresionDeLetras;
	private JLabel lblSeleccioneLaLetra;
	private JTextField txtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Letra3 window = new Letra3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Letra3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Letter Printer");
		frame.setBounds(100, 100, 493, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnA = new JButton("Print Letter A");
		btnA.setBounds(10, 106, 107, 23);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("************###************");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("***********#####***********");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("**********#######**********");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("*********###***###*********");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("********###*****###********");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("*******###*******###*******");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("******###*********###******");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("*****#################*****");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("****###*************###****");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("***###***************###***");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("**###*****************###**");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		frame.getContentPane().add(btnA);
		
		JButton btnNewButton = new JButton("Print Letter  B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("******############*********");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("******###********##********");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("******###*********##*******");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("******###*********##*******");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("******###********##********");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("******#############********");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("******###********##********");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("******###*********##*******");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("******###*********##*******");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("******###********##********");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("******############*********");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {

					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(10, 140, 107, 23);
		frame.getContentPane().add(btnNewButton);
		
		lblImpresionDeLetras = new JLabel("Letters Printer");
		lblImpresionDeLetras.setFont(new Font("Arial", Font.BOLD, 28));
		lblImpresionDeLetras.setBounds(10, 0, 347, 51);
		frame.getContentPane().add(lblImpresionDeLetras);
		
		lblSeleccioneLaLetra = new JLabel("Choose the letter you wish.");
		lblSeleccioneLaLetra.setFont(new Font("Arial", Font.PLAIN, 15));
		lblSeleccioneLaLetra.setBounds(10, 42, 265, 23);
		frame.getContentPane().add(lblSeleccioneLaLetra);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(152, 62, 315, 188);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
	}
}
