package Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class VdJTabel extends JFrame{

    public VdJTabel() {
        init();
    }
    
    public void init() {
        setBounds(50, 50, 800, 640);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));
        
        add(s);
        add(btnThem);
        add(btnSua);
        add(btnXoa);
        
        table.setModel(new DefaultTableModel(
                new Object[][] {},
                new String[] {"Mã sinh viên","Họ và tên","Ngày sinh","Giới tính","Địa chỉ"}
        ));
        s.setViewportView(table);
        
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSSVMouseClicked(evt);
            }
        });
        
        btnThem.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        
        btnXoa.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });
        
        btnSua.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });
    }
    
    private void tblDSSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSSVMouseClicked
        // TODO add your handling code here:
        int  i=table.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "row:"+i);
//        txtMaSV.setText(tblDSSV.getModel().getValueAt(i, 0).toString());
//        txtHo.setText(tblDSSV.getModel().getValueAt(i, 1).toString());
//        txtTen.setText(tblDSSV.getModel().getValueAt(i, 2).toString());         

    }
     
    private void btnSuaMouseClicked(MouseEvent evt) {
        int  i = table.getSelectedRow();
        if (i>=0)
        {
//            model.setValueAt(txtMaSV.getText(), i, 0);
//            model.setValueAt(txtHo.getText(), i, 1);
//            model.setValueAt(txtTen.getText(), i, 2);
            
            table.setModel(model);
        }
    }
    
    private void btnXoaMouseClicked(MouseEvent evt) {
        int  iSelect = table.getSelectedRow();
        if (iSelect >= 0) {
            model.removeRow(iSelect);
            table.setModel(model);
        }
    }
    
    private void btnThemMouseClicked(MouseEvent evt) {
        if (model.getRowCount()==0) {
            Vector<String> header = new Vector();
            header.add("MSSV");
            header.add("Họ");
            header.add("Tên");
            model = new DefaultTableModel(header, 0);
        }
        
        Vector row=new Vector();
        row.add("a");
        row.add("b");
        row.add("c");
        model.addRow(row);
        table.setModel(model);
    }
 
    public static void main(String[] args) {
        new VdJTabel().setVisible(true);
    }
    
    DefaultTableModel model = new DefaultTableModel();
    JTable table = new JTable();
    JScrollPane s= new JScrollPane();
    JButton btnThem = new JButton("Add");
    JButton btnXoa = new JButton("Remove");
    JButton btnSua = new JButton("repair");
}
