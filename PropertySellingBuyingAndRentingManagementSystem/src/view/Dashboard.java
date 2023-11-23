
package view;

import dao.PropertiesDao;
import dao.SalesDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Properties;
import model.Sales;
import model.Users;

public class Dashboard extends javax.swing.JFrame {
    DefaultTableModel tableModel = new DefaultTableModel();
    AllProperties all = new AllProperties();
    SalesReport sales = new SalesReport();
    Users user = new Users();
    /**
     * Creates new form Dashboard
     */
    public Dashboard(Users user) {
        initComponents();
       // myTable.setVisible(false);
    }
    
    
        public void addTableColumnsHeaderName(){
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
    
       public void addTableColumnsHeaderNameSales(){
        tableModel.addColumn("Property Id");
        tableModel.addColumn("Property Name");
        tableModel.addColumn("Property Category");
        tableModel.addColumn("Property type");
        tableModel.addColumn("Total Quantity");
        tableModel.addColumn("Selling Price");
        tableModel.addColumn("Pofit");
        tableModel.addColumn("Selling Date");
        sales.myTable.setModel(tableModel);
    }
    
    public void addTableRowsDataSales(Integer id){
        tableModel.setRowCount(0);
        SalesDao dao = new SalesDao();
        List<Sales> property = dao.allSales(id);
        for(Sales properties : property)
            tableModel.addRow(new Object[]{
                properties.getProperty_id(),
                properties.getProperty_name(),
                properties.getProperty_category(),
                properties.getProperty_type(),
                properties.getTotal_quantity(),
                properties.getSelling_price(),
                properties.getProfit(),
                properties.getDate()
            });
        } 
    
    
      private void addTableColumnsHeaderNameSearchBuyed(){
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
    
    private void addTableRowsDataSearchBuyed(String id){
        tableModel.setRowCount(0);
        PropertiesDao dao = new PropertiesDao();
        Properties property = dao.searchProperty(property_id.getText(),Integer.parseInt(company_id.getText()));
       // for(Properties properties : property)
            tableModel.addRow(new Object[]{
                property.getProperty_id(),
                property.getProperty_name(),
                property.getProperty_category(),
                property.getProperty_type(),
                property.getBuying_price(),
                property.getAvailable_quantity(),
                property.getRent_quantity(),
                property.getTotal_quantity(),  
            });
        } 
    
    private void addTableColumnsHeaderNameSearchSelled(){
        tableModel.addColumn("Property Id");
        tableModel.addColumn("Property Name");
        tableModel.addColumn("Property Category");
        tableModel.addColumn("Property type");
        tableModel.addColumn("Total Quantity");
        tableModel.addColumn("Selling Price");
        tableModel.addColumn("Prifit");
        tableModel.addColumn("Selling Date");
        myTable.setModel(tableModel);
    }
    
    private void addTableRowsDataSearchSelled(String id){
        tableModel.setRowCount(0);
        SalesDao dao = new SalesDao();
        Sales property = dao.searchProperty(property_id.getText(),Integer.parseInt(company_id.getText()));
       // for(Properties properties : property)
            tableModel.addRow(new Object[]{
                property.getProperty_id(),
                property.getProperty_name(),
                property.getProperty_category(),
                property.getProperty_type(),
                property.getTotal_quantity(),
                property.getSelling_price(),
                property.getProfit(),
                property.getDate()
                
            });
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        property_id = new javax.swing.JTextField();
        searchOptions = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        immovables = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        movables = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total_sales = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        net_profit = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dominant = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        movableSales = new javax.swing.JLabel();
        immovableSales = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        company_id = new javax.swing.JLabel();
        company = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        allProperties = new javax.swing.JButton();
        salesReport = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Welcome to Admin's Dashboad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Property Id:");

        searchOptions.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selled", "Buyed", "Rented" }));
        searchOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchOptionsActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(0, 153, 153));
        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(property_id, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(searchOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBtn)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchOptions, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(searchBtn))
                        .addGap(2, 2, 2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(property_id)
                        .addGap(3, 3, 3))
                    .addComponent(jLabel2))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashLogo.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("All Properties:");

        total.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        total.setText("jL");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Immovables : ");

        immovables.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        immovables.setText("j7");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Movables:");

        movables.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        movables.setText("fghd");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(movables, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(immovables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(immovables)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(movables)
                    .addComponent(jLabel8)))
        );

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel7.setText("General Analytics");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Total Sales:");

        total_sales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total_sales.setText("jLa10");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Net Profit:");

        net_profit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        net_profit.setText("jLabe");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Dominant Selling Category:");

        dominant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dominant.setText("jLabel13");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Rwf");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Rwf");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Profit From Movables:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Profit From Immovables:");

        movableSales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        movableSales.setText("jL16");

        immovableSales.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        immovableSales.setText("jLab6");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Rwf");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Rwf");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(net_profit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(total_sales)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10)))))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(dominant))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(movableSales)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(immovableSales)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel19))))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(total_sales)
                    .addComponent(jLabel10)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(movableSales)
                    .addComponent(jLabel18))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(net_profit)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(immovableSales)
                            .addComponent(jLabel19))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dominant))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        company_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        company_id.setText(" id");

        company.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        company.setText(" name");

        logoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        allProperties.setBackground(new java.awt.Color(0, 153, 153));
        allProperties.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        allProperties.setText("View All Properties");
        allProperties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allPropertiesActionPerformed(evt);
            }
        });

        salesReport.setBackground(new java.awt.Color(0, 153, 153));
        salesReport.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        salesReport.setText("View Sales Report");
        salesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesReportActionPerformed(evt);
            }
        });

        myTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(myTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(759, 759, 759)
                        .addComponent(company_id, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(company, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(logoutBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(allProperties)
                                    .addComponent(salesReport))))))
                .addGap(857, 857, 857)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(519, 519, 519))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logoutBtn)
                            .addComponent(company)
                            .addComponent(company_id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(allProperties)
                                .addGap(18, 18, 18)
                                .addComponent(salesReport)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        tableModel.setColumnCount(0);
        tableModel.setRowCount(0);
        if(property_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Property required to search!!","Required Field",JOptionPane.WARNING_MESSAGE);
        }
        else if(searchOptions==null){
            JOptionPane.showMessageDialog(this, "Please select search option!!","Required Field",JOptionPane.WARNING_MESSAGE);
        }
        else{
            tableModel.setColumnCount(0);
            tableModel.setRowCount(0);
            if(searchOptions.getSelectedItem().equals("Selled")){
                SalesDao sales = new SalesDao();
                if(!sales.found(property_id.getText(), Integer.parseInt(company_id.getText()))){
                    JOptionPane.showMessageDialog(this,"No property Found for Such Id!", "No data found",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(this,"Property Found. Click Ok to View Details!", "Data found",JOptionPane.INFORMATION_MESSAGE);
                    addTableColumnsHeaderNameSearchSelled();
                    addTableRowsDataSearchSelled((property_id.getText()));
                }
            }
            else if(searchOptions.getSelectedItem().equals("Buyed")){
                PropertiesDao dao = new PropertiesDao();
                if(!dao.found(property_id.getText(), Integer.parseInt(company_id.getText()))){
                    JOptionPane.showMessageDialog(this,"No property Found for Such Id!", "No data found",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                 else{
                    JOptionPane.showMessageDialog(this,"Property Found. Click Ok to View Details!", "Data found",JOptionPane.INFORMATION_MESSAGE);
                    addTableColumnsHeaderNameSearchBuyed();
                    addTableRowsDataSearchBuyed((property_id.getText()));
                }
                }
            else if(searchOptions.getSelectedItem().equals("Rented")){
                               PropertiesDao dao = new PropertiesDao();
                if(!dao.foundRent(property_id.getText(), Integer.parseInt(company_id.getText()))){
                    JOptionPane.showMessageDialog(this,"No property Found for Such Id!", "No data found",JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                 else{
                    JOptionPane.showMessageDialog(this,"Property Found. Click Ok to View Details!", "Data found",JOptionPane.INFORMATION_MESSAGE);
                    addTableColumnsHeaderNameSearchBuyed();
                    addTableRowsDataSearchBuyed((property_id.getText()));
                }
            }
            else{
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void searchOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchOptionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchOptionsActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        HomePage home = new HomePage();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void allPropertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allPropertiesActionPerformed
        // TODO add your handling code here:
       // AllProperties all = new AllProperties();
        tableModel.setColumnCount(0);
        tableModel.setRowCount(0);
        all.company_id.setText(company_id.getText());
        all.company_name.setText(company.getText());
        addTableColumnsHeaderName();
        addTableRowsData(Integer.parseInt(company_id.getText()));
        all.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_allPropertiesActionPerformed

    private void salesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesReportActionPerformed
        // TODO add your handling code here:
        sales.company_id.setText(company_id.getText());
        sales.company_name.setText(company.getText());
        addTableColumnsHeaderNameSales();
        addTableRowsDataSales(Integer.parseInt(company_id.getText()));
        sales.setVisible(true);
        dispose();
    }//GEN-LAST:event_salesReportActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Users user = new Users();
                new Dashboard(user).setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allProperties;
    public javax.swing.JLabel company;
    public javax.swing.JLabel company_id;
    public javax.swing.JLabel dominant;
    public javax.swing.JLabel immovableSales;
    public javax.swing.JLabel immovables;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBtn;
    public javax.swing.JLabel movableSales;
    public javax.swing.JLabel movables;
    private javax.swing.JTable myTable;
    public javax.swing.JLabel net_profit;
    public javax.swing.JTextField property_id;
    private javax.swing.JButton salesReport;
    private javax.swing.JButton searchBtn;
    public javax.swing.JComboBox<String> searchOptions;
    private javax.swing.JPanel tablePanel;
    public javax.swing.JLabel total;
    public javax.swing.JLabel total_sales;
    // End of variables declaration//GEN-END:variables
}
