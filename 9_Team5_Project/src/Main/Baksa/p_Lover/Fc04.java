package Main.Baksa.p_Lover;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fc04 extends JFrame {

	private JPanel contentPane;

	
	public Fc04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("귀차니즘 만렙 프로긍정러");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("휴먼매직체", Font.BOLD, 45));
		lblNewLabel.setBounds(12, 72, 710, 91);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>#좋은게좋은거 #태생적집콕러 #세미관종<br>" + 
				"<br> 성선설은 나를 보고 나온 말 아닐까? 감정이입 잘하고 선한 성격 덕에 연애에서도 빛과 소금 그 자체인 사람이에요. "
				+ "공감력 200%로 상대방의 특이 취향까지 존중해 주고 맞춰 주며 긍정에너지를 마구마구 전파해요. "
				+ "하지만 가끔은 갈등이나 논쟁이 그저 귀찮아서 좋게좋게 넘어갈 때도 있다는 사실! 거절을 잘 못 해서 부탁도 하소연도 잘 들어주지만, "
				+ "상대의 감정만 받아주다 보면 정작 나에게 소홀해질 때도 있을 거예요. 내 안에 잠재된 세미관종력을 잘 발휘해서 "
				+ "조금 더 내 감정과 생각을 솔직하게 표현해도 좋아요.</html>");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("휴먼매직체", Font.BOLD, 23));
		lblNewLabel_1.setBounds(52, 146, 624, 424);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("나가기");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("휴먼매직체", Font.PLAIN, 30));
		btnNewButton.setBounds(480, 573, 173, 58);
		contentPane.add(btnNewButton);
	}

}
