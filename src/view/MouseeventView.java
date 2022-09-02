package view;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseeventController;
import model.MouseeventModel;

public class MouseeventView extends JFrame {
    private MouseeventModel mouseeventModel;
    private JLabel jLabel_X;
    private JLabel jLabel_Y;
    private JLabel jLabel_Numberclick;
    private JLabel jLabel_Count;
    private JLabel jLabel_Checkin;
    public MouseeventView(){
        this.mouseeventModel = new MouseeventModel();
        this.init();
    }
    private void init() {
        this.setTitle("Mouse event");
        this.setSize(600,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        MouseeventController mouseeventController = new MouseeventController(this);

        JPanel jPanel_1 = new JPanel();
        jPanel_1.setSize(300,200);
        jPanel_1.setBackground(Color.GREEN);
        jPanel_1.addMouseListener(mouseeventController);
        jPanel_1.addMouseMotionListener(mouseeventController);

        JPanel jPanel_2 = new JPanel();
        jPanel_2.setSize(300,300);
        jPanel_2.setLayout(new GridLayout(3,3));
        JLabel jLabel_Position = new JLabel("Position");
         jLabel_X = new JLabel("X");
         jLabel_Y = new JLabel("Y");
         jLabel_Numberclick = new JLabel("number click: ");
         jLabel_Count = new JLabel("0");
        
        JLabel jLabel_1 = new JLabel();
        JLabel jLabel_MouseComponent = new JLabel("Mouse is in component: ");
         jLabel_Checkin = new JLabel();
        JLabel jLabel_2 = new JLabel();

        jPanel_2.add(jLabel_Position);
        jPanel_2.add(jLabel_X);
        jPanel_2.add(jLabel_Y);
        jPanel_2.add(jLabel_Numberclick);
        jPanel_2.add(jLabel_Count);
        jPanel_2.add(jLabel_1);
        jPanel_2.add(jLabel_MouseComponent);
        jPanel_2.add(jLabel_Checkin);
        jPanel_2.add(jLabel_2);

        this.setLayout(new BorderLayout());
        this.add(jPanel_1,BorderLayout.CENTER);
        this.add(jPanel_2,BorderLayout.SOUTH);

        this.setVisible(true);
    }
    public void click(){
        this.mouseeventModel.click();
        this.jLabel_Count.setText(this.mouseeventModel.getCount()+"");
    }
    public void mouseEnter(){
        this.mouseeventModel.setCheckin("Yes");
        this.jLabel_Checkin.setText(this.mouseeventModel.getCheckin()+"");
    }
    public void mouseExit(){
        this.mouseeventModel.setCheckin("No");
        this.jLabel_Checkin.setText(this.mouseeventModel.getCheckin()+"");
    }
    public void mouseMove(int x, int y){
        this.mouseeventModel.setX(x);
        this.mouseeventModel.setY(y);
        this.jLabel_X.setText(this.mouseeventModel.getX()+"");
        this.jLabel_Y.setText(this.mouseeventModel.getY()+"");
    }
}
