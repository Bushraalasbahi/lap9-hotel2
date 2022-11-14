import javax.naming.directory.SearchResult;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame {
    private JList Customerlist;
    private JLabel restabl;
    private JTextField CustomerName;
    private JTextField Customerid;
    private JTextField CustomerAge;
    private JComboBox CustomeridType;
    private JCheckBox hasFamilyCheckBox;
    private JLabel HasFamily;
    private JButton saveCustomers;
    private JPanel RessMainPanel;
    private JComboBox RoomcomboBox;
    private JTextField SearchCusomer;
    private JButton SearchPotton;
    ArrayList<Customer> allCustomer;
    ArrayList <Room> allRoom;
    DefaultListModel <Object>listModel;
    DefaultComboBoxModel listRoom;
    public GUI(){
        allCustomer=new ArrayList<>();
        allRoom=new ArrayList<>();
        listModel=new DefaultListModel<>();
        listRoom=new DefaultComboBoxModel();
        fillRoom();
       this.setContentPane(RessMainPanel);
       this.setSize(500,500);
       this.setVisible(true);

        saveCustomers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Customer cv=new Customer();
                cv.setName(CustomerName.getText());
                cv.setIdNumber(Customerid.getText());
                cv.setIdType(CustomeridType.getSelectedItem().toString());
                cv.setAge(Integer.parseInt(CustomerAge.getText()));
                if(hasFamilyCheckBox.isSelected())
                cv.setHasFamily(true);
                else
                    cv.setHasFamily(false);

                Room Croom;
                for (Room r:allRoom )
                {
           if(r.getRoomNo()==Integer.parseInt(RoomcomboBox.getSelectedItem().toString()));
           cv.setR(r);
                }

                allCustomer.add(cv);
                JOptionPane.showMessageDialog(null,"Customer added successfully");
                CustomerName.setText("");
                CustomerAge.setText("");
                Customerid.setText("");
                hasFamilyCheckBox.setSelected(false);
fillist();
            }
        });
        SearchPotton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Customer>SearchCusomers=new ArrayList<>();
          for (Customer c:allCustomer)
          {
           if(SearchCusomer.getText().equals(c.getName()))
           {SearchCusomers.add(c);}

          }
                if(SearchCusomers.size()==0)
                {JOptionPane.showMessageDialog(null,"sorry no search result");}
                else {Search s=new Search(SearchCusomers);}
            }
        });
    }
    public void fillist(){
        listModel.clear();
        for(Customer c: allCustomer)
          listModel.addElement(c.getName());
        Customerlist.setModel(listModel);
    }
    public void fillRoom(){

        Room r1=new Room();
        r1.setFloorNo(1);
        r1.setRoomNo(1001);
        r1.setRoomPrice(2000);
        r1.setRoomType("single");

        Room r2=new Room();
        r2.setFloorNo(1);
        r2.setRoomNo(1002);
        r2.setRoomPrice(4000);
        r2.setRoomType("Double");

        Room r3=new Room();
        r3.setFloorNo(3);
        r3.setRoomNo(2001);
        r3.setRoomPrice(3000);
        r3.setRoomType("single");

        Room r4=new Room();
        r4.setFloorNo(3);
        r4.setRoomNo(2002);
        r4.setRoomPrice(5000);
        r4.setRoomType("single");

        Room r5=new Room();
        r5.setFloorNo(2);
        r5.setRoomNo(3001);
        r5.setRoomPrice(4000);
        r5.setRoomType("Double");

        Room r6=new Room();
        r6.setFloorNo(2);
        r6.setRoomNo(3002);
        r6.setRoomPrice(3000);
        r6.setRoomType("single");

        allRoom.add(r1);
        allRoom.add(r2);
        allRoom.add(r3);
        allRoom.add(r4);
        allRoom.add(r5);
        allRoom.add(r6);
              listRoom.removeAllElements();
        for(Room r: allRoom){
            listRoom.addElement(r.getRoomNo());
           }
        RoomcomboBox.setModel(listRoom);





    }
}
