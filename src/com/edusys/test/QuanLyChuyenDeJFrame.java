/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.test;

import com.edusys.Interface.IService;
import com.edusys.DAO.ChuyenDeDAO;
import com.edusys.helper.DialogHelper;
import com.edusys.helper.ShareHelper;
import com.edusys.model.ChuyenDe;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Dell
 */
public class QuanLyChuyenDeJFrame extends javax.swing.JFrame implements IService {

    /**
     * Creates new form QuanLyChuyenDe
     */
    DefaultTableModel tblModel = new DefaultTableModel(new String[]{"MÃ CD", "TÊN CD", "HỌC PHÍ", "THỜI LƯỢNG", "HÌNH"}, 0);
    ChuyenDeDAO chuyenDeDAO = new ChuyenDeDAO();
    List<ChuyenDe> lst_chuyenDe = new ArrayList<>();
    int rowIndex = 0;

    public QuanLyChuyenDeJFrame() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_hinh = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_maCD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_tenCD = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_thoiLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_hocPhi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_moTa = new javax.swing.JTextArea();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        btn_moi = new javax.swing.JButton();
        btn_first = new javax.swing.JButton();
        btn_prev = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_danhSachChuyenDe = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("QUẢN LÝ CHUYÊN ĐỀ");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Hình logo");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        lbl_hinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        lbl_hinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_hinhMouseClicked(evt);
            }
        });
        jPanel2.add(lbl_hinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 31, 143, 173));

        jLabel4.setText("Mã chuyên đề");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 11, -1, -1));
        jPanel2.add(txt_maCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 31, 369, -1));

        jLabel5.setText("Tên chuyên đề");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 62, -1, -1));
        jPanel2.add(txt_tenCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 82, 369, -1));

        jLabel6.setText("Thời lượng");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 113, -1, -1));
        jPanel2.add(txt_thoiLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 133, 369, -1));

        jLabel7.setText("Học phí");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 159, -1, -1));
        jPanel2.add(txt_hocPhi, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 184, 369, -1));

        jLabel8.setText("Mô tả chuyên đề");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 222, -1, -1));

        txt_moTa.setColumns(20);
        txt_moTa.setRows(5);
        jScrollPane1.setViewportView(txt_moTa);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, 526, 127));

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        jPanel2.add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 387, -1, -1));

        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 387, -1, -1));

        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_xoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 387, -1, -1));

        btn_moi.setText("Mới");
        btn_moi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moiActionPerformed(evt);
            }
        });
        jPanel2.add(btn_moi, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 387, -1, -1));

        btn_first.setText("|<");
        btn_first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_firstActionPerformed(evt);
            }
        });
        jPanel2.add(btn_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 387, -1, -1));

        btn_prev.setText("<<");
        btn_prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prevActionPerformed(evt);
            }
        });
        jPanel2.add(btn_prev, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 387, -1, -1));

        btn_next.setText(">>");
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });
        jPanel2.add(btn_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 387, -1, -1));

        btn_last.setText(">|");
        btn_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lastActionPerformed(evt);
            }
        });
        jPanel2.add(btn_last, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 387, -1, -1));

        tabs.addTab("CẬP NHẬT", jPanel2);

        tbl_danhSachChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_danhSachChuyenDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_danhSachChuyenDeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_danhSachChuyenDe);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        tabs.addTab("DANH SÁCH", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_hinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_hinhMouseClicked
        try {
            selectImage();
        } catch (IOException ex) {
            Logger.getLogger(QuanLyChuyenDeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbl_hinhMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        insert();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        update();
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        delete();
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_moiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moiActionPerformed
        clear();
    }//GEN-LAST:event_btn_moiActionPerformed

    private void btn_firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_firstActionPerformed
        rowIndex = 0;
        setModel(lst_chuyenDe.get(rowIndex));
    }//GEN-LAST:event_btn_firstActionPerformed

    private void btn_prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prevActionPerformed
        rowIndex--;
        setModel(lst_chuyenDe.get(rowIndex));
    }//GEN-LAST:event_btn_prevActionPerformed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        rowIndex++;
        setModel(lst_chuyenDe.get(rowIndex));
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lastActionPerformed
        rowIndex = tbl_danhSachChuyenDe.getRowCount() - 1;
        setModel(lst_chuyenDe.get(rowIndex));
    }//GEN-LAST:event_btn_lastActionPerformed

    private void tbl_danhSachChuyenDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_danhSachChuyenDeMouseClicked
        rowIndex = tbl_danhSachChuyenDe.getSelectedRow();
        setModel(lst_chuyenDe.get(rowIndex));
        tabs.setSelectedIndex(0);
        setBtnEnabled(true);
    }//GEN-LAST:event_tbl_danhSachChuyenDeMouseClicked

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
            java.util.logging.Logger.getLogger(QuanLyChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyChuyenDeJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyChuyenDeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_moi;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_prev;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_hinh;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbl_danhSachChuyenDe;
    private javax.swing.JTextField txt_hocPhi;
    private javax.swing.JTextField txt_maCD;
    private javax.swing.JTextArea txt_moTa;
    private javax.swing.JTextField txt_tenCD;
    private javax.swing.JTextField txt_thoiLuong;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(ShareHelper.APP_ICON);
        setTitle("QUẢN LÝ CHUYÊN ĐỀ");
        tbl_danhSachChuyenDe.setModel(tblModel);
        loadTable();
        setBtnEnabled(false);
        tabs.setSelectedIndex(1);
        setSize(800, 600);
    }

    @Override
    public void loadTable() {
        try {
            lst_chuyenDe = chuyenDeDAO.selectAll();
            tblModel.setRowCount(0);
            for (ChuyenDe x : lst_chuyenDe) {
                tblModel.addRow(new Object[]{x.getMaCD(), x.getTenCD(), x.getHocPhi(), x.getThoiLuong(), x.getHinh()});
            }
        } catch (Exception e) {
            DialogHelper.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    @Override
    public void setBtnEnabled(boolean maTonTai) {
        txt_maCD.setEnabled(!maTonTai);
        btn_them.setEnabled(!maTonTai);
        btn_sua.setEnabled(maTonTai);
        btn_xoa.setEnabled(maTonTai);

        boolean first = rowIndex > 0;
        boolean last = rowIndex < tbl_danhSachChuyenDe.getRowCount() - 1;
        btn_first.setEnabled(first && maTonTai);
        btn_last.setEnabled(last && maTonTai);
        btn_prev.setEnabled(first && maTonTai);
        btn_next.setEnabled(last && maTonTai);
    }

    @Override
    public StringBuilder checkField() {
        StringBuilder sb = new StringBuilder();
        String maCD = txt_maCD.getText();
        String tenCD = txt_tenCD.getText();
        String thoiLuong = txt_thoiLuong.getText();
        String hocPhi = txt_hocPhi.getText();
        if (maCD.isBlank() || tenCD.isBlank() || thoiLuong.isBlank() || hocPhi.isBlank()) {
            sb.append("Phải nhập đủ dữ liệu\n");
        }
        try {
            int tl = Integer.parseInt(thoiLuong);
            if (tl <= 0) {
                sb.append("Thời lượng phải > 0\n");
            }
        } catch (Exception e) {
            sb.append("Thời lượng phải là số nguyên\n");
        }
        try {
            double hp = Double.parseDouble(hocPhi);
            if (hp <= 0) {
                sb.append("Học phí phải > 0\n");
            }
        } catch (Exception e) {
            sb.append("Học phí phải là số\n");
        }
        return sb;
    }

    @Override
    public void insert() {
        if (getModel() != null) {
            try {
                chuyenDeDAO.insert(getModel());
                loadTable();
                clear();
                DialogHelper.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Thêm mới thất bại!");
            }
        }
    }

    @Override
    public void update() {
        if (getModel() != null) {
            try {
                chuyenDeDAO.update(getModel());
                loadTable();
                DialogHelper.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                DialogHelper.alert(this, "Cập nhật thất bại!");
            }
        }
    }

    @Override
    public void delete() {
        if (rowIndex >= 0) {
            if (DialogHelper.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")) {
                String manv = txt_maCD.getText();
                try {
                    chuyenDeDAO.delete(manv);
                    loadTable();
                    clear();
                    DialogHelper.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    DialogHelper.alert(this, "Xóa thất bại!");
                }
            }
        }
    }

    @Override
    public void clear() {
        setModel(new ChuyenDe());
        txt_hocPhi.setText("");
        txt_thoiLuong.setText("");
        lbl_hinh.setIcon(null);
        setBtnEnabled(false);
    }

    private void selectImage() throws IOException {
        JFileChooser fc = new JFileChooser("logos\\");
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            if (ShareHelper.saveLogo(file)) {
                lbl_hinh.setIcon(ShareHelper.readLogo(file.getName()));   
                lbl_hinh.setToolTipText(file.getName());
            }
        }
    }

    void setModel(ChuyenDe model) {
        txt_maCD.setText(model.getMaCD());
        txt_tenCD.setText(model.getTenCD());
        txt_thoiLuong.setText(model.getThoiLuong() + "");
        txt_hocPhi.setText(model.getHocPhi() + "");
        txt_moTa.setText(model.getMoTa());
        lbl_hinh.setToolTipText(model.getHinh());
        if (model.getHinh() != null) {
            lbl_hinh.setIcon(ShareHelper.readLogo(model.getHinh()));
        }
        setBtnEnabled(true);
    }

    ChuyenDe getModel() {
        if (checkField().length() > 0) {
            DialogHelper.alert(this, checkField().toString());
            return null;
        }
        return new ChuyenDe(txt_maCD.getText(), txt_tenCD.getText(), Double.parseDouble(txt_hocPhi.getText()),
                Integer.parseInt(txt_thoiLuong.getText()), lbl_hinh.getToolTipText(), txt_moTa.getText());
    }

}
