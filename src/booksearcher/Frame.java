package booksearcher;

import java.awt.CardLayout;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author liam9
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form BookSearcherFrame
     */
    public Frame() {
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        this.setVisible(true);
        
        initComponents();
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        this.getRootPane().setDefaultButton(BookSearcherPanel.SearchButton);
        BookSearcher.countrySetup();

        this.setDefaultCloseOperation(Frame.DO_NOTHING_ON_CLOSE);
    }
    /**
     * toScreen2
     * When called from a button from either screen will swap to the second screen which is Book Searcher
     */
    public static void toScreen2() {
        CardLayout card = (CardLayout) mainPanel1.getLayout();
        card.show(mainPanel1, "card2");
    }
     /**
     * toScreen1
     * When called from a button from either screen will swap to the second screen which is the setUp screen
     */
    public static void toScreen1() {
        CardLayout card = (CardLayout) mainPanel1.getLayout();
        card.show(mainPanel1, "card1");
    }
     /**
     * toScreen3
     * When called from a button from either screen will swap to the second screen which is the CategoryPanel
     */
    public static void toScreen3() {
        CardLayout card = (CardLayout) mainPanel1.getLayout();
        card.show(mainPanel1, "card3");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel1 = new booksearcher.MainPanel();
        startup1 = new booksearcher.Startup();
        mainMenuPanel1 = new booksearcher.BookSearcherPanel();
        categoryPanel1 = new booksearcher.CategoryPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel1.add(startup1, "card1");
        mainPanel1.add(mainMenuPanel1, "card2");
        mainPanel1.add(categoryPanel1, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            //</editor-fold>
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private booksearcher.CategoryPanel categoryPanel1;
    private static booksearcher.BookSearcherPanel mainMenuPanel1;
    private static booksearcher.MainPanel mainPanel1;
    private static booksearcher.Startup startup1;
    // End of variables declaration//GEN-END:variables
}
