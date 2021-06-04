/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.table.DefaultTableModel;
import sql.KetNoi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.sql.CallableStatement;
/**
 *
 * @author Minh Hieu
 */
public class account extends javax.swing.JFrame {
    DefaultTableModel model;
    KetNoi db = new KetNoi();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;
    /**
     * Creates new form account
     */
    public account() {
        con = db.getCon();
        initComponents();
        setLocation(500, 250);
        btdelete.setEnabled(false);
        pnadd.setVisible(false);
        model = (DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(new Object[]{
            "STT","Tài Khoản","Họ Và Tên","Giới Tính","SĐT","Địa Chỉ"
        });
        loadAccount();
    }
    public void close(){
        WindowEvent closed = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closed);
    }
    public void loadAccount(){
        int i =1;
        try{
            String sql = "select * from employe";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Vector rowac = new Vector();
                rowac.add(i++);
                rowac.add(rs.getString("UsenameEmp"));
                rowac.add(rs.getString("HoTen"));
                rowac.add(rs.getString("GioiTinh"));
                rowac.add(rs.getString("SDT"));
                rowac.add(rs.getString("DiaChi"));
                model.addRow(rowac);
            }
            jTable1.setModel(model);
            jTable1.setDefaultEditor(Object.class, null);
        }catch(Exception e){}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnadd = new javax.swing.JPanel();
        txttaikhoan = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        txthoten = new javax.swing.JTextField();
        txtgiotinh = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btreset = new javax.swing.JButton();
        btluu = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btadd2 = new javax.swing.JButton();
        btadd = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        txtfinda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btfinda = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 73, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Quản Lý Nhân Viên");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 668, 136));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Tài khoản:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Mật Khẩu:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Họ Tên:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Giới Tính:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 255));
        jLabel6.setText("SĐT:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("Địa Chỉ:");

        btreset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btreset.setText("Làm mới");
        btreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetActionPerformed(evt);
            }
        });

        btluu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btluu.setText("Lưu");
        btluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btluuActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Thoát");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btadd2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btadd2.setText("Thêm Mới");
        btadd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadd2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnaddLayout = new javax.swing.GroupLayout(pnadd);
        pnadd.setLayout(pnaddLayout);
        pnaddLayout.setHorizontalGroup(
            pnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnaddLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtpass, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(txttaikhoan))
                .addGap(60, 60, 60)
                .addGroup(pnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnaddLayout.createSequentialGroup()
                        .addComponent(btadd2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btluu, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btreset)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(pnaddLayout.createSequentialGroup()
                        .addGroup(pnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txthoten, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(txtgiotinh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(pnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnaddLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnaddLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23))))
        );
        pnaddLayout.setVerticalGroup(
            pnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnaddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgiotinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(pnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btreset)
                    .addComponent(btluu)
                    .addComponent(jButton5)
                    .addComponent(btadd2))
                .addGap(18, 18, 18))
        );

        getContentPane().add(pnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 253, 668, -1));

        btadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btadd.setForeground(new java.awt.Color(51, 255, 51));
        btadd.setText("Thêm");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });
        getContentPane().add(btadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 73, -1));

        btdelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btdelete.setForeground(new java.awt.Color(255, 0, 0));
        btdelete.setText("Xóa");
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 73, -1));
        getContentPane().add(txtfinda, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 214, 125, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tìm Kiếm:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 216, -1, -1));

        btfinda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btfinda.setText("Tìm Kiếm");
        btfinda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfindaActionPerformed(evt);
            }
        });
        getContentPane().add(btfinda, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 212, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/im/anh-nen-mau-xam_055858999.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 690, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
       btluu.setEnabled(false);
        pnadd.setVisible(true);
       txttaikhoan.setText("");
       txthoten.setText("");
        txtgiotinh.setText("");
        txtsdt.setText("");
        txtdiachi.setText("");
        txtpass.setText("");
        btadd.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_btaddActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pnadd.setVisible(false);
        btadd.setEnabled(true);
        btdelete.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        btadd2.setEnabled(false);
        txttaikhoan.setEnabled(false);
        btluu.setEnabled(true);
        btdelete.setEnabled(true);
        btadd.setEnabled(false);
        pnadd.setVisible(true);
        int selec = jTable1.getSelectedRow();
        try{
            String sql = "select Password from employe where UsenameEmp=?";
            ps = con.prepareStatement(sql);
            ps.setString(1,(String) model.getValueAt(selec, 1));
            rs = ps.executeQuery();
            if(rs.next())
                txtpass.setText(rs.getString(1));
            
        }catch(Exception e){JOptionPane.showMessageDialog(null, "lỗi");}
        txttaikhoan.setText(model.getValueAt(selec, 1).toString());
        txthoten.setText(model.getValueAt(selec, 2).toString());
        txtgiotinh.setText(model.getValueAt(selec, 3).toString());
        txtsdt.setText(model.getValueAt(selec, 4).toString());
        txtdiachi.setText(model.getValueAt(selec, 5).toString());// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresetActionPerformed
        btdelete.setEnabled(false);
        txttaikhoan.setEnabled(true);
        btluu.setEnabled(false);
        btadd2.setEnabled(true);
        txttaikhoan.setText("");
        txthoten.setText("");
        txtgiotinh.setText("");
        txtsdt.setText("");
        txtdiachi.setText("");
        txtpass.setText("");
        model.setRowCount(0);
        loadAccount();// TODO add your handling code here:
    }//GEN-LAST:event_btresetActionPerformed

    private void btfindaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfindaActionPerformed
        if(txtfinda.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Text Trống");
        }else{
            int i = 1;
            Connection con = db.getCon();
            model.setRowCount(0);
            try{
                String l = "{call accfind (?)}";
                CallableStatement ps = con.prepareCall(l);
                ps.setString(1, txtfinda.getText());
                ps.execute();
                ResultSet rs = ps.getResultSet();
                while(rs.next()){
                    Vector va = new Vector();
                    va.add(i++);
                    va.add(rs.getString("UsenameEmp"));
                    va.add(rs.getString("HoTen"));
                    va.add(rs.getString("GioiTinh"));
                    va.add(rs.getString("SDT"));
                    va.add(rs.getString("DiaChi"));
                    model.addRow(va);
                }
                jTable1.setModel(model);
            }catch(Exception e ){JOptionPane.showMessageDialog(null, e);}
        }
    }//GEN-LAST:event_btfindaActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed
        
        String xoa = "select * from employe where UsenameEmp=?";
        try{
        ps = con.prepareStatement(xoa);
        ps.setString(1 , txttaikhoan.getText());
        rs = ps.executeQuery();
        if(rs.next()){
            int click = JOptionPane.showConfirmDialog(null, "Bạn muốn xóa tài khoản này?");
            if(click == 0){
                try{
                    String sql = "delete employe where UsenameEmp=?";
                    ps = con.prepareStatement(sql);
                    ps.setString(1, txttaikhoan.getText());
                    ps.executeUpdate();
                    model.setRowCount(0);
                    loadAccount();
                    JOptionPane.showMessageDialog(null, "Xóa thành công");
                }catch(Exception e){JOptionPane.showMessageDialog(null, "Có dữ liệu liên kết không thể xóa");}
            }else JOptionPane.showMessageDialog(null, "Xóa không thành công");
        }
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        pnadd.setVisible(false);
        btadd.setEnabled(true);
        btdelete.setEnabled(false);
    }//GEN-LAST:event_btdeleteActionPerformed

    private void btadd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadd2ActionPerformed
       int line = jTable1.getRowCount();
       pnadd.setVisible(false);
        if(txttaikhoan.getText().equals("") || txtpass.getText().equals("") || txthoten.getText().equals("") || txtgiotinh.getText().equals("") || txtsdt.getText().equals("") || txtdiachi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "có hàng để trống");
        }else{
            while(true){
                for(int i=0; i<line; i++){
                    if(txttaikhoan.getText().trim().equals(jTable1.getValueAt(i, 1))){
                        JOptionPane.showMessageDialog(null, "Tài khoản bị trùng");
                        return;
                    }
                }
                if(!txtgiotinh.getText().trim().equals("Nam") && !txtgiotinh.getText().trim().equals("Nữ")){
                    JOptionPane.showMessageDialog(null, "giới tính là: Nam hoặc Nữ");
                    return;
                }
                if(!txtsdt.getText().trim().matches("[0-9]{10}") && !txtsdt.getText().trim().matches("[0-9]{11}")){
                    JOptionPane.showMessageDialog(null, "SĐT là 10 hoặc 11 số");
                    return;
                }else break;
            }
        }
        try{
            String sql = "insert into employe values (?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, txttaikhoan.getText());
            ps.setString(2, txtpass.getText());
            ps.setString(3, txthoten.getText());
            ps.setString(4, txtgiotinh.getText());
            ps.setString(5, txtsdt.getText());
            ps.setString(6, txtdiachi.getText());
            ps.executeUpdate();
            model.setRowCount(0);
            loadAccount();
            JOptionPane.showMessageDialog(null, "thêm mới thành công");
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
        
    }//GEN-LAST:event_btadd2ActionPerformed

    private void btluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btluuActionPerformed

       pnadd.setVisible(false);
        if(txttaikhoan.getText().equals("") || txtpass.getText().equals("") || txthoten.getText().equals("") || txtgiotinh.getText().equals("") || txtsdt.getText().equals("") || txtdiachi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "có hàng để trống");
        }else{
            while(true){
                if(!txtgiotinh.getText().trim().equals("Nam") && !txtgiotinh.getText().trim().equals("Nữ")){
                    JOptionPane.showMessageDialog(null, "giới tính là: Nam hoặc Nữ");
                    return;
                }
                if(!txtsdt.getText().trim().matches("[0-9]{10}") && !txtsdt.getText().trim().matches("[0-9]{11}")){
                    JOptionPane.showMessageDialog(null, "SĐT là 10 hoặc 11 số");
                    return;
                }else break;
            }
        }
        try{
            String sql = "update employe set Password=?, HoTen=?, GioiTinh=?, SDT=?, DiaChi=? where UsenameEmp=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, txtpass.getText());
            ps.setString(2, txthoten.getText());
            ps.setString(3, txtgiotinh.getText());
            ps.setString(4, txtsdt.getText());
            ps.setString(5, txtdiachi.getText());
            ps.setString(6, txttaikhoan.getText());
            ps.executeUpdate();
            model.setRowCount(0);
            loadAccount();
            JOptionPane.showMessageDialog(null, "Sửa thành công");
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_btluuActionPerformed

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
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadd;
    private javax.swing.JButton btadd2;
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btfinda;
    private javax.swing.JButton btluu;
    private javax.swing.JButton btreset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnadd;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtfinda;
    private javax.swing.JTextField txtgiotinh;
    private javax.swing.JTextField txthoten;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttaikhoan;
    // End of variables declaration//GEN-END:variables
}