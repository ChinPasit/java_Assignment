/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package novicegui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Display extends JFrame{
    ArrayList<Novice> novices = new ArrayList<Novice>();
    
    public Display(){
     Icon iconNovice     = new ImageIcon(getClass().getResource("pic/novice1.gif"));
     Icon iconMonster1     = new ImageIcon(getClass().getResource("pic/monster1.gif"));
     Icon iconMonster2     = new ImageIcon(getClass().getResource("pic/monster2.gif"));
     
     makeMenuBar();
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel head = new JPanel();
        head.setLayout(new GridLayout(1, 2, 10, 7));
        head.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
        
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 3, 10, 7));
        p1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(6, 2, 5, 10));
        p2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
        p3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JLabel picNovice = new JLabel("");
        
    
        JLabel lbName = new JLabel("Name : ");
        JLabel lbWeight = new JLabel("Health : ");
        JLabel lbStepLength = new JLabel("Damage : ");
        JLabel lbHealth = new JLabel("Exp : ");
        JLabel lbLevel = new JLabel("Level : ");

        JLabel lbPicture = new JLabel("PICTURE", SwingConstants.CENTER);
        JLabel lbStatus = new JLabel("STATUS", SwingConstants.CENTER);
        
        JButton btcSelect = new JButton("Select Item");
        JButton btcLevel = new JButton("Postion");
        JButton btnPlayGame = new JButton("PlayGame");
        
        JTextField txtName = new JTextField();
        txtName.setEditable(false);
        txtName.setHorizontalAlignment(JTextField.CENTER);
        JTextField txthp = new JTextField();
        txthp.setEditable(false);
        txthp.setHorizontalAlignment(JTextField.CENTER);
        JTextField txtdamage = new JTextField();
        txtdamage.setEditable(false);
        txtdamage.setHorizontalAlignment(JTextField.CENTER);
        JTextField txtexp = new JTextField();
        txtexp.setEditable(false);
        txtexp.setHorizontalAlignment(JTextField.CENTER);
        JTextField txtLevel = new JTextField();
        txtLevel.setEditable(false);
        txtLevel.setHorizontalAlignment(JTextField.CENTER);
        
        String[] NoviceString = {"Novice1", "Monster1", "Monster2"};
        JComboBox NoviceList = new JComboBox(NoviceString);
        String[] weaponString = {"Swords", "Archer", "Wand"};
        JComboBox weaponList = new JComboBox(weaponString);
        String[] postionString = {"Green", "red", "yellow"};
        JComboBox postionList = new JComboBox(postionString);

        
        head.add(lbPicture);
        head.add(lbStatus);
        
        p2.add(lbName);
        p2.add(txtName);
        p2.add(lbWeight);
        p2.add(txthp);
        p2.add(lbStepLength);
        p2.add(txtdamage);
        p2.add(lbHealth);
        p2.add(txtexp);
        p2.add(lbLevel);
        p2.add(txtLevel);


         
        p3.add(NoviceList);
        p3.add(Box.createRigidArea(new Dimension(5,0)));
        p3.add(weaponList);
        p3.add(Box.createRigidArea(new Dimension(5,0)));
        p3.add(postionList);
        p3.add(Box.createRigidArea(new Dimension(5,0)));
        p3.add(btcSelect);
        p3.add(Box.createRigidArea(new Dimension(5,0)));
        p3.add(btcLevel);
        p3.add(Box.createRigidArea(new Dimension(5,0)));
        p3.add(btnPlayGame);
        p3.add(Box.createRigidArea(new Dimension(5,0)));

        p1.add(picNovice);
        p1.add(p2);

        c.add(head, BorderLayout.NORTH);
        c.add(p1, BorderLayout.CENTER);
        c.add(p3, BorderLayout.SOUTH);
        
        novices.add(new Novice1());
        novices.add(new Monster1());
        novices.add(new Monster2());
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        
        NoviceList.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
            switch (NoviceList.getSelectedIndex()) {
                    case 0:
                        int indexNovice1 = 0;
                        picNovice.setIcon(iconNovice);
                        txtName.setText(novices.get(indexNovice1).getName());
                        txthp.setText(""+novices.get(indexNovice1).gethp());
                        txtdamage.setText(""+novices.get(indexNovice1).getatk());
                        txtexp.setText(""+novices.get(indexNovice1).getexp());
                        txtLevel.setText(""+novices.get(indexNovice1).getLevel());
                        
                        
                        break;
                    case 1:
                        int indexMonster1 = 1;
                        picNovice.setIcon(iconMonster1);
                        txtName.setText(novices.get(indexMonster1).getName());
                        txthp.setText(""+novices.get(indexMonster1).gethp());
                        txtdamage.setText(""+novices.get(indexMonster1).getatk());
                        txtexp.setText(""+novices.get(indexMonster1).getexp());
                        txtLevel.setText(""+novices.get(indexMonster1).getLevel());
                        break;
                    case 2:
                        int indexMonster2 = 2;
                        picNovice.setIcon(iconMonster2);
                        txtName.setText(novices.get(indexMonster2).getName());
                        txthp.setText(""+novices.get(indexMonster2).gethp());
                        txtdamage.setText(""+novices.get(indexMonster2).getatk());
                        txtexp.setText(""+novices.get(indexMonster2).getexp());
                        txtLevel.setText(""+novices.get(indexMonster2).getLevel());
                        break;
                    default:
                        break;
                }
            }
        
        });
        
        btcSelect.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                switch(NoviceList.getSelectedIndex()){
                    case 0:
                        int indexNovice1 = 0; 
                        selectItem(weaponList.getSelectedIndex(),0);
                        txtdamage.setText(""+novices.get(indexNovice1).getatk());
                        break;
                }
            }
        });
        
        btcLevel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                switch(NoviceList.getSelectedIndex()){
                    case 0:
                        int indexNovice1 = 0; 
                        selectPostion(postionList.getSelectedIndex(),0);
                        txtLevel.setText(""+novices.get(indexNovice1).getLevel());
                        break;
                }
            }
        });
        
        btnPlayGame.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Fight fight = new Fight();
                
            }
        
        });
        
    }
    
     
     private void makeMenuBar(){
          JMenuBar menuBar = new JMenuBar();
          setJMenuBar(menuBar);
          
          JMenu helpMenu = new JMenu("Help");
          menuBar.add(helpMenu);
          
          JMenuItem aboutItem = new JMenuItem("About");
          aboutItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
          });
          
          helpMenu.add(aboutItem);
          
     }
     private void selectItem(int type,int index){
         Item item = new Item(type);
         novices.get(index).getItem(item);
     }
     private void selectPostion(int type,int index){
         Postion postion = new Postion(type);
         novices.get(index).getLevelup(postion);
     }
     
}
