package com.mycompany.sudoku_solver;
/**
 *
 * @author Viswanadh
 */
import java.awt.Color;
import javax.swing.*;

public class SudokuFile extends javax.swing.JFrame {
    
    private String turn="1";
    private boolean globalFlag=true;//used in showSolution button
    private boolean globalFlag2=true;//used for checkMoves
    private String solvedBoard[][]={
        {"2","9","8","5","1","6","7","3","4"},
        {"4","1","3","2","7","8","5","6","9"},
        {"7","5","6","3","4","9","1","2","8"},
        {"8","2","1","4","3","5","6","9","7"},
        {"5","3","4","6","9","7","2","8","1"},
        {"9","6","7","1","8","2","3","4","5"},
        {"1","4","2","8","5","3","9","7","6"},
        {"3","7","5","9","6","4","8","1","2"},
        {"6","8","9","7","2","1","4","5","3"}
    };
    private void AssignColorForSelectionButton(JButton button){
        selectionbutton1.setBackground(Color.black);
        selectionbutton2.setBackground(Color.black);
        selectionbutton3.setBackground(Color.black);
        selectionbutton4.setBackground(Color.black);
        selectionbutton5.setBackground(Color.black);
        selectionbutton6.setBackground(Color.black);
        selectionbutton7.setBackground(Color.black);
        selectionbutton8.setBackground(Color.black);
        selectionbutton9.setBackground(Color.black);
        
        button.setBackground(Color.blue);
    }
    private void checkMoves(){
        JButton btns[][]={  {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                            {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                            {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                            {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                            {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                            {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                            {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                            {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                            {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
                        };
        JButton predefined[] = {r1c4,r1c7,r1c8,r1c9,r2c1,r2c5,r2c6,r2c7,r2c9,r3c1,r3c3,r3c5,r3c8,r4c5,r4c6,r4c8,
        r5c2,r5c3,r5c7,r5c8,r6c2,r6c4,r6c5,r7c2,r7c5,r7c7,r7c9,r8c1,r8c4,r8c5,r8c9,r9c1,r9c2,r9c3,r9c6};
        if(globalFlag2){//this is for checking
            globalFlag2=false;
            checkbt.setText("Reset");
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    boolean flag=true;
                    for(int k=0;k<predefined.length;k++){
                        if(btns[i][j]==predefined[k]){
                            flag=false;
                            break;
                        }
                    }
                        if(flag){
                            if(!btns[i][j].getText().equals("") && btns[i][j].getText().equals(solvedBoard[i][j])){
                                btns[i][j].setBackground(Color.green);
                            }
                            else if(!btns[i][j].getText().equals("") && !btns[i][j].getText().equals(solvedBoard[i][j])){
                                btns[i][j].setBackground(Color.red);
                            }
                        }
                }
            }
        }
        else{ //this is for reset
            globalFlag2=true;
            checkbt.setText("Check and Reset");
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    boolean flag = true;
                    for(int k=0;k<predefined.length;k++){
                        if(btns[i][j]==predefined[k]){
                            flag=false;
                            break;
                        }
                    }
                    if(flag==true){
                        btns[i][j].setText("");
                        btns[i][j].setBackground(Color.white);
                        btns[i][j].setForeground(Color.black);
                    }
                }
            }
        }
    }
    private void resetGame()
    {
        JButton predefined[] = {r1c4,r1c7,r1c8,r1c9,r2c1,r2c5,r2c6,r2c7,r2c9,r3c1,r3c3,r3c5,r3c8,r4c5,r4c6,r4c8,
        r5c2,r5c3,r5c7,r5c8,r6c2,r6c4,r6c5,r7c2,r7c5,r7c7,r7c9,r8c1,r8c4,r8c5,r8c9,r9c1,r9c2,r9c3,r9c6};
        
        JButton btns[][]={  {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                            {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                            {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                            {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                            {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                            {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                            {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                            {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                            {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
                        };
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                boolean flag = true;
                for(int k=0;k<predefined.length;k++){
                    if(btns[i][j]==predefined[k]){
                        flag=false;
                        break;
                    }
                }
                if(flag==true){
                    btns[i][j].setText("");
                    btns[i][j].setBackground(Color.white);
                    btns[i][j].setForeground(Color.black);
                }
            }
        }
    }
    
    private void showSolution(){
        JButton predefined[] = {r1c4,r1c7,r1c8,r1c9,r2c1,r2c5,r2c6,r2c7,r2c9,r3c1,r3c3,r3c5,r3c8,r4c5,r4c6,r4c8,
        r5c2,r5c3,r5c7,r5c8,r6c2,r6c4,r6c5,r7c2,r7c5,r7c7,r7c9,r8c1,r8c4,r8c5,r8c9,r9c1,r9c2,r9c3,r9c6};
        
        JButton btns[][]={  {r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9},
                            {r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9},
                            {r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9},
                            {r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9},
                            {r5c1,r5c2,r5c3,r5c4,r5c5,r5c6,r5c7,r5c8,r5c9},
                            {r6c1,r6c2,r6c3,r6c4,r6c5,r6c6,r6c7,r6c8,r6c9},
                            {r7c1,r7c2,r7c3,r7c4,r7c5,r7c6,r7c7,r7c8,r7c9},
                            {r8c1,r8c2,r8c3,r8c4,r8c5,r8c6,r8c7,r8c8,r8c9},
                            {r9c1,r9c2,r9c3,r9c4,r9c5,r9c6,r9c7,r9c8,r9c9},
                        };
        if(globalFlag){ //this is when button shows "show solution"
            globalFlag=false;
            solbt.setText("Hide Solution");
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    boolean flag=true;
                    for(int k=0;k<predefined.length;k++){
                        if(predefined[k]==btns[i][j]){
                     //       System.out.println(predefined[k]);
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        btns[i][j].setText(solvedBoard[i][j]);
                        btns[i][j].setBackground(Color.white);
                        btns[i][j].setForeground(Color.black);
                    }
                }
            }
        }
        else{ //this is done when button shows "hide solution"
            globalFlag=true;
            solbt.setText("Show Solution");
            resetGame();
//            for(int i=1;i<=9;i++){
//                for(int j=1;j<=9;j++){
//                    boolean flag=true;
//                    for(int k=0;k<predefined.length;k++){
//                        if(predefined[k]==btns[i][j]){
//                            flag=false;
//                            break;
//                        }
//                    }
//                    if(flag){
//                        btns[i][j].setText("");
//                        btns[i][j].setBackground(Color.white);
//                    }
//                }
//            }
        }
    }
    
    /**
     * Creates new form SudokuFile
     */
    public SudokuFile() {
        initComponents();
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        r1c1 = new javax.swing.JButton();
        r1c2 = new javax.swing.JButton();
        r1c3 = new javax.swing.JButton();
        r2c1 = new javax.swing.JButton();
        r3c1 = new javax.swing.JButton();
        r2c2 = new javax.swing.JButton();
        r3c2 = new javax.swing.JButton();
        r2c3 = new javax.swing.JButton();
        r3c3 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        r1c4 = new javax.swing.JButton();
        r1c5 = new javax.swing.JButton();
        r1c6 = new javax.swing.JButton();
        r2c4 = new javax.swing.JButton();
        r3c4 = new javax.swing.JButton();
        r2c5 = new javax.swing.JButton();
        r3c5 = new javax.swing.JButton();
        r2c6 = new javax.swing.JButton();
        r3c6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        r1c7 = new javax.swing.JButton();
        r1c8 = new javax.swing.JButton();
        r1c9 = new javax.swing.JButton();
        r2c7 = new javax.swing.JButton();
        r3c7 = new javax.swing.JButton();
        r2c8 = new javax.swing.JButton();
        r3c8 = new javax.swing.JButton();
        r2c9 = new javax.swing.JButton();
        r3c9 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        r4c7 = new javax.swing.JButton();
        r4c8 = new javax.swing.JButton();
        r4c9 = new javax.swing.JButton();
        r5c7 = new javax.swing.JButton();
        r6c7 = new javax.swing.JButton();
        r5c8 = new javax.swing.JButton();
        r6c8 = new javax.swing.JButton();
        r5c9 = new javax.swing.JButton();
        r6c9 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        r4c4 = new javax.swing.JButton();
        r4c5 = new javax.swing.JButton();
        r4c6 = new javax.swing.JButton();
        r5c4 = new javax.swing.JButton();
        r6c4 = new javax.swing.JButton();
        r5c5 = new javax.swing.JButton();
        r6c5 = new javax.swing.JButton();
        r5c6 = new javax.swing.JButton();
        r6c6 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        r4c1 = new javax.swing.JButton();
        r4c2 = new javax.swing.JButton();
        r4c3 = new javax.swing.JButton();
        r5c1 = new javax.swing.JButton();
        r6c1 = new javax.swing.JButton();
        r5c2 = new javax.swing.JButton();
        r6c2 = new javax.swing.JButton();
        r5c3 = new javax.swing.JButton();
        r6c3 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        r7c4 = new javax.swing.JButton();
        r7c5 = new javax.swing.JButton();
        r7c6 = new javax.swing.JButton();
        r8c4 = new javax.swing.JButton();
        r9c4 = new javax.swing.JButton();
        r8c5 = new javax.swing.JButton();
        r9c5 = new javax.swing.JButton();
        r8c6 = new javax.swing.JButton();
        r9c6 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        r7c1 = new javax.swing.JButton();
        r7c2 = new javax.swing.JButton();
        r7c3 = new javax.swing.JButton();
        r8c1 = new javax.swing.JButton();
        r9c1 = new javax.swing.JButton();
        r8c2 = new javax.swing.JButton();
        r9c2 = new javax.swing.JButton();
        r8c3 = new javax.swing.JButton();
        r9c3 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        r7c7 = new javax.swing.JButton();
        r7c8 = new javax.swing.JButton();
        r7c9 = new javax.swing.JButton();
        r8c7 = new javax.swing.JButton();
        r9c7 = new javax.swing.JButton();
        r8c8 = new javax.swing.JButton();
        r9c8 = new javax.swing.JButton();
        r8c9 = new javax.swing.JButton();
        r9c9 = new javax.swing.JButton();
        selectionbutton2 = new javax.swing.JButton();
        selectionbutton1 = new javax.swing.JButton();
        selectionbutton3 = new javax.swing.JButton();
        selectionbutton4 = new javax.swing.JButton();
        selectionbutton5 = new javax.swing.JButton();
        selectionbutton6 = new javax.swing.JButton();
        selectionbutton7 = new javax.swing.JButton();
        selectionbutton8 = new javax.swing.JButton();
        selectionbutton9 = new javax.swing.JButton();
        resetbt = new javax.swing.JButton();
        exitbt = new javax.swing.JButton();
        solbt = new javax.swing.JButton();
        checkbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(560, 750));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        r1c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c1ActionPerformed(evt);
            }
        });

        r1c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c2ActionPerformed(evt);
            }
        });

        r1c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c3ActionPerformed(evt);
            }
        });

        r2c1.setBackground(new java.awt.Color(102, 102, 255));
        r2c1.setText("4");
        r2c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c1ActionPerformed(evt);
            }
        });

        r3c1.setBackground(new java.awt.Color(102, 102, 255));
        r3c1.setText("7");
        r3c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c1ActionPerformed(evt);
            }
        });

        r2c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c2ActionPerformed(evt);
            }
        });

        r3c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c2ActionPerformed(evt);
            }
        });

        r2c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c3ActionPerformed(evt);
            }
        });

        r3c3.setBackground(new java.awt.Color(102, 102, 255));
        r3c3.setText("6");
        r3c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(r3c1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r3c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r3c3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        r1c4.setBackground(new java.awt.Color(102, 102, 255));
        r1c4.setText("5");
        r1c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c4ActionPerformed(evt);
            }
        });

        r1c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c5ActionPerformed(evt);
            }
        });

        r1c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c6ActionPerformed(evt);
            }
        });

        r2c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c4ActionPerformed(evt);
            }
        });

        r3c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c4ActionPerformed(evt);
            }
        });

        r2c5.setBackground(new java.awt.Color(102, 102, 255));
        r2c5.setText("7");
        r2c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c5ActionPerformed(evt);
            }
        });

        r3c5.setBackground(new java.awt.Color(102, 102, 255));
        r3c5.setText("4");
        r3c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c5ActionPerformed(evt);
            }
        });

        r2c6.setBackground(new java.awt.Color(102, 102, 255));
        r2c6.setText("8");
        r2c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c6ActionPerformed(evt);
            }
        });

        r3c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(r3c4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r3c5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r3c6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        r1c7.setBackground(new java.awt.Color(102, 102, 255));
        r1c7.setText("7");
        r1c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c7ActionPerformed(evt);
            }
        });

        r1c8.setBackground(new java.awt.Color(102, 102, 255));
        r1c8.setText("3");
        r1c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c8ActionPerformed(evt);
            }
        });

        r1c9.setBackground(new java.awt.Color(102, 102, 255));
        r1c9.setText("4");
        r1c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1c9ActionPerformed(evt);
            }
        });

        r2c7.setBackground(new java.awt.Color(102, 102, 255));
        r2c7.setText("5");
        r2c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c7ActionPerformed(evt);
            }
        });

        r3c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c7ActionPerformed(evt);
            }
        });

        r2c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c8ActionPerformed(evt);
            }
        });

        r3c8.setBackground(new java.awt.Color(102, 102, 255));
        r3c8.setText("2");
        r3c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c8ActionPerformed(evt);
            }
        });

        r2c9.setBackground(new java.awt.Color(102, 102, 255));
        r2c9.setText("9");
        r2c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2c9ActionPerformed(evt);
            }
        });

        r3c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(r3c7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r3c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r3c9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r3c9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        r4c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c7ActionPerformed(evt);
            }
        });

        r4c8.setBackground(new java.awt.Color(102, 102, 255));
        r4c8.setText("9");
        r4c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c8ActionPerformed(evt);
            }
        });

        r4c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c9ActionPerformed(evt);
            }
        });

        r5c7.setBackground(new java.awt.Color(102, 102, 255));
        r5c7.setText("2");
        r5c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c7ActionPerformed(evt);
            }
        });

        r6c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c7ActionPerformed(evt);
            }
        });

        r5c8.setBackground(new java.awt.Color(102, 102, 255));
        r5c8.setText("8");
        r5c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c8ActionPerformed(evt);
            }
        });

        r6c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c8ActionPerformed(evt);
            }
        });

        r5c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c9ActionPerformed(evt);
            }
        });

        r6c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r4c9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(r6c7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r6c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r6c9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        r4c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c4ActionPerformed(evt);
            }
        });

        r4c5.setBackground(new java.awt.Color(102, 102, 255));
        r4c5.setText("3");
        r4c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c5ActionPerformed(evt);
            }
        });

        r4c6.setBackground(new java.awt.Color(102, 102, 255));
        r4c6.setText("5");
        r4c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c6ActionPerformed(evt);
            }
        });

        r5c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c4ActionPerformed(evt);
            }
        });

        r6c4.setBackground(new java.awt.Color(102, 102, 255));
        r6c4.setText("1");
        r6c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c4ActionPerformed(evt);
            }
        });

        r5c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c5ActionPerformed(evt);
            }
        });

        r6c5.setBackground(new java.awt.Color(102, 102, 255));
        r6c5.setText("8");
        r6c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c5ActionPerformed(evt);
            }
        });

        r5c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c6ActionPerformed(evt);
            }
        });

        r6c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(r6c4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r6c5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r6c6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        r4c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c1ActionPerformed(evt);
            }
        });

        r4c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c2ActionPerformed(evt);
            }
        });

        r4c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4c3ActionPerformed(evt);
            }
        });

        r5c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c1ActionPerformed(evt);
            }
        });

        r6c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c1ActionPerformed(evt);
            }
        });

        r5c2.setBackground(new java.awt.Color(102, 102, 255));
        r5c2.setText("3");
        r5c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c2ActionPerformed(evt);
            }
        });

        r6c2.setBackground(new java.awt.Color(102, 102, 255));
        r6c2.setText("6");
        r6c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c2ActionPerformed(evt);
            }
        });

        r5c3.setBackground(new java.awt.Color(102, 102, 255));
        r5c3.setText("4");
        r5c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5c3ActionPerformed(evt);
            }
        });

        r6c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r6c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(r6c1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r6c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r6c3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r4c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r5c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r6c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        r7c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c4ActionPerformed(evt);
            }
        });

        r7c5.setBackground(new java.awt.Color(102, 102, 255));
        r7c5.setText("5");
        r7c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c5ActionPerformed(evt);
            }
        });

        r7c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c6ActionPerformed(evt);
            }
        });

        r8c4.setBackground(new java.awt.Color(102, 102, 255));
        r8c4.setText("9");
        r8c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c4ActionPerformed(evt);
            }
        });

        r9c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c4ActionPerformed(evt);
            }
        });

        r8c5.setBackground(new java.awt.Color(102, 102, 255));
        r8c5.setText("6");
        r8c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c5ActionPerformed(evt);
            }
        });

        r9c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c5ActionPerformed(evt);
            }
        });

        r8c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c6ActionPerformed(evt);
            }
        });

        r9c6.setBackground(new java.awt.Color(102, 102, 255));
        r9c6.setText("1");
        r9c6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(r9c4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r9c5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r9c6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9c4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        r7c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c1ActionPerformed(evt);
            }
        });

        r7c2.setBackground(new java.awt.Color(102, 102, 255));
        r7c2.setText("4");
        r7c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c2ActionPerformed(evt);
            }
        });

        r7c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c3ActionPerformed(evt);
            }
        });

        r8c1.setBackground(new java.awt.Color(102, 102, 255));
        r8c1.setText("3");
        r8c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c1ActionPerformed(evt);
            }
        });

        r9c1.setBackground(new java.awt.Color(102, 102, 255));
        r9c1.setText("6");
        r9c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c1ActionPerformed(evt);
            }
        });

        r8c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c2ActionPerformed(evt);
            }
        });

        r9c2.setBackground(new java.awt.Color(102, 102, 255));
        r9c2.setText("8");
        r9c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c2ActionPerformed(evt);
            }
        });

        r8c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c3ActionPerformed(evt);
            }
        });

        r9c3.setBackground(new java.awt.Color(102, 102, 255));
        r9c3.setText("9");
        r9c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(r9c1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r9c2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r9c3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        r7c7.setBackground(new java.awt.Color(102, 102, 255));
        r7c7.setText("9");
        r7c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c7ActionPerformed(evt);
            }
        });

        r7c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c8ActionPerformed(evt);
            }
        });

        r7c9.setBackground(new java.awt.Color(102, 102, 255));
        r7c9.setText("6");
        r7c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7c9ActionPerformed(evt);
            }
        });

        r8c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c7ActionPerformed(evt);
            }
        });

        r9c7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c7ActionPerformed(evt);
            }
        });

        r8c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c8ActionPerformed(evt);
            }
        });

        r9c8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c8ActionPerformed(evt);
            }
        });

        r8c9.setBackground(new java.awt.Color(102, 102, 255));
        r8c9.setText("2");
        r8c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r8c9ActionPerformed(evt);
            }
        });

        r9c9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r9c9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r8c9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(r9c7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r9c8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r9c9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r7c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r8c7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r8c9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r9c7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r9c9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        selectionbutton2.setBackground(new java.awt.Color(0, 0, 0));
        selectionbutton2.setForeground(new java.awt.Color(255, 255, 255));
        selectionbutton2.setText("2");
        selectionbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbutton2ActionPerformed(evt);
            }
        });

        selectionbutton1.setBackground(new java.awt.Color(0, 0, 255));
        selectionbutton1.setForeground(new java.awt.Color(255, 255, 255));
        selectionbutton1.setText("1");
        selectionbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbutton1ActionPerformed(evt);
            }
        });

        selectionbutton3.setBackground(new java.awt.Color(0, 0, 0));
        selectionbutton3.setForeground(new java.awt.Color(255, 255, 255));
        selectionbutton3.setText("3");
        selectionbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbutton3ActionPerformed(evt);
            }
        });

        selectionbutton4.setBackground(new java.awt.Color(0, 0, 0));
        selectionbutton4.setForeground(new java.awt.Color(255, 255, 255));
        selectionbutton4.setText("4");
        selectionbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbutton4ActionPerformed(evt);
            }
        });

        selectionbutton5.setBackground(new java.awt.Color(0, 0, 0));
        selectionbutton5.setForeground(new java.awt.Color(255, 255, 255));
        selectionbutton5.setText("5");
        selectionbutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbutton5ActionPerformed(evt);
            }
        });

        selectionbutton6.setBackground(new java.awt.Color(0, 0, 0));
        selectionbutton6.setForeground(new java.awt.Color(255, 255, 255));
        selectionbutton6.setText("6");
        selectionbutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbutton6ActionPerformed(evt);
            }
        });

        selectionbutton7.setBackground(new java.awt.Color(0, 0, 0));
        selectionbutton7.setForeground(new java.awt.Color(255, 255, 255));
        selectionbutton7.setText("7");
        selectionbutton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbutton7ActionPerformed(evt);
            }
        });

        selectionbutton8.setBackground(new java.awt.Color(0, 0, 0));
        selectionbutton8.setForeground(new java.awt.Color(255, 255, 255));
        selectionbutton8.setText("8");
        selectionbutton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbutton8ActionPerformed(evt);
            }
        });

        selectionbutton9.setBackground(new java.awt.Color(0, 0, 0));
        selectionbutton9.setForeground(new java.awt.Color(255, 255, 255));
        selectionbutton9.setText("9");
        selectionbutton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionbutton9ActionPerformed(evt);
            }
        });

        resetbt.setBackground(new java.awt.Color(200, 200, 200));
        resetbt.setText("Reset");
        resetbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtActionPerformed(evt);
            }
        });

        exitbt.setBackground(new java.awt.Color(255, 0, 0));
        exitbt.setText("Exit");
        exitbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtActionPerformed(evt);
            }
        });

        solbt.setBackground(new java.awt.Color(0, 255, 0));
        solbt.setText("Show Solution");
        solbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solbtActionPerformed(evt);
            }
        });

        checkbt.setBackground(new java.awt.Color(100, 100, 100));
        checkbt.setText("Check and Reset");
        checkbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetbt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(solbt)
                            .addGap(46, 46, 46)
                            .addComponent(checkbt))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(selectionbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectionbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitbt, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectionbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectionbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectionbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectionbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectionbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectionbutton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectionbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectionbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbutton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbutton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbutton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbutton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbutton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbutton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionbutton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checkbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(solbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitbt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resetbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectionbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbutton1ActionPerformed
        turn="1";
        AssignColorForSelectionButton(selectionbutton1);
    }//GEN-LAST:event_selectionbutton1ActionPerformed

    private void selectionbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbutton3ActionPerformed
        AssignColorForSelectionButton(selectionbutton3);
        turn="3";
    }//GEN-LAST:event_selectionbutton3ActionPerformed

    private void selectionbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbutton4ActionPerformed
        AssignColorForSelectionButton(selectionbutton4);
        turn="4";
    }//GEN-LAST:event_selectionbutton4ActionPerformed

    private void selectionbutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbutton5ActionPerformed
        AssignColorForSelectionButton(selectionbutton5);
        turn="5";
    }//GEN-LAST:event_selectionbutton5ActionPerformed

    private void selectionbutton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbutton6ActionPerformed
        AssignColorForSelectionButton(selectionbutton6);
        turn="6";
    }//GEN-LAST:event_selectionbutton6ActionPerformed

    private void selectionbutton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbutton7ActionPerformed
        AssignColorForSelectionButton(selectionbutton7);
        turn="7";
    }//GEN-LAST:event_selectionbutton7ActionPerformed

    private void selectionbutton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbutton8ActionPerformed
        AssignColorForSelectionButton(selectionbutton8);
        turn="8";
    }//GEN-LAST:event_selectionbutton8ActionPerformed

    private void selectionbutton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbutton9ActionPerformed
        AssignColorForSelectionButton(selectionbutton9);
        turn="9";
    }//GEN-LAST:event_selectionbutton9ActionPerformed

    private void r1c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c8ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c8ActionPerformed

    private void r1c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c1ActionPerformed
        r1c1.setText(turn);
        r1c1.setBackground(Color.white);
    }//GEN-LAST:event_r1c1ActionPerformed

    private void r1c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c4ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c4ActionPerformed

    private void r1c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c2ActionPerformed
        r1c2.setText(turn);
        r1c2.setBackground(Color.white);
    }//GEN-LAST:event_r1c2ActionPerformed

    private void r1c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c3ActionPerformed
        r1c3.setText(turn);
        r1c3.setBackground(Color.white);
    }//GEN-LAST:event_r1c3ActionPerformed

    private void r1c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c5ActionPerformed
        r1c5.setText(turn);
        r1c5.setBackground(Color.white);
    }//GEN-LAST:event_r1c5ActionPerformed

    private void r1c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c6ActionPerformed
        r1c6.setText(turn);
        r1c6.setBackground(Color.white);
    }//GEN-LAST:event_r1c6ActionPerformed

    private void r2c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c2ActionPerformed
        r2c2.setText(turn);
        r2c2.setBackground(Color.white);
    }//GEN-LAST:event_r2c2ActionPerformed

    private void r2c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c3ActionPerformed
        r2c3.setText(turn);
        r2c3.setBackground(Color.white);
    }//GEN-LAST:event_r2c3ActionPerformed

    private void r2c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c4ActionPerformed
        r2c4.setText(turn);
        r2c4.setBackground(Color.white);
    }//GEN-LAST:event_r2c4ActionPerformed

    private void r2c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c8ActionPerformed
        r2c8.setText(turn);
        r2c8.setBackground(Color.white);
    }//GEN-LAST:event_r2c8ActionPerformed

    private void r3c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c9ActionPerformed
        r3c9.setText(turn);
        r3c9.setBackground(Color.white);
    }//GEN-LAST:event_r3c9ActionPerformed

    private void r3c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c7ActionPerformed
        r3c7.setText(turn);
        r3c7.setBackground(Color.white);
    }//GEN-LAST:event_r3c7ActionPerformed

    private void r3c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c6ActionPerformed
        r3c6.setText(turn);
        r3c6.setBackground(Color.white);
    }//GEN-LAST:event_r3c6ActionPerformed

    private void r3c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c4ActionPerformed
        r3c4.setText(turn);
        r3c4.setBackground(Color.white);
    }//GEN-LAST:event_r3c4ActionPerformed

    private void r3c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c2ActionPerformed
        r3c2.setText(turn);
        r3c2.setBackground(Color.white);
    }//GEN-LAST:event_r3c2ActionPerformed

    private void r4c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c2ActionPerformed
        r4c2.setText(turn);
        r4c2.setBackground(Color.white);
    }//GEN-LAST:event_r4c2ActionPerformed

    private void r4c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c1ActionPerformed
        r4c1.setText(turn);
        r4c1.setBackground(Color.white);
    }//GEN-LAST:event_r4c1ActionPerformed

    private void r4c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c3ActionPerformed
        r4c3.setText(turn);
        r4c3.setBackground(Color.white);
    }//GEN-LAST:event_r4c3ActionPerformed

    private void r4c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c4ActionPerformed
        r4c4.setText(turn);
        r4c4.setBackground(Color.white);
    }//GEN-LAST:event_r4c4ActionPerformed

    private void r4c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c7ActionPerformed
        r4c7.setText(turn);
        r4c7.setBackground(Color.white);
    }//GEN-LAST:event_r4c7ActionPerformed

    private void r4c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c9ActionPerformed
        r4c9.setText(turn);
        r4c9.setBackground(Color.white);
    }//GEN-LAST:event_r4c9ActionPerformed

    private void r5c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c9ActionPerformed
        r5c9.setText(turn);
        r5c9.setBackground(Color.white);
    }//GEN-LAST:event_r5c9ActionPerformed

    private void r5c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c6ActionPerformed
        r5c6.setText(turn);
        r5c6.setBackground(Color.white);
    }//GEN-LAST:event_r5c6ActionPerformed

    private void r5c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c5ActionPerformed
        r5c5.setText(turn);
        r5c5.setBackground(Color.white);
    }//GEN-LAST:event_r5c5ActionPerformed

    private void r5c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c4ActionPerformed
        r5c4.setText(turn);
        r5c4.setBackground(Color.white);
    }//GEN-LAST:event_r5c4ActionPerformed

    private void r5c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c1ActionPerformed
        r5c1.setText(turn);
        r5c1.setBackground(Color.white);
    }//GEN-LAST:event_r5c1ActionPerformed

    private void r6c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c9ActionPerformed
        r6c9.setText(turn);
        r6c9.setBackground(Color.white);
    }//GEN-LAST:event_r6c9ActionPerformed

    private void r6c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c8ActionPerformed
        r6c8.setText(turn);
        r6c8.setBackground(Color.white);
    }//GEN-LAST:event_r6c8ActionPerformed

    private void r6c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c7ActionPerformed
        r6c7.setText(turn);
        r6c7.setBackground(Color.white);
    }//GEN-LAST:event_r6c7ActionPerformed

    private void r6c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c6ActionPerformed
        r6c6.setText(turn);
        r6c6.setBackground(Color.white);
    }//GEN-LAST:event_r6c6ActionPerformed

    private void r6c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c3ActionPerformed
        r6c3.setText(turn);
        r6c3.setBackground(Color.white);
    }//GEN-LAST:event_r6c3ActionPerformed

    private void r6c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c1ActionPerformed
        r6c1.setText(turn);
        r6c1.setBackground(Color.white);
    }//GEN-LAST:event_r6c1ActionPerformed

    private void r7c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c8ActionPerformed
        r7c8.setText(turn);
        r7c8.setBackground(Color.white);
    }//GEN-LAST:event_r7c8ActionPerformed

    private void r7c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c6ActionPerformed
        r7c6.setText(turn);
        r7c6.setBackground(Color.white);
    }//GEN-LAST:event_r7c6ActionPerformed

    private void r7c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c4ActionPerformed
        r7c4.setText(turn);
        r7c4.setBackground(Color.white);
    }//GEN-LAST:event_r7c4ActionPerformed

    private void r7c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c3ActionPerformed
        r7c3.setText(turn);
        r7c3.setBackground(Color.white);
    }//GEN-LAST:event_r7c3ActionPerformed

    private void r7c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c1ActionPerformed
        r7c1.setText(turn);
        r7c1.setBackground(Color.white);
    }//GEN-LAST:event_r7c1ActionPerformed

    private void r8c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c8ActionPerformed
        r8c8.setText(turn);
        r8c8.setBackground(Color.white);
    }//GEN-LAST:event_r8c8ActionPerformed

    private void r8c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c7ActionPerformed
        r8c7.setText(turn);
        r8c7.setBackground(Color.white);
    }//GEN-LAST:event_r8c7ActionPerformed

    private void r8c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c6ActionPerformed
        r8c6.setText(turn);
        r8c6.setBackground(Color.white);
    }//GEN-LAST:event_r8c6ActionPerformed

    private void r8c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c3ActionPerformed
        r8c3.setText(turn);
        r8c3.setBackground(Color.white);
    }//GEN-LAST:event_r8c3ActionPerformed

    private void r8c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c2ActionPerformed
        r8c2.setText(turn);
        r8c2.setBackground(Color.white);
    }//GEN-LAST:event_r8c2ActionPerformed

    private void r9c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c7ActionPerformed
        r9c7.setText(turn);
        r9c7.setBackground(Color.white);// TODO add your handling code here:
    }//GEN-LAST:event_r9c7ActionPerformed

    private void r9c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c9ActionPerformed
        r9c9.setText(turn);
        r9c9.setBackground(Color.white);
    }//GEN-LAST:event_r9c9ActionPerformed

    private void r9c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c8ActionPerformed
        r9c8.setText(turn);
        r9c8.setBackground(Color.white);
    }//GEN-LAST:event_r9c8ActionPerformed

    private void r9c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c5ActionPerformed
        r9c5.setText(turn);
        r9c5.setBackground(Color.white);
    }//GEN-LAST:event_r9c5ActionPerformed

    private void r9c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c4ActionPerformed
        r9c4.setText(turn);
        r9c4.setBackground(Color.white);
    }//GEN-LAST:event_r9c4ActionPerformed

    private void r1c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c7ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c7ActionPerformed

    private void r1c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1c9ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r1c9ActionPerformed

    private void r2c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c9ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c9ActionPerformed

    private void r2c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c7ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c7ActionPerformed

    private void r2c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c6ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c6ActionPerformed

    private void r2c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c5ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c5ActionPerformed

    private void r2c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2c1ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r2c1ActionPerformed

    private void r3c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c8ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c8ActionPerformed

    private void r3c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c5ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c5ActionPerformed

    private void r3c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c3ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c3ActionPerformed

    private void r3c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3c1ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r3c1ActionPerformed

    private void r4c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c5ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c5ActionPerformed

    private void r4c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c6ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c6ActionPerformed

    private void r4c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4c8ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r4c8ActionPerformed

    private void r5c8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c8ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c8ActionPerformed

    private void r5c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c7ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c7ActionPerformed

    private void r5c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c3ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c3ActionPerformed

    private void r5c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5c2ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r5c2ActionPerformed

    private void r6c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c2ActionPerformed
       JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c2ActionPerformed

    private void r6c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c4ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c4ActionPerformed

    private void r6c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r6c5ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r6c5ActionPerformed

    private void r7c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c2ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c2ActionPerformed

    private void r7c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c5ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c5ActionPerformed

    private void r7c7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c7ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c7ActionPerformed

    private void r7c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7c9ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r7c9ActionPerformed

    private void r8c9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c9ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c9ActionPerformed

    private void r8c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c5ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c5ActionPerformed

    private void r8c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c4ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c4ActionPerformed

    private void r8c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r8c1ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r8c1ActionPerformed

    private void r9c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c1ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c1ActionPerformed

    private void r9c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c2ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c2ActionPerformed

    private void r9c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c3ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c3ActionPerformed

    private void r9c6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r9c6ActionPerformed
        JOptionPane.showMessageDialog(this, "You cannot make change here", "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_r9c6ActionPerformed

    private void selectionbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionbutton2ActionPerformed
       AssignColorForSelectionButton(selectionbutton2);
       turn="2";
    }//GEN-LAST:event_selectionbutton2ActionPerformed

    private void resetbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtActionPerformed
        //we can create new frame and add JOptionPane to it.
        //JFrame frame=new JFrame("Reset");
        //in next line remove this and keep 'frame'
        if(JOptionPane.showConfirmDialog(this, "Do you want to reset the game?","Sudoku Puzzle",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
          resetGame();
    }//GEN-LAST:event_resetbtActionPerformed

    private void exitbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtActionPerformed
        JFrame exitFrame= new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(exitFrame, "Do you want to exit?","Sudoku Puzzle",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
            System.exit(0);
    }//GEN-LAST:event_exitbtActionPerformed

    private void solbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solbtActionPerformed
        showSolution();
    }//GEN-LAST:event_solbtActionPerformed

    private void checkbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbtActionPerformed
        checkMoves();
    }//GEN-LAST:event_checkbtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkbt;
    private javax.swing.JButton exitbt;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton r1c1;
    private javax.swing.JButton r1c2;
    private javax.swing.JButton r1c3;
    private javax.swing.JButton r1c4;
    private javax.swing.JButton r1c5;
    private javax.swing.JButton r1c6;
    private javax.swing.JButton r1c7;
    private javax.swing.JButton r1c8;
    private javax.swing.JButton r1c9;
    private javax.swing.JButton r2c1;
    private javax.swing.JButton r2c2;
    private javax.swing.JButton r2c3;
    private javax.swing.JButton r2c4;
    private javax.swing.JButton r2c5;
    private javax.swing.JButton r2c6;
    private javax.swing.JButton r2c7;
    private javax.swing.JButton r2c8;
    private javax.swing.JButton r2c9;
    private javax.swing.JButton r3c1;
    private javax.swing.JButton r3c2;
    private javax.swing.JButton r3c3;
    private javax.swing.JButton r3c4;
    private javax.swing.JButton r3c5;
    private javax.swing.JButton r3c6;
    private javax.swing.JButton r3c7;
    private javax.swing.JButton r3c8;
    private javax.swing.JButton r3c9;
    private javax.swing.JButton r4c1;
    private javax.swing.JButton r4c2;
    private javax.swing.JButton r4c3;
    private javax.swing.JButton r4c4;
    private javax.swing.JButton r4c5;
    private javax.swing.JButton r4c6;
    private javax.swing.JButton r4c7;
    private javax.swing.JButton r4c8;
    private javax.swing.JButton r4c9;
    private javax.swing.JButton r5c1;
    private javax.swing.JButton r5c2;
    private javax.swing.JButton r5c3;
    private javax.swing.JButton r5c4;
    private javax.swing.JButton r5c5;
    private javax.swing.JButton r5c6;
    private javax.swing.JButton r5c7;
    private javax.swing.JButton r5c8;
    private javax.swing.JButton r5c9;
    private javax.swing.JButton r6c1;
    private javax.swing.JButton r6c2;
    private javax.swing.JButton r6c3;
    private javax.swing.JButton r6c4;
    private javax.swing.JButton r6c5;
    private javax.swing.JButton r6c6;
    private javax.swing.JButton r6c7;
    private javax.swing.JButton r6c8;
    private javax.swing.JButton r6c9;
    private javax.swing.JButton r7c1;
    private javax.swing.JButton r7c2;
    private javax.swing.JButton r7c3;
    private javax.swing.JButton r7c4;
    private javax.swing.JButton r7c5;
    private javax.swing.JButton r7c6;
    private javax.swing.JButton r7c7;
    private javax.swing.JButton r7c8;
    private javax.swing.JButton r7c9;
    private javax.swing.JButton r8c1;
    private javax.swing.JButton r8c2;
    private javax.swing.JButton r8c3;
    private javax.swing.JButton r8c4;
    private javax.swing.JButton r8c5;
    private javax.swing.JButton r8c6;
    private javax.swing.JButton r8c7;
    private javax.swing.JButton r8c8;
    private javax.swing.JButton r8c9;
    private javax.swing.JButton r9c1;
    private javax.swing.JButton r9c2;
    private javax.swing.JButton r9c3;
    private javax.swing.JButton r9c4;
    private javax.swing.JButton r9c5;
    private javax.swing.JButton r9c6;
    private javax.swing.JButton r9c7;
    private javax.swing.JButton r9c8;
    private javax.swing.JButton r9c9;
    private javax.swing.JButton resetbt;
    private javax.swing.JButton selectionbutton1;
    private javax.swing.JButton selectionbutton2;
    private javax.swing.JButton selectionbutton3;
    private javax.swing.JButton selectionbutton4;
    private javax.swing.JButton selectionbutton5;
    private javax.swing.JButton selectionbutton6;
    private javax.swing.JButton selectionbutton7;
    private javax.swing.JButton selectionbutton8;
    private javax.swing.JButton selectionbutton9;
    private javax.swing.JButton solbt;
    // End of variables declaration//GEN-END:variables
}
