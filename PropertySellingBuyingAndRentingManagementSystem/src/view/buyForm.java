/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.PropertiesDao;
import dao.SalesDao;
import dao.UsersDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Properties;
import model.Users;

/**
 *
 * @author hp
 */
public class buyForm extends javax.swing.JFrame {
      DefaultTableModel tableModel = new DefaultTableModel();
      AllProperties all = new AllProperties();
         private void addTableColumnsHeaderName(){
        tableModel.addColumn("Property Id");
        tableModel.addColumn("Property Name");
        tableModel.addColumn("Property Category");
        tableModel.addColumn("Property type");
        tableModel.addColumn("Buying Price");
        tableModel.addColumn("Available Quantity");
        tableModel.addColumn("Rented Quantity");
        tableModel.addColumn("Total Quantity");
        all.myTable.setModel(tableModel);
    }
    
    private void addTableRowsData(Integer id){
        tableModel.setRowCount(0);
        PropertiesDao dao = new PropertiesDao();
        List<Properties> property = dao.allProperties(id);
        for(Properties properties : property)
            tableModel.addRow(new Object[]{
                properties.getProperty_id(),
                properties.getProperty_name(),
                properties.getProperty_category(),
                properties.getProperty_type(),
                properties.getBuying_price(),
                properties.getAvailable_quantity(),
                properties.getRent_quantity(),
                properties.getTotal_quantity(),  
            });
        }
    /**
     * Creates new form buyForm
     */
    public buyForm() {
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

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        productIdLabel = new javax.swing.JLabel();
        productNameLabel = new javax.swing.JLabel();
        product_id = new javax.swing.JTextField();
        product_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        product_category = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        buying_price = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        product_type = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        doneBtn = new javax.swing.JButton();
        quantityLabel = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();
        company_id = new javax.swing.JLabel();
        company_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Please fill this form to record new Property(ies)");

        productIdLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productIdLabel.setText("Property Id:");

        productNameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        productNameLabel.setText("Property name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Property Category:");

        product_category.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        product_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Movable", "Immovable", " " }));
        product_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_categoryActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Buying Price:");

        buying_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buying_priceKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Property Type:");

        product_type.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        product_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Other" }));

        addBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        doneBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        doneBtn.setText("Done");
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
            }
        });

        quantityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quantityLabel.setText("Quantity:");

        quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityActionPerformed(evt);
            }
        });
        quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityKeyTyped(evt);
            }
        });

        company_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        company_id.setText("Comp id");

        company_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        company_name.setText("comp name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(resetBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(doneBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(quantityLabel)
                                                .addComponent(jLabel5)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(addBtn)
                                                    .addComponent(jLabel3)))
                                            .addGap(49, 49, 49))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(productNameLabel)
                                            .addComponent(productIdLabel))
                                        .addGap(45, 45, 45)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buying_price)
                                        .addComponent(product_category, 0, 194, Short.MAX_VALUE)
                                        .addComponent(product_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(quantity))
                                    .addComponent(product_id, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(81, 132, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(company_id)
                .addGap(18, 18, 18)
                .addComponent(company_name)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(company_name)
                    .addComponent(company_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productIdLabel)
                            .addComponent(product_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productNameLabel)
                            .addComponent(product_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(product_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantityLabel)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buying_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetBtn)
                            .addComponent(doneBtn)
                            .addComponent(addBtn))
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void product_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_categoryActionPerformed
        // TODO add your handling code here:
        if(product_category.getSelectedItem().equals("Immovable")){
            product_type.setSelectedItem(null);
            product_type.removeAllItems();
            product_type.addItem("House");
            product_type.addItem("Land");
            product_type.addItem("Forest");
        }
        else{
            product_type.removeAllItems();
            product_type.addItem("Other");
            product_type.setEditable(false);
        }
    }//GEN-LAST:event_product_categoryActionPerformed

    private void buying_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buying_priceKeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if(!Character.isDigit(character)){
            evt.consume();
        }
    }//GEN-LAST:event_buying_priceKeyTyped

    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneBtnActionPerformed
        // TODO add your handling code here:
        all.company_id.setText(company_id.getText());
        all.company_name.setText(company_name.getText());
        addTableColumnsHeaderName();
        addTableRowsData(Integer.parseInt(company_id.getText()));
        all.setVisible(true);
        dispose();
    }//GEN-LAST:event_doneBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        product_id.setText("");
        product_name.setText("");
        //product_category.removeAllItems();
       // product_category.addItem("Movable");
       // product_category.addItem("Immovable");
        product_category.setSelectedItem("Movable");
        product_type.removeAllItems();
        product_type.addItem("Other");
        product_type.setEditable(false);
        buying_price.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if(product_id.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Product Id Required!!");
        }
        else if(product_name.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Product name required!");
        }
        else if(product_category.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Product category required!");
        }
        else if(product_type.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Product Type required!");
        }
        else if(quantity.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Quantity required!");
        }
        else if(Integer.parseInt(quantity.getText())<=0){
            JOptionPane.showMessageDialog(this, "Quantity can't be zero or negative!");
        }
        else if(buying_price.getText()==null){
            JOptionPane.showMessageDialog(this, "Buying Price required!");
        }
        else if(Integer.parseInt(buying_price.getText())<=0){
            JOptionPane.showMessageDialog(this, "Buying Price can't be zero or negative!");
        }
        else{
        Properties property = new Properties();
        PropertiesDao dao =new PropertiesDao();
        UsersDao user = new UsersDao();
        property.setProperty_id(product_id.getText().trim());
        property.setProperty_name(product_name.getText());
        property.setProperty_category(product_category.getSelectedItem().toString());
        property.setProperty_type(product_type.getSelectedItem().toString());
        property.setAvailable_quantity(Integer.parseInt(quantity.getText()));
        property.setTotal_quantity(Integer.parseInt(quantity.getText()));
        property.setBuying_price(Integer.parseInt(buying_price.getText()));
        property.setUser_id(Integer.parseInt(company_id.getText().trim()));
        if(user.Exists(Integer.parseInt(company_id.getText().trim()))){
          if(dao.existingId(property)){
              JOptionPane.showMessageDialog(this, "Sorry this property Id is reserved!!","Error",JOptionPane.ERROR_MESSAGE);
          }
          else{
            if(dao.exists(property)){
               String feedback = dao.incrementQty(property);
               JOptionPane.showMessageDialog(this, feedback,"Congratulations",JOptionPane.INFORMATION_MESSAGE);
              }
             else{
                 String feedback = dao.addProperty(property);
                 JOptionPane.showMessageDialog(this,feedback,"Congratulations" ,JOptionPane.INFORMATION_MESSAGE);
              }     
        }
        }
        else{
            JOptionPane.showMessageDialog(this,"User Does'nt Exists","Error" ,JOptionPane.ERROR_MESSAGE);
        }
        }
    
    }//GEN-LAST:event_addBtnActionPerformed

    private void quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_quantityActionPerformed

    private void quantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityKeyTyped
        // TODO add your handling code here:
        char character = evt.getKeyChar();
        if(!Character.isDigit(character)){
            evt.consume();
        }
    }//GEN-LAST:event_quantityKeyTyped

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
            java.util.logging.Logger.getLogger(buyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buyForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField buying_price;
    public javax.swing.JLabel company_id;
    public javax.swing.JLabel company_name;
    private javax.swing.JButton doneBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel productIdLabel;
    private javax.swing.JLabel productNameLabel;
    private javax.swing.JComboBox<String> product_category;
    private javax.swing.JTextField product_id;
    private javax.swing.JTextField product_name;
    private javax.swing.JComboBox<String> product_type;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton resetBtn;
    // End of variables declaration//GEN-END:variables
}
