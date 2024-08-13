package calculator;
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.*;
import java.awt.Font;
import java.awt.Panel;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main extends JFrame {
private JLabel triglabel;
private boolean shift = false;
private JLabel display;
private JPanel contentPane;
private JButton buttonpoint;
private JButton button00;
private JButton button2;
private JButton btnNewButton_2;
private JButton button1;
private JButton btnNewButton_6;
private JButton btnNewButton_7;
private JButton btnNewButton_8;
private JButton btnNewButton_9;
private JButton btnNewButton_10;
private JButton btnNewButton_11;
private JButton buttonAdd;
private JButton buttonequals;
private JButton buttonminus;
private JButton buttonpower;
private JButton buttonmodulus;
double trig=0.0;
private JButton buttonfactorial;
private JButton buttondivide;
private JButton buttonroot;
private JButton buttonboolean;
private JButton btnNewButton_21;
private JButton btnNewButton_22;
private JButton btnNewButton_23;
private JButton btnNewButton_24;
private JButton btnNewButton_25;
private JButton btnNewButton_26;
private JButton btnNewButton_27;
private JButton btnNewButton_28;
private JButton btnNewButton_29;
private JButton buttonAC;
private JButton buttonDEL;
private JButton buttonDtoH;
private JButton buttonDtoB;
private JButton buttonDtoO;
private JButton buttonStop;
private JLabel displayResult;
private String Answer;
protected boolean trigfunc;
int choice=0;

public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
    public void run() {
        try {
            Main frame = new Main();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
});
}

Object create1(String a) throws ScriptException {
ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
// JavaScript code from String
Object ob = scriptEngine.eval(a);
System.out.println("Result of evaluating mathematical expressions in String = "+ob);
return ob;
}
public Main() throws ScriptException {
Answer = "0000";
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 489, 582);
contentPane = new JPanel();
contentPane.setBackground(new Color(0, 0, 0));
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

setContentPane(contentPane);
contentPane.setLayout(null);

JButton button0 = new JButton("0");
button0.setBackground(new Color(255, 255, 255));
button0.setFont(new Font("Times New Roman", Font.BOLD, 24));
button0.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000"){
            displayResult.setText("0");
        Answer="0";}
        else {
            displayResult.setText(displayResult.getText().toString() + "0");
            Answer = Answer + "0";
        }
    }
});
button0.setBounds(96, 488, 85, 47);
contentPane.add(button0);

buttonpoint = new JButton(".");
buttonpoint.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText(".");
            Answer = Answer + ".";
        } else {
            displayResult.setText(displayResult.getText().toString() + ".");
            Answer = Answer + ".";
        }

    }
});
buttonpoint.setBackground(new Color(255, 255, 255));
buttonpoint.setFont(new Font("Times New Roman", Font.BOLD, 24));
buttonpoint.setBounds(184, 488, 85, 47);
contentPane.add(buttonpoint);

button00 = new JButton("00");
button00.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000")
            displayResult.setText("00");
        else {
            displayResult.setText(displayResult.getText().toString() + "00");
            Answer = Answer + "00";
        }

    }
});
button00.setBackground(new Color(255, 255, 255));
button00.setFont(new Font("Times New Roman", Font.BOLD, 24));
button00.setBounds(10, 488, 85, 47);
contentPane.add(button00);

button2 = new JButton("2");
button2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("2");
            Answer = "2";
        } else {
            displayResult.setText(displayResult.getText().toString() + "2");
            Answer = Answer + "2";
        }
    }
});
button2.setBackground(new Color(255, 255, 255));
button2.setFont(new Font("Times New Roman", Font.BOLD, 24));
button2.setBounds(97, 436, 85, 47);
contentPane.add(button2);

btnNewButton_2 = new JButton("3");
btnNewButton_2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("3");
            Answer = "3";
        } else {
            displayResult.setText(displayResult.getText().toString() + "3");
            Answer = Answer + "3";
        }
    }
});
btnNewButton_2.setBackground(new Color(255, 255, 255));
btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 24));
btnNewButton_2.setBounds(184, 436, 85, 47);
contentPane.add(btnNewButton_2);

button1 = new JButton("1");
button1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("1");
            Answer ="1";
        } else {
            displayResult.setText(displayResult.getText().toString() + "1");
            Answer = Answer + "1";
        }
    }
});
button1.setBackground(new Color(255, 255, 255));
button1.setFont(new Font("Times New Roman", Font.BOLD, 24));
button1.setBounds(10, 436, 85, 47);
contentPane.add(button1);

btnNewButton_6 = new JButton("5");
btnNewButton_6.setBackground(new Color(255, 255, 255));
btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 24));
btnNewButton_6.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("5");
            Answer = "5";
        } else {
            displayResult.setText(displayResult.getText().toString() + "5");
            Answer = Answer + "5";
        }

    }
});
btnNewButton_6.setBounds(97, 386, 85, 47);
contentPane.add(btnNewButton_6);

btnNewButton_7 = new JButton("6");
btnNewButton_7.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("6");
            Answer = Answer + "6";
        } else {
            displayResult.setText(displayResult.getText().toString() + "6");
            Answer ="6";
        }
    }
});
btnNewButton_7.setBackground(new Color(255, 255, 255));
btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 24));
btnNewButton_7.setBounds(184, 386, 85, 47);
contentPane.add(btnNewButton_7);

btnNewButton_8 = new JButton("4");
btnNewButton_8.setBackground(new Color(255, 255, 255));
btnNewButton_8.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("4");
            Answer = "4";
        } else {
            displayResult.setText(displayResult.getText().toString() + "4");
            Answer = Answer + "4";
        }
    }
});
btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 24));
btnNewButton_8.setBounds(10, 386, 85, 47);
contentPane.add(btnNewButton_8);

btnNewButton_9 = new JButton("8");
btnNewButton_9.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("8");
            Answer ="8";
        } else {
            displayResult.setText(displayResult.getText().toString() + "8");
            Answer = Answer + "8";
        }

    }
});
btnNewButton_9.setBackground(new Color(255, 255, 255));
btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 24));
btnNewButton_9.setBounds(97, 336, 85, 47);
contentPane.add(btnNewButton_9);

btnNewButton_10 = new JButton("9");
btnNewButton_10.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("9");
            Answer = Answer + "";
        } else {
            displayResult.setText(displayResult.getText().toString() + "9");
            Answer = Answer + "9";
        }

    }
});
btnNewButton_10.setBackground(new Color(255, 255, 255));
btnNewButton_10.setFont(new Font("Times New Roman", Font.BOLD, 24));
btnNewButton_10.setBounds(184, 336, 85, 47);
contentPane.add(btnNewButton_10);

btnNewButton_11 = new JButton("7");
btnNewButton_11.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("7");
            Answer = Answer + "7";
        } else {
            displayResult.setText(displayResult.getText().toString() + "7");
            Answer = Answer + "7";
        }

    }
});
btnNewButton_11.setBackground(new Color(255, 255, 255));
btnNewButton_11.setFont(new Font("Times New Roman", Font.BOLD, 24));
btnNewButton_11.setBounds(10, 336, 85, 47);
contentPane.add(btnNewButton_11);

buttonAdd = new JButton("+");
buttonAdd.setBackground(new Color(255, 255, 255));
buttonAdd.setFont(new Font("Times New Roman", Font.BOLD, 24));
buttonAdd.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("Enter number at begining");
        } else {
            displayResult.setText(displayResult.getText().toString() + "+");
            Answer = Answer + "+";
        }
    }
});
buttonAdd.setBounds(273, 412, 54, 123);
contentPane.add(buttonAdd);
buttonequals = new JButton("=");
buttonequals.setBackground(new Color(255, 255, 255));
buttonequals.setFont(new Font("Times New Roman", Font.BOLD, 24));
buttonequals.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    	if(trigfunc) {
    		Answer=Double.toString(trig);
    		displayResult.setText(Answer);
    		trigfunc=false;
    		
    	}
    	else {
        try {
            String d=create1(Answer).toString();
            display.setText("fdf".toString());
            displayResult.setText(d);
        } catch (ScriptException ex) {
            throw new RuntimeException(ex);
        }


        display.setText(Answer);

    }
    }
});
buttonequals.setBounds(331, 488, 134, 47);
contentPane.add(buttonequals);

buttonminus = new JButton("-");
buttonminus.setBackground(new Color(255, 255, 255));
buttonminus.setFont(new Font("Times New Roman", Font.BOLD, 24));
buttonminus.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("Enter number at begining");
        } else {
            displayResult.setText(displayResult.getText().toString() + "-");
            Answer = Answer + "-";
        }
    }
});
buttonminus.setBounds(331, 439, 65, 47);
contentPane.add(buttonminus);

buttonpower = new JButton("^");
buttonpower.setBackground(new Color(255, 255, 255));
buttonpower.setFont(new Font("Times New Roman", Font.BOLD, 24));
buttonpower.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    }
});
buttonpower.setBounds(400, 438, 65, 47);
contentPane.add(buttonpower);

buttonmodulus = new JButton("%");
buttonmodulus.setBackground(new Color(255, 255, 255));
buttonmodulus.setFont(new Font("Times New Roman", Font.BOLD, 21));
buttonmodulus.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("Enter number at begining");
        } else {
            displayResult.setText(displayResult.getText().toString() + "%");
            Answer = Answer + "%";
        }
    }

});
buttonmodulus.setBounds(273, 336, 54, 73);
contentPane.add(buttonmodulus);

buttonfactorial = new JButton("!");
buttonfactorial.setBackground(new Color(255, 255, 255));
buttonfactorial.setFont(new Font("Times New Roman", Font.BOLD, 24));
buttonfactorial.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("Enter number at begining");
        } else {
            displayResult.setText(displayResult.getText().toString() + "!");
            Answer = Answer + "!";
        }
    }
});
buttonfactorial.setBounds(400, 388, 65, 47);
contentPane.add(buttonfactorial);

buttondivide = new JButton("/");
buttondivide.setBackground(new Color(255, 255, 255));
buttondivide.setFont(new Font("Times New Roman", Font.BOLD, 24));
buttondivide.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("Enter number at begining");
        } else {
            displayResult.setText(displayResult.getText().toString() + "/");
            Answer = Answer + "/";
        }
    }
});
buttondivide.setBounds(331, 390, 65, 47);
contentPane.add(buttondivide);

buttonroot = new JButton("\u221A");
buttonroot.setBackground(new Color(255, 255, 255));
buttonroot.setFont(new Font("Times New Roman", Font.BOLD, 24));
buttonroot.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    }
});
buttonroot.setBounds(398, 335, 65, 50);
contentPane.add(buttonroot);

buttonboolean = new JButton("t/f");
buttonboolean.setBackground(new Color(255, 255, 255));
buttonboolean.setFont(new Font("Times New Roman", Font.BOLD, 24));
buttonboolean.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    }
});
buttonboolean.setBounds(330, 336, 65, 50);
contentPane.add(buttonboolean);

btnNewButton_21 = new JButton("ANS");
btnNewButton_21.setFont(new Font("Times New Roman", Font.BOLD, 21));
btnNewButton_21.setBackground(new Color(255, 255, 255));
btnNewButton_21.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    }
});
btnNewButton_21.setBounds(184, 275, 85, 58);
contentPane.add(btnNewButton_21);

btnNewButton_22 = new JButton("sin");
btnNewButton_22.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		triglabel.setVisible(true);
		trigfunc=true;
    	triglabel.setText("cos(x) enter x");
    	if(trigfunc) {
    		trigfunc=true;
        	triglabel.setText("sin(x) enter x");
        	if(trigfunc) {
        		double s=Math.toRadians(Math.sin(Double.parseDouble(Answer)));
        	trig=s;
        }
	}
	}
});

btnNewButton_22.setFont(new Font("Times New Roman", Font.BOLD, 18));
btnNewButton_22.setBackground(new Color(255, 255, 255));
btnNewButton_22.setBounds(99, 275, 81, 58);
contentPane.add(btnNewButton_22);

btnNewButton_23 = new JButton("cos");
btnNewButton_23.setFont(new Font("Times New Roman", Font.BOLD, 18));
btnNewButton_23.setBackground(new Color(255, 255, 255));
btnNewButton_23.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    	trigfunc=true;
    	choice=1;
    	triglabel.setText("cos(x) enter x");
    	triglabel.setVisible(true);
    }
    
});
btnNewButton_23.setBounds(10, 275, 85, 58);
contentPane.add(btnNewButton_23);

btnNewButton_24 = new JButton("(");
btnNewButton_24.setFont(new Font("Times New Roman", Font.BOLD, 18));
btnNewButton_24.setBackground(new Color(255, 255, 255));
btnNewButton_24.setBounds(184, 214, 85, 58);
contentPane.add(btnNewButton_24);
btnNewButton_24.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
		 if (displayResult.getText().toString() == "0000") {
        displayResult.setText("(");
        Answer="(";
    } else {
   	  displayResult.setText(displayResult.getText().toString() + "(");
        Answer =Answer+"(";
      }
}
});

btnNewButton_25 = new JButton(")");
btnNewButton_25.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		 if (displayResult.getText().toString() == "0000") {
         displayResult.setText(")");
         Answer=")";
     } else {
    	  displayResult.setText(displayResult.getText().toString() + ")");
         Answer =Answer+")";
 }
		
	}
});
btnNewButton_25.setFont(new Font("Times New Roman", Font.BOLD, 18));
btnNewButton_25.setBackground(new Color(255, 255, 255));
btnNewButton_25.setBounds(99, 213, 81, 58);
contentPane.add(btnNewButton_25);

btnNewButton_26 = new JButton("log");
btnNewButton_26.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		triglabel.setText("log(x) enter x");
		triglabel.setVisible(true);
		double s=Math.sin(Double.parseDouble(Answer));
	}
});
btnNewButton_26.setFont(new Font("Times New Roman", Font.BOLD, 18));
btnNewButton_26.setBackground(new Color(255, 255, 255));
btnNewButton_26.setBounds(10, 214, 85, 58);
contentPane.add(btnNewButton_26);

btnNewButton_27 = new JButton("");
btnNewButton_27.setFont(new Font("Times New Roman", Font.BOLD, 18));
btnNewButton_27.setBackground(new Color(255, 255, 255));
btnNewButton_27.setBounds(184, 152, 85, 58);
contentPane.add(btnNewButton_27);

btnNewButton_28 = new JButton("\u03C0");
btnNewButton_28.setFont(new Font("Times New Roman", Font.BOLD, 18));
btnNewButton_28.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	}
});
btnNewButton_28.setBackground(new Color(255, 255, 255));
btnNewButton_28.setBounds(99, 151, 81, 58);
contentPane.add(btnNewButton_28);

btnNewButton_29 = new JButton("srqt");
btnNewButton_29.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		triglabel.setVisible(true);
		 if (displayResult.getText().toString() == "0000") {
             displayResult.setText("sqrt");
             Answer="sqrt";
         } else {
             displayResult.setText("sqrt");
             display.setText("sqrt");
             Answer =Answer+"sqrt";
         }
     }
		
});
btnNewButton_29.setFont(new Font("Times New Roman", Font.BOLD, 18));
btnNewButton_29.setBackground(new Color(255, 255, 255));
btnNewButton_29.setBounds(10, 152, 85, 58);
contentPane.add(btnNewButton_29);

buttonAC = new JButton("AC");
buttonAC.setBackground(new Color(255, 255, 255));
buttonAC.setFont(new Font("Times New Roman", Font.BOLD, 20));
buttonAC.setBounds(361, 214, 104, 58);
contentPane.add(buttonAC);
buttonAC.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("00");
            Answer="";
        } else {
            displayResult.setText("0");
            display.setText("000");
            Answer ="";
            trigfunc=false;
            trig=0.0;
            triglabel.setVisible(false);
            
        }
    }
});

buttonDEL = new JButton("DEl");
buttonDEL.setBackground(new Color(255, 255, 255));
buttonDEL.setFont(new Font("Times New Roman", Font.BOLD, 20));
buttonDEL.setBounds(361, 276, 104, 54);
contentPane.add(buttonDEL);
buttonDEL.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        if (displayResult.getText().toString() == "0000") {
            displayResult.setText("Enter number at begining");
        } else {
            StringBuffer ds=new StringBuffer(Answer);
            ds.deleteCharAt(ds.length()-1);
            Answer=ds.toString();
            displayResult.setText(Answer);
        }
    }
});

buttonDtoH = new JButton("D to H");
buttonDtoH.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(!shift) {
			Integer s=Integer.parseInt(Answer);
			String sd=Answer;
			Answer=Integer.toHexString(s);
			displayResult.setText(Answer);
			display.setText(sd);
			        		}
		else {
			String sd=Answer;
			Integer s=Integer.parseInt(Answer,16);
			displayResult.setText(s.toString());
			display.setText(sd);
			Answer="";
		}
	}
});
buttonDtoH.setBackground(new Color(255, 255, 255));
buttonDtoH.setFont(new Font("Times New Roman", Font.BOLD, 17));
buttonDtoH.setBounds(273, 276, 85, 54);
contentPane.add(buttonDtoH);

buttonDtoB = new JButton("D to B");
buttonDtoB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(!shift) {
			Integer s=Integer.parseInt(Answer);
			String sd=Answer;
			Answer=Integer.toBinaryString(s);
			displayResult.setText(Answer);
			display.setText(sd);
			        		}
		else {
			String sd=Answer;
			Integer s=Integer.parseInt(Answer,2);
			displayResult.setText(s.toString());
			display.setText(sd);
			Answer="";
		}
	}
});
buttonDtoB.setBackground(new Color(255, 255, 255));
buttonDtoB.setFont(new Font("Times New Roman", Font.BOLD, 17));
buttonDtoB.setBounds(273, 214, 85, 58);
contentPane.add(buttonDtoB);

buttonDtoO = new JButton("D to O");
buttonDtoO.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		if(!shift) {
			Integer s=Integer.parseInt(Answer);
			String sd=Answer;
			Answer=Integer.toOctalString(s);
			displayResult.setText(Answer);
			display.setText(sd);
			Answer="";
			
		}
		else {
			String sd=Answer;
			Integer s=Integer.parseInt(Answer,8);
			displayResult.setText(s.toString());
			display.setText(sd);
			Answer="";
		}
		
		
		
	}
});
buttonDtoO.setBackground(new Color(255, 255, 255));
buttonDtoO.setFont(new Font("Times New Roman", Font.BOLD, 17));
buttonDtoO.setBounds(273, 152, 85, 58);
contentPane.add(buttonDtoO);

buttonStop = new JButton("stop");
buttonStop.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		System.exit(ABORT);
	}
});
buttonStop.setBackground(new Color(255, 255, 255));
buttonStop.setFont(new Font("Times New Roman", Font.BOLD, 20));
buttonStop.setBounds(361, 152, 104, 58);
contentPane.add(buttonStop);

JRadioButton buttonlight = new JRadioButton("LIGHT");
buttonlight.setFont(new Font("Times New Roman", Font.BOLD, 12));
buttonlight.setBounds(362, 125, 103, 21);
contentPane.add(buttonlight);

JRadioButton buttondark = new JRadioButton("dark");
buttondark.setFont(new Font("Times New Roman", Font.BOLD, 12));
buttondark.setBounds(255, 125, 103, 21);
contentPane.add(buttondark);
ButtonGroup s = new ButtonGroup();
buttondark.setSelected(true);
s.add(buttondark);
s.add(buttonlight);
buttondark.addItemListener(new ItemListener() {

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (buttondark.isSelected()) {
            contentPane.setBackground(Color.black);
        }

    }

});
buttonlight.addItemListener(new ItemListener() {

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (buttonlight.isSelected()) {
            contentPane.setBackground(new Color(240, 240, 240));
        }

    }

});


JCheckBox buttonshift = new JCheckBox("shift");
buttonshift.setFont(new Font("Times New Roman", Font.BOLD, 12));
buttonshift.setBounds(164, 125, 85, 21);
contentPane.add(buttonshift);
buttonshift.addItemListener(new ItemListener() {

    @Override
    public void itemStateChanged(ItemEvent e) {
      if(buttonshift.isSelected()) {
    	  buttonDtoB.setText("B to D");
    	  buttonDtoO.setText("O to D");
    	  buttonDtoH.setText("H to D");  
    	  shift=true;
      }
      else {
      buttonDtoB.setText("D to B");
	  buttonDtoO.setText("D to O");
	  buttonDtoH.setText("D to H"); 
      }
    }
});

Panel panel = new Panel();
panel.setBackground(new Color(255, 255, 255));
panel.setBounds(10, 10, 455, 109);
contentPane.add(panel);
panel.setLayout(null);

display = new JLabel("SCIENTIFIC CALCULATOR!", SwingConstants.RIGHT);
display.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
display.setForeground(new Color(0, 0, 0));
display.setBounds(10, 10, 435, 44);
panel.add(display);

displayResult = new JLabel("0000", SwingConstants.RIGHT);
displayResult.setForeground(Color.BLACK);
displayResult.setFont(new Font("Segoe UI Variable", Font.BOLD, 17));
displayResult.setBounds(10, 55, 435, 44);
panel.add(displayResult);


 triglabel = new JLabel("New label");
 triglabel.setEnabled(true);
 triglabel.setVisible(false);
triglabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
triglabel.setBounds(10, 55, 89, 44);
panel.add(triglabel);
}
}
/*240 240 240*/