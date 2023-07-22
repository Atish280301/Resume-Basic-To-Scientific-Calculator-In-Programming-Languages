import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdvanceCalculatorInJava {

	private JFrame frmAdvanceCalculator;
	public long First, Result;
	public double firstnumber, secondnumber, result;
	public String answer, operation;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdvanceCalculatorInJava window = new AdvanceCalculatorInJava();
					window.frmAdvanceCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public AdvanceCalculatorInJava() {
		initialize();
	}
	private void initialize() {
		frmAdvanceCalculator = new JFrame();
		frmAdvanceCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Atish kumar sahu\\eclipse-workspace\\Resume_Advance_Calculator_In_Java\\src\\calculator_23810.png"));
		frmAdvanceCalculator.getContentPane().setBackground(new Color(240, 255, 255));
		frmAdvanceCalculator.setResizable(false);
		frmAdvanceCalculator.setTitle("Advance Calculator Atish Kumar Sahu");
		frmAdvanceCalculator.setBounds(100, 100, 615, 460);
		frmAdvanceCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdvanceCalculator.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Tahoma", Font.BOLD, 25));
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(new Color(0, 0, 0));
		textArea.setBounds(20, 20, 558, 100);
		frmAdvanceCalculator.getContentPane().add(textArea);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no1 = textArea.getText() + btn1.getText();
				textArea.setText(no1);
			}
		});
		btn1.setBackground(new Color(255, 255, 255));
		btn1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn1.setBounds(20, 319, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no2 = textArea.getText() + btn2.getText();
				textArea.setText(no2);
			}
		});
		btn2.setBackground(new Color(255, 255, 255));
		btn2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn2.setBounds(112, 319, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no3 = textArea.getText() + btn3.getText();
				textArea.setText(no3);
			}
		});
		btn3.setBackground(new Color(255, 255, 255));
		btn3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn3.setBounds(204, 319, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no4 = textArea.getText() + btn4.getText();
				textArea.setText(no4);
			}
		});
		btn4.setBackground(new Color(255, 255, 255));
		btn4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn4.setBounds(20, 276, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no5 = textArea.getText() + btn5.getText();
				textArea.setText(no5);
			}
		});
		btn5.setBackground(new Color(255, 255, 255));
		btn5.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn5.setBounds(112, 276, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no6 = textArea.getText() + btn6.getText();
				textArea.setText(no6);
			}
		});
		btn6.setBackground(new Color(255, 255, 255));
		btn6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn6.setBounds(204, 276, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String no7 = textArea.getText() + btn7.getText();
				textArea.setText(no7);
			}
		});
		btn7.setBackground(new Color(255, 255, 255));
		btn7.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn7.setBounds(20, 233, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no8 = textArea.getText() + btn8.getText();
				textArea.setText(no8);
			}
		});
		btn8.setBackground(new Color(255, 255, 255));
		btn8.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn8.setBounds(112, 233, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no9 = textArea.getText() + btn9.getText();
				textArea.setText(no9);
			}
		});
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn9.setBounds(204, 233, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no0 = textArea.getText() + btn0.getText();
				textArea.setText(no0);
			}
		});
		btn0.setBackground(new Color(255, 255, 255));
		btn0.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn0.setBounds(20, 362, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btn0);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nob = textArea.getText() + btn00.getText();
				textArea.setText(nob);
			}
		});
		btn00.setForeground(new Color(165, 42, 42));
		btn00.setBackground(new Color(255, 255, 255));
		btn00.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btn00.setBounds(112, 362, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btn00);
		
		JButton btndt = new JButton(".");
		btndt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nodt = textArea.getText() + btndt.getText();
				textArea.setText(nodt);
			}
		});
		btndt.setForeground(new Color(70, 130, 180));
		btndt.setBackground(new Color(255, 255, 255));
		btndt.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btndt.setBounds(204, 362, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btndt);
		
		JButton btndel = new JButton("DEL");
		btndel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String X = null ;
				if(textArea.getText().length() > 0)
				{
					StringBuilder STR = new StringBuilder(textArea.getText());
					STR.deleteCharAt(textArea.getText().length()-1);
					X = STR.toString();
					textArea.setText(X);
				}
			}
		});
		btndel.setForeground(new Color(220, 20, 60));
		btndel.setBackground(new Color(255, 255, 255));
		btndel.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btndel.setBounds(314, 233, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btndel);
		
		JButton btnac = new JButton("AC");
		btnac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);;
			}
		});
		btnac.setForeground(new Color(220, 20, 60));
		btnac.setBackground(new Color(255, 255, 255));
		btnac.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnac.setBounds(406, 233, 80, 30);
		frmAdvanceCalculator.getContentPane().add(btnac);
		
		JButton ADD = new JButton("+");
		ADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "+";
			}
		});
		ADD.setForeground(new Color(0, 0, 205));
		ADD.setBackground(new Color(255, 255, 255));
		ADD.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		ADD.setBounds(314, 319, 80, 30);
		frmAdvanceCalculator.getContentPane().add(ADD);
		
		JButton SUB = new JButton("-");
		SUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "-";
			}
		});
		SUB.setForeground(new Color(199, 21, 133));
		SUB.setBackground(new Color(255, 255, 255));
		SUB.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		SUB.setBounds(406, 319, 80, 30);
		frmAdvanceCalculator.getContentPane().add(SUB);
		
		JButton MUL = new JButton("*");
		MUL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "*";
			}
		});
		MUL.setForeground(new Color(0, 128, 128));
		MUL.setBackground(new Color(255, 255, 255));
		MUL.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		MUL.setBounds(314, 276, 80, 30);
		frmAdvanceCalculator.getContentPane().add(MUL);
		
		JButton DIV = new JButton("/");
		DIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "/";
			}
		});
		DIV.setForeground(new Color(210, 105, 30));
		DIV.setBackground(new Color(255, 255, 255));
		DIV.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		DIV.setBounds(406, 276, 80, 30);
		frmAdvanceCalculator.getContentPane().add(DIV);
		
		JButton MOD = new JButton("mod");
		MOD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "mod";
			}
		});
		MOD.setForeground(new Color(60, 179, 113));
		MOD.setBackground(new Color(255, 255, 255));
		MOD.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		MOD.setBounds(498, 233, 80, 30);
		frmAdvanceCalculator.getContentPane().add(MOD);
		
		JButton PWR = new JButton("^");
		PWR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "^";
			}
		});
		PWR.setForeground(new Color(255, 0, 0));
		PWR.setBackground(new Color(255, 255, 255));
		PWR.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		PWR.setBounds(498, 276, 80, 30);
		frmAdvanceCalculator.getContentPane().add(PWR);
		
		JButton ROOT = new JButton("\u221A");
		ROOT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "\u221A";
			}
		});
		ROOT.setForeground(new Color(46, 139, 87));
		ROOT.setBackground(new Color(255, 255, 255));
		ROOT.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		ROOT.setBounds(498, 319, 80, 30);
		frmAdvanceCalculator.getContentPane().add(ROOT);
		
		JButton percentage = new JButton("%");
		percentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "%";
			}
		});
		percentage.setForeground(new Color(25, 25, 112));
		percentage.setBackground(new Color(255, 255, 255));
		percentage.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		percentage.setBounds(498, 362, 80, 30);
		frmAdvanceCalculator.getContentPane().add(percentage);
		
		JButton FACT = new JButton("!");
		FACT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First = Long.parseLong(textArea.getText());
				textArea.setText("");
				operation = "!";
			}
		});
		FACT.setForeground(new Color(0, 0, 255));
		FACT.setBackground(new Color(255, 255, 255));
		FACT.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		FACT.setBounds(20, 190, 80, 30);
		frmAdvanceCalculator.getContentPane().add(FACT);
		
		JButton NCR = new JButton("nCr");
		NCR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "nCr";
			}
		});
		NCR.setForeground(new Color(255, 69, 0));
		NCR.setBackground(new Color(255, 255, 255));
		NCR.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		NCR.setBounds(112, 190, 80, 30);
		frmAdvanceCalculator.getContentPane().add(NCR);
		
		JButton NPR = new JButton("nPr");
		NPR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "nPr";
			}
		});
		NPR.setForeground(new Color(139, 69, 19));
		NPR.setBackground(new Color(255, 255, 255));
		NPR.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		NPR.setBounds(204, 190, 80, 30);
		frmAdvanceCalculator.getContentPane().add(NPR);
		
		JButton LOG = new JButton("log");
		LOG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "log";
			}
		});
		LOG.setForeground(new Color(205, 133, 63));
		LOG.setBackground(new Color(255, 255, 255));
		LOG.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		LOG.setBounds(314, 190, 80, 30);
		frmAdvanceCalculator.getContentPane().add(LOG);
		
		JButton LN = new JButton("ln");
		LN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "ln";
			}
		});
		LN.setForeground(new Color(205, 92, 92));
		LN.setBackground(new Color(255, 255, 255));
		LN.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		LN.setBounds(406, 190, 80, 30);
		frmAdvanceCalculator.getContentPane().add(LN);
		
		JButton SIN = new JButton("sin");
		SIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				operation = "sin";
			}
		});
		SIN.setForeground(new Color(255, 0, 0));
		SIN.setBackground(new Color(255, 255, 255));
		SIN.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		SIN.setBounds(20, 147, 80, 30);
		frmAdvanceCalculator.getContentPane().add(SIN);
		
		JButton COS = new JButton("cos");
		COS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				operation = "cos";
			}
		});
		COS.setForeground(new Color(0, 0, 255));
		COS.setBackground(new Color(255, 255, 255));
		COS.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		COS.setBounds(112, 147, 80, 30);
		frmAdvanceCalculator.getContentPane().add(COS);
		
		JButton TAN = new JButton("tan");
		TAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				operation = "tan";
			}
		});
		TAN.setForeground(new Color(0, 128, 128));
		TAN.setBackground(new Color(255, 255, 255));
		TAN.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		TAN.setBounds(204, 147, 80, 30);
		frmAdvanceCalculator.getContentPane().add(TAN);
		
		JButton COT = new JButton("cot");
		COT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				operation = "cot";
			}
		});
		COT.setForeground(new Color(199, 21, 133));
		COT.setBackground(new Color(255, 255, 255));
		COT.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		COT.setBounds(314, 147, 80, 30);
		frmAdvanceCalculator.getContentPane().add(COT);
		
		JButton SEC = new JButton("sec");
		SEC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				operation = "sec";
			}
		});
		SEC.setForeground(new Color(50, 205, 50));
		SEC.setBackground(new Color(255, 255, 255));
		SEC.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		SEC.setBounds(406, 147, 80, 30);
		frmAdvanceCalculator.getContentPane().add(SEC);
		
		JButton COSEC = new JButton("cosec");
		COSEC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				operation = "cosec";
			}
		});
		COSEC.setForeground(new Color(0, 128, 128));
		COSEC.setBackground(new Color(255, 255, 255));
		COSEC.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		COSEC.setBounds(498, 147, 80, 30);
		frmAdvanceCalculator.getContentPane().add(COSEC);
		
		JButton INV = new JButton("1/x");
		INV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				operation = "1/num";
			}
		});
		INV.setForeground(new Color(255, 0, 255));
		INV.setBackground(new Color(255, 255, 255));
		INV.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		INV.setBounds(498, 190, 80, 30);
		frmAdvanceCalculator.getContentPane().add(INV);
		
		JButton EXP = new JButton("EXP");
		EXP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnumber = Double.parseDouble(textArea.getText());
				textArea.setText("");
				operation = "EXP";
			}
		});
		EXP.setForeground(new Color(148, 0, 211));
		EXP.setBackground(new Color(255, 255, 255));
		EXP.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		EXP.setBounds(314, 362, 80, 30);
		frmAdvanceCalculator.getContentPane().add(EXP);
		
		JButton equal = new JButton("=");
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(operation == "%")
				{
					result = firstnumber/100;
					answer = String.format("%.4f",result);
					textArea.setText(answer);
				}
				if(operation == "!")
				{
					long count = 1;

					for(long i = 1; i <= First; i++)
					{
						count = count * i;
					}
					Result = count;
					answer = String.format("%d",Result);
					textArea.setText(answer);
				}
				if(operation == "ln")
				{
					firstnumber = Double.parseDouble(textArea.getText());
					result = Math.log(firstnumber);
					answer = String.format("%.4f",result);
					textArea.setText(answer);
				}
				if(operation == "sin")
				{
					firstnumber = Double.parseDouble(textArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = Math.sin(radian);
					answer = String.format("%.8f",result);
					textArea.setText(answer);
				}
				if(operation == "cos")
				{
					firstnumber = Double.parseDouble(textArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = Math.cos(radian);
					answer = String.format("%.8f",result);
					textArea.setText(answer);
				}
				if(operation == "tan")
				{
					firstnumber = Double.parseDouble(textArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = Math.tan(radian);
					answer = String.format("%.8f", result);
					textArea.setText(answer);
				}
				if(operation == "cot")
				{
					firstnumber = Double.parseDouble(textArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = 1 / Math.tan(radian);
					answer = String.format("%.8f",result);
					textArea.setText(answer);
				}
				if(operation == "sec")
				{
					firstnumber = Double.parseDouble(textArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = 1 / Math.cos(radian);
					answer = String.format("%.8f",result);
					textArea.setText(answer);
				}
				if(operation == "csc")
				{
					firstnumber = Double.parseDouble(textArea.getText());
					double radian = Math.toRadians(firstnumber);
					result = 1 / Math.sin(radian);
					answer = String.format("%.8f",result);
					textArea.setText(answer);
				}
				if(operation == "1/num")
				{
					firstnumber = Double.parseDouble(textArea.getText());
					result = 1 / firstnumber;
					answer = String.format("%.8f",result);
					textArea.setText(answer);
				}
				secondnumber = Double.parseDouble(textArea.getText());
				if(operation == "+")
				{	result = firstnumber + secondnumber ;
					answer = String.format("%.4f", result);
					textArea.setText(answer);
				}
				if(operation == "-")
				{
					result = firstnumber - secondnumber ;
					answer = String.format("%.4f", result);
					textArea.setText(answer);
				}
				if(operation == "*") {
					result = firstnumber * secondnumber ;
					answer = String.format("%.4f", result);
					textArea.setText(answer);
				}
				if(operation == "/")
				{
					result = firstnumber / secondnumber ;
					answer = String.format("%.4f", result);
					textArea.setText(answer);
				}
				if(operation == "mod")
				{
					result = firstnumber % secondnumber ;
					answer = String.format("%.4f", result);
					textArea.setText(answer);
				}
				if(operation == "^")
				{
					result = Math.pow(firstnumber, secondnumber);
					answer = String.format("%.4f",result);
					textArea.setText(answer);
				}
				if(operation == "\u221A")
				{
					secondnumber = 1 / secondnumber;
					result = Math.pow(firstnumber, secondnumber);
					answer = String.format("%.4f",result);
					textArea.setText(answer);
				}
				if(operation == "nCr")
				{
					double count1 = 1, count2 = 1, count3 = 1;
					double subv = firstnumber - secondnumber;
					
					for(double i = 1; i <= firstnumber; i++)
					{
						count1 = count1 * i;
					}
					for(double  i = 1; i <= secondnumber; i++)
					{
						count2 = count2 * i;
					}
					for(double i = 1; i <= subv; i++)
					{
						count3 = count3 * i;
					}
					double slv1 = count2 * count3;
					double slv2 = count1 / slv1;
					result = slv2;
					answer = String.format("%.4f",result);
					textArea.setText(answer);
				}
				if(operation == "nPr")
				{
					double count1 = 1, count2 = 1, subv = firstnumber - secondnumber;
					for(double i = 1; i <= firstnumber; i++)
					{
						count1 = count1 * i;
					}
					for(double i = 1; i <= subv; i++)
					{
						count2 = count2 * i;
					}
					result = count1 / count2;
					answer = String.format("%.4f",result);
					textArea.setText(answer);
				}
				if(operation == "log")
				{
					result = (int)(Math.log(firstnumber)/Math.log(secondnumber));
					answer = String.format("%.4f",result);
					textArea.setText(answer);
				}
				if(operation == "EXP")
				{
					result = firstnumber * Math.pow(10, secondnumber);
					answer = String.format("%.4f",result);
					textArea.setText(answer);
				}
			}
		});
		equal.setForeground(new Color(255, 0, 255));
		equal.setBackground(new Color(255, 255, 255));
		equal.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		equal.setBounds(406, 362, 80, 30);
		frmAdvanceCalculator.getContentPane().add(equal);
	}
}