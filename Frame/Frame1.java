
//import java.lang.*;
import javax.swing.*; //package for GUI components
import java.awt.*; //package for Font and Color
import java.awt.event.*; //package for Interfaces
//import java.io.*; //for File IO

public class Frame1 extends JFrame implements ActionListener // , MouseListener
{
    private JLabel label1;
    private JButton button1, bt2, bt3, bt4, bt5, bt6, backBtn, backToMainFromLogin, exitBtn;
    private Font f1,f2;
    private Color c1,c2;
    private JPanel mainPanel, createPanel, loginPanel;
    private CardLayout cardLayout;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf7;
    private JPasswordField pf1;
    private JLabel l1,l2,l3,l4,l5,l6;
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
		f2 = new Font("Arial", Font.BOLD, 24); 
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
        createLabel.setForeground(Color.BLACK);
        createLabel.setOpaque(true);
        createLabel.setBackground(Color.LIGHT_GRAY);
        createLabel.setHorizontalAlignment(JLabel.CENTER);
        createLabel.setBounds(275, 10, 350, 50);
        createPanel.add(createLabel);
        
        JButton backBtn = new JButton("Create Account");
        backBtn.addActionListener(this);
        backBtn.setBounds(350, 850, 200, 50);
        createPanel.add(backBtn);        
        exitBtn = new JButton("Exit");
        exitBtn.addActionListener(this);
        exitBtn.setBounds(570, 850, 200, 50);
        createPanel.add(exitBtn);        
        this.add(createPanel, "create");

        l1= new JLabel("Name:");
        l1.setFont(f2);
        l1.setForeground(Color.BLACK);
        l1.setOpaque(true);
        l1.setBackground(Color.LIGHT_GRAY);
        l1.setBounds(165,100,150,40);
        createPanel.add(l1);


        tf1= new JTextField();
        tf1.setFont(f2);
        tf1.setBounds(335,100,400,40);
        createPanel.add(tf1);

        l2= new JLabel("Address:");
        l2.setFont(f2);
        l2.setForeground(Color.BLACK);
        l2.setOpaque(true);
        l2.setBackground(Color.LIGHT_GRAY);
        l2.setBounds(165,180,150,40);
        createPanel.add(l2);

        tf2= new JTextField();
        tf2.setFont(f2);
        tf2.setBounds(335,180,400,40);
        createPanel.add(tf2);


        l3= new JLabel("Phone:");
        l3.setFont(f2);
        l3.setForeground(Color.BLACK);
        l3.setOpaque(true);
        l3.setBackground(Color.LIGHT_GRAY);
        l3.setBounds(165,260,150,40);   
        createPanel.add(l3);

        tf3= new JTextField();
        tf3.setFont(f2);
        tf3.setBounds(335,260,400,40);
        createPanel.add(tf3);

        l4= new JLabel("Email:");
        l4.setFont(f2); 
        l4.setForeground(Color.BLACK);
        l4.setOpaque(true);
        l4.setBackground(Color.LIGHT_GRAY);
        l4.setBounds(165,340,150,40);
        createPanel.add(l4);

        tf4= new JTextField();
        tf4.setFont(f2);
        tf4.setBounds(335,340,400,40);
        createPanel.add(tf4);


        l5= new JLabel("Username:");
        l5.setFont(f2);
        l5.setForeground(Color.BLACK);
        l5.setOpaque(true);
        l5.setBackground(Color.LIGHT_GRAY);
        l5.setBounds(165,420,150,40);
        createPanel.add(l5);

        tf5= new JTextField();
        tf5.setFont(f2);
        tf5.setBounds(335,420,400,40);
        createPanel.add(tf5);

        this.setVisible(true);

        l6= new JLabel("Password:");
        l6.setFont(f2);
        l6.setForeground(Color.BLACK);
        l6.setOpaque(true);
        l6.setBackground(Color.LIGHT_GRAY);
        l6.setBounds(165,500,150,40);
        createPanel.add(l6);

        pf1= new JPasswordField();
        pf1.setFont(f2);
        pf1.setBounds(335,500,400,40);
        createPanel.add(pf1);

        JLabel accountTypeLabel = new JLabel("Account Type:");
        accountTypeLabel.setFont(f2);
        accountTypeLabel.setForeground(Color.BLACK);
        accountTypeLabel.setOpaque(true);
        accountTypeLabel.setBackground(Color.LIGHT_GRAY);
        accountTypeLabel.setBounds(165,580,150,40);
        createPanel.add(accountTypeLabel);

        JRadioButton savingsRadio = new JRadioButton("Savings");
        savingsRadio.setFont(f2);
        savingsRadio.setForeground(Color.BLACK);
        savingsRadio.setBackground(Color.LIGHT_GRAY);
        savingsRadio.setBounds(335,580,150,40);
        savingsRadio.setSelected(true);
        createPanel.add(savingsRadio);

        JRadioButton currentRadio = new JRadioButton("Current");
        currentRadio.setFont(f2);
        currentRadio.setForeground(Color.BLACK);
        currentRadio.setBackground(Color.LIGHT_GRAY);
        currentRadio.setBounds(500,580,150,40);
        createPanel.add(currentRadio);

        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(savingsRadio);
        accountTypeGroup.add(currentRadio);

        JLabel l7 = new JLabel("Description:");
        l7.setFont(f2);
        l7.setForeground(Color.BLACK);
        l7.setOpaque(true);
        l7.setBackground(Color.LIGHT_GRAY);
        l7.setBounds(165,660,150,40);
        createPanel.add(l7);

        tf7= new JTextField();
        tf7.setFont(f2);
        tf7.setBounds(335,660,400,150);
        createPanel.add(tf7);



        // Login Panel
        loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBackground(new Color(20, 30, 48));

        JLabel loginLabel = new JLabel("Log In");
        loginLabel.setFont(f2);
        loginLabel.setForeground(Color.WHITE);
        loginLabel.setBounds(350, 50, 200, 50);
        loginPanel.add(loginLabel);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(f2);
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(200, 150, 150, 40);
        loginPanel.add(userLabel);

        JTextField userTf = new JTextField();
        userTf.setFont(f2);
        userTf.setBounds(350, 150, 300, 40);
        loginPanel.add(userTf);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setFont(f2);
        passLabel.setForeground(Color.WHITE);
        passLabel.setBounds(200, 250, 150, 40);
        loginPanel.add(passLabel);

        JPasswordField passPf = new JPasswordField();
        passPf.setFont(f2);
        passPf.setBounds(350, 250, 300, 40);
        loginPanel.add(passPf);

        JButton loginBtn = new JButton("Log In");
        loginBtn.addActionListener(this);
        loginBtn.setBounds(350, 350, 200, 50);
        loginPanel.add(loginBtn);

        backToMainFromLogin = new JButton("Back to Main");
        backToMainFromLogin.addActionListener(this);
        backToMainFromLogin.setBounds(350, 450, 200, 50);
        loginPanel.add(backToMainFromLogin);

        this.add(loginPanel, "login");

        cardLayout.show(this, "main");
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button1)
        {
            mainPanel.setVisible(false);
            createPanel.setVisible(true);
        }
        if(e.getSource() == bt2)
        {
           mainPanel.setVisible(false);
           createPanel.setVisible(false);
              loginPanel.setVisible(true);
        }
        if(e.getSource() == backBtn)
        {
            createPanel.setVisible(false);
            loginPanel.setVisible(false);
            mainPanel.setVisible(true);
        }
        if(e.getSource() == exitBtn)
        {
            mainPanel.setVisible(true);
            loginPanel.setVisible(false);
        }
        if(e.getSource() == backToMainFromLogin)
        {
            mainPanel.setVisible(true);
            loginPanel.setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new Frame1();
    }
}
