

import com.sun.source.doctree.AttributeTree;
import java.awt.event.KeyEvent;
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
    private boolean operationLastPressed;
    private final int MAX_DIGITS = 18;
    
    private void resetCalculator(){
        value1 = null;
        value2 = null;
        operation = null;
        jVisor.setText("");
        jAuxVisor.setText("");
        equalLastPressed = false;
        resetVisor = false;
        operationLastPressed = false;
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
        operationLastPressed = false;
        
        if(equalLastPressed) {
            resetCalculator();
        }
        
        if(resetVisor) {
            jVisor.setText("");
            resetVisor = false;
        }
        if(jVisor.getText().length() < MAX_DIGITS){
            jVisor.setText(jVisor.getText() + input);
        }
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
        
        if(value1 != null && equalLastPressed == false && operationLastPressed == false){
            value2 = Double.parseDouble(jVisor.getText());
            jAuxVisor.setText(jAuxVisor.getText()+jVisor.getText());
            value1 = calculate(value1, value2, operation);
            setFormatedText(value1+"");
        }
        
        equalLastPressed = false;
        value1 = Double.parseDouble(jVisor.getText());
        operation = input;
        jAuxVisor.setText(jVisor.getText() + " " + input + " ");
        resetVisor = true;  
        operationLastPressed = true;
    }
    
    private void equalPress(){
        String visorStr = jVisor.getText();
        value2 = Double.parseDouble(visorStr);
        if(equalLastPressed){
            jAuxVisor.setText(jAuxVisor.getText()+ " " + operation + " " + jVisor.getText());
        } else {
            jAuxVisor.setText(jAuxVisor.getText()+jVisor.getText());
        }
        setFormatedText(calculate(value1, value2, operation)+"");
        equalLastPressed = true;
        operationLastPressed = false;
    }
    
    private void setFormatedText(String text) {

        if(text.substring(text.length() - 2).equals(".0")){
            text = text.substring(0, text.length() - 2);
        }
        
        if (text.length() > MAX_DIGITS){
            if(text.contains("E")){
                int sIndex = text.indexOf("E");
                String sLeading = text.substring(0, text.length() - sIndex + 1);
                String sTrailing = text.substring(text.length() - sIndex + 1);
                
                int trailingLength = sTrailing.length();
                //int leadingLength = sLeading.length();
                
                sLeading = sLeading.substring(0, MAX_DIGITS - trailingLength);
                text = sLeading + sTrailing;
            }
            else {
                text = text.substring(0, MAX_DIGITS);
            }
            
            if (text.substring(text.length() - 1).equals(".")){
                text = text.substring(0, text.length() - 1);
            }
        }
        
        jVisor.setText(text);
    }
    
    private void keyListener(int evt){
        System.out.println(evt);
        switch(evt){
            case 48:
                addDigit("0");
                    break;
            case KeyEvent.VK_1:
                addDigit("1");
                    break;
            case KeyEvent.VK_2:
                addDigit("2");
                    break;
            case KeyEvent.VK_3:
                addDigit("3");
                    break;
            case KeyEvent.VK_4:
                addDigit("4");
                    break;
            case KeyEvent.VK_5:
                addDigit("5");
                    break;
            case KeyEvent.VK_6:
                addDigit("6");
                    break;
            case KeyEvent.VK_7:
                addDigit("7");
                    break;
            case KeyEvent.VK_8:
                addDigit("8");
                    break;
            case KeyEvent.VK_9:
                addDigit("9");
                    break;
            case 43:
                addOperation("+");
                    break;
            case KeyEvent.VK_MINUS:
                addOperation("-");
                    break;
            case 42:
                addOperation("x");
                    break;
            case KeyEvent.VK_SLASH:
                addOperation("/");
                    break;
            case KeyEvent.VK_COMMA:
                addDecimal();
                    break;
            case KeyEvent.VK_ESCAPE:
                resetCalculator();
                    break;
            case KeyEvent.VK_BACK_SPACE:
                jVisor.setText(jVisor.getText().substring(0, jVisor.getText().length()-1));
                    break;
            case KeyEvent.VK_ENTER:
                equalPress();
                    break;
            default:
                System.out.println("Default");
                    break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jAuxVisor = new javax.swing.JTextField();
        jVisor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonPercent = new javax.swing.JButton();
        jButtonClearEntry = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonBackspace = new javax.swing.JButton();
        jButtonInvert = new javax.swing.JButton();
        jButtonSquare = new javax.swing.JButton();
        jButtonSqrt = new javax.swing.JButton();
        jButtonDivide = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonMulitply = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonSubtract = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonInvertSign = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonDecimal = new javax.swing.JButton();
        jButtonEquals = new javax.swing.JButton();

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

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);
        jPanel2.setFocusable(false);
        jPanel2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jPanel2ComponentResized(evt);
            }
        });
        jPanel2.setLayout(new java.awt.GridLayout(6, 4, 1, 1));

        jButtonPercent.setBackground(new java.awt.Color(102, 102, 102));
        jButtonPercent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonPercent.setForeground(java.awt.Color.white);
        jButtonPercent.setText("%");
        jButtonPercent.setAlignmentY(0.0F);
        jButtonPercent.setBorder(null);
        jButtonPercent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonPercent.setFocusable(false);
        jButtonPercent.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonPercent.setRequestFocusEnabled(false);
        jButtonPercent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonPercentMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonPercent);

        jButtonClearEntry.setBackground(new java.awt.Color(102, 102, 102));
        jButtonClearEntry.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonClearEntry.setForeground(java.awt.Color.white);
        jButtonClearEntry.setText("CE");
        jButtonClearEntry.setAlignmentY(0.0F);
        jButtonClearEntry.setBorder(null);
        jButtonClearEntry.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonClearEntry.setFocusable(false);
        jButtonClearEntry.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonClearEntry.setRequestFocusEnabled(false);
        jButtonClearEntry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonClearEntryMouseReleased(evt);
            }
        });
        jButtonClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearEntryActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonClearEntry);

        jButtonClear.setBackground(new java.awt.Color(102, 102, 102));
        jButtonClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonClear.setForeground(java.awt.Color.white);
        jButtonClear.setText("C");
        jButtonClear.setAlignmentY(0.0F);
        jButtonClear.setBorder(null);
        jButtonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonClear.setFocusable(false);
        jButtonClear.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonClear.setRequestFocusEnabled(false);
        jButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonClearMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonClear);

        jButtonBackspace.setBackground(new java.awt.Color(102, 102, 102));
        jButtonBackspace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBackspace.setForeground(java.awt.Color.white);
        jButtonBackspace.setText("◄");
        jButtonBackspace.setAlignmentY(0.0F);
        jButtonBackspace.setBorder(null);
        jButtonBackspace.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonBackspace.setFocusable(false);
        jButtonBackspace.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonBackspace.setRequestFocusEnabled(false);
        jButtonBackspace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonBackspaceMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonBackspace);

        jButtonInvert.setBackground(new java.awt.Color(102, 102, 102));
        jButtonInvert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonInvert.setForeground(java.awt.Color.white);
        jButtonInvert.setText("1/x");
        jButtonInvert.setAlignmentY(0.0F);
        jButtonInvert.setBorder(null);
        jButtonInvert.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonInvert.setFocusable(false);
        jButtonInvert.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonInvert.setRequestFocusEnabled(false);
        jButtonInvert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonInvertMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonInvert);

        jButtonSquare.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSquare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSquare.setForeground(java.awt.Color.white);
        jButtonSquare.setText("x²");
        jButtonSquare.setAlignmentY(0.0F);
        jButtonSquare.setBorder(null);
        jButtonSquare.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSquare.setFocusable(false);
        jButtonSquare.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonSquare.setRequestFocusEnabled(false);
        jButtonSquare.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonSquareMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonSquare);

        jButtonSqrt.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSqrt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSqrt.setForeground(java.awt.Color.white);
        jButtonSqrt.setText("√");
        jButtonSqrt.setAlignmentY(0.0F);
        jButtonSqrt.setBorder(null);
        jButtonSqrt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSqrt.setFocusable(false);
        jButtonSqrt.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonSqrt.setRequestFocusEnabled(false);
        jButtonSqrt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonSqrtMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonSqrt);

        jButtonDivide.setBackground(new java.awt.Color(102, 102, 102));
        jButtonDivide.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDivide.setForeground(java.awt.Color.white);
        jButtonDivide.setText("÷");
        jButtonDivide.setAlignmentY(0.0F);
        jButtonDivide.setBorder(null);
        jButtonDivide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonDivide.setFocusable(false);
        jButtonDivide.setMaximumSize(new java.awt.Dimension(73, 73));
        jButtonDivide.setRequestFocusEnabled(false);
        jButtonDivide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonDivideMouseReleased(evt);
            }
        });
        jButtonDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivideActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDivide);

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("7");
        jButton7.setAlignmentY(0.0F);
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton7.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton7.setRequestFocusEnabled(false);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton7MouseReleased(evt);
            }
        });
        jPanel2.add(jButton7);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("8");
        jButton8.setAlignmentY(0.0F);
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton8.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton8.setRequestFocusEnabled(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton8MouseReleased(evt);
            }
        });
        jPanel2.add(jButton8);

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("9");
        jButton9.setAlignmentY(0.0F);
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.setFocusable(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton9.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton9.setRequestFocusEnabled(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton9MouseReleased(evt);
            }
        });
        jPanel2.add(jButton9);

        jButtonMulitply.setBackground(new java.awt.Color(102, 102, 102));
        jButtonMulitply.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonMulitply.setForeground(java.awt.Color.white);
        jButtonMulitply.setText("x");
        jButtonMulitply.setAlignmentY(0.0F);
        jButtonMulitply.setBorder(null);
        jButtonMulitply.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonMulitply.setFocusable(false);
        jButtonMulitply.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonMulitply.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonMulitply.setRequestFocusEnabled(false);
        jButtonMulitply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonMulitplyMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonMulitply);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("4");
        jButton4.setAlignmentY(0.0F);
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton4.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton4.setRequestFocusEnabled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("5");
        jButton5.setAlignmentY(0.0F);
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton5.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton5.setRequestFocusEnabled(false);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("6");
        jButton6.setAlignmentY(0.0F);
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton6.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton6.setRequestFocusEnabled(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton6MouseReleased(evt);
            }
        });
        jPanel2.add(jButton6);

        jButtonSubtract.setBackground(new java.awt.Color(102, 102, 102));
        jButtonSubtract.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSubtract.setForeground(java.awt.Color.white);
        jButtonSubtract.setText("-");
        jButtonSubtract.setAlignmentY(0.0F);
        jButtonSubtract.setBorder(null);
        jButtonSubtract.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonSubtract.setFocusable(false);
        jButtonSubtract.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonSubtract.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonSubtract.setRequestFocusEnabled(false);
        jButtonSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonSubtractMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonSubtract);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("1");
        jButton1.setAlignmentY(0.0F);
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton1.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton1.setRequestFocusEnabled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");
        jButton2.setAlignmentY(0.0F);
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton2.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton2.setRequestFocusEnabled(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("3");
        jButton3.setAlignmentY(0.0F);
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton3.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton3.setRequestFocusEnabled(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jPanel2.add(jButton3);

        jButtonAdd.setBackground(new java.awt.Color(102, 102, 102));
        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAdd.setForeground(java.awt.Color.white);
        jButtonAdd.setText("+");
        jButtonAdd.setAlignmentY(0.0F);
        jButtonAdd.setBorder(null);
        jButtonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonAdd.setFocusable(false);
        jButtonAdd.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonAdd.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonAdd.setRequestFocusEnabled(false);
        jButtonAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonAddMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonAdd);

        jButtonInvertSign.setBackground(new java.awt.Color(0, 0, 0));
        jButtonInvertSign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonInvertSign.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInvertSign.setText("±");
        jButtonInvertSign.setAlignmentY(0.0F);
        jButtonInvertSign.setBorder(null);
        jButtonInvertSign.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonInvertSign.setFocusable(false);
        jButtonInvertSign.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonInvertSign.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonInvertSign.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonInvertSign.setRequestFocusEnabled(false);
        jButtonInvertSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonInvertSignMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonInvertSign);

        jButton0.setBackground(new java.awt.Color(0, 0, 0));
        jButton0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton0.setForeground(new java.awt.Color(255, 255, 255));
        jButton0.setText("0");
        jButton0.setAlignmentY(0.0F);
        jButton0.setBorder(null);
        jButton0.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton0.setFocusable(false);
        jButton0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton0.setMaximumSize(new java.awt.Dimension(292, 200));
        jButton0.setMinimumSize(new java.awt.Dimension(73, 50));
        jButton0.setRequestFocusEnabled(false);
        jButton0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton0MouseReleased(evt);
            }
        });
        jPanel2.add(jButton0);

        jButtonDecimal.setBackground(new java.awt.Color(0, 0, 0));
        jButtonDecimal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDecimal.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDecimal.setText(",");
        jButtonDecimal.setAlignmentY(0.0F);
        jButtonDecimal.setBorder(null);
        jButtonDecimal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonDecimal.setFocusable(false);
        jButtonDecimal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonDecimal.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonDecimal.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonDecimal.setRequestFocusEnabled(false);
        jButtonDecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonDecimalMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonDecimal);

        jButtonEquals.setBackground(new java.awt.Color(51, 153, 255));
        jButtonEquals.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonEquals.setForeground(java.awt.Color.white);
        jButtonEquals.setText("=");
        jButtonEquals.setAlignmentY(0.0F);
        jButtonEquals.setBorder(null);
        jButtonEquals.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonEquals.setFocusable(false);
        jButtonEquals.setMaximumSize(new java.awt.Dimension(292, 200));
        jButtonEquals.setMinimumSize(new java.awt.Dimension(73, 50));
        jButtonEquals.setRequestFocusEnabled(false);
        jButtonEquals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonEqualsMouseReleased(evt);
            }
        });
        jPanel2.add(jButtonEquals);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAuxVisor, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(jVisor))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAuxVisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jVisor, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 182, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jVisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jVisorActionPerformed

    private void jButtonClearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClearEntryActionPerformed

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        keyListener(evt.getKeyChar());
    }//GEN-LAST:event_jPanel1KeyTyped

    private void jPanel2ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel2ComponentResized
    }//GEN-LAST:event_jPanel2ComponentResized

    private void jButton0MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton0MouseReleased
        addDigit("0");
    }//GEN-LAST:event_jButton0MouseReleased

    private void jButtonInvertSignMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInvertSignMouseReleased
        String visorStr = jVisor.getText();
        double visorDouble = Double.parseDouble(visorStr);
        setFormatedText((-visorDouble)+"");
    }//GEN-LAST:event_jButtonInvertSignMouseReleased

    private void jButtonDecimalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDecimalMouseReleased
        addDecimal();
    }//GEN-LAST:event_jButtonDecimalMouseReleased

    private void jButtonEqualsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEqualsMouseReleased
        equalPress();
    }//GEN-LAST:event_jButtonEqualsMouseReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        addDigit("1");
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        addDigit("2");
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        addDigit("3");
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButtonAddMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddMouseReleased
        addOperation("+");
    }//GEN-LAST:event_jButtonAddMouseReleased

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        addDigit("4");
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
        addDigit("5");
    }//GEN-LAST:event_jButton5MouseReleased

    private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseReleased
        addDigit("6");
    }//GEN-LAST:event_jButton6MouseReleased

    private void jButtonSubtractMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSubtractMouseReleased
        addOperation("-");
    }//GEN-LAST:event_jButtonSubtractMouseReleased

    private void jButton7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseReleased
        addDigit("7");
    }//GEN-LAST:event_jButton7MouseReleased

    private void jButton8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseReleased
        addDigit("8");
    }//GEN-LAST:event_jButton8MouseReleased

    private void jButton9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseReleased
        addDigit("9");
    }//GEN-LAST:event_jButton9MouseReleased

    private void jButtonMulitplyMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMulitplyMouseReleased
        addOperation("x");
    }//GEN-LAST:event_jButtonMulitplyMouseReleased

    private void jButtonInvertMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInvertMouseReleased
        String visorStr = jVisor.getText();
        double visorDouble = Double.parseDouble(visorStr);
        setFormatedText((1/visorDouble)+"");
    }//GEN-LAST:event_jButtonInvertMouseReleased

    private void jButtonSquareMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSquareMouseReleased
        String visorStr = jVisor.getText();
        double visorDouble = Double.parseDouble(visorStr);
        setFormatedText(Math.pow(visorDouble, 2)+"");
    }//GEN-LAST:event_jButtonSquareMouseReleased

    private void jButtonSqrtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSqrtMouseReleased
        String visorStr = jVisor.getText();
        double visorDouble = Double.parseDouble(visorStr);
        setFormatedText(Math.sqrt(visorDouble)+"");
    }//GEN-LAST:event_jButtonSqrtMouseReleased

    private void jButtonDivideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDivideMouseReleased
        addOperation("/");
    }//GEN-LAST:event_jButtonDivideMouseReleased

    private void jButtonPercentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPercentMouseReleased
        if(value1 != null) {
            String visorStr = jVisor.getText();
            double visorDouble = Double.parseDouble(visorStr);
            jVisor.setText((visorDouble/100)+"");
        }
    }//GEN-LAST:event_jButtonPercentMouseReleased

    private void jButtonClearEntryMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearEntryMouseReleased
        jVisor.setText("");
    }//GEN-LAST:event_jButtonClearEntryMouseReleased

    private void jButtonClearMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMouseReleased
        resetCalculator();
    }//GEN-LAST:event_jButtonClearMouseReleased

    private void jButtonBackspaceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackspaceMouseReleased
        jVisor.setText(jVisor.getText().substring(0, jVisor.getText().length()-1));
    }//GEN-LAST:event_jButtonBackspaceMouseReleased

    private void jButtonDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDivideActionPerformed

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
