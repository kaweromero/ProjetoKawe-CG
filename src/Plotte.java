
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;

public class Plotte extends JFrame {

	private JPanel framePrincipal;
	private JTextField textFieldX1;
	private JTextField textFieldY1;
	private JTextField textFieldX2;
	private JTextField textFieldY2;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Plotte frame = new Plotte();
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Plotte() {
		
		super("Super editor by @kawe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		framePrincipal = new JPanel();
		framePrincipal.setBackground(Color.LIGHT_GRAY);
		framePrincipal.setForeground(Color.WHITE);
		setContentPane(framePrincipal);
		framePrincipal.setLayout(null);
		

		//JPanel painel1 = new JPanel();
		//painel1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		PainelDoBuffer painel1 = new PainelDoBuffer();
		
		//painel1.setY(25);
		//painel1.setX(25);
		painel1.setLocation(25, 25); //(23, 23, 550, 550);
		framePrincipal.add(painel1);
			
		
		JLabel label1 = new JLabel("0");
		label1.setBounds(666, 34, 72, 43);
		framePrincipal.add(label1);
		
		JLabel label2 = new JLabel("0");
		label2.setBounds(666, 88, 72, 49);
		framePrincipal.add(label2);
		
		JLabel label3 = new JLabel("0");
		label3.setBounds(666, 148, 72, 49);
		framePrincipal.add(label3);
		
		JLabel label4 = new JLabel("0");
		label4.setBounds(666, 208, 72, 49);
		framePrincipal.add(label4);
		
		textFieldX1 = new JTextField();
		textFieldX1.setBounds(625, 388, 72, 20);
		framePrincipal.add(textFieldX1);
		textFieldX1.setColumns(10);
		
		textFieldY1 = new JTextField();
		textFieldY1.setBounds(625, 419, 72, 20);
		framePrincipal.add(textFieldY1);
		textFieldY1.setColumns(10);
		
		JLabel labelX = new JLabel("");
		labelX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelX.setBounds(68, 534, 34, 28);
		framePrincipal.add(labelX);
		
		JLabel labelDoXY = new JLabel("X,Y:");
		labelDoXY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelDoXY.setBounds(33, 534, 25, 28);
		framePrincipal.add(labelDoXY);
		
		JLabel labelY = new JLabel("");
		labelY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		labelY.setBounds(100, 534, 34, 28);
		framePrincipal.add(labelY);
		
		
		JLabel lblNewLabel = new JLabel("X1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(595, 391, 25, 14);
		framePrincipal.add(lblNewLabel);
		
		JLabel lblY = new JLabel("Y1:");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblY.setBounds(595, 422, 25, 14);
		framePrincipal.add(lblY);
		
		JLabel lblNewLabel_1 = new JLabel("NDCX:");
		lblNewLabel_1.setBounds(595, 48, 46, 14);
		framePrincipal.add(lblNewLabel_1);
		
		JLabel lblNdcy = new JLabel("NDCY:");
		lblNdcy.setBounds(595, 105, 46, 14);
		framePrincipal.add(lblNdcy);
		
		JLabel lblDcy = new JLabel("DCX:");
		lblDcy.setBounds(595, 165, 46, 14);
		framePrincipal.add(lblDcy);
		
		JLabel lblDcy_1 = new JLabel("DCY:");
		lblDcy_1.setBounds(595, 225, 46, 14);
		framePrincipal.add(lblDcy_1);
		
		JLabel lblX = new JLabel("X2:");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblX.setBounds(720, 391, 25, 14);
		framePrincipal.add(lblX);
		
		JLabel lblY_1 = new JLabel("Y2:");
		lblY_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblY_1.setBounds(720, 422, 25, 14);
		framePrincipal.add(lblY_1);
		
		textFieldX2 = new JTextField();
		textFieldX2.setColumns(10);
		textFieldX2.setBounds(750, 388, 72, 20);
		framePrincipal.add(textFieldX2);
		
		textFieldY2 = new JTextField();
		textFieldY2.setColumns(10);
		textFieldY2.setBounds(750, 419, 72, 20);
		framePrincipal.add(textFieldY2);
		
		
		JButton botaoPlotarPixel = new JButton("Plotar");
		botaoPlotarPixel.setBounds(595, 465, 89, 23);
		framePrincipal.add(botaoPlotarPixel);
		
		JButton btnLimparTela = new JButton("Limpar");
		btnLimparTela.setBounds(595, 499, 89, 23);
		framePrincipal.add(btnLimparTela);
		
		JButton botaoPlotarReta = new JButton("Reta");
		botaoPlotarReta.setBounds(703, 465, 89, 23);
		framePrincipal.add(botaoPlotarReta);
		
		JRadioButton botaoMouse = new JRadioButton("Mouse",false);
		botaoMouse.setBounds(107, 0, 109, 23);
		framePrincipal.add(botaoMouse);
		
		
		
		
		//evento para colocar todos os pixeis brancos
		btnLimparTela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
				//add(new Painel1());
				painel1.limparTela();
				textFieldX1.setText("");
				textFieldY1.setText("");
				textFieldX2.setText("");
				textFieldY2.setText("");
				
				label1.setText("");
				label2.setText("");
				label3.setText("");
				label4.setText("");
					
			}
		});
			
		//Evento para plotar o pixel nas coordenadas
		
		botaoPlotarPixel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				painel1.setXX(Integer.parseInt(textFieldX1.getText()));
				painel1.setYY(Integer.parseInt(textFieldY1.getText()));
				painel1.plotarPixel();
				
			}
		});
			
		
		//Evento para plotar reta
		
		botaoPlotarReta.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
			
			
				painel1.plotarRetaDDA(Integer.parseInt(textFieldX1.getText()), Integer.parseInt(textFieldY1.getText()), Integer.parseInt(textFieldX2.getText()), Integer.parseInt(textFieldY2.getText()));
				painel1.repaint();
				
			}
			
			
		});
		
		
		//Evento quando o mouse move, para pegar as coordenadas
		
		painel1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent arg0) {
				
				int x = arg0.getX()-275;
				int y = 250-arg0.getY();
				
				//coordeX = x;
				//coordeY = y;
				labelX.setText(Integer.toString(x));
				labelY.setText(Integer.toString(y));
				
				//label1.set
				DecimalFormat oi = new DecimalFormat("0.000000");
				//oi.format(user_to_NDCX(x));
				
				label1.setText(	oi.format(user_to_NDCX(x)));
				label2.setText( oi.format(user_to_NDCY(y)));
				
				label3.setText( Integer.toString((NDC_TO_DCX(user_to_NDCX(x)))));
				label4.setText( Integer.toString((NDC_TO_DCY(user_to_NDCY(y)))));
						
				//System.out.printf("%.6f%n",user_to_NDCX(x));
				//System.out.printf("%.6f%n",user_to_NDCY(y));
				
				//System.out.println(x+" "+ y);
			}
			
		});	
		
		//Plota quando clica
		
		botaoMouse.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				
				//De plotar pixel
					painel1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
					
							if(botaoMouse.isSelected()==true){
								
								int x = arg0.getX();
								int y = arg0.getY();
					
								painel1.setXX(x);
								painel1.setYY(y);
								painel1.plotarPixel();
								
								
							}	

						}
						
					});	
			
			}
		});
		
		
	}
	
	
	
	public double user_to_NDCX (double x){
		
		double result = (x-0) / (550-0);
		
		//System.out.printf("%.6f%n",result);	
		return result;	
	}
	
	public double user_to_NDCY (double y){
		
		
		return (y-0) / (500-0);	
	}
	
	public int NDC_TO_DCX(double NDCX){
		
		return 	(int) Math.round(NDCX*549);	
	}
	
	public int NDC_TO_DCY(double NDCY){
		
		return (int) Math.round(NDCY*499);	
	}
	
	
}
