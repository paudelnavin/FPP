package wednesday7_2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main7_2 extends JFrame implements ActionListener {

	public static final int FRAME_WIDTH = 500;
	public static final int FRAME_HEIGHT = 200;
	public static final int FRAME_X_ORIGIN = 250;
	public static final int FRAME_Y_ORIGIN = 250;
	public static final int BUTTON_WIDTH = 150;
	public static final int BUTTON_HEIGHT = 30;

	JButton countButton, reverseButton, removeDuplicateButton;
	JTextField inputTextField, outputTextField;

	JLabel inputLabel, outputLabel;
	private static final String COUNT_BUTTON = "Count Letters";
	private static final String REVERSE_BUTTON = "Reverse Letters";
	private static final String REMOVE_DUPLICATE_BUTTON = "Remove Duplicates";

	public static void main(String[] args) {

		Main7_2 frame = new Main7_2();
		frame.setVisible(true);
		frame.setResizable(false);
	}

	public Main7_2() {
		setTitle("String Utility");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		changeBackgroundColor();

	}

	void changeBackgroundColor() {
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.white);
		addCountButton(contentPane);
		addReverseButton(contentPane);
		addRemoveDupliButton(contentPane);
		addInputTextField(contentPane);
		addOutputTextField(contentPane);
	}

	void addCountButton(Container contentPane) {
		countButton = new JButton(COUNT_BUTTON);
		countButton.setBounds(25, 20, BUTTON_WIDTH, BUTTON_HEIGHT);
		contentPane.add(countButton);
		countButton.addActionListener(this);

	}

	void addReverseButton(Container contentPane) {
		reverseButton = new JButton(REVERSE_BUTTON);
		reverseButton.setBounds(25, 60, BUTTON_WIDTH, BUTTON_HEIGHT);
		contentPane.add(reverseButton);
		reverseButton.addActionListener(this);

	}

	void addRemoveDupliButton(Container contentPane) {
		removeDuplicateButton = new JButton(REMOVE_DUPLICATE_BUTTON);
		removeDuplicateButton.setBounds(25, 100, BUTTON_WIDTH, BUTTON_HEIGHT);
		contentPane.add(removeDuplicateButton);
		removeDuplicateButton.addActionListener(this);

	}

	void addInputTextField(Container contentPane) {
		inputLabel = new JLabel("Input");
		inputTextField = new JTextField();
		inputTextField.setBounds(200, 40, 130, 25);

		contentPane.add(inputTextField);

		inputLabel.setBounds(200, 8, 50, 50);
		contentPane.add(inputLabel);
		inputTextField.addActionListener(this);

	}

	void addOutputTextField(Container contentPane) {
		outputLabel = new JLabel("Output");
		outputTextField = new JTextField();
		outputTextField.setBounds(200, 80, 130, 25);

		contentPane.add(outputTextField);

		outputLabel.setBounds(200, 48, 50, 50);
		contentPane.add(outputLabel);
		outputTextField.addActionListener(this);

	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub

		if (event.getSource() instanceof JButton) {

			JButton clickedButton = (JButton) event.getSource();
			String buttonText = clickedButton.getText();
			String input = inputTextField.getText();

			if (buttonText.equals(COUNT_BUTTON)) {

				outputTextField.setText(String.valueOf(input.length()));

			} else if (buttonText.equals(REVERSE_BUTTON)) {

				StringBuffer string = new StringBuffer();
				for (int i = input.length() - 1; i > -1; i--) {
					string.append(input.charAt(i));
				}
				outputTextField.setText(string.toString());

			} else if(buttonText.equals(REMOVE_DUPLICATE_BUTTON)) {
				
				StringBuffer string = new StringBuffer();
				List<String> list = new ArrayList<>();
				
				for (int i = 0; i < input.length(); i++) {
					if (!list.contains(String.valueOf(input.charAt(i)))) {
						list.add(String.valueOf(input.charAt(i)));
						string.append(input.charAt(i));
										}
				}
				outputTextField.setText(string.toString());
			}
		}
	}
}
