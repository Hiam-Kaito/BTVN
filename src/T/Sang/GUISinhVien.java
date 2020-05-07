package T.Sang;

import java.awt.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class GUISinhVien extends JFrame {

    public GUISinhVien() {
        init();
    }

    public void init() {
        //du lieu
        qlsv = new HRSinhVien();
        qlsv.add(sv0);
        qlsv.add(sv1);
        qlsv.add(sv2);
        qlsv.add(sv3);
        
        Arial = new Font("Arial", Font.ITALIC, 20);
        pSv = new JPanel();
        pTop = new JPanel();
        lblAvatar = new JLabel(new ImageIcon("./src/T/Sang/SV2.jpg") );
        pAvatar = new JPanel();
        String[] arrSv = {"Mã SV", "Họ tên", "Năm Sinh", "Địa chỉ", "Điện Thoại"};
        pTT = createPanel_Label(arrSv, 10, 10);
        String[] arrBtn = {"thêm", "sửa", "xóa"};
        pButton = createBtn_Lbl(arrBtn, 10, 10);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 640);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        this.add(pTop);
        this.add(pSv);

        //------------pTOp------------------------------
        pTop.setLayout(null);
        pTop.setBounds(0, 0, 800, 200);
        pTop.setBackground(Color.yellow);
        
        pTop.add(pTT);
        pTop.add(pAvatar);
        pTop.add(pButton);
        
        pAvatar.add(lblAvatar);
        pAvatar.setBounds(0, 0, 200, 200);

        pTT.setBounds(200, 0, 400, 200);
        
        pButton.setBounds(600, 0, 200, 200);
        
        //----------------pSV------------------------
        model = new DefaultTableModel(
                new Object[][]{
                },
                arrSv
        );

        table = new JTable();
        table.setModel(model);

        scroll = new JScrollPane(table);

        //thay doi background cua tieu de
        tablehead = table.getTableHeader();
        tablehead.setFont(Arial);
        //dieu chinh mau nen cua chu
//        tablehead.setForeground(Color.MAGENTA);
        //la 1
        table.getTableHeader().setForeground(Color.RED);

        //thay doi mau khi dang chon
        table.setSelectionBackground(Color.PINK);

        setSizeTable();

        pSv.setBackground(Color.yellow);
        pSv.setOpaque(true);
        pSv.setBounds(0, 200, 800, 400);
        pSv.add(scroll);
        pSv.setLayout(new GridLayout(1, 0));

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        
        this.actionButtondisplay();
    }

    private JPanel createPanel_Label(String[] arr,int iMarginLeft, int iMarginTop) {
        JPanel Panel = new JPanel();
        list_lbl = new JLabel[10];
        list_tf = new JTextField[10];
        
        Panel.setLayout(null);
        
        for (int i=0; i < arr.length ; i++) {
            list_lbl[i] = new JLabel(arr[i]);
            list_lbl[i].setBounds(iMarginLeft, iMarginTop, 150, 25);
            list_lbl[i].setFont(Arial);
            list_lbl[i].setName(arr[i]);
            list_lbl[i].setOpaque(true);
            
            
            list_tf[i] = new JTextField();
            list_tf[i].setBounds(iMarginLeft + 200, iMarginTop, 180, 25);
            list_tf[i].setFont(Arial);
            list_tf[i].setName(arr[i]);
            
            Panel.add(list_lbl[i]);
            Panel.add(list_tf[i]);
            
            iMarginTop += 40;
        }
        
        return Panel;
    }
    
    private JPanel createBtn_Lbl(String[] arr,int iMarginLeft, int iMarginTop) {
        JPanel Panel = new JPanel();
        list_btn = new JButton[10];
        
        Panel.setLayout(null);
        
        for (int i=0; i < arr.length ; i++) {
            list_btn[i] = new JButton(arr[i]);
            list_btn[i].setBounds(iMarginLeft, iMarginTop, 150, 30);
            list_btn[i].setFont(Arial);
            list_btn[i].setName(arr[i]);
            
            Panel.add(list_btn[i]);
            
            iMarginTop += 40;
        }
        
        return Panel;
    }
    
    private void createVectorHeader() {
        if (model.getRowCount()==0) {
            Vector<String> header = new Vector();
            header.add("Mã sinh viên");
            header.add("Họ tên");
            header.add("Năm sinh");
            header.add("Địa chỉ");
            header.add("Địên thoại");
            
            model = new DefaultTableModel(header, 0);
        }
    }
    
    private void actionButtondisplay() {
        model = new DefaultTableModel();
        
        createVectorHeader();
        for (int i=0 ; i < qlsv.getSoSinhVien() ; i++) {
            SinhVien sv = new SinhVien();
            
            sv = qlsv.getInfor(i);
            
            createVectorHeader();
            
            Vector row=new Vector();
            row.add(sv.getMaSV());
            row.add(sv.getHovaTen());
            row.add(sv.getNamSinh());
            row.add(sv.getDiaChi());
            row.add(sv.getDienThoai());
            
            model.addRow(row);
        }
        
        table.setModel(model);
        setSizeTable();
    }
    
    private void setSizeTable() {
        table.getColumnModel().getColumn(0).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(60);
        table.getColumnModel().getColumn(3).setPreferredWidth(200);
        table.getColumnModel().getColumn(4).setPreferredWidth(50);
    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {
        int  i=table.getSelectedRow();
        
        list_tf[0].setText(table.getModel().getValueAt(i, 0).toString());
        list_tf[1].setText(table.getModel().getValueAt(i, 1).toString());
        list_tf[2].setText(table.getModel().getValueAt(i, 2).toString());         
        list_tf[3].setText(table.getModel().getValueAt(i, 3).toString());
        list_tf[4].setText(table.getModel().getValueAt(i, 4).toString());
    }
    
    public static void main(String[] args) {
        new GUISinhVien().setVisible(true);
    }

    private Font Arial;
    private DefaultTableModel model;
    private JTable table;
    private JPanel pSv, pTop, pTT, pAvatar, pButton;
    private JLabel lblAvatar;
    private JScrollPane scroll;
    private JTableHeader tablehead;
    private JLabel[] list_lbl;
    private JTextField[] list_tf;
    private JButton[] list_btn;
    private HRSinhVien qlsv;
    
    SinhVien sv0 = new SinhVien("1", "Nguyen Van", "572020", "Ke Ben Nha cua 2", "0000");
    SinhVien sv1 = new SinhVien("2", "Nguyen Thi", "5320", "Ke Ben Nha cua 3", "0001");
    SinhVien sv2 = new SinhVien("3", "Nguyen Le", "57120", "Ke Ben Nha cua 4", "0010");
    SinhVien sv3 = new SinhVien("4", "Nguyen Minh", "520", "Ke Ben Nha cua 1", "0011");
   
}
