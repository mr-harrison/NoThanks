/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nothanks;

/**
 *
 * @author user
 */
public class InstructionsGUI extends javax.swing.JFrame {

    /**
     * Creates new form InstructionsGUI
     */
    public InstructionsGUI() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Players: 3 - 5 Age: 8+ years Playing Time: approx. 20 min.\nContents:\n33 cards with numbers from 3 to 35 55 playing chips\n\nIdea of the Game:\n\nOne card lies in the center of the table, face-up. On his turn,\neach player must decide: Either he takes the card and puts it in front of himself,\ngiving him points equal to the value printed on the card, or\nhe declines the card by putting one of his chips next to it. The turn to play passes \nclockwise, and the next player faces the same decision: Either accept the card\n(including the chip), or decline it and pay one of his own chips. \nThe game goes on this way until all cards have found someone willing to accept them.\nThe player with the fewest points wins.\n\nThe Cards and the Chips:\n\nEach single card which a player has in front of him counts points according to the\nnumber it shows. Therefore, a 7 counts as seven points, a 15 brings fifteen points, a \n29 counts as twenty- nine points, and so on.\n\nEXAMPLE: Sabrina has four single cards in front of her, totaling 41 points.\n (4+6+10+21). Unbroken number sequences only count as points according to the \nlowest number of the sequence. For example, if a player has the 8 and the 9 in front of\nhim, those two cards together only count as 8 points. If he has the cards with the \nnumbers 17, 18, 19 and 20 in front of him, all of them together only get him 17 \npoints. NOTE: Getting unbroken number sequences is better than getting single cards.\nEXAMPLE: Peter has a total of 28 points in front of him: 13 for the single card, and 15\nfor the sequence. If he can get the 14 as well, he will have an unbroken sequence from\n13 to 16, which will count as only 13 points all together. To avoid having to take a \ncard, the player whose turn it is must pay a chip. Therefore, it is always good to have \nmany chips, in order to be able to decline cards you don’t want. Moreover, at the end\nof the game, each chip you have subtracts from your total points.\n\nPreparation:\n\nEach player gets 11 chips. If there are only three or four players,\nDuring the game, all players keep their chips hidden in their hand so that the \nother players cannot see them. Shuffle the cards, then 24 cards are placed face-down \nand put into the center of the table as a face-down deck. The remaining 9 cards \nare not needed for this game and are discarded, without any player looking\nat them.\n\nHow to Play\n\nRandomly determine which player begins. That player turns over the top card of the\ndeck and puts it next to the deck, face-up. Then he has to:\n• either take the card and put it in front of himself, face-up • or decline it and put one\nof his chips next to the card.\nIf the player declines the card, play passes to his left-hand neighbor. That player \nfaces the same decision: either take the card (and the chip), or decline it and pay one\nof his chips. In this way, the game continues with the turn passing clockwise. Each \nplayer in turn decides whether to take the card (and all chips next to it), or decline it\nand add one of his own chips to the pool.\n     \n ❋ When finally a player decides to take the card (and all chips next to it), he puts it in\nfront of himself face-up and takes the chips up in hand. After that, this player turns \nover the next card of the deck. As described above, he must then decide whether to \ntake the card, or decline it and pay a chip. If he declines, the turn to play – and the \ndecision whether or not to accept the card – again passes to his left-hand neighbor, \nand so on.\nOften, players will decline a card several turns over, so that the number of chips lying \nnext to the card becomes quite large. This is absolutely ok – in fact, it’s an interesting\naspect of the game.\nExample: Peter turns over the top card of the deck. It shows the number 11. As this \ncard would get Peter 11 points, he declines it and puts one of his chips next to it. \nSabrina also declines and adds one of her chips. Lisa, however, would rather save her\nchips, so she accepts the card. She puts down the 11 in front of herself face-up, and \ntakes the two chips next to it up in hand. Then, Lisa turns over the top card of the\ndeck – it’s the 16. Lisa could take the card straight away, but that would get her \nanother 16 points. She declines the card, putting one of her chips next to it. Then the \ngame goes on.\n\nNote: To make it easy for all players to see who has how many points, unbroken \nsequences should be placed with the cards overlapping, well separated from single \ncards. All card values have to be clearly visible at all times during the game.\nThe game continues in this manner until all cards of the deck have been used up. As \nsoon as the last card of the deck has found a player who accepts it, the game ends \nand the final scores are calculated.\n\nEnd of the Game / Scorekeeping\n\nAfter all 24 cards have found an owner, each player calculates his final score by \nadding up the values of all his single cards, plus that of the lowest card of each \nunbroken number sequence he has in front of him. From the total, he subtracts the \nnumber of chips he still has. It’s pretty simple, really.\nExample: At the end of the game, Lisa has three single cards and two sequences in \nfront of her. Together, they get her 59 points (3+7+10+14+25 = 59). From that, she \nsubtracts the 8 chips she has left, for a final score of 51 (59-8 = 51).\nThe player with the lowest final score – i.e., the fewest points – wins the game.\nTactical Tips\n❋ Sooner or later, you will run out of chips, which means that you will have to take a \ncard. Therefore, especially at the beginning of the game, don’t be too hesitant about \ntaking a card that doesn’t have that many chips next to it. A 15, for example, with \nthree or four chips next to it, may well be worth considering.\n❋ A good way to grab as many chips as possible is to decline a card which you \nyourself could easily take (because it would complete or add to one of your sequences)\n, but which your fellow players won’t want (because it would get them too many points)\n. Just send it around for another turn or two; it will come back to you with a lot more\nchips.\n\nExample: Sabrina already has the 34 in front of her. The next card to be turned over is \nthe 35. Sabrina could take it at once, as it would allow her to form a sequence with the\n 34 she already has. Her fellow players, however, do not want to take the 35 at all, \nbecause to them it’s worth 35 points. Thus, Sabrina doesn’t accept the 35 on her turn, \nbut declines it, waiting until it comes back her way with a decent number of chips.\nNote: Of course, you can try to send a very high card around several times, but you \nshouldn’t get too greedy! When some other player runs out of chips, he will have to \ntake it – and you can never know when that moment will come.\n❋ Since nine cards are put aside at the beginning of the game, there will necessarily \nbe a few gaps between the cards. Of course, you’ll have to speculate upon being able \nto close gaps between some of your cards at a later point (for example, between the 22\nand the 24) – a little luck is part of the game – but you can never rely on that \nhappening. The bigger the gap (say, between the 30 and the 35), the smaller the \nchance that all necessary cards to close it are in the deck – and that you will get them \nall.\n❋ If you want to put a little more emphasis on tactics, you can try the following \nvariant rule:\nAt the beginning of the game, each player only gets 10 chips. The cards with the \nnumbers 10, 20 and 30 are taken out and put into the box, before the 24 cards for the \ndeck are counted off (face-down). The six cards which then remain are also put into \nthe box. The rest of the game is unchanged, but knowing three of the nine gaps in \nadvance increases the tactical element of the game.");
        jScrollPane2.setViewportView(jTextArea1);

        jLayeredPane1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 550, 420));

        jLabel2.setText("Instructions");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InstructionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructionsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstructionsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}