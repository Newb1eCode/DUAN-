
package Views;


import Models.PhieuGiaoHang.PhieuGiaoHangModels;
import Models.PhieuGiaoHang.ThanhToanModels;
import Models.PhieuGiaoHang.TrangThaiModels;
import Models.PhieuGiaoHang.VanChuyenModels;
import Services.PhieuGiaoHang.DiaChiDao;
import Services.PhieuGiaoHang.PhieuGiaoHangDao;
import Services.PhieuGiaoHang.ThanhToanDao;
import Services.PhieuGiaoHang.TrangThaiDao;
import Services.PhieuGiaoHang.VanChuyenDao;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class PhieuGiaoHangJPanel extends javax.swing.JPanel {
     PhieuGiaoHangDao list = new PhieuGiaoHangDao();
    DiaChiDao diadiem = new DiaChiDao();
    ThanhToanDao thanhToan = new ThanhToanDao();
    VanChuyenDao vanchuyen = new VanChuyenDao();
    TrangThaiDao trangThai = new TrangThaiDao();
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel modelll = new DefaultTableModel();
//DefaultComboBoxModel cbo = new DefaultComboBoxModel();
  
    public PhieuGiaoHangJPanel() {
        initComponents();
        fillTablePhieuGiaoHang();
//        fillTableThanhToan();
//        fillTableVanChuyen();
        fillTableTrangThai();
        fillComboboxTrangThai();
//        fillComboboxsoTien();
//        fillComboboxdiaCHi();
//        fillComboboxvanChuyen();
        DiaChiJDialog.setLocationRelativeTo(null);
        JdialogThanhToan.setLocationRelativeTo(null);
        TrangThai.setLocationRelativeTo(null);
        ThongTinVanChuyen.setLocationRelativeTo(null);
        TrangThai.setTitle("Trạng Thái Giao Hàng");
        ThongTinVanChuyen.setTitle("Thông Tin Vận Chuyển");
    }
     private void fillComboboxTrangThai() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbo_TrangThaiGiaoHang.getModel();
        model.removeAllElements();
        ArrayList<TrangThaiModels> lst = trangThai.getAllTramgThai();
        for (TrangThaiModels tt : lst) {
            model.addElement(tt.getTrangThai());
            this.fillTableTrangThai();
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        DiaChiJDialog = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_MaDiaDiem = new javax.swing.JTextField();
        txt_Duong = new javax.swing.JTextField();
        txt_tenQH = new javax.swing.JTextField();
        txt_tenTP = new javax.swing.JTextField();
        btn_luuDiaCHi = new javax.swing.JButton();
        btn_luu1 = new javax.swing.JButton();
        btn_UpdateDiaChi = new javax.swing.JButton();
        JdialogThanhToan = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_MathanhToan = new javax.swing.JTextField();
        txt_NgayThanhToan = new javax.swing.JTextField();
        txt_soTien = new javax.swing.JTextField();
        txt_PhuongThuc = new javax.swing.JTextField();
        btn_luuThanhToan = new javax.swing.JButton();
        btn_luu2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        rdo_chuaThanhToan1 = new javax.swing.JRadioButton();
        rdo_DaThanhToan1 = new javax.swing.JRadioButton();
        btn_updateeeThanhToan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ThongTinVanChuyen = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txt_MaVanChuyen = new javax.swing.JTextField();
        txt_NguoiVanChuyen = new javax.swing.JTextField();
        txt_sdtNguoiGiao = new javax.swing.JTextField();
        btn_luuThanhToan1 = new javax.swing.JButton();
        btn_luu3 = new javax.swing.JButton();
        btn_updateThongTinVanCHuyen = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        TrangThai = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txt_TrangThai = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_maTrangTHai1 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        updateTranngThai = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        rdo_thanhtoan = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rdo_chuathanhtoan = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbo_TrangThaiGiaoHang = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txt_maPhieu = new javax.swing.JTextField();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_PhieuGiaoHang = new javax.swing.JTable();
        btn_themPhieuGiaoHang = new javax.swing.JButton();
        btn_updatePhieuGiaoHang = new javax.swing.JButton();
        btn_xoaPhieuGiaoHang = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        txt_timKiem = new javax.swing.JTextField();
        btn_timKiem = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        rdo_MaSapXep = new javax.swing.JRadioButton();
        rdo_soTien = new javax.swing.JRadioButton();
        txt_soTiennnn = new javax.swing.JTextField();
        txt_nguoivanchuyennn = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txt_ngayGiao = new javax.swing.JTextField();
        txt_nguoiNhan = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_TrangThai = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_ghiChu = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

        DiaChiJDialog.setTitle("Diachi");
        DiaChiJDialog.setMinimumSize(new java.awt.Dimension(400, 400));
        DiaChiJDialog.setModal(true);

        jLabel8.setText("Mã Địa Điểm:");

        jLabel9.setText("Đường:");

        jLabel10.setText("Tên Quận Huyện:");

        jLabel11.setText("Tên Thành Phố:");

        btn_luuDiaCHi.setText("Lưu");
        btn_luuDiaCHi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuDiaCHiActionPerformed(evt);
            }
        });

        btn_luu1.setText("Cancel");
        btn_luu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luu1ActionPerformed(evt);
            }
        });

        btn_UpdateDiaChi.setText("Update");
        btn_UpdateDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateDiaChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_MaDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Duong, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenQH, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tenTP, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_luuDiaCHi)
                .addGap(68, 68, 68)
                .addComponent(btn_UpdateDiaChi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_luu1)
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_MaDiaDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Duong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txt_tenQH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_tenTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_luuDiaCHi)
                    .addComponent(btn_luu1)
                    .addComponent(btn_UpdateDiaChi))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DiaChiJDialogLayout = new javax.swing.GroupLayout(DiaChiJDialog.getContentPane());
        DiaChiJDialog.getContentPane().setLayout(DiaChiJDialogLayout);
        DiaChiJDialogLayout.setHorizontalGroup(
            DiaChiJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DiaChiJDialogLayout.setVerticalGroup(
            DiaChiJDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        JdialogThanhToan.setTitle("JdialogThanhToan");
        JdialogThanhToan.setMinimumSize(new java.awt.Dimension(400, 400));
        JdialogThanhToan.setModal(true);

        jLabel12.setText("Mã Thanh Toan");

        jLabel13.setText("Ngày Thanh Toán");

        jLabel14.setText("Số Tiền");

        jLabel15.setText("Phương Thức");

        btn_luuThanhToan.setText("Lưu");
        btn_luuThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuThanhToanActionPerformed(evt);
            }
        });

        btn_luu2.setText("Cancel");
        btn_luu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luu2ActionPerformed(evt);
            }
        });

        jLabel16.setText("Trạng Thái");

        rdo_chuaThanhToan1.setText("Chưa Thanh Toán");

        rdo_DaThanhToan1.setText("Đã Thanh Toán");

        btn_updateeeThanhToan.setText("Update");
        btn_updateeeThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateeeThanhToanActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(btn_luuThanhToan))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(rdo_DaThanhToan1))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btn_updateeeThanhToan)
                                .addGap(28, 28, 28)
                                .addComponent(jButton2)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdo_chuaThanhToan1))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btn_luu2))))
                    .addComponent(txt_MathanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_NgayThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_soTien, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_PhuongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_MathanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_NgayThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txt_soTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_PhuongThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(rdo_chuaThanhToan1)
                    .addComponent(rdo_DaThanhToan1))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_luuThanhToan)
                    .addComponent(btn_luu2)
                    .addComponent(btn_updateeeThanhToan)
                    .addComponent(jButton2))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JdialogThanhToanLayout = new javax.swing.GroupLayout(JdialogThanhToan.getContentPane());
        JdialogThanhToan.getContentPane().setLayout(JdialogThanhToanLayout);
        JdialogThanhToanLayout.setHorizontalGroup(
            JdialogThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JdialogThanhToanLayout.setVerticalGroup(
            JdialogThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ThongTinVanChuyen.setMinimumSize(new java.awt.Dimension(400, 400));
        ThongTinVanChuyen.setModal(true);

        jLabel17.setText("Mã Vận Chuyển");

        jLabel18.setText("Người Vận Chuyển");

        jLabel20.setText("SDT Người Giao:");

        btn_luuThanhToan1.setText("Lưu");
        btn_luuThanhToan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuThanhToan1ActionPerformed(evt);
            }
        });

        btn_luu3.setText("Cancel");
        btn_luu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luu3ActionPerformed(evt);
            }
        });

        btn_updateThongTinVanCHuyen.setText("Update");
        btn_updateThongTinVanCHuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateThongTinVanCHuyenActionPerformed(evt);
            }
        });

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btn_luuThanhToan1)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(txt_MaVanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btn_updateThongTinVanCHuyen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_luu3)
                        .addGap(27, 27, 27))))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_NguoiVanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_sdtNguoiGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_MaVanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_NguoiVanChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt_sdtNguoiGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_luuThanhToan1)
                    .addComponent(btn_luu3)
                    .addComponent(btn_updateThongTinVanCHuyen)
                    .addComponent(jButton6))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ThongTinVanChuyenLayout = new javax.swing.GroupLayout(ThongTinVanChuyen.getContentPane());
        ThongTinVanChuyen.getContentPane().setLayout(ThongTinVanChuyenLayout);
        ThongTinVanChuyenLayout.setHorizontalGroup(
            ThongTinVanChuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ThongTinVanChuyenLayout.setVerticalGroup(
            ThongTinVanChuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TrangThai.setMinimumSize(new java.awt.Dimension(400, 400));
        TrangThai.setModal(true);

        jLabel19.setText("Mã Trạng Thái: ");

        jLabel21.setText("Trạng Thái:");

        jButton8.setText("Thêm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        updateTranngThai.setText("Update");
        updateTranngThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTranngThaiActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel21)
                        .addComponent(jLabel19)))
                .addGap(39, 39, 39)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_maTrangTHai1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(updateTranngThai)
                        .addGap(54, 54, 54)
                        .addComponent(jButton4)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_TrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txt_maTrangTHai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel21)))
                .addGap(46, 46, 46)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateTranngThai)
                    .addComponent(jButton8)
                    .addComponent(jButton4))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout TrangThaiLayout = new javax.swing.GroupLayout(TrangThai.getContentPane());
        TrangThai.getContentPane().setLayout(TrangThaiLayout);
        TrangThaiLayout.setHorizontalGroup(
            TrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TrangThaiLayout.setVerticalGroup(
            TrangThaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setText("Ngày Giao");

        buttonGroup1.add(rdo_thanhtoan);
        rdo_thanhtoan.setText("Đã Thanh Toán");

        jLabel3.setText("Người Nhận");

        buttonGroup1.add(rdo_chuathanhtoan);
        rdo_chuathanhtoan.setText("Chưa Thanh Toán");

        jLabel4.setText("SDT");

        jLabel5.setText("Địa Chỉ");

        cbo_TrangThaiGiaoHang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Trạng Thái");

        jLabel22.setText("Trạng Thái Giao Hàng");

        jLabel7.setText("Mã Hoá Đơn");

        jLabel23.setText("Số Tiền");

        tabs.setBackground(new java.awt.Color(255, 102, 0));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tbl_PhieuGiaoHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Phiếu", "Ngày Giao", "Người Nhận", "SDT", "Địa Chỉ", "Trạng Thái Thanh Toán", "Mã Hóa Đơn", "Người Vận Chuyển", "Số Tiền", "Trạng Thái Giao Hàng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_PhieuGiaoHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_PhieuGiaoHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_PhieuGiaoHang);

        btn_themPhieuGiaoHang.setText("Thêm");
        btn_themPhieuGiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themPhieuGiaoHangActionPerformed(evt);
            }
        });

        btn_updatePhieuGiaoHang.setText("Update");
        btn_updatePhieuGiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updatePhieuGiaoHangActionPerformed(evt);
            }
        });

        btn_xoaPhieuGiaoHang.setText("Delete");
        btn_xoaPhieuGiaoHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaPhieuGiaoHangActionPerformed(evt);
            }
        });

        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        txt_timKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_timKiemKeyReleased(evt);
            }
        });

        btn_timKiem.setText("Tìm Kiếm");
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });

        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        jLabel26.setText("Sắp Xếp :");

        rdo_MaSapXep.setText("Mã");
        rdo_MaSapXep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdo_MaSapXepMouseClicked(evt);
            }
        });

        rdo_soTien.setText("Số Tiền");
        rdo_soTien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdo_soTienMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdo_MaSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(rdo_soTien, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(rdo_MaSapXep)
                    .addComponent(rdo_soTien))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btn_themPhieuGiaoHang)
                        .addGap(95, 95, 95)
                        .addComponent(btn_updatePhieuGiaoHang)
                        .addGap(71, 71, 71)
                        .addComponent(btn_xoaPhieuGiaoHang)
                        .addGap(89, 89, 89)
                        .addComponent(jButton7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btn_timKiem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_timKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_timKiem)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_themPhieuGiaoHang)
                    .addComponent(btn_updatePhieuGiaoHang)
                    .addComponent(btn_xoaPhieuGiaoHang)
                    .addComponent(jButton7))
                .addGap(16, 16, 16))
        );

        tabs.addTab("Phiếu Giao Hàng", jPanel1);

        txt_soTiennnn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_soTiennnnActionPerformed(evt);
            }
        });

        jLabel24.setText("Người Vận Chuyển");

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Trạng thái giao hàng"));

        tbl_TrangThai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Trạng Thái", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_TrangThai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TrangThaiMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_TrangThai);

        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jButton3)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jLabel1.setText("Mã Phiếu");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel25.setText("PHIẾU GIAO HÀNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_ngayGiao)
                                        .addComponent(txt_soTiennnn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_maPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_ghiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_nguoivanchuyennn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(38, 38, 38)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdo_thanhtoan)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdo_chuathanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel22)
                                        .addGap(54, 54, 54)
                                        .addComponent(cbo_TrangThaiGiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 1202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(490, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(457, 457, 457)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_maPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(cbo_TrangThaiGiaoHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_ghiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(rdo_thanhtoan)
                            .addComponent(rdo_chuathanhtoan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(txt_nguoivanchuyennn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nguoiNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txt_soTiennnn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_ngayGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_PhieuGiaoHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_PhieuGiaoHangMouseClicked
        this.showDetai();
    }//GEN-LAST:event_tbl_PhieuGiaoHangMouseClicked

    private void btn_themPhieuGiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themPhieuGiaoHangActionPerformed
        if(validates()) {
            try {

                int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?");
                if (hoi != JOptionPane.YES_OPTION) {
                    return;
                }

                PhieuGiaoHangModels nv = getForm();
                if (list.add(nv) != null) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    this.fillTablePhieuGiaoHang();
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm thất bại");
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }    // TODO add your handling code here:
    }//GEN-LAST:event_btn_themPhieuGiaoHangActionPerformed

    private void btn_updatePhieuGiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updatePhieuGiaoHangActionPerformed
        if(validates()) {
            try {
                int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật không?");
                if (hoi != JOptionPane.YES_OPTION) {
                    return;
                }
                int index = tbl_PhieuGiaoHang.getSelectedRow();

                PhieuGiaoHangModels kh = getForm();
                if (list.update(kh) != null && index >= 0) {
                    JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công!");
                    fillTablePhieuGiaoHang();
                } else {
                    JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thất bại");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
                //            JOptionPane.showMessageDialog(this, "Lỗi nút update");
            }

        }
    }//GEN-LAST:event_btn_updatePhieuGiaoHangActionPerformed

    private void btn_xoaPhieuGiaoHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaPhieuGiaoHangActionPerformed
        if(validates()) {
            try {
                int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa đối tượng này không?");
                if (hoi != JOptionPane.YES_OPTION) {
                    return;
                } else {
                    int index = tbl_PhieuGiaoHang.getRowCount();
                    String maPhieu = txt_maPhieu.getText();
                    if (index >= 0 && list.delete(index, maPhieu) != null) {
                        JOptionPane.showMessageDialog(this, "Xóa thành công");
                        fillTablePhieuGiaoHang();
                        //                    if (tbl_phieugiaohang.getRowCount() > 0) {
                            //                        tbl_phieugiaohang.setRowSelectionInterval(1, 1);
                            //                        showDetai();
                            //                    }
                    }
                }

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }//GEN-LAST:event_btn_xoaPhieuGiaoHangActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        txt_maPhieu.setText("");
        txt_ngayGiao.setText("");
        txt_nguoiNhan.setText("");
        txt_sdt.setText("");
        txt_email.setText("");
        txt_ghiChu.setText("");
        txt_soTiennnn.setText("");
        txt_nguoivanchuyennn.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txt_timKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_timKiemKeyReleased
        DefaultTableModel dtm = (DefaultTableModel) tbl_PhieuGiaoHang.getModel();
        TableRowSorter<DefaultTableModel> abc = new TableRowSorter<>(dtm);
        tbl_PhieuGiaoHang.setRowSorter(abc);
        abc.setRowFilter(RowFilter.regexFilter(txt_timKiem.getText(),0,5));// TODO add your handling code here:
    }//GEN-LAST:event_txt_timKiemKeyReleased

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
        try {
            model = (DefaultTableModel) tbl_PhieuGiaoHang.getModel();
            model.setRowCount(0);
            String maNh = txt_timKiem.getText();
            for (PhieuGiaoHangModels p : list.getMa(maNh)) {
                model.addRow(new Object[]{p.getMaPhieu(), p.getNgayGiao(), p.getNguoiNhan(), p.getSdt(), p.getGmail(), p.getTrangThaiThanhToan(), p.getGhiChu(),
                    p.getNguoiVanChuyen(), p.getSoTien(), p.getTrangThaiGiaoHang()});
        }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void rdo_MaSapXepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdo_MaSapXepMouseClicked
        // TODO add your handling code here:
        sapxep(list.getAll(), "MaPhieu");
    }//GEN-LAST:event_rdo_MaSapXepMouseClicked

    private void rdo_soTienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdo_soTienMouseClicked
        sapxep(list.getAll(), "SoTien");// TODO add your handling code here:
    }//GEN-LAST:event_rdo_soTienMouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked

    }//GEN-LAST:event_jPanel11MouseClicked

    private void tbl_TrangThaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TrangThaiMouseClicked
        int index = tbl_TrangThai.getSelectedRow();
        txt_maTrangTHai1.setText(tbl_TrangThai.getValueAt(index, 0).toString());
        txt_TrangThai.setText(tbl_TrangThai.getValueAt(index, 1).toString());
    }//GEN-LAST:event_tbl_TrangThaiMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TrangThai.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_luuDiaCHiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuDiaCHiActionPerformed

    }//GEN-LAST:event_btn_luuDiaCHiActionPerformed

    private void btn_luu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luu1ActionPerformed
        DiaChiJDialog.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btn_luu1ActionPerformed

    private void btn_UpdateDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateDiaChiActionPerformed

    }//GEN-LAST:event_btn_UpdateDiaChiActionPerformed

    private void btn_luuThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuThanhToanActionPerformed

        try {
            ThanhToanModels dd = new ThanhToanModels();
            String ngayGiaoText = txt_NgayThanhToan.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date ngayGiao = dateFormat.parse(ngayGiaoText);
            dd.setNgayThanhToan(ngayGiao);
            //            dd.setSoTien(Float.parseFloat(txt_soTien.getText()));
            // String selectedValue = txt_soTien.getSelectedItem().toString();
            //            BigDecimal bigDecimalValue = BigDecimal.valueOf(Double.parseDouble(selectedValue));
            //            dd.setSoTien(bigDecimalValue);
            BigDecimal soTienValue = new BigDecimal(txt_soTien.getText());

            // Set the SoTien property of dd with the BigDecimal value
            dd.setSoTien(soTienValue);
            dd.setPhuongThuc(txt_PhuongThuc.getText());
            if (rdo_DaThanhToan1.isSelected()) {
                dd.setTrangThai(rdo_DaThanhToan1.getText());
            } else {
                dd.setTrangThai(rdo_chuaThanhToan1.getText());
            }
            thanhToan.add(dd);
            //            this.fillTableThanhToan();
            //            fillComboboxsoTien();
            JOptionPane.showMessageDialog(this, "Thêm Thành Công");// TODO add your handling code here:
        } catch (ParseException ex) {
            Logger.getLogger(PhieuGiaoHangJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_luuThanhToanActionPerformed

    private void btn_luu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luu2ActionPerformed
        JdialogThanhToan.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_btn_luu2ActionPerformed

    private void btn_updateeeThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateeeThanhToanActionPerformed

        //        try {
            //            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật không?");
            //            if (hoi != JOptionPane.YES_OPTION) {
                //                return;
                //            }
            //            int index = tbl_thanhToan.getSelectedRow();
            //
            //            ThanhToanModels dd = new ThanhToanModels();
            //            String ngayGiaoText = txt_NgayThanhToan.getText();
            //            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            //            Date ngayGiao = dateFormat.parse(ngayGiaoText);
            //            dd.setNgayThanhToan(ngayGiao);
            ////            dd.setSoTien(BigDecimal.(txt_soTien.getText()));
            //            dd.setMaThanhToan(Integer.parseInt(txt_MathanhToan.getText()));
            //            BigDecimal soTienValue = new BigDecimal(txt_soTien.getText());
            //            dd.setSoTien(soTienValue);
            //
            //            dd.setPhuongThuc(txt_PhuongThuc.getText());
            //            if (rdo_DaThanhToan1.isSelected()) {
                //                dd.setTrangThai(rdo_DaThanhToan1.getText());
                //            } else {
                //                dd.setTrangThai(rdo_chuaThanhToan1.getText());
                //            }
            //
            //            if (thanhToan.update(dd) != null && index >= 0) {
                //                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công!");
                //                fillTableThanhToan();
                ////                fillComboboxsoTien();
                //                if (tbl_thanhToan.getRowCount() >= 0) {
                    //                    tbl_thanhToan.setRowSelectionInterval(1, 1);
                    ////                        showDetai();
                    //                }
                //            } else {
                //                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thất bại");
                //            }
            //
            //        } catch (Exception e) {
            //            throw new RuntimeException(e);
            //        }
    }//GEN-LAST:event_btn_updateeeThanhToanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //          try {
            //            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa đối tượng này không?");
            //            if (hoi != JOptionPane.YES_OPTION) {
                //                return;
                //            } else {
                //                int index = tbl_thanhToan.getRowCount();
                //                String maPhieu = txt_MathanhToan.getText();
                //                if (index >= 0 && thanhToan.delete(index, maPhieu) != null) {
                    //                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    //                    fillTableThanhToan();
                    //                    //                    fillComboboxsoTien();
                    //                    //                    if (tbl_phieugiaohang.getRowCount() > 0) {
                        //                        //                        tbl_phieugiaohang.setRowSelectionInterval(1, 1);
                        //                        //                        showDetai();
                        //                        //                    }
                    //                }
                //            }
            //
            //        } catch (Exception e) {
            //            throw new RuntimeException(e);
            //        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_luuThanhToan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuThanhToan1ActionPerformed
        ///////        // TODO add your handling code here:
        VanChuyenModels dd = new VanChuyenModels();
        dd.setNguoiVanCHuyen(txt_NguoiVanChuyen.getText());
        dd.setSDTNguoiGiao(txt_sdtNguoiGiao.getText());
        vanchuyen.add(dd);
        //        this.fillTableVanChuyen();
        //        this.fillComboboxvanChuyen();
        JOptionPane.showMessageDialog(this, "Thêm Thành Công");
    }//GEN-LAST:event_btn_luuThanhToan1ActionPerformed

    private void btn_luu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_luu3ActionPerformed

    private void btn_updateThongTinVanCHuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateThongTinVanCHuyenActionPerformed
        //           try {
            //            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật không?");
            //            if (hoi != JOptionPane.YES_OPTION) {
                //                return;
                //            }
            //            int index = tbl_vanchuyen.getSelectedRow();
            //            VanChuyenModels ee = new VanChuyenModels();
            //            ee.setMaVanChuyen(Integer.parseInt(txt_MaVanChuyen.getText()));
            //            ee.setNguoiVanCHuyen(txt_NguoiVanChuyen.getText());
            //            ee.setSDTNguoiGiao(txt_sdtNguoiGiao.getText());
            //            if (vanchuyen.update(ee) != null && index >= 0) {
                //                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công!");
                //                fillTableVanChuyen();
                ////                fillComboboxvanChuyen();
                //
                //            } else {
                //                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thất bại");
                //            }
            //
            //        } catch (Exception e) {
            //            throw new RuntimeException(e);
            //        }

    }//GEN-LAST:event_btn_updateThongTinVanCHuyenActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        /////        // TODO add your handling code here:
        //        try {
            //            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa đối tượng này không?");
            //            if (hoi != JOptionPane.YES_OPTION) {
                //                return;
                //            } else {
                //                int index = tbl_vanchuyen.getRowCount();
                //                String maPhieu = txt_MaVanChuyen.getText();
                //                if (index >= 0 && vanchuyen.delete(index, maPhieu) != null) {
                    //                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    //                    fillTableVanChuyen();
                    //                    //                    fillComboboxvanChuyen();
                    //                    //                    if (tbl_phieugiaohang.getRowCount() > 0) {
                        //                        //                        tbl_phieugiaohang.setRowSelectionInterval(1, 1);
                        //                        //                        showDetai();
                        //                        //                    }
                    //                }
                //            }
            //
            //        } catch (Exception e) {
            //            throw new RuntimeException(e);
            //        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        TrangThaiModels dd = new TrangThaiModels();
        dd.setTrangThai(txt_TrangThai.getText());
        trangThai.add(dd);
        this.fillTableTrangThai();
        this.fillComboboxTrangThai();
        JOptionPane.showMessageDialog(this, "Thêm Thành Công");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void updateTranngThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTranngThaiActionPerformed
        // TODO add your handling code here:
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật không?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            }
            int index = tbl_TrangThai.getSelectedRow();
            TrangThaiModels ee = new TrangThaiModels();
            ee.setMaTrangThai(Integer.parseInt(txt_maTrangTHai1.getText()));
            ee.setTrangThai(txt_TrangThai.getText());
            if (trangThai.update(ee) != null && index >= 0) {
                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thành công!");
                fillTableTrangThai();
                fillComboboxTrangThai();

            } else {
                JOptionPane.showMessageDialog(this, "Bạn đã cập nhật thất bại");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }//GEN-LAST:event_updateTranngThaiActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            int hoi = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa đối tượng này không?");
            if (hoi != JOptionPane.YES_OPTION) {
                return;
            } else {
                int index = tbl_TrangThai.getRowCount();
                String maPhieu = txt_maTrangTHai1.getText();
                if (index >= 0 && trangThai.delete(index, maPhieu) != null) {
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                    fillTableTrangThai();
                    fillComboboxTrangThai();
                    //                    if (tbl_phieugiaohang.getRowCount() > 0) {
                        //                        tbl_phieugiaohang.setRowSelectionInterval(1, 1);
                        //                        showDetai();
                        //                    }
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_soTiennnnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_soTiennnnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_soTiennnnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DiaChiJDialog;
    private javax.swing.JDialog JdialogThanhToan;
    private javax.swing.JDialog ThongTinVanChuyen;
    private javax.swing.JDialog TrangThai;
    private javax.swing.JButton btn_UpdateDiaChi;
    private javax.swing.JButton btn_luu1;
    private javax.swing.JButton btn_luu2;
    private javax.swing.JButton btn_luu3;
    private javax.swing.JButton btn_luuDiaCHi;
    private javax.swing.JButton btn_luuThanhToan;
    private javax.swing.JButton btn_luuThanhToan1;
    private javax.swing.JButton btn_themPhieuGiaoHang;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_updatePhieuGiaoHang;
    private javax.swing.JButton btn_updateThongTinVanCHuyen;
    private javax.swing.JButton btn_updateeeThanhToan;
    private javax.swing.JButton btn_xoaPhieuGiaoHang;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cbo_TrangThaiGiaoHang;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JRadioButton rdo_DaThanhToan1;
    private javax.swing.JRadioButton rdo_MaSapXep;
    private javax.swing.JRadioButton rdo_chuaThanhToan1;
    private javax.swing.JRadioButton rdo_chuathanhtoan;
    private javax.swing.JRadioButton rdo_soTien;
    private javax.swing.JRadioButton rdo_thanhtoan;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbl_PhieuGiaoHang;
    private javax.swing.JTable tbl_TrangThai;
    private javax.swing.JTextField txt_Duong;
    private javax.swing.JTextField txt_MaDiaDiem;
    private javax.swing.JTextField txt_MaVanChuyen;
    private javax.swing.JTextField txt_MathanhToan;
    private javax.swing.JTextField txt_NgayThanhToan;
    private javax.swing.JTextField txt_NguoiVanChuyen;
    private javax.swing.JTextField txt_PhuongThuc;
    private javax.swing.JTextField txt_TrangThai;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_ghiChu;
    private javax.swing.JTextField txt_maPhieu;
    private javax.swing.JTextField txt_maTrangTHai1;
    private javax.swing.JTextField txt_ngayGiao;
    private javax.swing.JTextField txt_nguoiNhan;
    private javax.swing.JTextField txt_nguoivanchuyennn;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_sdtNguoiGiao;
    private javax.swing.JTextField txt_soTien;
    private javax.swing.JTextField txt_soTiennnn;
    private javax.swing.JTextField txt_tenQH;
    private javax.swing.JTextField txt_tenTP;
    private javax.swing.JTextField txt_timKiem;
    private javax.swing.JButton updateTranngThai;
    // End of variables declaration//GEN-END:variables
    private void fillTablePhieuGiaoHang() {
        model = (DefaultTableModel) tbl_PhieuGiaoHang.getModel();
        model.setRowCount(0);
        try {
//           ThanhToanModels tt = (ThanhToanModels)cbo_TrangThaiThanhToan.getSelectedItem();
//          ArrayList<PhieuGiaoHangModels> pgh = list.selectByThanhToan(tt.getMaThanhToan());
            ArrayList<PhieuGiaoHangModels> pgh = list.getAll();
            for (PhieuGiaoHangModels n : pgh) {
                model.addRow(new Object[]{
                    n.getMaPhieu(), n.getNgayGiao(), n.getNguoiNhan(), n.getSdt(), 
                    n.getGmail(), n.getTrangThaiThanhToan(), n.getGhiChu(), 
                     n.getNguoiVanChuyen(), n.getSoTien(), n.getTrangThaiGiaoHang()
                });
            }
        } catch (Exception e) {
        }

    }

    private PhieuGiaoHangModels getForm() throws ParseException {
        PhieuGiaoHangModels pgh = new PhieuGiaoHangModels();
        pgh.setMaPhieu(txt_maPhieu.getText());
        String ngayGiaoText = txt_ngayGiao.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date ngayGiao = dateFormat.parse(ngayGiaoText);
        pgh.setNgayGiao(ngayGiao);
        pgh.setNguoiNhan(txt_nguoiNhan.getText());
        pgh.setSdt(txt_sdt.getText());
        pgh.setGhiChu(txt_ghiChu.getText());
        pgh.setGmail(txt_email.getText());
//        pgh.setDiaChi(txt_diachiiiii.getText());
//        pgh.setDiaChi(cbo_diaChi.getSelectedItem().toString());
//        pgh.setSoTien(BigDecimal.valueOf(cbo_soTien.getSelectedItem().toString()));
       pgh.setSoTien(new BigDecimal(txt_soTiennnn.getText()));
//        String selectedValue = cbo_soTien.getSelectedItem().toString();
//        BigDecimal soTienValue = new BigDecimal(selectedValue);
//        pgh.setSoTien(soTienValue);
        pgh.setNguoiVanChuyen(txt_nguoivanchuyennn.getText());

//        pgh.setNguoiVanChuyen(cbo_nguoiVanChuyen.getSelectedItem().toString());
        pgh.setTrangThaiGiaoHang(cbo_TrangThaiGiaoHang.getSelectedItem().toString());
        if (rdo_thanhtoan.isSelected()) {
            pgh.setTrangThaiThanhToan(rdo_thanhtoan.getText());
        } else {
            pgh.setTrangThaiThanhToan(rdo_chuathanhtoan.getText());
        }
        return pgh;
    }

    private void showDetai() {
        int index = tbl_PhieuGiaoHang.getSelectedRow();
        txt_maPhieu.setText(tbl_PhieuGiaoHang.getValueAt(index, 0).toString());
        txt_ngayGiao.setText(tbl_PhieuGiaoHang.getValueAt(index, 1).toString());
        txt_nguoiNhan.setText(tbl_PhieuGiaoHang.getValueAt(index, 2).toString());
        txt_sdt.setText(tbl_PhieuGiaoHang.getValueAt(index, 3).toString());
        txt_email.setText(tbl_PhieuGiaoHang.getValueAt(index, 4).toString());
        this.show1(index);
        txt_ghiChu.setText(tbl_PhieuGiaoHang.getValueAt(index, 6).toString());
//        txt_maHoaDon.setText(tbl_PhieuGiaoHang.getValueAt(index, 11).toString());
//        txt_diachi1.setText(tbl_PhieuGiaoHang.getValueAt(index, 7).toString());
//        txt_soTienn.setText(tbl_PhieuGiaoHang.getValueAt(index, 9).toString());
//        txt_nguoivanchuyen1.setText(tbl_PhieuGiaoHang.getValueAt(index, 8).toString());
//        Object value = tbl_PhieuGiaoHang.getValueAt(index, 8);
        
        txt_soTiennnn.setText(tbl_PhieuGiaoHang.getValueAt(index, 8).toString());

//        try {
//            if (value != null) {
//                BigDecimal bigDecimalValue = new BigDecimal(value.toString());
//                cbo_soTien.setSelectedItem(bigDecimalValue);
//            } else {
//                cbo_soTien.setSelectedItem(null);
//            }
//        } catch (NumberFormatException e) {
//            // Handle the case where the value cannot be converted to BigDecimal
//            System.err.println("Error converting value to BigDecimal: " + e.getMessage());
//            cbo_soTien.setSelectedItem(null);
//        }
//        Object value = tbl_PhieuGiaoHang.getValueAt(index, 9);
//        if(value!=null) {
//          cbo_soTien.setSelectedItem(Float.valueOf(value.toString()));
//        }else{
//           cbo_soTien.setSelectedItem(null);
//        }
        txt_nguoivanchuyennn.setText(tbl_PhieuGiaoHang.getValueAt(index, 7).toString());
//        cbo_nguoiVanChuyen.setSelectedItem(tbl_PhieuGiaoHang.getValueAt(index, 7).toString());
//        cbo_diaChi.setSelectedItem(tbl_PhieuGiaoHang.getValueAt(index, 7).toString());
//         txt_diachiiiii.setText(tbl_PhieuGiaoHang.getValueAt(index, 7).toString());
        cbo_TrangThaiGiaoHang.setSelectedItem(tbl_PhieuGiaoHang.getValueAt(index, 9).toString());

}    

    void show1(int Vitri) {
        PhieuGiaoHangModels vx = list.getAll().get(Vitri);
        if (vx.getTrangThaiThanhToan().equals("Đã Thanh Toán")) {
            rdo_thanhtoan.setSelected(true);
        } else {
            rdo_chuathanhtoan.setSelected(true);
        }

       }



//    private void fillTableThanhToan() {
//        model = (DefaultTableModel) tbl_thanhToan.getModel();
//        model.setRowCount(0);
//        ArrayList<ThanhToanModels> pgh = thanhToan.getAllThanhToan();
//        for (ThanhToanModels gh : pgh) {
//            model.addRow(new Object[]{
//                gh.getMaThanhToan(), gh.getNgayThanhToan(), gh.getSoTien(), gh.getPhuongThuc(), gh.getTrangThai()
//            });
//        }
//    }

//    private void fillTableVanChuyen() {
//        model = (DefaultTableModel) tbl_vanchuyen.getModel();
//        model.setRowCount(0);
//        ArrayList<VanChuyenModels> pgh = vanchuyen.getAllVanCHuyen();
//        for (VanChuyenModels gh : pgh) {
//            model.addRow(new Object[]{
//                gh.getMaVanChuyen(), gh.getNguoiVanCHuyen(), gh.getSDTNguoiGiao()
//            });
//        }
//    }

    private void fillTableTrangThai() {
        model = (DefaultTableModel) tbl_TrangThai.getModel();
        model.setRowCount(0);
        ArrayList<TrangThaiModels> pgh = trangThai.getAllTramgThai();
        for (TrangThaiModels gh : pgh) {
            model.addRow(new Object[]{
                gh.getMaTrangThai(), gh.getTrangThai()
            });
        }
    }

    public void sapxep(List<PhieuGiaoHangModels> listPGH, String srotBy) {
        switch (srotBy) {
            case "DaThanhToan":
                listPGH.sort(Comparator.comparing(PhieuGiaoHangModels::getTrangThaiThanhToan));
                break;
            case "MaPhieu":
                listPGH.sort(Comparator.comparing(PhieuGiaoHangModels::getMaPhieu));
                break;
            case "SoTien":
                listPGH.sort(Comparator.comparing(PhieuGiaoHangModels::getSoTien));
                break;
        }
        modelll = (DefaultTableModel) tbl_PhieuGiaoHang.getModel();
        modelll.setRowCount(0);
        for (PhieuGiaoHangModels pgh : listPGH) {
            Object[] data = {
                pgh.getMaPhieu(), pgh.getNgayGiao(), pgh.getNguoiNhan(), pgh.getSdt(), pgh.getGmail(), pgh.getTrangThaiThanhToan(), pgh.getGhiChu(), pgh.getNguoiVanChuyen(), pgh.getSoTien(), pgh.getTrangThaiGiaoHang()
            };
            modelll.addRow(data);
        }

    }
 
    
   public boolean validates() {

        if (txt_maPhieu.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mời Nhập Dữ Liệu!");
            txt_maPhieu.requestFocus();
            return false;
        }
        if (txt_email.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mời Nhập Dữ Liệu!");
            txt_email.requestFocus();
            return false;
        }

        if (txt_nguoiNhan.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, " Mời Nhập Dữ Liệu !");
            txt_nguoiNhan.requestFocus();
            return false;
        }
        if (txt_sdt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, " Mời Nhập Dữ Liệu !");
            txt_sdt.requestFocus();
            return false;
        }
        if (txt_ghiChu.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, " Mời Nhập Dữ Liệu !");
            txt_ghiChu.requestFocus();
            return false;
        }

        return true;
    }
   
  
}
