/*
 * Launa Bucher-Austin
 * June 14 2020
 * This program allows two user to play a game of Tictactoe together. 
 */

/**
 *
 * @author launa
 */
public class Tictactoe extends javax.swing.JFrame {

    /**
     * Creates new form Tictactoe
     */
    
  
    public Tictactoe() {
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

        jButton3 = new javax.swing.JButton();
        ttllbl = new javax.swing.JLabel();
        p2lbl = new javax.swing.JLabel();
        p1lbl = new javax.swing.JLabel();
        p3lbl = new javax.swing.JLabel();
        p4lbl = new javax.swing.JLabel();
        p7lbl = new javax.swing.JLabel();
        p5lbl = new javax.swing.JLabel();
        p8lbl = new javax.swing.JLabel();
        p6lbl = new javax.swing.JLabel();
        p9lbl = new javax.swing.JLabel();
        promptlbl = new javax.swing.JLabel();
        prompttxt = new javax.swing.JTextField();
        trn11btn = new javax.swing.JToggleButton();
        trn12btn = new javax.swing.JButton();
        ply1lbl = new javax.swing.JLabel();
        prompt2lbl = new javax.swing.JLabel();
        prompt2txt = new javax.swing.JTextField();
        ply2lbl = new javax.swing.JLabel();
        restartlbl = new javax.swing.JLabel();
        spotlbl = new javax.swing.JLabel();
        spot1lbl = new javax.swing.JLabel();
        firstlbl = new javax.swing.JLabel();
        turn21btn = new javax.swing.JButton();
        trn31btn = new javax.swing.JButton();
        trn41btn = new javax.swing.JButton();
        trn22btn = new javax.swing.JButton();
        trn32btn = new javax.swing.JButton();
        trn42btn = new javax.swing.JButton();
        sspotlbl = new javax.swing.JLabel();
        tspotlbl = new javax.swing.JLabel();
        fspotlbl = new javax.swing.JLabel();
        sespotlbl = new javax.swing.JLabel();
        sixspotlbl = new javax.swing.JLabel();
        eispotlbl = new javax.swing.JLabel();
        fispotlbl = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ttllbl.setText("Tic Tac Toe");

        p2lbl.setText("_ ");

        p1lbl.setText("_ ");

        p3lbl.setText("_ ");

        p4lbl.setText("_");

        p7lbl.setText("_");

        p5lbl.setText("_ ");

        p8lbl.setText("_ ");

        p6lbl.setText("_ ");

        p9lbl.setText("_");

        promptlbl.setText("Enter your placement (1-9) :");

        trn11btn.setText("turn 1");
        trn11btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trn11btnActionPerformed(evt);
            }
        });

        trn12btn.setText("turn 1");
        trn12btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trn12btnActionPerformed(evt);
            }
        });

        ply1lbl.setText("Player 1");

        prompt2lbl.setText("Enter your placement (1-9) :");

        ply2lbl.setText("Player 2");

        spotlbl.setText("Spots taken");

        firstlbl.setText("...");

        turn21btn.setText("turn 2");
        turn21btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turn21btnActionPerformed(evt);
            }
        });

        trn31btn.setText("turn 3");
        trn31btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trn31btnActionPerformed(evt);
            }
        });

        trn41btn.setText("turn 4");
        trn41btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trn41btnActionPerformed(evt);
            }
        });

        trn22btn.setText("turn 2");
        trn22btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trn22btnActionPerformed(evt);
            }
        });

        trn32btn.setText("turn 3");
        trn32btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trn32btnActionPerformed(evt);
            }
        });

        trn42btn.setText("turn 4");
        trn42btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trn42btnActionPerformed(evt);
            }
        });

        sspotlbl.setText("...");

        tspotlbl.setText("...");

        fspotlbl.setText("...");

        sespotlbl.setText("...");

        sixspotlbl.setText("...");

        eispotlbl.setText("...");

        fispotlbl.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ply2lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restartlbl)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(p6lbl)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(p1lbl)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(38, 38, 38)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(p5lbl)
                                                .addComponent(p2lbl)
                                                .addComponent(p8lbl))
                                            .addGap(33, 33, 33)
                                            .addComponent(p3lbl))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(ttllbl)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(p4lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p7lbl))
                                .addGap(83, 83, 83)
                                .addComponent(p9lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ply1lbl))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(promptlbl)
                            .addComponent(prompt2lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(prompttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(prompt2txt))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trn12btn)
                            .addComponent(trn11btn)
                            .addComponent(trn41btn)
                            .addComponent(trn42btn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spot1lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tspotlbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(sespotlbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstlbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(fispotlbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sspotlbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(sixspotlbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fspotlbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(eispotlbl))))
                            .addComponent(spotlbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(trn22btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trn32btn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(turn21btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trn31btn)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(spotlbl)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ttllbl)
                                .addComponent(spot1lbl))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(firstlbl)
                                .addComponent(fispotlbl)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p2lbl)
                            .addComponent(p1lbl)
                            .addComponent(p3lbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sspotlbl)
                            .addComponent(sixspotlbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sespotlbl)
                            .addComponent(tspotlbl))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fspotlbl)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p4lbl)
                            .addComponent(p5lbl)
                            .addComponent(p6lbl))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p7lbl)
                            .addComponent(p8lbl)
                            .addComponent(p9lbl))
                        .addGap(16, 16, 16)
                        .addComponent(ply1lbl))
                    .addComponent(eispotlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(promptlbl)
                    .addComponent(prompttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trn11btn)
                    .addComponent(turn21btn)
                    .addComponent(trn31btn))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ply2lbl)
                    .addComponent(restartlbl)
                    .addComponent(trn41btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trn12btn)
                    .addComponent(prompt2lbl)
                    .addComponent(prompt2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trn22btn)
                    .addComponent(trn32btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(trn42btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      
  
    
    private void trn11btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trn11btnActionPerformed
   int pos = Integer.parseInt(prompttxt.getText());
   firstlbl.setText(String.valueOf(pos));
   if(pos==1){
       p1lbl.setText("X");
   }
   if(pos==2){
       p2lbl.setText("X"); 
   }
   if(pos==3){
        p3lbl.setText("X");
   }
   if(pos==4){
        p4lbl.setText("X");
   }
   if(pos==5){
        p5lbl.setText("X");
   }
   if(pos==6){
        p6lbl.setText("X");
   }
   if(pos==7){
        p7lbl.setText("X");
   }
   if(pos==8){
        p8lbl.setText("X");
   }
   if(pos==9){
        p9lbl.setText("X");
   }
   
   
        
      
    }//GEN-LAST:event_trn11btnActionPerformed

    private void trn12btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trn12btnActionPerformed
  int pos2 = Integer.parseInt(prompt2txt.getText());
  int user = Integer.parseInt(firstlbl.getText());
  sspotlbl.setText(String.valueOf(pos2));
  
  if (pos2 == user)
  {
      restartlbl.setText("try again!");
  }
  else{
   if(pos2==1){
 
       p1lbl.setText("O");
  
   }
   if(pos2==2){
       p2lbl.setText("O"); 
   }
   if(pos2==3){
        p3lbl.setText("O");
   }
   if(pos2==4){
        p4lbl.setText("O");
   }
   if(pos2==5){
        p5lbl.setText("O");
   }
   if(pos2==6){
        p6lbl.setText("O");
   }
   if(pos2==7){
        p7lbl.setText("O");
   }
   if(pos2==8){
        p8lbl.setText("O");
   }
   if(pos2==9){
        p9lbl.setText("O");
   }
  }
   
  
       
    }//GEN-LAST:event_trn12btnActionPerformed

    private void turn21btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turn21btnActionPerformed
   int pos = Integer.parseInt(prompttxt.getText());
   tspotlbl.setText(String.valueOf(pos));
    int user = Integer.parseInt(firstlbl.getText());
    int user2 = Integer.parseInt(sspotlbl.getText());
    
   if(pos==user)
   {
    restartlbl.setText("please try again!");

   }
   
   else if (pos==user2)
   {
       restartlbl.setText("please try again!");
   }
   else {
   
   if(pos==1){
       p1lbl.setText("X");
   }
   if(pos==2){
       p2lbl.setText("X"); 
   }
   if(pos==3){
        p3lbl.setText("X");
   }
   if(pos==4){
        p4lbl.setText("X");
   }
   if(pos==5){
        p5lbl.setText("X");
   }
   if(pos==6){
        p6lbl.setText("X");
   }
   if(pos==7){
        p7lbl.setText("X");
   }
   if(pos==8){
        p8lbl.setText("X");
   }
   if(pos==9){
        p9lbl.setText("X");
   }
   }
    }//GEN-LAST:event_turn21btnActionPerformed

    private void trn22btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trn22btnActionPerformed
  int pos2 = Integer.parseInt(prompt2txt.getText());
  int user = Integer.parseInt(firstlbl.getText());
  int user2 = Integer.parseInt(sspotlbl.getText());
  int user3 = Integer.parseInt(tspotlbl.getText());
  fspotlbl.setText(String.valueOf(pos2));
  
  
  if (pos2 == user)
  {
   restartlbl.setText("try once more!");

  }
  
  else if (pos2 == user2 ){
  restartlbl.setText("try  once more!");
  
  }
  
  else if (pos2 == user3){
   restartlbl.setText("try once more!");
  }
  else 
  {
  if (pos2 == user)
  {
      restartlbl.setText("try once more!");
  }
  else{
   if(pos2==1){
 
       p1lbl.setText("O");
  
   }
   if(pos2==2){
       p2lbl.setText("O"); 
   }
   if(pos2==3){
        p3lbl.setText("O");
   }
   if(pos2==4){
        p4lbl.setText("O");
   }
   if(pos2==5){
        p5lbl.setText("O");
   }
   if(pos2==6){
        p6lbl.setText("O");
   }
   if(pos2==7){
        p7lbl.setText("O");
   }
   if(pos2==8){
        p8lbl.setText("O");
   }
   if(pos2==9){
        p9lbl.setText("O");
   }
  }     
    }//GEN-LAST:event_trn22btnActionPerformed

    private void trn31btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trn31btnActionPerformed
   
      int pos = Integer.parseInt(prompttxt.getText());
  
    int user = Integer.parseInt(firstlbl.getText());
    int user2 = Integer.parseInt(sspotlbl.getText());
    int user3 = Integer.parseInt(tspotlbl.getText());
    int user4 = Integer.parseInt(fspotlbl.getText());
    fispotlbl.setText(String.valueOf(pos));
    
   if(pos==user)
   {
    restartlbl.setText("that spot is taken!");

   }
   
   else if (pos==user2)
   {
       restartlbl.setText("that spot is taken!");
   }
   
   else if (pos==user3){
       restartlbl.setText("that spot is taken!");
   }
   
   else if (pos==user4){
       restartlbl.setText("that spot is taken!");
   }
   else {
   
   if(pos==1){
       p1lbl.setText("X");
   }
   if(pos==2){
       p2lbl.setText("X"); 
   }
   if(pos==3){
        p3lbl.setText("X");
   }
   if(pos==4){
        p4lbl.setText("X");
   }
   if(pos==5){
        p5lbl.setText("X");
   }
   if(pos==6){
        p6lbl.setText("X");
   }
   if(pos==7){
        p7lbl.setText("X");
   }
   if(pos==8){
        p8lbl.setText("X");
   }
   if(pos==9){
        p9lbl.setText("X");
   }
   }  
        
    }//GEN-LAST:event_trn31btnActionPerformed

    private void trn32btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trn32btnActionPerformed
  int pos2 = Integer.parseInt(prompt2txt.getText());
  int user = Integer.parseInt(firstlbl.getText());
  int user2 = Integer.parseInt(sspotlbl.getText());
  int user3 = Integer.parseInt(tspotlbl.getText());
  int user4 = Integer.parseInt(fspotlbl.getText());
  int user5 = Integer.parseInt(fispotlbl.getText());
  sixspotlbl.setText(String.valueOf(pos2));
  
  
  if (pos2 == user)
  {
   restartlbl.setText("you cannot place an O here");

  }
  
  else if (pos2 == user2 ){
  restartlbl.setText("you cannot place an O here");
  
  }
  
  else if (pos2 == user3){
   restartlbl.setText("you cannot place an O here");
  }
  
  else if (pos2==user4){
      restartlbl.setText("you cannot place an O here");
  }
  
  else if (pos2==user5){
      restartlbl.setText("you cannot place an O here");
  }
  else 
  {
  if (pos2 == user)
  {
      restartlbl.setText("you cannot place an O here");
  }
  else{
   if(pos2==1){
 
       p1lbl.setText("O");
  
   }
   if(pos2==2){
       p2lbl.setText("O"); 
   }
   if(pos2==3){
        p3lbl.setText("O");
   }
   if(pos2==4){
        p4lbl.setText("O");
   }
   if(pos2==5){
        p5lbl.setText("O");
   }
   if(pos2==6){
        p6lbl.setText("O");
   }
   if(pos2==7){
        p7lbl.setText("O");
   }
   if(pos2==8){
        p8lbl.setText("O");
   }
   if(pos2==9){
        p9lbl.setText("O");
   }
  }         }//GEN-LAST:event_trn32btnActionPerformed

    private void trn41btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trn41btnActionPerformed
 
    int pos = Integer.parseInt(prompttxt.getText());
   
    int user = Integer.parseInt(firstlbl.getText());
    int user2 = Integer.parseInt(sspotlbl.getText());
    int user3 = Integer.parseInt(tspotlbl.getText());
    int user4 = Integer.parseInt(fspotlbl.getText());
    int user5 = Integer.parseInt(fispotlbl.getText());
    int user6 = Integer.parseInt(sixspotlbl.getText());
    int user7 = Integer.parseInt(sespotlbl.getText());
    int user8 = Integer.parseInt(eispotlbl.getText());
    
   
   if(pos==user)
   {
    restartlbl.setText("you can't place an X here");

   }
   
   else if (pos==user2)
   {
       restartlbl.setText("you can't place an X here");
   }
   
   else if (pos==user3){
       restartlbl.setText("you can't place an X here");
   }
   
   else if (pos==user4){
       restartlbl.setText("you can't place an X here");
   }
   
   else if (pos==user5){
       restartlbl.setText("you can't place an X here");
   }
   
   else if (pos==user6){
       restartlbl.setText("you can't place an X here");
   }
   
   else if (pos==user7){
        restartlbl.setText("you can't place an X here");
   }
   else if (pos==user8){
         restartlbl.setText("you can't place an X here");
   }
   else {
   
   if(pos==1){
       p1lbl.setText("X");
   }
   if(pos==2){
       p2lbl.setText("X"); 
   }
   if(pos==3){
        p3lbl.setText("X");
   }
   if(pos==4){
        p4lbl.setText("X");
   }
   if(pos==5){
        p5lbl.setText("X");
   }
   if(pos==6){
        p6lbl.setText("X");
   }
   if(pos==7){
        p7lbl.setText("X");
   }
   if(pos==8){
        p8lbl.setText("X");
   }
   if(pos==9){
        p9lbl.setText("X");
   }
   }      }//GEN-LAST:event_trn41btnActionPerformed

    private void trn42btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trn42btnActionPerformed
int pos2 = Integer.parseInt(prompt2txt.getText());
  int user = Integer.parseInt(firstlbl.getText());
  int user2 = Integer.parseInt(sspotlbl.getText());
  int user3 = Integer.parseInt(tspotlbl.getText());
  int user4 = Integer.parseInt(fspotlbl.getText());
  int user5 = Integer.parseInt(fispotlbl.getText());
  int user6 = Integer.parseInt(sixspotlbl.getText());
  int user7 = Integer.parseInt(sespotlbl.getText());
  eispotlbl.setText(String.valueOf(pos2));
  
  
  if (pos2 == user)
  {
   restartlbl.setText("please pick another number");

  }
  
  else if (pos2 == user2 ){
  restartlbl.setText("please pick another number");
  
  }
  
  else if (pos2 == user3){
   restartlbl.setText("please pick another number");
  }
  
  else if (pos2==user4){
      restartlbl.setText("please pick another number");
  }
  
  else if (pos2==user5){
      restartlbl.setText("please pick another number");
  }
  else if (pos2 == user6)
  {
      restartlbl.setText("please pick another number");
  }
  else if(pos2==user7)
      {
          restartlbl.setText("please pick another number");
      }
  }

  
    else{
    
}
   if(pos2==2){
       p2lbl.setText("O"); 
   }
   if(pos2==3){
        p3lbl.setText("O");
   }
   if(pos2==4){
        p4lbl.setText("O");
   }
   if(pos2==5){
        p5lbl.setText("O");
   }
   if(pos2==6){
        p6lbl.setText("O");
   }
   if(pos2==7){
        p7lbl.setText("O");
   }
   if(pos2==8){
        p8lbl.setText("O");
   }
   if(pos2==9){
        p9lbl.setText("O");
   }    }//GEN-LAST:event_trn42btnActionPerformed

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
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eispotlbl;
    private javax.swing.JLabel firstlbl;
    private javax.swing.JLabel fispotlbl;
    private javax.swing.JLabel fspotlbl;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel p1lbl;
    private javax.swing.JLabel p2lbl;
    private javax.swing.JLabel p3lbl;
    private javax.swing.JLabel p4lbl;
    private javax.swing.JLabel p5lbl;
    private javax.swing.JLabel p6lbl;
    private javax.swing.JLabel p7lbl;
    private javax.swing.JLabel p8lbl;
    private javax.swing.JLabel p9lbl;
    private javax.swing.JLabel ply1lbl;
    private javax.swing.JLabel ply2lbl;
    private javax.swing.JLabel prompt2lbl;
    private javax.swing.JTextField prompt2txt;
    private javax.swing.JLabel promptlbl;
    private javax.swing.JTextField prompttxt;
    private javax.swing.JLabel restartlbl;
    private javax.swing.JLabel sespotlbl;
    private javax.swing.JLabel sixspotlbl;
    private javax.swing.JLabel spot1lbl;
    private javax.swing.JLabel spotlbl;
    private javax.swing.JLabel sspotlbl;
    private javax.swing.JToggleButton trn11btn;
    private javax.swing.JButton trn12btn;
    private javax.swing.JButton trn22btn;
    private javax.swing.JButton trn31btn;
    private javax.swing.JButton trn32btn;
    private javax.swing.JButton trn41btn;
    private javax.swing.JButton trn42btn;
    private javax.swing.JLabel tspotlbl;
    private javax.swing.JLabel ttllbl;
    private javax.swing.JButton turn21btn;
    // End of variables declaration//GEN-END:variables
}
