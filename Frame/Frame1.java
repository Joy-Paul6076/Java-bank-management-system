
//import java.lang.*;
import javax.swing.*; //package for GUI components
import java.awt.*; //package for Font and Color
import java.awt.event.*; //package for Interfaces
//import java.io.*; //for File IO

public class Frame1 extends JFrame implements ActionListener // , MouseListener
{
    private JLabel label1;
    private JButton button1, bt2, bt3, bt4, bt5, bt6, backBtn;
    private Font f1,f2;
    private Color c1,c2;
    private JPanel mainPanel, createPanel;
    private CardLayout cardLayout;
    private JTextField tf1, tf2, tf3, tf4;
    private JPasswordField pf1;
    private JLabel l1,l2,l3,l4,l5;
    public Frame1()
    {
        super("ABC Bank Management System");
        super.setSize(900,1250);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null); 
        super.setResizable(false);
        cardLayout = new CardLayout();
        this.setLayout(cardLayout);
        
        f1 = new Font("Arial", Font.BOLD, 48);
		f2 = new Font("Arial", Font.BOLD, 20); 
        c1 = new Color(255, 193, 7);
		c2 = new Color(20, 30, 48);
        // Main Panel
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(20, 30, 48));
        ImageIcon image1 = new ImageIcon("logo.png");
        this.setIconImage(image1.getImage());

        
        
        label1 = new JLabel("Welcome to ABC Bank Management System");
        label1.setFont(f2);
        label1.setForeground(Color.WHITE);
        label1.setBounds(180, 15, 500, 30);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.TOP);
        
        button1 = new JButton("CREATE ACCOUNT");
        button1.addActionListener(this);
        button1.setBounds(200,90,500,100);
        button1.setFont(f1);
        button1.setBackground(c1);
        mainPanel.add(label1);
        mainPanel.add(button1);

        bt2 = new JButton("LOG IN");
        bt2.addActionListener(this);
        bt2.setBounds(200,280,500,100);
        bt2.setFont(f1);
        bt2.setBackground(c1);
        mainPanel.add(bt2);

         bt3 = new JButton("SEARCH ACCOUNT");
        bt3.addActionListener(this);
        bt3.setBounds(200,470,500,100);
        bt3.setFont(f1);
        bt3.setBackground(c1);
        mainPanel.add(bt3);

         bt4 = new JButton("DELETE ACCOUNT");
        bt4.addActionListener(this);
        bt4.setBounds(200,660,500,100);
        bt4.setFont(f1);
        bt4.setBackground(c1);
        mainPanel.add(bt4);
        
         bt5 = new JButton("SHOW ALL ACCOUNTS");
        bt5.addActionListener(this);
        bt5.setBounds(200,850,500,100);
        bt5.setFont(f1);
        bt5.setBackground(c1);
        mainPanel.add(bt5);

         bt6 = new JButton("Exit");
        bt6.addActionListener(this);
        bt6.setBounds(200,1040,500,100);
        bt6.setFont(f1);
        bt6.setBackground(c1);
        mainPanel.add(bt6);

        this.add(mainPanel, "main");
        
        // Create create account  Panel
        createPanel = new JPanel();
        createPanel.setLayout(null);
        createPanel.setBackground(new Color(20, 30, 48));
        ImageIcon image2 = new ImageIcon("logo.png");
        this.setIconImage(image2.getImage());

        
        JLabel createLabel = new JLabel("Creating An Account");
        createLabel.setFont(f2);
        createLabel.setBounds(340, 10, 400, 50);
        createPanel.add(createLabel);
        
        JButton backBtn = new JButton("Back to Main");
        backBtn.addActionListener(this);
        backBtn.setBounds(350, 1100, 200, 50);
        createPanel.add(backBtn);
        
        this.add(createPanel, "create");

        l1= new JLabel("Name:");
        l1.setFont(f2);
        l1.setForeground(Color.WHITE);
        l1.setBounds(100,100,200,30);
        createPanel.add(l1);


        tf1= new JTextField();
        tf1.setFont(f2);
        tf1.setBounds(300,100,400,30);
        createPanel.add(tf1);

        
        
        this.setVisible(true);







        mainPanel.setVisible(false);
        createPanel.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button1)
        {
          mainPanel.setVisible(false);
            createPanel.setVisible(true);
        }
    }
    
    public static void main(String[] args)
    {
        new Frame1();
    }
}
