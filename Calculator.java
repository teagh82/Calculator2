import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{
	public Calculator() {
		setTitle("7번 계산기"); // 프레임의 타이틀  달기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 윈도우를 닫으면 프로그램 종료
		GridLayout grid = new GridLayout(6, 4);
		grid.setVgap(3); //격자 사이의 수직 간격을 3픽셀로 설정
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout()); // 컨텐트팬에 BorderLayout 배치관리자 설정
		c.setBackground(Color.WHITE);
		
		//위쪽 패널
        JPanel northP = new JPanel();
        northP.setBackground(Color.LIGHT_GRAY);
		northP.add(new JLabel("수식입력"));
		northP.add(new JTextField(16));
		northP.setLayout(new FlowLayout());
		
		//가운데 패널
		JPanel centerP = new JPanel();
		centerP.setLayout(new GridLayout(4,4,2,2));
		JButton b[] = {new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/")};
		
		for(int i = 0; i < 10; i++)
			centerP.add(new JButton(Integer.toString(i)));
		centerP.add(new JButton("CE"));
		centerP.add(new JButton("계산"));
		
		for(int i = 0; i < b.length; i++) {
			b[i].setBackground(Color.CYAN);
			centerP.add(b[i]);
		}
		
		//아랫쪽 패널
		JPanel southP = new JPanel();
		southP.setLayout(new FlowLayout(FlowLayout.LEFT));
		southP.setBackground(Color.YELLOW);
		southP.add(new JLabel("계산결과"));
		southP.add(new JTextField(16));
		
		
		c.add(northP, BorderLayout.NORTH);
		c.add(centerP, BorderLayout.CENTER);
		c.add(southP, BorderLayout.SOUTH);

		setSize(300, 250);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Calculator();
	}
}
