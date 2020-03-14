import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame{
	public Calculator() {
		setTitle("7�� ����"); // �������� Ÿ��Ʋ  �ޱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ �����츦 ������ ���α׷� ����
		GridLayout grid = new GridLayout(6, 4);
		grid.setVgap(3); //���� ������ ���� ������ 3�ȼ��� ����
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout()); // ����Ʈ�ҿ� BorderLayout ��ġ������ ����
		c.setBackground(Color.WHITE);
		
		//���� �г�
        JPanel northP = new JPanel();
        northP.setBackground(Color.LIGHT_GRAY);
		northP.add(new JLabel("�����Է�"));
		northP.add(new JTextField(16));
		northP.setLayout(new FlowLayout());
		
		//��� �г�
		JPanel centerP = new JPanel();
		centerP.setLayout(new GridLayout(4,4,2,2));
		JButton b[] = {new JButton("+"), new JButton("-"), new JButton("*"), new JButton("/")};
		
		for(int i = 0; i < 10; i++)
			centerP.add(new JButton(Integer.toString(i)));
		centerP.add(new JButton("CE"));
		centerP.add(new JButton("���"));
		
		for(int i = 0; i < b.length; i++) {
			b[i].setBackground(Color.CYAN);
			centerP.add(b[i]);
		}
		
		//�Ʒ��� �г�
		JPanel southP = new JPanel();
		southP.setLayout(new FlowLayout(FlowLayout.LEFT));
		southP.setBackground(Color.YELLOW);
		southP.add(new JLabel("�����"));
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
