import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPasswordField textField_1;
	private JButton btnAcessar, btnEsqueciASenha;
	private Observador observador;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblReciclaBrasil;
	private JLabel lblUsuario;
	private JTextField campoUsuario;
	private JLabel lblSenha;
	private JCheckBox chckbxLembrarMe;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 453);

		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 722, 392);
		panel.add(panel_1);
		panel_1.setLayout(null);

		lblReciclaBrasil = new JLabel("Recicla Brasil");
		lblReciclaBrasil.setBounds(303, 59, 138, 38);
		lblReciclaBrasil.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		panel_1.add(lblReciclaBrasil);

		lblUsuario = new JLabel("Usuário:");
		lblUsuario.setBounds(155, 125, 85, 21);
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_1.add(lblUsuario);

		campoUsuario = new JTextField();
		campoUsuario.setBounds(244, 121, 273, 28);
		campoUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		panel_1.add(campoUsuario);
		campoUsuario.setColumns(10);

		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(155, 181, 68, 21);
		lblSenha.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_1.add(lblSenha);

		textField_1 = new JPasswordField();
		textField_1.setBounds(244, 181, 273, 28);
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		btnAcessar = new JButton("Entrar");
		btnAcessar.setBounds(572, 336, 118, 28);
		btnAcessar.setBackground(new Color(0, 191, 255));
		panel_1.add(btnAcessar);

		btnEsqueciASenha = new JButton("Esqueci a senha");
		btnEsqueciASenha.setBounds(21, 339, 129, 25);
		btnEsqueciASenha.setForeground(Color.BLACK);
		btnEsqueciASenha.setBackground(new Color(255, 153, 51));
		panel_1.add(btnEsqueciASenha);

		chckbxLembrarMe = new JCheckBox("Lembrar - me");
		chckbxLembrarMe.setBounds(527, 124, 97, 23);
		chckbxLembrarMe.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		chckbxLembrarMe.setBackground(Color.WHITE);
		panel_1.add(chckbxLembrarMe);

		/*JLabel iconRecicla = new JLabel("");
		iconRecicla.setIcon(new ImageIcon(
				"C:\\Users\\thain\\Documents\\ProjetoPI\\ReciclaBrasil\\ReciclaBrasil\\view\\ReciclaImagem.png"));
		iconRecicla.setBounds(429, 52, 59, 58);
		panel_1.add(iconRecicla);

		JLabel lblplanoFundo = new JLabel("");
		lblplanoFundo.setIcon(new ImageIcon(
				"green-nature-vector-backgrounds-powerpoint.jpg"));
		lblplanoFundo.setBounds(0, 0, 722, 392);
		panel_1.add(lblplanoFundo);*/
		
		
		setVisible(true);
		
		//observador
		observador = new Observador();
		btnAcessar.addActionListener(observador);
		btnEsqueciASenha.addActionListener(observador);

	}
	
	class Observador implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnAcessar) {
				Home pagInicial = new Home();
				pagInicial.setVisible(true);
				dispose();
			} else  {
				EsqueciSenha esqueciSenha = new EsqueciSenha();
				esqueciSenha.setVisible(true);
				dispose();
			}
		}
	}
}
