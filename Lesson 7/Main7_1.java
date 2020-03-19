package wednesday7_1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main7_1 extends JFrame implements ActionListener {

	public static final int FRAME_WIDTH = 500;
	public static final int FRAME_HEIGHT = 200;
	public static final int FRAME_X_ORIGIN = 250;
	public static final int FRAME_Y_ORIGIN = 250;
	public static final int BUTTON_WIDTH = 80;
	public static final int BUTTON_HEIGHT = 30;

	private static final String SUBMIT_BUTTON = "Submit";

	JButton submitButton;
	JTextField nameTextField, streetTextField, cityTextField, stateTextField, zipTextField;
	JLabel nameLabel, streetLabel, cityLabel, stateLabel, zipLabel;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main7_1 frame = new Main7_1();
		frame.setVisible(true);
		frame.setResizable(false);

	}

	public Main7_1() {
		setTitle("Address Form");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		changeBackgroundColor();
	}

	void changeBackgroundColor() {
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.white);
		addButton(contentPane);
	}

	void addButton(Container contentPane) {
		submitButton = new JButton(SUBMIT_BUTTON);
		submitButton.setBounds(200, 125, BUTTON_WIDTH, BUTTON_HEIGHT);
		contentPane.add(submitButton);
		submitButton.addActionListener(this);
		addNameTextField(contentPane);

		addStreetTextField(contentPane);

		addCityTextField(contentPane);

		addStateTextField(contentPane);

		addZipTextField(contentPane);
	}

	void addNameTextField(Container contentPane) {
		nameLabel = new JLabel("Name");
		nameTextField = new JTextField();
		nameTextField.setBounds(25, 20, 130, 25);

		contentPane.add(nameTextField);

		nameLabel.setBounds(25, -12, 50, 50);
		contentPane.add(nameLabel);
		nameTextField.addActionListener(this);

	}

	void addStreetTextField(Container contentPane) {
		streetLabel = new JLabel("Street");
		streetTextField = new JTextField();
		streetTextField.setBounds(175, 20, 130, 25);
		contentPane.add(streetTextField);

		streetLabel.setBounds(175, -12, 50, 50);
		contentPane.add(streetLabel);
		streetTextField.addActionListener(this);
	}

	void addCityTextField(Container contentPane) {
		cityLabel = new JLabel("City");
		cityTextField = new JTextField();
		cityTextField.setBounds(320, 20, 130, 25);
		contentPane.add(cityTextField);

		cityLabel.setBounds(320, -12, 50, 50);
		contentPane.add(cityLabel);
		cityTextField.addActionListener(this);

	}

	void addStateTextField(Container contentPane) {
		stateLabel = new JLabel("State");
		stateTextField = new JTextField();
		stateTextField.setBounds(25, 70, 130, 25);
		contentPane.add(stateTextField);

		stateLabel.setBounds(25, 35, 50, 50);
		contentPane.add(stateLabel);
		stateTextField.addActionListener(this);

	}

	void addZipTextField(Container contentPane) {
		zipLabel = new JLabel("Zip");
		zipTextField = new JTextField();
		zipTextField.setBounds(175, 70, 130, 25);
		contentPane.add(zipTextField);

		zipLabel.setBounds(175, 35, 50, 50);
		contentPane.add(zipLabel);
		zipTextField.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub

		if (event.getSource() instanceof JButton) {
			JButton clickedButton = (JButton) event.getSource();
			String buttonText = clickedButton.getText();
			if (buttonText.equals(SUBMIT_BUTTON)) {
				dataCalculation();
			}
		} else {
			dataCalculation();

		}

	}

	void dataCalculation() {

		String name = nameTextField.getText().trim();
		if (name.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Name Cannot be Empty");
			return;
		}
		String street = streetTextField.getText().trim();
		if (street.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Street Cannot be Empty");

			return;
		}
		String city = cityTextField.getText().trim();
		if (city.isEmpty()) {
			JOptionPane.showMessageDialog(null, "City Cannot be Empty");

			return;
		}
		String state = stateTextField.getText().trim();
		if (state.isEmpty()) {
			JOptionPane.showMessageDialog(null, "State Cannot be Empty");

			return;
		}
		String zip = zipTextField.getText().trim();
		if (zip.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Zip Cannot be Empty");

			return;
		}
		System.out.println("Name : " + name);
		System.out.println("Street : " + street);
		System.out.println("City : " + city);
		System.out.println("State : " + state);
		System.out.println("Zip : " + zip);

	}
}
