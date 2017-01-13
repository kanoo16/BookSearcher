package booksearcher;

import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author liam9
 */
public class MainMenuPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainMenuPanel
     */
    public MainMenuPanel() {
        initComponents();
        BookSearcher.initFileIO();

    }

    public void setFocusField() {
        ISBNField.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookTitleLabel = new javax.swing.JLabel();
        googleRatingLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        publisherLabel = new javax.swing.JLabel();
        publishedDateLabel = new javax.swing.JLabel();
        bookImageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        ISBNField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        ISBNLabel = new javax.swing.JLabel();
        newReviewButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        newReviewTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        reviewTextArea = new javax.swing.JTextArea();
        reviewRatingSlider = new javax.swing.JSlider();
        reviewLabel = new javax.swing.JLabel();
        createReviewLabel = new javax.swing.JLabel();
        currentSliderPosition = new javax.swing.JLabel();
        maxReview = new javax.swing.JLabel();

        bookTitleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookTitleLabel.setText("Title:");

        googleRatingLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        googleRatingLabel.setText("Google Rating:");

        authorLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        authorLabel.setText("Author:");

        categoryLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        categoryLabel.setText("Category:");

        publisherLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        publisherLabel.setText("Publisher:");

        publishedDateLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        publishedDateLabel.setText("Published: ");

        descriptionTextArea.setEditable(false);
        descriptionTextArea.setColumns(20);
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(descriptionTextArea);

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        ISBNLabel.setText("ISBN: ");

        newReviewButton.setText("Submit Review");
        newReviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newReviewButtonActionPerformed(evt);
            }
        });

        newReviewTextArea.setColumns(20);
        newReviewTextArea.setRows(5);
        jScrollPane2.setViewportView(newReviewTextArea);

        reviewTextArea.setEditable(false);
        reviewTextArea.setColumns(20);
        reviewTextArea.setRows(5);
        jScrollPane3.setViewportView(reviewTextArea);

        reviewRatingSlider.setMajorTickSpacing(1);
        reviewRatingSlider.setMaximum(5);
        reviewRatingSlider.setMinimum(1);
        reviewRatingSlider.setMinorTickSpacing(1);
        reviewRatingSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                reviewRatingSliderStateChanged(evt);
            }
        });

        reviewLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        reviewLabel.setText("Reviews:");

        createReviewLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        createReviewLabel.setText("Create Review:");

        currentSliderPosition.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        currentSliderPosition.setText("5");

        maxReview.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        maxReview.setText("/ 5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(ISBNLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ISBNField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SearchButton)
                        .addGap(18, 119, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(googleRatingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(publisherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(publishedDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bookImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reviewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(newReviewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createReviewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reviewRatingSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(currentSliderPosition)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxReview)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reviewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createReviewLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reviewRatingSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currentSliderPosition, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maxReview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newReviewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bookTitleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(googleRatingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(authorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(publisherLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                .addGap(13, 13, 13)
                                .addComponent(publishedDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(bookImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ISBNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ISBNLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        BookSearcher.addBook(ISBNField.getText());
        try {
            String[] info = BookSearcher.getBookInfo(ISBNField.getText());
            bookTitleLabel.setText("Title: " + info[0]);
            googleRatingLabel.setText("Google Rating: " + info[1]);
            authorLabel.setText("Author: " + info[2]);
            categoryLabel.setText("Category: " + info[3]);
            publisherLabel.setText("Publisher: " + info[4]);
            publishedDateLabel.setText("Pusblished: " + info[5]);
            descriptionTextArea.setText(info[6]);

            //BufferedImage image = BookSearcher.getBookImage(ISBNField.getText());
            ImageIcon icon = new ImageIcon(BookSearcher.getBookImage(ISBNField.getText()));
            int height = bookImageLabel.getHeight();
            int width = bookImageLabel.getWidth();
            Image scaleImage = icon.getImage().getScaledInstance(height, width, Image.SCALE_DEFAULT);
            

            bookImageLabel.setIcon(new ImageIcon(scaleImage));
            ISBNField.selectAll();
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Book not found in database!", "Sorry!", JOptionPane.INFORMATION_MESSAGE);
        }
        String[] reviews = BookSearcher.getReviews(ISBNField.getText());
        String temp = "";
        for (int i = 1; i < reviews.length; i++) {
            temp += reviews[i] + "\n";
        }
        reviewTextArea.setText(temp);
        newReviewTextArea.setText("");
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void newReviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newReviewButtonActionPerformed
        if (newReviewTextArea.getText().length() <= 0 && BookSearcher.searchISBN(ISBNLabel.getText()) >= 0) {
            BookSearcher.addReview(ISBNField.getText(), reviewRatingSlider.getValue(), newReviewTextArea.getText());
        } else if (BookSearcher.searchISBN(ISBNLabel.getText()) >= 0) {
            JOptionPane.showMessageDialog(null, "Please enter a valid ISBN!", "Sorry!", JOptionPane.INFORMATION_MESSAGE);
        } else if (newReviewTextArea.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Please enter a review first!", "Sorry!", JOptionPane.INFORMATION_MESSAGE);
        }
        
        String[] reviews = BookSearcher.getReviews(ISBNField.getText());
        String temp = "";
        for (int i = 0; i < reviews.length; i++) {
            temp += reviews[i] + "\n";
        }
        reviewTextArea.setText(temp);
        newReviewTextArea.setText("");
    }//GEN-LAST:event_newReviewButtonActionPerformed

    private void reviewRatingSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_reviewRatingSliderStateChanged
        String currentRating = Integer.toString(reviewRatingSlider.getValue());
        currentSliderPosition.setText(currentRating);
    }//GEN-LAST:event_reviewRatingSliderStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ISBNField;
    private javax.swing.JLabel ISBNLabel;
    protected static javax.swing.JButton SearchButton;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel bookImageLabel;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JLabel createReviewLabel;
    private javax.swing.JLabel currentSliderPosition;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel googleRatingLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel maxReview;
    private javax.swing.JButton newReviewButton;
    private javax.swing.JTextArea newReviewTextArea;
    private javax.swing.JLabel publishedDateLabel;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JLabel reviewLabel;
    private javax.swing.JSlider reviewRatingSlider;
    private javax.swing.JTextArea reviewTextArea;
    // End of variables declaration//GEN-END:variables
}
