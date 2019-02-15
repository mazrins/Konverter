package hr.vsite.java;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.text.LayeredHighlighter;

import java.awt.Insets;
import java.awt.Label;

import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JDesktopPane;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

public class Konverter {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Konverter window = new Konverter();
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
	
	
	public Konverter() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		springLayout.putConstraint(SpringLayout.NORTH, layeredPane, 40, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, layeredPane, 14, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, layeredPane, 225, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, layeredPane, 422, SpringLayout.WEST, frame.getContentPane());
		
		
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel.setBounds(0, 0, 408, 185);
		layeredPane.add(panel);
		springLayout.putConstraint(SpringLayout.NORTH, panel, 40, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 14, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 225, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 422, SpringLayout.WEST, frame.getContentPane());
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblOdaberiteVeliinuZa = new JLabel("Odaberite veli\u010Dinu za konvertiranje");
		lblOdaberiteVeliinuZa.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblOdaberiteVeliinuZa.setAutoscrolls(true);
		lblOdaberiteVeliinuZa.setHorizontalAlignment(SwingConstants.CENTER);
		lblOdaberiteVeliinuZa.setHorizontalTextPosition(SwingConstants.CENTER);
		panel.add(lblOdaberiteVeliinuZa);
		lblOdaberiteVeliinuZa.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JPanel panelBrzina = new JPanel();
		panelBrzina.setBounds(0, 0, 408, 185);
		layeredPane.add(panelBrzina);
		springLayout.putConstraint(SpringLayout.NORTH, panelBrzina, 40, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panelBrzina, 14, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panelBrzina, 225, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panelBrzina, 422, SpringLayout.WEST, frame.getContentPane());
		panelBrzina.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblPretvaranjeKmU = new JLabel("Pretvaranje km u mph.Unesite km/h");
		lblPretvaranjeKmU.setVerticalAlignment(SwingConstants.TOP);
		panelBrzina.add(lblPretvaranjeKmU);
		JPanel panelTemperatura = new JPanel();
		panelTemperatura.setBounds(0, 0, 408, 185);
		layeredPane.add(panelTemperatura);
		springLayout.putConstraint(SpringLayout.NORTH, panelTemperatura, 40, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panelTemperatura, 14, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panelTemperatura, 225, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panelTemperatura, 422, SpringLayout.WEST, frame.getContentPane());
		textField_1 = new JTextField();
		panelBrzina.add(textField_1);
		textField_1.setColumns(10);
		JButton btnNewButton_3 = new JButton("Pretvori");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double metarUKm = Double.parseDouble(textField_1.getText());
				double kilometri = metarUKm*0.62137119;
				String metar = Double.toString(kilometri);
				textField_1.setText(metar);
			}
			
			
		});
		panelBrzina.add(btnNewButton_3);
		JLabel lblPretvaranjeCelzijusaU = new JLabel("Pretvaranje celzijusa u farenhajt.Unesite temperaturu u stupnjevima \u00B0C");
		lblPretvaranjeCelzijusaU.setVerticalAlignment(SwingConstants.TOP);
		panelTemperatura.add(lblPretvaranjeCelzijusaU);
		
		textField = new JTextField();
		panelTemperatura.add(textField);
		textField.setColumns(10);
		
		JButton btnPretvori = new JButton("Pretvori");
		btnPretvori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double tempC = Double.parseDouble(textField.getText());
				double farenhajt = tempC*1.8+32;
				String rezFarenhajt = Double.toString(farenhajt);
				textField.setText(rezFarenhajt);
			}
		});
		panelTemperatura.add(btnPretvori);
		
		JPanel panelDuljina = new JPanel();
		panelDuljina.setBounds(0, 0, 408, 185);
		layeredPane.add(panelDuljina);
		springLayout.putConstraint(SpringLayout.NORTH, panelDuljina, 40, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panelDuljina, 14, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panelDuljina, 225, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panelDuljina, 422, SpringLayout.WEST, frame.getContentPane());
		
		JLabel lblPretvaranjeMetaraU = new JLabel("Pretvaranje metara u kilometre.Unesite metre");
		lblPretvaranjeMetaraU.setVerticalAlignment(SwingConstants.TOP);
		lblPretvaranjeMetaraU.setFocusable(false);
		panelDuljina.add(lblPretvaranjeMetaraU);
		
		textField_2 = new JTextField();
		panelDuljina.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnPretvori_1 = new JButton("Pretvori");
		btnPretvori_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double metar = Double.parseDouble(textField_2.getText());
				double kilometar = metar/1000;
				String rezKilometar = Double.toString(kilometar);
				textField_2.setText(rezKilometar);
			}
		});
		panelDuljina.add(btnPretvori_1);
		
		JButton btnZatvori = new JButton("Zatvori");
		springLayout.putConstraint(SpringLayout.NORTH, btnZatvori, -33, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnZatvori, -99, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnZatvori, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnZatvori, -10, SpringLayout.EAST, frame.getContentPane());
		btnZatvori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnZatvori.setPreferredSize(new Dimension(89, 23));
		frame.getContentPane().add(btnZatvori);
		
		JButton btnNewButton_1 = new JButton("Brzina");
		btnNewButton_1.setAlignmentX(1.0f);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_1, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_1, 91, SpringLayout.WEST, frame.getContentPane());
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			layeredPane.removeAll();
			layeredPane.repaint();
			layeredPane.revalidate();
			layeredPane.add(panelBrzina);
			
			
				
				
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
	
		
		JButton btnNewButton = new JButton("Duljina");
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -10, SpringLayout.EAST, frame.getContentPane());
		btnNewButton.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, 33, SpringLayout.NORTH, frame.getContentPane());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.repaint();
				layeredPane.revalidate();
				layeredPane.add(panelDuljina);
			}
		});
		layeredPane.removeAll();
		layeredPane.add(panel);
		
		JLabel label = new JLabel("Rezultat");
		panel.add(label);
		label.setAlignmentX(Component.RIGHT_ALIGNMENT);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Temperatura");
		springLayout.putConstraint(SpringLayout.NORTH, btnNewButton_2, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton_2, 115, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton_2, -134, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnNewButton, 35, SpringLayout.EAST, btnNewButton_2);
		btnNewButton_2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.repaint();
				layeredPane.revalidate();
				layeredPane.add(panelTemperatura);
				
			}
			
			
		});
		frame.getContentPane().add(btnNewButton_2);
		
	}
}
