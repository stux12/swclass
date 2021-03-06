package Day11_20;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JFrame;

class FileGUI2 extends JFrame implements ActionListener {

	private Button b2 = new Button("파일READ");
	private Button b3 = new Button("파일SAVE");
	private TextArea ta1 = new TextArea();// multi line row ,col

	public FileGUI2() { // 생성자
		this.setLayout(null);///////////////////

		b2.setSize(100, 70);// 버튼 크기
		b2.setForeground(new Color(255, 255, 255));
		b2.setBackground(new Color(0, 0, 255));
		b2.setFont(new Font("돋움", Font.BOLD, 20));
		b2.setLocation(350, 200); // 버튼 내부위치
		this.add(b2);// 버튼 추가
		b2.addActionListener(this); //////////////////

		b3.setSize(100, 70);// 버튼 크기
		b3.setForeground(new Color(255, 255, 255));
		b3.setBackground(new Color(0, 0, 255));
		b3.setFont(new Font("돋움", Font.BOLD, 20));
		b3.setLocation(350, 300); // 버튼 내부위치
		this.add(b3);// 버튼 추가
		b3.addActionListener(this); //////////////////

		ta1.setSize(300, 340);// 크기
		ta1.setForeground(new Color(0, 0, 255));
		ta1.setBackground(new Color(255, 255, 0));
		ta1.setFont(new Font("돋움", Font.BOLD, 20));
		ta1.setLocation(20, 40); // 내부위치
		this.add(ta1);// 추가

		this.setBackground(new Color(0, 200, 0));
		this.setTitle("나의 멋있는 메모장~~~~~~~ !!!!!!");
		this.setSize(500, 500); // 프레임 크기
		this.setVisible(true);
		addWindowListener(new WindowAdapter() { //////////////////
			public void windowClosing(WindowEvent e1) {
				dispose();
				System.exit(0);
			}
		});
	}// 생성자 -end

	@Override
	public void actionPerformed(ActionEvent e1) {

		if (e1.getSource() == b2) {
			String fileData = "";
			FileDialog fd1 = new FileDialog(this, "파일READ", FileDialog.LOAD);
			fd1.setVisible(true);

			String dirfile1 = fd1.getDirectory() + fd1.getFile();
			try {
				FileReader fr;
				fr = new FileReader(dirfile1);// open
				BufferedReader br = new BufferedReader(fr);
				String s;
				while ((s = br.readLine()) != null) {
					fileData += s + "\n";// 텍스트 에어리어에 넣으려고
				}
				ta1.setText(fileData);// 출력
				br.close();
				fr.close();
			} catch (Exception e) {
				System.out.println("error");
			}

		} else if (e1.getSource() == b3) {
			FileDialog fd2 = new FileDialog(this, "파일SAVE", FileDialog.SAVE);
			fd2.setVisible(true);
			String dirfile2 = fd2.getDirectory() + fd2.getFile();// 저장을 위해 경로명
			// replace 앞의내용을 뒤에걸로 바꿔라
			// 윈도우는 \r\n이고 리눅스는 \n
			// 저장할때만 바꿔주면 됨
			String fileData2 = ta1.getText().replace("\n", "\r\n");

			try {
				FileWriter fw = new FileWriter(dirfile2);
				PrintWriter pw = new PrintWriter(fw);
				pw.println(fileData2);
				pw.close();
				fw.close();
			} catch (Exception e) {
				System.out.println("error");
			}
		}

	}

}

public class FileGUI {

	public static void main(String[] args) {

		new FileGUI2();

	}
}
