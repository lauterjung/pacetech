package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.Math;

public class Calculator extends javax.swing.JFrame  {

    public Calculator() {
        initComponents();
        jPanel1.requestFocus();
    }
        
    private Double value1;
    private Double value2;
    private Double result;
    private String operation;
    private boolean resetVisor;
    private boolean equalLastPressed;
    
    private void resetCalculator(){
        value1 = null;
        value2 = null;
        operation = null;
        jVisor.setText("");
        jAuxVisor.setText("");
        equalLastPressed = false;
        resetVisor = false;
    }
    
    private void keylistener(int evt){
        System.out.println("Oi");
        switch(evt){
            case KeyEvent.VK_8:
                addDigit("8");
                    break;
            case KeyEvent.VK_9:
                addDigit("9");
            default:
                    break;
        }
    }
    
    private Double calculate(Double value1, Double value2, String operation) {
        switch(operation) {
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "x":
                result = value1 * value2;
                break;
            case "/":
                result = value1 / value2;
                break;
        }
        return result;
    }
    
    private void addDigit(String input) {
        if(equalLastPressed) {
            resetCalculator();
        }
        
        if(resetVisor) {
            jVisor.setText("");
            resetVisor = false;
        }
        jVisor.setText(jVisor.getText() + input);
        System.out.println("Oi");
    }
    
    private void addDecimal(){
        if(equalLastPressed == true){
            resetCalculator();
        }
        if(jVisor.getText().equals("")) {
            addDigit("0.");
        } else if(!jVisor.getText().contains(".")) {
            addDigit(".");
        }
    }
    
    private void addOperation(String input) {
         if(value1 != null && equalLastPressed == false){
            value2 = Double.parseDouble(jVisor.getText());
            jAuxVisor.setText(jAuxVisor.getText()+jVisor.getText());
            value1 = calculate(value1, value2, operation);
            jVisor.setText(value1+"");
        }
        
        value1 = Double.parseDouble(jVisor.getText());
        operation = input;
        jAuxVisor.setText(jVisor.getText() + " " + input + " ");
        resetVisor = true;  
        equalLastPressed = false;
    }
    
    private void equalPress(){
        String visorStr = jVisor.getText();
        value2 = Double.parseDouble(visorStr);
        jAuxVisor.setText(jAuxVisor.getText()+jVisor.getText()); //+ " =");
        jVisor.setText(calculate(value1, value2, operation)+"");
        equalLastPressed = true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jAuxVisor = new javax.swing.JTextField();
        jButtonInvertSign = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonDecimal = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonSubtract = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonMulitply = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButtonSquare = new javax.swing.JButton();
        jButtonInvert = new javax.swing.JButton();
        jButtonSqrt = new javax.swing.JButton();
        jButtonPercent = new javax.swing.JButton();
        jButtonClearEntry = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonBackspace = new javax.swing.JButton();
        jVisor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setFocusTraversalPolicyProvider(true);
        setIconImages(null);
        setLocation(new java.awt.Point(500, 200));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });

        jAuxVisor.setEditable(false);
        jAuxVisor.setBackground(new java.awt.Color(153, 153, 153));
        jAuxVisor.setForeground(new java.awt.Color(255, 255, 255));
        jAuxVisor.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jAuxVisor.setBorder(null);

        jButtonInvertSign.setBackground(new java.awt.Color(0, 0, 0));
        jButtonInvertSign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonInvertSign.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInvertSign.setText("+/-");
        jButtonInvertSign.setBorder(null);
        jButtonInvertSign.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonInvertSign.setFocusable(false);
        jButtonInvertSign.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInvertSign.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonInvertSign.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonInvertSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonInvertSignMouseClicked(evt);
            }
        });

        jButton0.setBackground(new java.awt.Color(0, 0, 0));
        jButton0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton0.setForeground(new java.awt.Color(255, 255, 255));
        jButton0.setText("0");
        jButton0.setBorder(null);
        jButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton0.setFocusable(false);
        jButton0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton0.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton0.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton0MouseClicked(evt);
            }
        });

        jButtonDecimal.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDecimal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDecimal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDecimal.setText(",");
        jButtonDecimal.setBorder(null);
        jButtonDecimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonDecimal.setFocusable(false);
        jButtonDecimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDecimal.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonDecimal.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonDecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDecimalMouseClicked(evt);
            }
        });

        jButtonEquals.setBackground(new java.awt.Color(51, 153, 255));
        jButtonEquals.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEquals.setForeground(java.awt.Color.white);
        jButtonEquals.setText("=");
        jButtonEquals.setBorder(null);
        jButtonEquals.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEquals.setFocusable(false);
        jButtonEquals.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonEquals.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonEquals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEqualsMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("1");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton1.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton2.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("3");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton3.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButtonAdd.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAdd.setForeground(java.awt.Color.white);
        jButtonAdd.setText("+");
        jButtonAdd.setBorder(null);
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAdd.setFocusable(false);
        jButtonAdd.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonAdd.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddMouseClicked(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("5");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton5.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("6");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton6.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButtonSubtract.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSubtract.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSubtract.setForeground(java.awt.Color.white);
        jButtonSubtract.setText("-");
        jButtonSubtract.setBorder(null);
        jButtonSubtract.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSubtract.setFocusable(false);
        jButtonSubtract.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonSubtract.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSubtractMouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("4");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton4.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("8");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton8.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("9");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton9.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButtonMulitply.setBackground(new java.awt.Color(102, 102, 102));
        jButtonMulitply.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonMulitply.setForeground(java.awt.Color.white);
        jButtonMulitply.setText("x");
        jButtonMulitply.setBorder(null);
        jButtonMulitply.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonMulitply.setFocusable(false);
        jButtonMulitply.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonMulitply.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonMulitply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMulitplyMouseClicked(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("7");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton7.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButtonDivide.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDivide.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDivide.setForeground(java.awt.Color.white);
        jButtonDivide.setText("/");
        jButtonDivide.setBorder(null);
        jButtonDivide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonDivide.setFocusable(false);
        jButtonDivide.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonDivide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDivideMouseClicked(evt);
            }
        });

        jButtonSquare.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSquare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSquare.setForeground(java.awt.Color.white);
        jButtonSquare.setText("x²");
        jButtonSquare.setBorder(null);
        jButtonSquare.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSquare.setFocusable(false);
        jButtonSquare.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonSquare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSquareMouseClicked(evt);
            }
        });

        jButtonInvert.setBackground(new java.awt.Color(102, 102, 102));
        jButtonInvert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonInvert.setForeground(java.awt.Color.white);
        jButtonInvert.setText("1/x");
        jButtonInvert.setBorder(null);
        jButtonInvert.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonInvert.setFocusable(false);
        jButtonInvert.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonInvert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonInvertMouseClicked(evt);
            }
        });

        jButtonSqrt.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSqrt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSqrt.setForeground(java.awt.Color.white);
        jButtonSqrt.setText("sqrt");
        jButtonSqrt.setBorder(null);
        jButtonSqrt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSqrt.setFocusable(false);
        jButtonSqrt.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonSqrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSqrtMouseClicked(evt);
            }
        });

        jButtonPercent.setBackground(new java.awt.Color(102, 102, 102));
        jButtonPercent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonPercent.setForeground(java.awt.Color.white);
        jButtonPercent.setText("%");
        jButtonPercent.setBorder(null);
        jButtonPercent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonPercent.setFocusable(false);
        jButtonPercent.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonPercent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPercentMouseClicked(evt);
            }
        });

        jButtonClearEntry.setBackground(new java.awt.Color(102, 102, 102));
        jButtonClearEntry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonClearEntry.setForeground(java.awt.Color.white);
        jButtonClearEntry.setText("CE");
        jButtonClearEntry.setBorder(null);
        jButtonClearEntry.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonClearEntry.setFocusable(false);
        jButtonClearEntry.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonClearEntry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearEntryMouseClicked(evt);
            }
        });
        jButtonClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearEntryActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(102, 102, 102));
        jButtonClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonClear.setForeground(java.awt.Color.white);
        jButtonClear.setText("C");
        jButtonClear.setBorder(null);
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonClear.setFocusable(false);
        jButtonClear.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearMouseClicked(evt);
            }
        });

        jButtonBackspace.setBackground(new java.awt.Color(102, 102, 102));
        jButtonBackspace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBackspace.setForeground(java.awt.Color.white);
        jButtonBackspace.setText("Del");
        jButtonBackspace.setBorder(null);
        jButtonBackspace.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBackspace.setFocusable(false);
        jButtonBackspace.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonBackspace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBackspaceMouseClicked(evt);
            }
        });

        jVisor.setEditable(false);
        jVisor.setBackground(new java.awt.Color(153, 153, 153));
        jVisor.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jVisor.setForeground(new java.awt.Color(255, 255, 255));
        jVisor.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jVisor.setBorder(null);
        jVisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisorActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(6, 4));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jVisor)
                    .addComponent(jAuxVisor, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonInvert, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonMulitply, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonInvertSign, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAuxVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jVisor, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPercent, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButtonClearEntry, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButtonBackspace, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonInvert, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jButtonSquare, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jButtonSqrt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonDivide, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonMulitply, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButtonSubtract, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInvertSign, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButton0, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButtonDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jButtonEquals, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVisorActionPerformed

    private void jButtonBackspaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackspaceMouseClicked
        jVisor.setText(jVisor.getText().substring(0, jVisor.getText().length()-1));
    }//GEN-LAST:event_jButtonBackspaceMouseClicked

    private void jButtonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMouseClicked
        resetCalculator();
    }//GEN-LAST:event_jButtonClearMouseClicked

    private void jButtonClearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClearEntryActionPerformed

    private void jButtonClearEntryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearEntryMouseClicked
        jVisor.setText("");
    }//GEN-LAST:event_jButtonClearEntryMouseClicked

    private void jButtonPercentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPercentMouseClicked
        if(value1 != null) {
            String visorStr = jVisor.getText();
            double visorDouble = Double.parseDouble(visorStr);
            jVisor.setText((visorDouble/100)+"");
        }
    }//GEN-LAST:event_jButtonPercentMouseClicked

    private void jButtonSqrtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSqrtMouseClicked
        String visorStr = jVisor.getText();
        double visorDouble = Double.parseDouble(visorStr);
        jVisor.setText(Math.sqrt(visorDouble)+"");
    }//GEN-LAST:event_jButtonSqrtMouseClicked

    private void jButtonInvertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInvertMouseClicked
        String visorStr = jVisor.getText();
        double visorDouble = Double.parseDouble(visorStr);
        jVisor.setText((1/visorDouble)+"");
    }//GEN-LAST:event_jButtonInvertMouseClicked

    private void jButtonSquareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSquareMouseClicked
        String visorStr = jVisor.getText();
        double visorDouble = Double.parseDouble(visorStr);
        jVisor.setText(Math.pow(visorDouble, 2)+"");
    }//GEN-LAST:event_jButtonSquareMouseClicked

    private void jButtonDivideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDivideMouseClicked
        addOperation("/");
    }//GEN-LAST:event_jButtonDivideMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        addDigit("7");
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButtonMulitplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMulitplyMouseClicked
        addOperation("x");
    }//GEN-LAST:event_jButtonMulitplyMouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        addDigit("9");
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        addDigit("8");
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        addDigit("4");
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButtonSubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSubtractMouseClicked
        addOperation("-");
    }//GEN-LAST:event_jButtonSubtractMouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        addDigit("6");
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        addDigit("5");
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButtonAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseClicked
        addOperation("+");
    }//GEN-LAST:event_jButtonAddMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        addDigit("3");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        addDigit("2");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        addDigit("1");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButtonEqualsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEqualsMouseClicked
        equalPress();
    }//GEN-LAST:event_jButtonEqualsMouseClicked

    private void jButtonDecimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDecimalMouseClicked
        addDecimal();
    }//GEN-LAST:event_jButtonDecimalMouseClicked

    private void jButton0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton0MouseClicked
        addDigit("0");
    }//GEN-LAST:event_jButton0MouseClicked

    private void jButtonInvertSignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInvertSignMouseClicked
        String visorStr = jVisor.getText();
        double visorDouble = Double.parseDouble(visorStr);
        jVisor.setText((-visorDouble)+"");
    }//GEN-LAST:event_jButtonInvertSignMouseClicked

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        keylistener(evt.getKeyCode());
    }//GEN-LAST:event_jPanel1KeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAuxVisor;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBackspace;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonClearEntry;
    private javax.swing.JButton jButtonDecimal;
    private javax.swing.JButton jButtonDivide;
    private javax.swing.JButton jButtonEquals;
    private javax.swing.JButton jButtonInvert;
    private javax.swing.JButton jButtonInvertSign;
    private javax.swing.JButton jButtonMulitply;
    private javax.swing.JButton jButtonPercent;
    private javax.swing.JButton jButtonSqrt;
    private javax.swing.JButton jButtonSquare;
    private javax.swing.JButton jButtonSubtract;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jVisor;
    // End of variables declaration//GEN-END:variables
}
