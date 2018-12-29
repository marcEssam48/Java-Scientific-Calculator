package com.company;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.lang.Math.*;



public class GUI extends JFrame implements KeyListener{

    double firstNum;
    double SecondNum;
    String entered;
    double result;
    String Operations;
    String answer;
    double exponen = 2.718281828;


    JButton btn_On = new JButton("ON");
    JButton btn_Off = new JButton("Off");
    JButton btn_sqx = new JButton("^2");
    JButton btn_sqxinput = new JButton("^");
    JButton btn_sqrt = new JButton("√");
    JButton btn_logx = new JButton("log");
    JButton btn_ln = new JButton("ln");
    JButton btn_brac = new JButton("(");
    JButton btn_brac2 = new JButton(")");
    JButton btn_sinx = new JButton("sin(");
    JButton btn_cosx = new JButton("cos(");
    JButton btn_tanx = new JButton("tan(");
    JButton btn_factorial = new JButton("!");
    JButton btn_combination = new JButton("C");
    JButton btn_Permutation = new JButton("P");
    JButton btn_Ac = new JButton("AC");
    JButton btn_1 = new JButton("1");
    JButton btn_2 = new JButton("2");
    JButton btn_3 = new JButton("3");
    JButton btn_4 = new JButton("4");
    JButton btn_5 = new JButton("5");
    JButton btn_6 = new JButton("6");
    JButton btn_7 = new JButton("7");
    JButton btn_8 = new JButton("8");
    JButton btn_9 = new JButton("9");
    JButton btn_0 = new JButton("0");
    JButton btn_plus = new JButton("+");
    JButton btn_minus = new JButton("-");
    JButton btn_multiply = new JButton("x");
    JButton btn_divided = new JButton("÷");
    JButton btn_pi = new JButton("π");
    JButton btn_exponential = new JButton("e");
    JButton btn_MODE = new JButton("DEL");
    JButton btn_decimal = new JButton(".");
    JTextField Input = new JTextField();
    JButton btn_equal = new JButton("=");
    JButton btn_answer= new JButton("Ans");

    Container cp = getContentPane();

    public GUI(){
        setSize(415,550);
        setLayout(null);
        setTitle("Scientific Calculator");
        cp.add(btn_On);
        cp.add(btn_Off);
        cp.add(btn_sqx);
        cp.add(btn_sqrt);
        cp.add(btn_sqxinput);
        cp.add(btn_logx);
        cp.add(btn_ln);
        cp.add(btn_brac);
        cp.add(btn_brac2);
        cp.add(btn_sinx);
        cp.add(btn_cosx);
        cp.add(btn_tanx);
        cp.add(btn_factorial);
        cp.add(btn_combination);
        cp.add(btn_Permutation);
        cp.add(btn_Ac);
        cp.add(btn_1);
        cp.add(btn_2);
        cp.add(btn_3);
        cp.add(btn_4);
        cp.add(btn_5);
        cp.add(btn_6);
        cp.add(btn_7);
        cp.add(btn_8);
        cp.add(btn_9);
        cp.add(btn_0);
        cp.add(btn_plus);
        cp.add(btn_minus);
        cp.add(btn_multiply);
        cp.add(btn_divided);
        cp.add(btn_pi);
        cp.add(btn_exponential);
        cp.add(btn_MODE);
        cp.add(btn_decimal);
        cp.add(Input);
        cp.add(btn_equal);
        cp.add(btn_answer);

        Input.setBounds(0, 0, 400, 100);
        btn_On.setBounds(325,100,70,30);
        btn_Off.setBounds(250,100,70,30);
        btn_sqx.setBounds(5,150,70,30);
        btn_sqxinput.setBounds(85,150,70,30);
        btn_sqrt.setBounds(165,150,70,30);
        btn_logx.setBounds(245,150,70,30);
        btn_ln.setBounds(325,150,70,30);
        btn_sinx.setBounds(5,200,70,30);
        btn_cosx.setBounds(85,200,70,30);
        btn_tanx.setBounds(165,200,70,30);
        btn_factorial.setBounds(245,200,70,30);
        btn_combination.setBounds(325,200,70,30);
        btn_Permutation.setBounds(5,250,70,30);
        btn_pi.setBounds(85,250,70,30);
        btn_exponential.setBounds(165,250,70,30);
        btn_answer.setBounds(245,250 ,70 ,30 );
        btn_MODE.setBounds(245,320,70,30);
        btn_Ac.setBounds(325,320,65,30);
        btn_7.setBounds(5,320,65,30);
        btn_8.setBounds(75,320,65,30);
        btn_9.setBounds(145,320,65,30);
        btn_plus.setBounds(250,370,65,30);
        btn_minus.setBounds(325,370,65,30);
        btn_4.setBounds(5,370,65,30);
        btn_5.setBounds(75,370,65,30);
        btn_6.setBounds(145,370,65,30);
        btn_multiply.setBounds(250,420,65,30);
        btn_divided.setBounds(325,420,65,30);
        btn_1.setBounds(5,420,65,30);
        btn_2.setBounds(75,420,65,30);
        btn_3.setBounds(145,420,65,30);
        btn_brac.setBounds(5,470,65,30);
        btn_0.setBounds(75,470,65,30);
        btn_brac2.setBounds(145,470,65,30);
        btn_equal.setBounds(250,470,65,30);
        btn_decimal.setBounds(325,470,65,30);


        btn_On.setForeground(Color.white);
        btn_Off.setForeground(Color.white);
        btn_sqx.setForeground(Color.white);
        btn_sqxinput.setForeground(Color.white);
        btn_sqrt.setForeground(Color.white);
        btn_logx.setForeground(Color.white);
        btn_ln.setForeground(Color.white);
        btn_brac.setForeground(Color.white);
        btn_brac2.setForeground(Color.white);
        btn_sinx.setForeground(Color.white);
        btn_cosx.setForeground(Color.white);
        btn_tanx.setForeground(Color.white);
        btn_factorial.setForeground(Color.white);
        btn_combination.setForeground(Color.white);
        btn_Permutation.setForeground(Color.white);
        btn_Ac.setForeground(Color.white);
        btn_MODE.setForeground(Color.white);
        btn_pi.setForeground(Color.white);
        btn_exponential.setForeground(Color.white);
        btn_0.setForeground(Color.white);
        btn_1.setForeground(Color.white);
        btn_2.setForeground(Color.white);
        btn_3.setForeground(Color.white);
        btn_4.setForeground(Color.white);
        btn_5.setForeground(Color.white);
        btn_6.setForeground(Color.white);
        btn_7.setForeground(Color.white);
        btn_8.setForeground(Color.white);
        btn_9.setForeground(Color.white);
        btn_plus.setForeground(Color.white);
        btn_minus.setForeground(Color.white);
        btn_multiply.setForeground(Color.white);
        btn_divided.setForeground(Color.white);
        btn_decimal.setForeground(Color.white);
        btn_equal.setForeground(Color.white);
        Input.setForeground(Color.white);
        btn_answer.setForeground(Color.white);

        btn_On.setBackground(Color.orange);
        btn_Off.setBackground(Color.red);
        btn_sqx.setBackground(Color.gray);
        btn_sqxinput.setBackground(Color.gray);
        btn_sqrt.setBackground(Color.gray);
        btn_logx.setBackground(Color.gray);
        btn_ln.setBackground(Color.gray);
        btn_brac.setBackground(Color.black);
        btn_brac2.setBackground(Color.black);
        btn_sinx.setBackground(Color.gray);
        btn_cosx.setBackground(Color.gray);
        btn_tanx.setBackground(Color.gray);
        btn_factorial.setBackground(Color.gray);
        btn_combination.setBackground(Color.gray);
        btn_Permutation.setBackground(Color.gray);
        btn_Ac.setBackground(Color.red);
        btn_MODE.setBackground(Color.red);
        btn_pi.setBackground(Color.gray);
        btn_answer.setBackground(Color.gray);
        btn_exponential.setBackground(Color.gray);
        btn_0.setBackground(Color.black);
        btn_1.setBackground(Color.black);
        btn_2.setBackground(Color.black);
        btn_3.setBackground(Color.black);
        btn_4.setBackground(Color.black);
        btn_5.setBackground(Color.black);
        btn_6.setBackground(Color.black);
        btn_7.setBackground(Color.black);
        btn_8.setBackground(Color.black);
        btn_9.setBackground(Color.black);
        btn_plus.setBackground(Color.black);
        btn_minus.setBackground(Color.black);
        btn_multiply.setBackground(Color.black);
        btn_divided.setBackground(Color.black);
        btn_decimal.setBackground(Color.black);
        Input.setBackground(Color.gray);
        cp.setBackground(Color.white);
        btn_equal.setBackground(Color.black);
        cp.setBackground(Color.LIGHT_GRAY);

        no1 a = new no1();
        btn_1.addActionListener(a);
        no2 b = new no2();
        btn_2.addActionListener(b);
        no3 c = new no3();
        btn_3.addActionListener(c);
        no4 d = new no4();
        btn_4.addActionListener(d);
        no5 e = new no5();
        btn_5.addActionListener(e);
        no6 f = new no6();
        btn_6.addActionListener(f);
        no7 g = new no7();
        btn_7.addActionListener(g);
        no8 h = new no8();
        btn_8.addActionListener(h);
        no9 i = new no9();
        btn_9.addActionListener(i);
        no0 j = new no0();
        btn_0.addActionListener(j);
        plus k = new plus();
        btn_plus.addActionListener(k);
        minus l = new minus();
        btn_minus.addActionListener(l);
        times m = new times();
        btn_multiply.addActionListener(m);
        divided n = new divided();
        btn_divided.addActionListener(n);
        Combination o = new Combination();
        btn_combination.addActionListener(o);
        Permutation p = new Permutation();
        btn_Permutation.addActionListener(p);
        pi q = new pi();
        btn_pi.addActionListener(q);
        exp r = new exp();
        btn_exponential.addActionListener(r);
        sqx s = new sqx();
        btn_sqx.addActionListener(s);
        log t = new log();
        btn_logx.addActionListener(t);
        ln u = new ln();
        btn_ln.addActionListener(u);
        sin v = new sin();
        btn_sinx.addActionListener(v);
        cos w = new cos();
        btn_cosx.addActionListener(w);
        tan x = new tan();
        btn_tanx.addActionListener(x);
        sqrt y = new sqrt();
        btn_sqrt.addActionListener(y);
        brac z = new brac();
        btn_brac.addActionListener(z);
        brac2 aa = new brac2();
        btn_brac2.addActionListener(aa);
        fact ab = new fact();
        btn_factorial.addActionListener(ab);
        pow ac = new pow();
        btn_sqxinput.addActionListener(ac);
        decimal ad = new decimal();
        btn_decimal.addActionListener(ad);
        delete ae = new delete();
        btn_Ac.addActionListener(ae);
        off af = new off();
        btn_Off.addActionListener(af);
        on ag = new on();
        btn_On.addActionListener(ag);
        resulting ah = new resulting();
        btn_equal.addActionListener(ah);
        Input.addKeyListener(this);
        answer ai = new answer();
        btn_answer.addActionListener(ai);
        deletion aj = new deletion();
        btn_MODE.addActionListener(aj);






    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {

        int KeyCode = e.getKeyCode();
        if(KeyCode== KeyEvent.VK_1)
        {
            entered = Input.getText()+btn_1.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_2)
        {
            entered = Input.getText()+btn_2.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_3)
        {
            entered = Input.getText()+btn_3.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_4)
        {
            entered = Input.getText()+btn_4.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_5)
        {
            entered = Input.getText()+btn_5.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_6)
        {
            entered = Input.getText()+btn_6.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_7)
        {
            entered = Input.getText()+btn_7.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_8)
        {
            entered = Input.getText()+btn_8.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_9)
        {
            entered = Input.getText()+btn_9.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_0)
        {
            entered = Input.getText()+btn_0.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_L)
        {
            entered = Input.getText()+btn_logx.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_N)
        {
            entered = Input.getText()+btn_ln.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_S)
        {
            entered = Input.getText()+btn_sinx.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_X)
        {
            entered = Input.getText()+btn_cosx.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_T)
        {
            entered = Input.getText()+btn_tanx.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_C)
        {
            entered = Input.getText()+btn_combination.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_P)
        {
            entered = Input.getText()+btn_Permutation.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_SLASH)
        {
            entered = Input.getText()+btn_divided.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_PLUS)
        {
            entered = Input.getText()+btn_plus.getText();
            Input.setText(entered);
        }
        else if(KeyCode== KeyEvent.VK_EQUALS)
        {
            entered = Input.getText()+btn_equal.getText();
            Input.setText(entered);
        }





    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    class no1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_1.getText();
            Input.setText(EnterNum);
        }
    }
    class no2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_2.getText();
            Input.setText(EnterNum);
        }
    }
    class no3 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_3.getText();
            Input.setText(EnterNum);
        }
    }
    class no4 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_4.getText();
            Input.setText(EnterNum);
        }
    }
    class no5 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_5.getText();
            Input.setText(EnterNum);
        }
    }
    class no6 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_6.getText();
            Input.setText(EnterNum);
        }
    }
    class no7 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_7.getText();
            Input.setText(EnterNum);
        }
    }
    class no8 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_8.getText();
            Input.setText(EnterNum);
        }
    }
    class no9 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_9.getText();
            Input.setText(EnterNum);
        }
    }
    class no0 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_0.getText();
            Input.setText(EnterNum);
        }
    }
    class plus implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            firstNum = Double.parseDouble(Input.getText());
            Input.setText("");
            Operations="+";
        }
    }
    class minus implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            firstNum = Double.parseDouble(Input.getText());
            Input.setText("");
            Operations="-";
        }
    }
    class times implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            firstNum = Double.parseDouble(Input.getText());
            Input.setText("");
            Operations="*";
        }
    }
    class divided implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            firstNum = Double.parseDouble(Input.getText());
            Input.setText("");
            Operations="/";
        }
    }
    class Permutation implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            firstNum = Double.parseDouble(Input.getText());
            Input.setText("");
            Operations="P";
        }
    }
    class Combination implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            firstNum = Double.parseDouble(Input.getText());
            Input.setText("");
            Operations="C";
        }
    }
    class pi implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ;
            firstNum = Double.parseDouble(Input.getText());
            Input.setText("");
            Operations="π";

        }
    }
    class exp implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            String ent = Input.getText()+btn_exponential.getText();
            btn_exponential.equals(exponen);
            Operations="e";

        }
    }
    class sqx implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            firstNum = Double.parseDouble(Input.getText());
            Input.setText(Input.getText()+btn_sqx.getText());
            Operations= "^2";
        }
    }
    class log implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {


            Input.setText("");
            Operations="log";
        }
    }
    class ln implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {


            Input.setText("");
            Operations="ln";
        }
    }
    class sin implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {


            Input.setText("");
            Operations="sin(";
        }
    }
    class cos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {


            Input.setText("");
            Operations="cos(";
        }
    }
    class tan implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {


            Input.setText("");
            Operations="tan(";
        }
    }
    class sqrt implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {


            Input.setText("");
            Operations="√";
        }
    }
    class brac implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_brac.getText();
            Input.setText(EnterNum);
        }
    }
    class brac2 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_brac2.getText();
            Input.setText(EnterNum);
        }
    }
    class fact implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            firstNum = Double.parseDouble(Input.getText());
            Input.setText("");
            Operations = "!";

        }
    }
    class pow implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            firstNum = Double.parseDouble(Input.getText());
            Input.setText("");
            Operations="^";
        }
    }
    class decimal implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String EnterNum = Input.getText()+ btn_decimal.getText();
            Input.setText(EnterNum);
        }
    }
    class delete implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Input.setText(" ");
        }
    }
    class off implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            btn_Off.setEnabled(false);
            btn_sqrt.setEnabled(false);
            btn_sqxinput.setEnabled(false);
            btn_sqx.setEnabled(false);
            btn_logx.setEnabled(false);
            btn_ln.setEnabled(false);
            btn_sinx.setEnabled(false);
            btn_cosx.setEnabled(false);
            btn_tanx.setEnabled(false);
            btn_brac.setEnabled(false);
            btn_brac2.setEnabled(false);
            btn_exponential.setEnabled(false);
            btn_pi.setEnabled(false);
            btn_combination.setEnabled(false);
            btn_Permutation.setEnabled(false);
            btn_equal.setEnabled(false);
            btn_0.setEnabled(false);
            btn_1.setEnabled(false);
            btn_2.setEnabled(false);
            btn_3.setEnabled(false);
            btn_4.setEnabled(false);
            btn_5.setEnabled(false);
            btn_6.setEnabled(false);
            btn_7.setEnabled(false);
            btn_8.setEnabled(false);
            btn_9.setEnabled(false);
            btn_plus.setEnabled(false);
            btn_minus.setEnabled(false);
            btn_divided.setEnabled(false);
            btn_multiply.setEnabled(false);
            btn_MODE.setEnabled(false);
            btn_Ac.setEnabled(false);
            btn_factorial.setEnabled(false);
            btn_answer.setEnabled(false);
            Input.setText("");
        }
    }
    class on implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            btn_Off.setEnabled(!false);
            btn_sqrt.setEnabled(!false);
            btn_sqxinput.setEnabled(!false);
            btn_sqx.setEnabled(!false);
            btn_logx.setEnabled(!false);
            btn_ln.setEnabled(!false);
            btn_sinx.setEnabled(!false);
            btn_cosx.setEnabled(!false);
            btn_tanx.setEnabled(!false);
            btn_brac.setEnabled(!false);
            btn_brac2.setEnabled(!false);
            btn_exponential.setEnabled(!false);
            btn_pi.setEnabled(!false);
            btn_combination.setEnabled(!false);
            btn_Permutation.setEnabled(!false);
            btn_equal.setEnabled(!false);
            btn_0.setEnabled(!false);
            btn_1.setEnabled(!false);
            btn_2.setEnabled(!false);
            btn_3.setEnabled(!false);
            btn_4.setEnabled(!false);
            btn_5.setEnabled(!false);
            btn_6.setEnabled(!false);
            btn_7.setEnabled(!false);
            btn_8.setEnabled(!false);
            btn_9.setEnabled(!false);
            btn_plus.setEnabled(!false);
            btn_minus.setEnabled(!false);
            btn_divided.setEnabled(!false);
            btn_multiply.setEnabled(!false);
            btn_MODE.setEnabled(!false);
            btn_Ac.setEnabled(!false);
            btn_factorial.setEnabled(!false);
            btn_answer.setEnabled(!false);
        }
    }

    class resulting implements ActionListener{
        double fact (double number){
            if (number == 1){
                return 1;
            }
            else {
                result = number *fact(number-1);

            }

            return  result;
        }




        @Override
        public void actionPerformed(ActionEvent e) {







            if (Operations == "+"){

                SecondNum = Double.parseDouble(Input.getText());
                result = firstNum+SecondNum;
                answer = String.format("%.7f", result);
                Input.setText(" "+"="+" " +answer);

            }
            else if (Operations == "-"){
                SecondNum = Double.parseDouble(Input.getText());
                result = firstNum-SecondNum;
                answer = String.format("%.7f", result);
                Input.setText(" "+"="+" " +answer);
            }
            else if (Operations == "*"){
                SecondNum = Double.parseDouble(Input.getText());
                result = firstNum*SecondNum;
                answer = String.format("%.7f", result);
                Input.setText(" "+"="+" " +answer);
            }
            else if (Operations == "/"){
                SecondNum = Double.parseDouble(Input.getText());
                result = firstNum/SecondNum;
                answer = String.format("%.7f", result);
                Input.setText(" "+"="+" " +answer);
            }
            else if (Operations == "!"){
                result= fact(firstNum);
                answer = String.format("%.0f", result);
                Input.setText(" "+"="+" " +answer);
            }
            else if (Operations == "^"){
                SecondNum = Double.parseDouble(Input.getText());
                result = Math.pow(firstNum,SecondNum);
                answer = String.format("%.7f",result);
                Input.setText(answer);

            }
            else if (Operations == "P"){
                SecondNum = Double.parseDouble(Input.getText());
                if(firstNum<SecondNum ){
                    answer = "Maths Error";
                    Input.setText(answer);
                }
                else if(firstNum == SecondNum && firstNum == 0){
                    result =1;
                    answer= String.format("%.0f", result);
                    Input.setText(" "+"="+" " +answer);
                }
                else if(firstNum >= SecondNum && firstNum == 1){
                    result =1;
                    answer= String.format("%.0f", result);
                    Input.setText(" "+"="+" " +answer);
                }
                else if(firstNum >= SecondNum ){
                    result = fact(firstNum)/fact(firstNum-SecondNum);
                    answer= String.format("%.0f", result);
                    Input.setText(" "+"="+" " +answer);
                }
            }

            else if (Operations == "^2"){
                result = firstNum * firstNum;
                answer = String.format("%.7f",result);
                Input.setText(Input.getText()+" "+"="+" " +answer);

            }
            else if (Operations == "√"){
                firstNum = Double.parseDouble(Input.getText());
                result = Math.sqrt(firstNum);
                answer = String.format("%.7f",result);
                Input.setText(Input.getText()+" "+"="+" " +answer);


            }
            else if (Operations == "sin("){
                firstNum = Double.parseDouble(Input.getText());
                result = Math.sin(firstNum);
                answer = String.format("%.7f",result);
                Input.setText(Input.getText()+" "+"="+" " +answer);


            }
            else if (Operations == "cos("){
                firstNum = Double.parseDouble(Input.getText());
                result = Math.cos(firstNum);
                answer = String.format("%.7f",result);
                Input.setText(Input.getText()+" "+"="+" " +answer);


            }
            else if (Operations == "tan("){
                firstNum = Double.parseDouble(Input.getText());
                result = Math.tan(firstNum);
                answer = String.format("%.7f",result);
                Input.setText(Input.getText()+" "+"="+" " +answer);


            }
            else if (Operations == "ln"){
                firstNum = Double.parseDouble(Input.getText());
                result = Math.log(firstNum);
                answer = String.format("%.7f",result);
                Input.setText(Input.getText()+" "+"="+" " +answer);


            }
            else if (Operations == "log"){
                firstNum = Double.parseDouble(Input.getText());
                result = Math.log10(firstNum);
                answer = String.format("%.7f",result);
                Input.setText(Input.getText()+" "+"="+" " +answer);


            }
            else if (Operations == "C"){
                SecondNum = Double.parseDouble(Input.getText());
                if(firstNum<SecondNum ){
                    answer = "Maths Error";
                    Input.setText(answer);
                }
                else if(firstNum == SecondNum && firstNum == 0){
                    result =1;
                    answer= String.format("%.0f", result);
                    Input.setText(" "+"="+" " +answer);
                }
                else if(firstNum >= SecondNum && firstNum == 1){
                    result =1;
                    answer= String.format("%.0f", result);
                    Input.setText(" "+"="+" " +answer);

                }
                else if(firstNum >= SecondNum ){
                    result = fact(firstNum)/(fact(SecondNum)*fact(firstNum-SecondNum));
                    answer= String.format("%.0f", result);
                    Input.setText(" "+"="+" " +answer);
                }
            }
        }
    }
    class answer implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String number;
            number = String.format("%.7f", result);
            Input.setText(number);

        }

    }
    class deletion implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            if (Input.getText().length()>0){
                StringBuffer sb = new StringBuffer(Input.getText());
                sb = sb.deleteCharAt(Input.getText().length()-1);
                Input.setText(sb.toString());
            }
        }
    }
}