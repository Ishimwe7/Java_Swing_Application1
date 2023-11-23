/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.PropertiesDao;
import dao.SalesDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Properties;
import model.Users;

/**
 *
 * @author hp
 */
public class AllProperties extends javax.swing.JFrame {

     Users user =new Users();
     Properties property = new Properties();
     PropertiesDao dao = new PropertiesDao();
     DefaultTableModel tableModel = new DefaultTableModel(); 
    
    /**
     * Creates new form AllProperties
     */
     
      public void addTableColumnsHeaderName(){
        tableModel.addColumn("Property Id");
        tableModel.addColumn("Property Name");
        tableModel.addColumn("Property Category");
        tableModel.addColumn("Property type");
        tableModel.addColumn("Buying Price");
        tableModel.addColumn("Available Quantity");
        tableModel.addColumn("Rented Quantity");
        tableModel.addColumn("Total Quantity");
        myTable.setModel(tableModel);
    }
    
    public void addTableRowsData(Integer id){
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
     
    public AllProperties() {
        initComponents();
        //deleteBtn.disable(); 
        deleteBtn.setEnabled(false);
        updateBtn.setEnabled(false);
        sellBtn.setEnabled(false);
      //  addTableColumnsHeaderName();
      //  addTableRowsData(Integer.parseInt(company_id.getText()));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        company_id = new javax.swing.JLabel();
        company_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        sellBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lock.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Detailed List of All Your Properties is below ");

        company_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        company_id.setText("comp id");

        company_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        company_name.setText("Comp name");

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        myTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myTable);

        back.setBackground(new java.awt.Color(0, 153, 153));
        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back to Dashboard");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        addBtn.setBackground(new java.awt.Color(0, 153, 153));
        addBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addBtn.setText("Add new");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(0, 153, 153));
        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 153, 153));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        sellBtn.setBackground(new java.awt.Color(0, 153, 153));
        sellBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sellBtn.setText("Sell");
        sellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBtn)
                .addGap(18, 18, 18)
                .addComponent(updateBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addGap(18, 18, 18)
                .addComponent(sellBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(sellBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(company_id)
                                .addGap(34, 34, 34)
                                .addComponent(company_name))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(company_id)
                            .addComponent(company_name))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        user.setCompany_id(Integer.parseInt(company_id.getText()));
        user.setCompany_name(company_name.getText());
        PropertiesDao pro = new PropertiesDao();
        SalesDao sale = new SalesDao();
        Dashboard dash = new Dashboard(user); 
            dash.company_id.setText(user.getCompany_id().toString());
            dash.company.setText(user.getCompany_name());
            Integer total = pro.totalProperties(user);
            Integer immovables = pro.totalImmovableProperties(user);
            Integer movables = pro.totalmovableProperties(user);
            Integer total_sales=sale.totalSales(user.getCompany_id());
            Integer total_profit=sale.netProfit(user.getCompany_id());
            String dominant = sale.dominant(user.getCompany_id());
            Integer movableSales=sale.movableSales(user.getCompany_id());
            Integer immovableSales=sale.immovableSales(user.getCompany_id());
            dash.total_sales.setText(total_sales.toString());
            dash.total.setText(total.toString());
            dash.net_profit.setText(total_profit.toString());
            dash.dominant.setText(dominant);
            dash.immovables.setText(immovables.toString());
            dash.movables.setText(movables.toString());
            dash.movableSales.setText(movableSales.toString());
            dash.immovableSales.setText(immovableSales.toString());
            dash.setVisible(true);
            dispose();
    }//GEN-LAST:event_backActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        buyForm buy = new buyForm();
        buy.company_id.setText(company_id.getText());
        buy.company_name.setText(company_name.getText());
        buy.setVisible(true);
        dispose();
    }//GEN-LAST:event_addBtnActionPerformed

    private void myTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTableMouseClicked
        // TODO add your handling code here:
        int row  = myTable.getSelectedRow();
        property.setProperty_id((String)myTable.getValueAt(row, 0));
        property.setProperty_name((String)myTable.getValueAt(row, 1));
        property.setProperty_category((String)myTable.getValueAt(row, 2));
        property.setProperty_type((String)myTable.getValueAt(row, 3));
        property.setAvailable_quantity((int)myTable.getValueAt(row, 5));
        property.setRent_quantity((int)myTable.getValueAt(row, 6));
        property.setTotal_quantity((int)myTable.getValueAt(row, 7));
        property.setBuying_price((int)myTable.getValueAt(row, 4));
        property.setUser_id(Integer.parseInt(company_id.getText())); 
        if(property!=null){
        //deleteBtn.enable();
        deleteBtn.setEnabled(true);
        updateBtn.setEnabled(true);
        sellBtn.setEnabled(true);
        }
    }//GEN-LAST:event_myTableMouseClicked

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        user.setCompany_id(Integer.parseInt(company_id.getText()));
        Dashboard dash = new Dashboard(user);
       int confirmed = JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this property?","Delete",JOptionPane.YES_NO_OPTION);
       if(confirmed==JOptionPane.YES_OPTION){
        int feed = dao.delete(property);
        if(feed>0){
             JOptionPane.showMessageDialog(this, "Property Deleted Successfully","Congratulations",JOptionPane.INFORMATION_MESSAGE);
             dash.addTableColumnsHeaderName();
             dash.addTableRowsData(Integer.parseInt(company_id.getText()));
             AllProperties all = new AllProperties();
             all.company_id.setText(company_id.getText());
             all.company_name.setText(company_name.getText());
             all.addTableColumnsHeaderName();
             all.addTableRowsData(user.getCompany_id());
             all.setVisible(true);
             dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Property Deletion failled!!","ooops!!",JOptionPane.INFORMATION_MESSAGE);
        }
       }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void sellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellBtnActionPerformed
        // TODO add your handling code here:
        SellForm sell = new SellForm();
        sell.company_id.setText(company_id.getText());
        sell.company_name.setText(company_name.getText());
        sell.product_id.setText(property.getProperty_id());
        sell.product_id.setEditable(false);
        sell.product_name.setText(property.getProperty_name());
        sell.product_name.setEditable(false);
        sell.product_category.setSelectedItem(property.getProperty_category());
        sell.product_category.setEnabled(false);
        sell.product_type.setSelectedItem(property.getProperty_type());
        sell.product_type.setEnabled(false);
        sell.quantity.setText(property.getAvailable_quantity().toString());
        Integer selling_price=property.getBuying_price()+(property.getBuying_price()*15/100);
        sell.selling_price.setText(selling_price.toString());
        sell.selling_price.setEditable(false);
        Integer profit=selling_price-property.getBuying_price();
        sell.profit.setText(profit.toString());
        sell.profit.setEditable(false);
        sell.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_sellBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        updateForm update = new updateForm();
        update.company_id.setText(company_id.getText());
        update.company_name.setText(company_name.getText());
        update.property_id.setText(property.getProperty_id());
        update.property_id.setEditable(false);
        update.property_name.setText(property.getProperty_name());
        update.property_name.setEditable(false);
        update.property_category.setSelectedItem(property.getProperty_category());
        update.property_category.setEnabled(false);
        update.property_type.setSelectedItem(property.getProperty_type());
        update.property_type.setEnabled(false);
        update.available_quantity.setText(property.getAvailable_quantity().toString());
        update.buying_price.setText(property.getBuying_price().toString());
        update.rented_quantity.setText(property.getRent_quantity().toString());
        update.buying_price.setEditable(false);
        update.setVisible(true);
        dispose();
    }//GEN-LAST:event_updateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AllProperties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllProperties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllProperties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllProperties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllProperties().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton back;
    public javax.swing.JLabel company_id;
    public javax.swing.JLabel company_name;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable myTable;
    private javax.swing.JButton sellBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}