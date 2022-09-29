import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Programa {

	public static void main(String[] args) {
		final String USUARIO = "RafaelBessa";
		final String SENHA = "123abc";
		
		
		JFrame frame = new JFrame("Rafael Bessa :: Testando Aplicação");   //Criando a tela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Clicar no X fecha a janela.
		
		JPanel panel = new JPanel();      //Agrupa os elemento dentro da janela
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JLabel labelUsuario = new JLabel("Usuário: ");
		JTextField txtUsuario = new JTextField(20);
		txtUsuario.setToolTipText("Informe seu usuário de acesso. ");
		
		JLabel labelSenha = new JLabel("Senha: ");
		JPasswordField txtSenha = new JPasswordField(20);
		txtSenha.setToolTipText("Informe sua senha de acesso. ");
		
		JButton botaoLogin = new JButton("Login");
		
		botaoLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtUsuario.getText().equals(USUARIO) &&
						new String(txtSenha.getPassword()).equals(SENHA)) {
					
					JOptionPane.showMessageDialog(frame, "Acesso autorizado");
				}
				else {
					JOptionPane.showMessageDialog(frame, "Acesso negado");
				}
				
			}
			
		});
			
		panel.add(labelUsuario);
		panel.add(txtUsuario);
		
		panel.add(labelSenha);
		panel.add(txtSenha);
		
		panel.add(botaoLogin);
		
		frame.setContentPane(panel);
		frame.pack();
		frame.setVisible(true);
	
	}

}
