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
public class Fight extends JFrame {
     ArrayList<Novice> novices = new ArrayList<Novice>();
     int count=0;
     int kill=0;
     
     public Fight(){
         super("Fight");
        
        Icon iconNovice1       = new ImageIcon(getClass().getResource("pic/novice1.gif"));
        Icon iconMonster1     = new ImageIcon(getClass().getResource("pic/monster1.gif"));
        Icon iconMonster2     = new ImageIcon(getClass().getResource("pic/monster2.gif"));
        
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        
        JPanel head = new JPanel();
        head.setLayout(new GridLayout(1, 2, 10, 7));
        head.setBorder(BorderFactory.createEmptyBorder(20, 20, 0, 20));
        
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 2, 7, 7));
        p1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(6, 2, 5, 10));
        p2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JPanel p3 = new JPanel();
        p3.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
        p3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel p4 = new JPanel();
        p4.setLayout(new BoxLayout(p4, BoxLayout.Y_AXIS));
        
        
        JPanel p5 = new JPanel();
        p5.setLayout(new BoxLayout(p5, BoxLayout.Y_AXIS));
        
        JPanel p6 = new JPanel();
        p6.setLayout(new BoxLayout(p3, BoxLayout.X_AXIS));
        p6.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        

        
        JLabel picNovice1 = new JLabel("");
        JLabel picMonster = new JLabel("");
        
        JLabel lbHealthCompetitor1 = new JLabel("Health - Novice : ");
        JLabel lbHealthCompetitor2 = new JLabel("Health - Monsters : ");
        JLabel lbHealthCompetitor3 = new JLabel("Show Kill : ");

        JLabel lbPicture = new JLabel("Display1 & Display2", SwingConstants.CENTER);
        JLabel lbStatus = new JLabel("STATUS", SwingConstants.CENTER);
        
        
        JButton btnFight = new JButton("Fight!");
        
        JTextField txtHealth = new JTextField();
        txtHealth.setEditable(false);
        txtHealth.setHorizontalAlignment(JTextField.CENTER);
        
        JTextField txtHealthCompetitor1 = new JTextField();
        txtHealthCompetitor1.setEditable(false);
        txtHealthCompetitor1.setHorizontalAlignment(JTextField.CENTER);
        
        JTextField txtHealthCompetitor2 = new JTextField();
        txtHealthCompetitor2.setEditable(false);
        txtHealthCompetitor2.setHorizontalAlignment(JTextField.CENTER);
        
        JTextField txtHealthCompetitor3 = new JTextField();
        txtHealthCompetitor3.setEditable(false);
        txtHealthCompetitor3.setHorizontalAlignment(JTextField.CENTER);

        String[] noviceString = {"Novice1","Novice2"};
        JComboBox novicesLisCompetitor1 = new JComboBox(noviceString);
        String[] monsterString = {"Monster1", "Monster2"};
        JComboBox monsterLisCompetitor2 = new JComboBox(monsterString);
        
        head.add(lbPicture);
        head.add(lbStatus);
        
        
        p3.add(novicesLisCompetitor1);
        p3.add(Box.createRigidArea(new Dimension(5,0)));
        p3.add(monsterLisCompetitor2);
        p3.add(Box.createRigidArea(new Dimension(5,0)));
        p3.add(btnFight);
        p3.add(Box.createRigidArea(new Dimension(5,0)));
        p3.add(txtHealthCompetitor3);
        p3.add(Box.createRigidArea(new Dimension(5,0)));

        p4.add(lbHealthCompetitor1);
        p4.add(txtHealthCompetitor1);

        p5.add(lbHealthCompetitor2);
        p5.add(txtHealthCompetitor2);
        
 

        
        p1.add(picNovice1);
        p1.add(p4);
        p1.add(picMonster);
        p1.add(p5);
        
        c.add(head, BorderLayout.NORTH);
        c.add(p1, BorderLayout.CENTER);
        c.add(p3, BorderLayout.SOUTH);
        
        Novice1 noviceDisplay1 = new Novice1();
        Novice1 noviceDisplay2 = new Novice1();
        Monster1 monsterDisplay1 = new Monster1();
        Monster2 monsterDisplay2 = new Monster2();
        
        
        novices.add(noviceDisplay1);
        novices.add(noviceDisplay2);
        novices.add(monsterDisplay1);
        novices.add(monsterDisplay2);
        

        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        
        novicesLisCompetitor1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
            switch (novicesLisCompetitor1.getSelectedIndex()) {
                    case 0:
                        int indexNovice1 = 0;
                        picNovice1.setIcon(iconNovice1);
                        txtHealth.setText(""+novices.get(indexNovice1).gethp());
                        break;
                    case 1:
                        int indexNovice = 0;
                        picNovice1.setIcon(iconNovice1);
                        txtHealth.setText(""+novices.get(indexNovice).gethp());
                        break;
                    default:
                        break;
                        
                }
            }
        
        });
        monsterLisCompetitor2.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
            switch (monsterLisCompetitor2.getSelectedIndex()) {
                    case 0:
                        int indexMonster = 0;
                        picMonster.setIcon(iconMonster1);
                        txtHealth.setText(""+novices.get(indexMonster).gethp());
                        break;
                    case 1:
                        int indexMonster1 = 1;
                        picMonster.setIcon(iconMonster2);
                        txtHealth.setText(""+novices.get(indexMonster1).gethp());
                        break;
                    default:
                        break;
                }
            }
        
        });

            int indexNovice1 = 0;
            int indexNovice2 =1;
            int indexMonster1 = 2;
            int indexMonster2 = 3;

            btnFight.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            /*if (novicesLisCompetitor1.getSelectedIndex() == 0 && monsterLisCompetitor2.getSelectedIndex() == 0){
                      JOptionPane.showMessageDialog(null, "ไม่สามารถต่อสู้กับตัวเองได้", "Warning", JOptionPane.PLAIN_MESSAGE);
                }*/
            if(novicesLisCompetitor1.getSelectedIndex() == 1 && monsterLisCompetitor2.getSelectedIndex() == 0){
                if(count % 2 == 0){
                    noviceDisplay2.attack(monsterDisplay1);
                }
                else monsterDisplay1.attack(noviceDisplay2);
                
                txtHealthCompetitor1.setText(""+novices.get(indexNovice2).gethp()+" / 250");
                txtHealthCompetitor2.setText(""+novices.get(indexMonster1).gethp()+" / 150");
                if(novices.get(indexMonster1).gethp() == 0 && novices.get(indexNovice2).gethp() > 0 ){
                    kill+=1;
                    txtHealthCompetitor3.setText("Kill"+kill);
                }
                count += 1;
            }
            else if(novicesLisCompetitor1.getSelectedIndex() == 1 && monsterLisCompetitor2.getSelectedIndex() == 1){
                if(count % 2 == 0){
                    noviceDisplay2.attack(monsterDisplay2);
                }
                else monsterDisplay2.attack(noviceDisplay2);
                
                txtHealthCompetitor1.setText(""+novices.get(indexNovice2).gethp()+" / 250");
                txtHealthCompetitor2.setText(""+novices.get(indexMonster2).gethp()+" / 100");
                
                if(novices.get(indexMonster2).gethp() == 0 && novices.get(indexNovice2).gethp() > 0 ){
                    kill+=1;
                    txtHealthCompetitor3.setText("Kill"+kill);
                }
                count += 1;
                }
            }

        });
     }
                    
}
