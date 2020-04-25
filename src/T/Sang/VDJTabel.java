package T.Sang;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class VDJTabel extends JFrame{

    public VDJTabel() {
        init();
    }
    
    public void init() {
        Arial = new Font("Arial", Font.ITALIC, 30);
        p = new JPanel();
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.add(p);
        
//        String[] colum = {"cot 1", "cot 2", "cot 3"};
//        Object[][] data = {
//            {"cot 1 dong 1", "cot 1 dong 2", "cot 1 dong 3"},  
//            {"cot 2 dong 1", "cot 2 dong 2", "cot 2 dong 3"},  
//            {"cot 2 dong 1", "cot 2 dong 2", "cot 2 dong 3"},  
//            {"cot 2 dong 1", "cot 2 dong 2", "cot 2 dong 3"},  
//            {"cot 3 dong 1", "cot 3 dong 2", "cot 3 dong 3"} 
//        };
//        
//        model = new DefaultTableModel(data, colum);
        model = new DefaultTableModel (
                new Object[][] {
            {"cot 1 dong 1", "cot 1 dong 2", "cot 1 dong 3"},  
            {"cot 2 dong 1", "cot 2 dong 2", "cot 2 dong 3"},  
            {"cot 2 dong 1", "cot 2 dong 2", "cot 2 dong 3"},  
            {"cot 2 dong 1", "cot 2 dong 2", "cot 2 dong 3"},  
            {"cot 3 dong 1", "cot 3 dong 2", "cot 3 dong 3"} 
            },
            new String[] {"cot 1", "cot 2", "cot 3"}        
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
        
        table.getColumnModel().getColumn(0).setPreferredWidth(50000000);
        table.getColumnModel().getColumn(1).setPreferredWidth(20000000);
        table.getColumnModel().getColumn(2).setPreferredWidth(10000000);
        
        
        p.setBackground(Color.yellow);
        p.setOpaque(true);
        p.setBounds(50, 30, 400, 400);
        p.add(scroll);
        p.setLayout(new GridLayout(4, 0));
        
    }
    
    public static void main(String[] args) {
        new VDJTabel().setVisible(true);
    }
    
    private Font Arial;
    private DefaultTableModel model;
    private JTable table;
    private JPanel p;
    private JScrollPane scroll;
    private JTableHeader tablehead;
}
