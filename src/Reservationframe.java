
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Reservationframe extends javax.swing.JFrame {
     private DefaultTableModel tableModel;
    private TableRowSorter<DefaultTableModel> sorter;

    
    public Reservationframe() {
        initComponents();
        initializeTableModel();
    }


    private void initializeTableModel() {
        
        tableModel = new DefaultTableModel();
    sorter = new TableRowSorter<>(tableModel);
        
        Object[][] data = {
                {102, "Small(69sqm)", "Available", "Limay"},
                {201, "Medium(160sqm)", "Available", "Samal"},
                {303, "Large(220sqm)", "Available", "Balanga"},
                {402, "Medium(190sqm)", "Available", "Orani"},
                {502, "Small(90sqm)", "Available", "Dinalupihan"},
                {202, "Small(50sqm)", "Available", "Limay"},
                {301, "Medium(120sqm)", "Available", "Abucay"},
                {103, "Large(200sqm)", "Available", "Mariveles"},
                {502, "Medium(120sqm)", "Available", "Orion"},
                  {802, "Small(80sqm)", "Available", "Dinalupihan"},
                {152, "Small(80sqm)", "Available", "Mariveles"},
                {251, "Medium(120sqm)", "Available", "Samal"},
                {383, "Large(210sqm)", "Available", "Balanga"},
                {432, "Medium(190sqm)", "Available", "Orani"},
                {793, "Small(100sqm)", "Available", "Dinalupihan"},
                {1106, "Small(90sqm)", "Available", "Samal"},
                {1207, "Medium(150sqm)", "Available", "Mariveles"},
                {1308, "Large(270sqm)", "Available", "Samal"},
                {1409, "Small(67sqm)", "Available", "Mariveles"},
                {2510, "Medium(150sqm)", "Available", "Orion"},
                {872, "Small(50sqm)", "Available", "Dinalupihan"},
                {1052, "Small(70sqm)", "Available", "Mariveles"},
                {2591, "Medium(180sqm)", "Available", "Samal"},
                {3093, "Large(300sqm)", "Available", "Balanga"}
                
                
                
                
        };
        String[] columnNames = {"Lot Id", "Lot size", "Availability", "Location"};

        tableModel.setDataVector(data, columnNames);
        
        TableModel.setModel(tableModel);
        TableModel.setRowSorter(sorter);
        
        
        searchButton.addActionListener(this::searchButtonActionPerformed);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableModel = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        reserveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(68, 136, 178));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setFont(new java.awt.Font("NSimSun", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to LotEase");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Find your perfect land! Search for the perfect destination.");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bataan Branch");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)))
                .addGap(60, 60, 60)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 48, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        searchButton.setForeground(new java.awt.Color(102, 102, 102));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        TableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lot Id", "Lot size", "Availability", "Location"
            }
        ));
        jScrollPane1.setViewportView(TableModel);

        jPanel2.setBackground(new java.awt.Color(42, 96, 124));

        backButton.setForeground(new java.awt.Color(102, 102, 102));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("LotEase allows you to search for your dream location");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("for your new lot inside Bataan, Philippines.");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("It will show all the available lots,");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("as well as their sizes.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(backButton)
                .addGap(46, 46, 46))
        );

        reserveButton.setForeground(new java.awt.Color(102, 102, 102));
        reserveButton.setText("Reserve");
        reserveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reserveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(reserveButton)
                        .addGap(33, 33, 33))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
          
    
    
   private void updateReservationStatus(int lotId, String newStatus) {
        int viewIndex = TableModel.getSelectedRow();
    if (viewIndex != -1) {
        int modelIndex = TableModel.convertRowIndexToModel(viewIndex);
        tableModel.setValueAt(newStatus, modelIndex, 2);
        sorter.modelStructureChanged(); 
        
            
        }
    }
    
    
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
       
        String searchText = searchTextField.getText().trim().toLowerCase();

    if (searchText.isEmpty()) {
        sorter.setRowFilter(null);
    } else {
        try {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText));
        } catch (java.util.regex.PatternSyntaxException e) {
            System.err.println("Invalid search pattern");
        }

        }
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Reservationframe().setVisible(true));
    
    }//GEN-LAST:event_searchButtonActionPerformed

    private void reserveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveButtonActionPerformed
    int selectedRow = TableModel.getSelectedRow();

    if (selectedRow != -1 && selectedRow < TableModel.getRowCount()) {
        int modelIndex = sorter.convertRowIndexToModel(selectedRow);

        if (TableModel.getValueAt(modelIndex, 2).equals("Available")) {
           AgreementDialog agreementDialog = new AgreementDialog(this);
           
           if (agreementDialog.showDialog() && agreementDialog.agreed && !agreementDialog.getName().isEmpty()) {
               // Update the reservation status to Reserved
               updateReservationStatus(modelIndex, "Reserved");
   if (agreementDialog.showDialog()) {
                   String reservationCode = null;
       
        

      
        String message = "Reservation Successful!\n\nThank you for reserving with us.\nYour reservation code: " + reservationCode
                + "\n\nPlease remember that this code will send to your email.\nYou can now exit the application.";
        JOptionPane.showMessageDialog(this, message);
            } else {
                JOptionPane.showMessageDialog(this, "Please provide your name, agree to the terms, and select a purpose.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please select an available lot to reserve.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a valid row to reserve.");

        }
    }
    }


   private class AgreementDialog extends JDialog {
    private JCheckBox agreeCheckBox;
    private JTextField nameTextField;
    private JTextField emailTextField;
    private JTextField contactTextField;
    private JTextField addressTextField;
    private JComboBox<String> purposeComboBox;

    private boolean agreed = false;

    public AgreementDialog(JFrame parent) {
        super(parent, "Agreement", true);
        initComponents();
        }

        private void initComponents() {
            JPanel panel = new JPanel(new GridLayout(7, 2));

        JLabel nameLabel = new JLabel("Name:");
        nameTextField = new JTextField();

        JLabel emailLabel = new JLabel("Email:");
        emailTextField = new JTextField();

        JLabel contactLabel = new JLabel("Contact Number:");
        contactTextField = new JTextField();

        JLabel addressLabel = new JLabel("Current Address:");
        addressTextField = new JTextField();

        JLabel purposeLabel = new JLabel("Purpose:");
        purposeComboBox = new JComboBox<>(new String[]{"Personal", "Commercial"});

        JLabel agreementLabel = new JLabel("I agree to the terms and conditions:");
        agreeCheckBox = new JCheckBox();

        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(emailLabel);
        panel.add(emailTextField);
        panel.add(contactLabel);
        panel.add(contactTextField);
        panel.add(addressLabel);
        panel.add(addressTextField);
        panel.add(purposeLabel);
        panel.add(purposeComboBox);
        panel.add(agreementLabel);
        panel.add(agreeCheckBox);

        JButton agreeButton = new JButton("Agree");
        JButton cancelButton = new JButton("Cancel");

        agreeButton.addActionListener((ActionEvent e) -> {
            if (agreeCheckBox.isSelected() && !nameTextField.getText().trim().isEmpty()) {
                agreed = true;
                dispose();
            } else {
                JOptionPane.showMessageDialog(AgreementDialog.this, "Please provide your name and agree to the terms.");
                }
            });

            cancelButton.addActionListener((ActionEvent e) -> {
            dispose();
        });

        panel.add(agreeButton);
        panel.add(cancelButton);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
        }

        public boolean showDialog() {
            setVisible(true);
        return agreed;
    }

    public String getEmail() {
        return emailTextField.getText().trim();
    }

    public String getAddress() {
        return addressTextField.getText().trim();
    }

    public String getContactNumber() {
        return contactTextField.getText().trim();
    }

    public String getPurpose() {
        return purposeComboBox.getSelectedItem().toString();
        }
    }//GEN-LAST:event_reserveButtonActionPerformed

    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();

    Homeframe homeFrame = new Homeframe();
    homeFrame.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableModel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton reserveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
