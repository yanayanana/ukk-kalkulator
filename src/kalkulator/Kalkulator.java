/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;



import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
        
public class Kalkulator implements ActionListener{
    
    double variabel1=0,variabel2=0,hasil=0;
    int operator;
    
  
    
        
        
        JFrame frame=new JFrame("kalkulator");
        JLabel label=new JLabel();
        JTextField textField=new JTextField();
        
        
        
        JButton buttonZero=new JButton("0");
        JButton buttonOne=new JButton("1");
        JButton buttonTwo=new JButton("2");
        JButton buttonThree=new JButton("3");
        JButton buttonFour=new JButton("4");
        JButton buttonFive=new JButton("5");
        JButton buttonSix=new JButton("6");
        JButton buttonSeven=new JButton("7");
        JButton buttonEight=new JButton("8");
        JButton buttonNine=new JButton("9");
        JButton buttonDot=new JButton(".");
        JButton buttonClear=new JButton("c");
        JButton buttonDelete=new JButton("DEL");
        JButton buttonEqual=new JButton("=");
        JButton buttonMul=new JButton("X");
        JButton buttonDiv=new JButton("/");
        JButton buttonPlus=new JButton("+");
        JButton buttonMinus=new JButton("-");
        
        
        
        
        Kalkulator(){
        
        
        prepareGui();
        addComponents();
        addActionEvent();
    }
       
        
        
        public void prepareGui(){
          frame.setSize(305,450);
          frame.getContentPane().setLayout(null);
          frame.getContentPane().setBackground(Color.gray);
          frame.setLocationRelativeTo(null);
          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          
        }
        
        public void addComponents(){
            label.setBounds(250,0,50,50);
            label.setForeground(Color.white);
            frame.add(label);
            
            
            textField.setBounds(10,40,270,40);
            textField.setFont(new Font("Arial",Font.BOLD,20));
            textField.setEditable(false);
            textField.setHorizontalAlignment(SwingConstants.RIGHT);
            frame.add(textField);
            
            
            
            ButtonGroup buttonGroup=new ButtonGroup();
            
            
            buttonSeven.setBounds(10,170,60,40);
            buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
            buttonSeven.setFocusable(false);
            frame.add(buttonSeven);
            
            buttonEight.setBounds(80,170,60,40);
            buttonEight.setFont(new Font("Arial",Font.BOLD,20));
            buttonEight.setFocusable(false);
            frame.add(buttonEight);
            
            buttonNine.setBounds(150,170,60,40);
            buttonNine.setFont(new Font("Arial",Font.BOLD,20));
            buttonNine.setFocusable(false);
            frame.add(buttonNine);
            
            buttonFour.setBounds(10,230,60,40);
            buttonFour.setFont(new Font("Arial",Font.BOLD,20));
            buttonFour.setFocusable(false);
            frame.add(buttonFour);
            
            buttonFive.setBounds(80,230,60,40);
            buttonFive.setFont(new Font("Arial",Font.BOLD,20));
            buttonFive.setFocusable(false);
            frame.add(buttonFive);
            
            buttonSix.setBounds(150,230,60,40);
            buttonSix.setFont(new Font("Arial",Font.BOLD,20));
            buttonSix.setFocusable(false);
            frame.add(buttonSix);
            
            buttonOne.setBounds(10,290,60,40);
            buttonOne.setFont(new Font("Arial",Font.BOLD,20));
            buttonOne.setFocusable(false);
            frame.add(buttonOne);
            
            buttonTwo.setBounds(80,290,60,40);
            buttonTwo.setFont(new Font("Arial",Font.BOLD,20));
            buttonTwo.setFocusable(false);
            frame.add(buttonTwo);
            
            buttonThree.setBounds(150,290,60,40);
            buttonThree.setFont(new Font("Arial",Font.BOLD,20));
            buttonThree.setFocusable(false);
            frame.add(buttonThree);
            
            buttonDot.setBounds(150,350,60,40);
            buttonDot.setFont(new Font("Arial",Font.BOLD,20));
            buttonDot.setFocusable(false);
            frame.add(buttonDot);
            
            buttonZero.setBounds(10,350,130,40);
            buttonZero.setFont(new Font("Arial",Font.BOLD,20));
            buttonZero.setFocusable(false);
            frame.add(buttonZero);
            
            buttonEqual.setBounds(220,350,60,40);
            buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
            buttonEqual.setBackground(new Color(239,188,2));
            buttonEqual.setFocusable(false);
            frame.add(buttonEqual);
            
            
            buttonDiv.setBounds(220,110,60,40);
            buttonDiv.setFont(new Font("Arial",Font.BOLD,20));
            buttonDiv.setBackground(new Color(239,188,2));
            buttonDiv.setFocusable(false);
            frame.add(buttonDiv);
            
            buttonMul.setBounds(220,230,60,40);
            buttonMul.setFont(new Font("Arial",Font.BOLD,20));
            buttonMul.setBackground(new Color(239,188,2));
            buttonMul.setFocusable(false);
            frame.add(buttonMul);
            
            buttonMinus.setBounds(220,170,60,40);
            buttonMinus.setFont(new Font("Arial",Font.BOLD,20));
            buttonMinus.setBackground(new Color(239,188,2));
            buttonMinus.setFocusable(false);
            frame.add(buttonMinus);
            
            
            buttonPlus.setBounds(220,290,60,40);
            buttonPlus.setFont(new Font("Arial",Font.BOLD,20));
            buttonPlus.setBackground(new Color(239,188,2));
            buttonPlus.setFocusable(false);
            frame.add(buttonPlus);
            
            buttonDelete.setBounds(150,110,60,40);
            buttonDelete.setFont(new Font("Arial",Font.BOLD,12));
            buttonDelete.setBackground(Color.red);
            buttonDelete.setForeground(Color.white);
            buttonDelete.setFocusable(false);
            frame.add(buttonDelete);
            
            
            buttonClear.setBounds(10,110,130,40);
            buttonClear.setFont(new Font("Arial",Font.BOLD,20));
            buttonClear.setBackground(Color.red);
            buttonClear.setForeground(Color.white);
            buttonClear.setFocusable(false);
            frame.add(buttonClear);
        } 
        
        
        
        public void addActionEvent(){
            
            
            buttonClear.addActionListener(this);
            buttonDelete.addActionListener(this);
            buttonDiv.addActionListener(this);
            buttonMinus.addActionListener(this);
            buttonSeven.addActionListener(this);
            buttonEight.addActionListener(this);
            buttonNine.addActionListener(this);
            buttonMul.addActionListener(this);
            buttonFour.addActionListener(this);
            buttonFive.addActionListener(this);
            buttonSix.addActionListener(this);
            buttonPlus.addActionListener(this);
            buttonOne.addActionListener(this);
            buttonTwo.addActionListener(this);
            buttonThree.addActionListener(this);
            buttonEqual.addActionListener(this);
            buttonZero.addActionListener(this);
            buttonDot.addActionListener(this);
                    
                    
        }   
            
            public static void main(String[]args){
                
                Kalkulator kalkulator=new Kalkulator();
            }
                
            @Override
            public void actionPerformed(ActionEvent e){
                
            
            
            
            Object source=e.getSource();
            
            
            if(source==buttonClear){
                label.setText("");
                textField.setText("");
            }else if(source==buttonDelete){
                int length=textField.getText().length();
                int number=length-1;
                if(length>0){
                    
                    
                    StringBuilder back=new StringBuilder(textField.getText());
                    back.deleteCharAt(number);
                    textField.setText(back.toString());
                    
                }if(textField.getText().endsWith(""));
                label.setText("");
            }else if(source==buttonZero){
                if(textField.getText().equals("0")){
                return;
            }else{
                textField.setText(textField.getText()+"0");
            }
            
            }else if(source==buttonOne){
                textField.setText(textField.getText()+"1");
            }else if(source==buttonTwo){
                textField.setText(textField.getText()+"2");
            }else if(source==buttonThree){
                textField.setText(textField.getText()+"3");
            }else if(source==buttonFour){
                textField.setText(textField.getText()+"4");
            }else if(source==buttonFive){
                textField.setText(textField.getText()+"5");
            }else if(source==buttonSix){
                textField.setText(textField.getText()+"6");
            }else if(source==buttonSeven){
                textField.setText(textField.getText()+"7");
            }else if(source==buttonEight){
                textField.setText(textField.getText()+"8");
            }else if(source==buttonNine){
                textField.setText(textField.getText()+"9");
            }else if(source==buttonDot){    
                if(textField.getText().contains(".")){
                return;
            }else{
                textField.setText(textField.getText()+".");
            }
            
            }else if(source==buttonPlus){
                String str = textField.getText();
                variabel1 =Double.parseDouble(textField.getText());
                operator=1;
                textField.setText("");
                label.setText(str+"+");
            }else if(source==buttonMinus){
                String str=textField.getText();
                variabel1=Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str+"-");
                operator=2;
            }else if(source==buttonMul){
                String str=textField.getText();
                variabel1=Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str+"x");
                operator=3;
            }else if(source==buttonDiv){
                String str=textField.getText();
                variabel1=Double.parseDouble(textField.getText());
                textField.setText("");
                label.setText(str+"/");
                operator=4;   
                
            }else if(source==buttonEqual){
                variabel2=Double.parseDouble(textField.getText());
                switch(operator){
                    
                    case 1:
                        hasil=variabel1+variabel2;
                        break;
                    case 2:
                        hasil=variabel1-variabel2;
                        break;
                    case 3:
                        hasil=variabel1*variabel2;
                        break;
                    case 4:
                        hasil=variabel1/variabel2;
                        break;
                    
                }if(Double.toString(hasil).endsWith(".0")){
                    textField.setText(Double.toString(hasil).replace(".0",""));
                    
                }else{
                    textField.setText(Double.toString(hasil));
                    
                }
                
                
                label.setText("");
                variabel1=hasil;
            }
    
    
          }
            
            public void enable(){
                textField.setEnabled(true);
                label.setEnabled(true);
                buttonClear.setEnabled(true);
                buttonDelete.setEnabled(true);
                buttonDiv.setEnabled(true);
                buttonMinus.setEnabled(true);
                buttonSeven.setEnabled(true);
                buttonEight.setEnabled(true);
                buttonNine.setEnabled(true);
                buttonMul.setEnabled(true);
                buttonFour.setEnabled(true);
                buttonFive.setEnabled(true);
                buttonSix.setEnabled(true);
                buttonPlus.setEnabled(true);
                buttonOne.setEnabled(true);
                buttonTwo.setEnabled(true);
                buttonThree.setEnabled(true);
                buttonEqual.setEnabled(true);
                buttonZero.setEnabled(true);
                buttonDot.setEnabled(true);
                
            }
            
            
            public void disable(){
                textField.setEnabled(false);
                label.setEnabled(false);
                buttonClear.setEnabled(false);
                buttonDelete.setEnabled(false);
                buttonDiv.setEnabled(false);
                buttonMinus.setEnabled(false);
                buttonSeven.setEnabled(false);
                buttonEight  .setEnabled(false);
                buttonNine.setEnabled(false);
                buttonMul.setEnabled(false);
                buttonFour.setEnabled(false);
                buttonFive.setEnabled(false);
                buttonSix.setEnabled(false);
                buttonPlus.setEnabled(false);
                buttonOne.setEnabled(false);
                buttonTwo.setEnabled(false);
                buttonThree.setEnabled(false);
                buttonEqual.setEnabled(false);
                buttonZero.setEnabled(false);
                buttonDot.setEnabled(false);
                
            }
}
    

            
    
    
    


        
    

    

