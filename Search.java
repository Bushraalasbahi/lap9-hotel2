import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Search extends JFrame{
    private JTable resoltetable;
    private JPanel SearchPanel;
    private ArrayList<Customer> allCustomer;
DefaultTableModel TableModel;
    public Search(ArrayList<Customer> c){
        allCustomer=c;
        String [] titleTable={"Name","Age","Card No","Card Type","Room No","Room Price"};
        TableModel=new DefaultTableModel(titleTable,0);
        for(Customer s:allCustomer)
        {
            String [] records={s.getName(),String.valueOf(s.getAge()),s.getIdNumber(),s.getIdType(),
                    String.valueOf(s.getR().getRoomNo()),String.valueOf(s.getR().getRoomPrice())};
            TableModel.addRow(records);
        }
        resoltetable.setModel(TableModel);
        this.setContentPane(SearchPanel);
        this.setSize(500,500);
        this.setVisible(true);
    }
}
