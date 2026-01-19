
//import java.lang.*;
import javax.swing.*; //package for GUI components
import java.awt.*; //package for Font and Color
import java.awt.event.*; //package for Interfaces
//import java.io.*; //for File IO

public class Frame1 extends JFrame implements ActionListener // , MouseListener
{
    private JLabel label1;
    private JButton button1, bt2, bt3, bt4, bt5, bt6, backBtn, backToMainFromLogin, exitBtn, backFromSearch, searchBtn, deleteBtn, backFromDelete, balanceBtn, transferBtn, withdrawBtn, addBalanceBtn, logoutBtn, loginBtn, withdrawConfirmBtn, transferConfirmBtn, addBalanceConfirmBtn, backFromWithdraw, backFromTransfer, backFromAddBalance;
    private Font f1,f2;
    private Color c1,c2;
    private JPanel mainPanel, createPanel, loginPanel, searchpanel, deletePanel, accountPanel, withdrawPanel, transferPanel, addBalancePanel;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf7, searchTf, deleteTf, withdrawTf, transferRecipientTf, transferAmountTf, addBalanceTf;
    private JPasswordField pf1, deletePf;
    private JLabel l1,l2,l3,l4,l5,l6;
    public Frame1()
    {
        super("ABC Bank Management System");
        super.setSize(900,1250);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null); 
        super.setResizable(false);
        this.setLayout(null);
        
        
        f1 = new Font("Arial", Font.BOLD, 48);
		f2 = new Font("Arial", Font.BOLD, 24); 
        c1 = new Color(255, 193, 7);
		c2 = new Color(20, 30, 48);
        // Main Panel
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0,0,900,1250);
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

        this.add(mainPanel);
        
        // Create create account  Panel
        createPanel = new JPanel();
        createPanel.setLayout(null);
        createPanel.setBounds(0,0,900,1250);
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
        this.add(createPanel);

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
        loginPanel.setBounds(0,0,900,1250);
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

        loginBtn = new JButton("Log In");
        loginBtn.addActionListener(this);
        loginBtn.setBounds(350, 350, 200, 50);
        loginPanel.add(loginBtn);

        backToMainFromLogin = new JButton("Back to Main");
        backToMainFromLogin.addActionListener(this);
        backToMainFromLogin.setBounds(350, 450, 200, 50);
        loginPanel.add(backToMainFromLogin);

        this.add(loginPanel);

        // Search Panel
        searchpanel = new JPanel();
        searchpanel.setLayout(null);
        searchpanel.setBounds(0,0,900,1250);
        searchpanel.setBackground(new Color(20, 30, 48));

        JLabel searchLabel = new JLabel("Search Account");
        searchLabel.setFont(f2);
        searchLabel.setForeground(Color.WHITE);
        searchLabel.setBounds(350, 50, 200, 50);
        searchpanel.add(searchLabel);

        JLabel searchUserLabel = new JLabel("Username:");
        searchUserLabel.setFont(f2);
        searchUserLabel.setForeground(Color.WHITE);
        searchUserLabel.setBounds(200, 150, 150, 40);
        searchpanel.add(searchUserLabel);

        JTextField searchTf = new JTextField();
        searchTf.setFont(f2);
        searchTf.setBounds(350, 150, 300, 40);
        searchpanel.add(searchTf);

        JButton searchBtn = new JButton("Search");
        searchBtn.addActionListener(this);
        searchBtn.setBounds(350, 250, 200, 50);
        searchpanel.add(searchBtn);

        JButton backFromSearch = new JButton("Back to Main");
        backFromSearch.addActionListener(this);
        backFromSearch.setBounds(350, 350, 200, 50);
        searchpanel.add(backFromSearch);

        this.add(searchpanel);

        // Delete Panel
        deletePanel = new JPanel();
        deletePanel.setLayout(null);
        deletePanel.setBounds(0,0,900,1250);
        deletePanel.setBackground(new Color(20, 30, 48));

        JLabel deleteLabel = new JLabel("Delete Account");
        deleteLabel.setFont(f2);
        deleteLabel.setForeground(Color.WHITE);
        deleteLabel.setBounds(350, 50, 200, 50);
        deletePanel.add(deleteLabel);

        JLabel deleteUserLabel = new JLabel("Username:");
        deleteUserLabel.setFont(f2);
        deleteUserLabel.setForeground(Color.WHITE);
        deleteUserLabel.setBounds(200, 150, 150, 40);
        deletePanel.add(deleteUserLabel);

        deleteTf = new JTextField();
        deleteTf.setFont(f2);
        deleteTf.setBounds(350, 150, 300, 40);
        deletePanel.add(deleteTf);

        JLabel deletePassLabel = new JLabel("Password:");
        deletePassLabel.setFont(f2);
        deletePassLabel.setForeground(Color.WHITE);
        deletePassLabel.setBounds(200, 250, 150, 40);
        deletePanel.add(deletePassLabel);

        deletePf = new JPasswordField();
        deletePf.setFont(f2);
        deletePf.setBounds(350, 250, 300, 40);
        deletePanel.add(deletePf);

        deleteBtn = new JButton("Delete Account");
        deleteBtn.addActionListener(this);
        deleteBtn.setBounds(350, 350, 200, 50);
        deletePanel.add(deleteBtn);

        backFromDelete = new JButton("Back to Main");
        backFromDelete.addActionListener(this);
        backFromDelete.setBounds(350, 450, 200, 50);
        deletePanel.add(backFromDelete);

        this.add(deletePanel);

        // Account Panel
        accountPanel = new JPanel();
        accountPanel.setLayout(null);
        accountPanel.setBounds(0,0,900,1250);
        accountPanel.setBackground(new Color(20, 30, 48));

        JLabel accountLabel = new JLabel("Account Options");
        accountLabel.setFont(f2);
        accountLabel.setForeground(Color.WHITE);
        accountLabel.setBounds(350, 50, 200, 50);
        accountPanel.add(accountLabel);

        balanceBtn = new JButton("Show Balance");
        balanceBtn.addActionListener(this);
        balanceBtn.setBounds(200, 150, 500, 100);
        balanceBtn.setFont(f1);
        balanceBtn.setBackground(c1);
        accountPanel.add(balanceBtn);

        transferBtn = new JButton("Transfer");
        transferBtn.addActionListener(this);
        transferBtn.setBounds(200, 280, 500, 100);
        transferBtn.setFont(f1);
        transferBtn.setBackground(c1);
        accountPanel.add(transferBtn);

        withdrawBtn = new JButton("Withdraw");
        withdrawBtn.addActionListener(this);
        withdrawBtn.setBounds(200, 410, 500, 100);
        withdrawBtn.setFont(f1);
        withdrawBtn.setBackground(c1);
        accountPanel.add(withdrawBtn);

        addBalanceBtn = new JButton("Add Balance");
        addBalanceBtn.addActionListener(this);
        addBalanceBtn.setBounds(200, 540, 500, 100);
        addBalanceBtn.setFont(f1);
        addBalanceBtn.setBackground(c1);
        accountPanel.add(addBalanceBtn);

        logoutBtn = new JButton("Logout");
        logoutBtn.addActionListener(this);
        logoutBtn.setBounds(200, 670, 500, 100);
        logoutBtn.setFont(f1);
        logoutBtn.setBackground(c1);
        accountPanel.add(logoutBtn);

        this.add(accountPanel);

        // Withdraw Panel
        withdrawPanel = new JPanel();
        withdrawPanel.setLayout(null);
        withdrawPanel.setBounds(0,0,900,1250);
        withdrawPanel.setBackground(new Color(20, 30, 48));

        JLabel withdrawLabel = new JLabel("Withdraw Money");
        withdrawLabel.setFont(f2);
        withdrawLabel.setForeground(Color.WHITE);
        withdrawLabel.setBounds(350, 50, 200, 50);
        withdrawPanel.add(withdrawLabel);

        JLabel withdrawAmountLabel = new JLabel("Amount:");
        withdrawAmountLabel.setFont(f2);
        withdrawAmountLabel.setForeground(Color.WHITE);
        withdrawAmountLabel.setBounds(200, 150, 150, 40);
        withdrawPanel.add(withdrawAmountLabel);

        withdrawTf = new JTextField();
        withdrawTf.setFont(f2);
        withdrawTf.setBounds(350, 150, 300, 40);
        withdrawPanel.add(withdrawTf);

        withdrawConfirmBtn = new JButton("Withdraw");
        withdrawConfirmBtn.addActionListener(this);
        withdrawConfirmBtn.setBounds(350, 250, 200, 50);
        withdrawPanel.add(withdrawConfirmBtn);

        backFromWithdraw = new JButton("Back to Account");
        backFromWithdraw.addActionListener(this);
        backFromWithdraw.setBounds(350, 350, 200, 50);
        withdrawPanel.add(backFromWithdraw);

        this.add(withdrawPanel);

        // Transfer Panel
        transferPanel = new JPanel();
        transferPanel.setLayout(null);
        transferPanel.setBounds(0,0,900,1250);
        transferPanel.setBackground(new Color(20, 30, 48));

        JLabel transferLabel = new JLabel("Transfer Money");
        transferLabel.setFont(f2);
        transferLabel.setForeground(Color.WHITE);
        transferLabel.setBounds(350, 50, 200, 50);
        transferPanel.add(transferLabel);

        JLabel transferRecipientLabel = new JLabel("Recipient:");
        transferRecipientLabel.setFont(f2);
        transferRecipientLabel.setForeground(Color.WHITE);
        transferRecipientLabel.setBounds(200, 150, 150, 40);
        transferPanel.add(transferRecipientLabel);

        transferRecipientTf = new JTextField();
        transferRecipientTf.setFont(f2);
        transferRecipientTf.setBounds(350, 150, 300, 40);
        transferPanel.add(transferRecipientTf);

        JLabel transferAmountLabel = new JLabel("Amount:");
        transferAmountLabel.setFont(f2);
        transferAmountLabel.setForeground(Color.WHITE);
        transferAmountLabel.setBounds(200, 250, 150, 40);
        transferPanel.add(transferAmountLabel);

        transferAmountTf = new JTextField();
        transferAmountTf.setFont(f2);
        transferAmountTf.setBounds(350, 250, 300, 40);
        transferPanel.add(transferAmountTf);

        transferConfirmBtn = new JButton("Transfer");
        transferConfirmBtn.addActionListener(this);
        transferConfirmBtn.setBounds(350, 350, 200, 50);
        transferPanel.add(transferConfirmBtn);

        backFromTransfer = new JButton("Back to Account");
        backFromTransfer.addActionListener(this);
        backFromTransfer.setBounds(350, 450, 200, 50);
        transferPanel.add(backFromTransfer);

        this.add(transferPanel);

        // Add Balance Panel
        addBalancePanel = new JPanel();
        addBalancePanel.setLayout(null);
        addBalancePanel.setBounds(0,0,900,1250);
        addBalancePanel.setBackground(new Color(20, 30, 48));

        JLabel addBalanceLabel = new JLabel("Add Balance");
        addBalanceLabel.setFont(f2);
        addBalanceLabel.setForeground(Color.WHITE);
        addBalanceLabel.setBounds(350, 50, 200, 50);
        addBalancePanel.add(addBalanceLabel);

        JLabel addAmountLabel = new JLabel("Amount:");
        addAmountLabel.setFont(f2);
        addAmountLabel.setForeground(Color.WHITE);
        addAmountLabel.setBounds(200, 150, 150, 40);
        addBalancePanel.add(addAmountLabel);

        addBalanceTf = new JTextField();
        addBalanceTf.setFont(f2);
        addBalanceTf.setBounds(350, 150, 300, 40);
        addBalancePanel.add(addBalanceTf);

        addBalanceConfirmBtn = new JButton("Add Balance");
        addBalanceConfirmBtn.addActionListener(this);
        addBalanceConfirmBtn.setBounds(350, 250, 200, 50);
        addBalancePanel.add(addBalanceConfirmBtn);

        backFromAddBalance = new JButton("Back to Account");
        backFromAddBalance.addActionListener(this);
        backFromAddBalance.setBounds(350, 350, 200, 50);
        addBalancePanel.add(backFromAddBalance);

        this.add(addBalancePanel);

        mainPanel.setVisible(true);
        createPanel.setVisible(false);
        loginPanel.setVisible(false);
        searchpanel.setVisible(false);
        deletePanel.setVisible(false);
        accountPanel.setVisible(false);
        withdrawPanel.setVisible(false);
        transferPanel.setVisible(false);
        addBalancePanel.setVisible(false);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == button1)
        {
            mainPanel.setVisible(false);
            createPanel.setVisible(true);
            loginPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            accountPanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
             }
        if(e.getSource() == bt2)
        {
           mainPanel.setVisible(false);
           createPanel.setVisible(false);
           loginPanel.setVisible(true);
           searchpanel.setVisible(false);
           deletePanel.setVisible(false);
           accountPanel.setVisible(false);
           withdrawPanel.setVisible(false);
           transferPanel.setVisible(false);
           addBalancePanel.setVisible(false);
        }
        if(e.getSource() == backBtn)
        {
            createPanel.setVisible(false);
            loginPanel.setVisible(false);
            mainPanel.setVisible(true);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            accountPanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
            JOptionPane.showMessageDialog(backBtn, "Account Created Successfully!");
       
        }
        if(e.getSource() == exitBtn)
        {
            mainPanel.setVisible(true);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
        }
        if(e.getSource() == backToMainFromLogin)
        {
            mainPanel.setVisible(true);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            accountPanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
        }
        if(e.getSource() == loginBtn)
        {
            mainPanel.setVisible(false);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            accountPanel.setVisible(true);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
        }
        if(e.getSource() == bt3)
        {
            mainPanel.setVisible(false);
            searchpanel.setVisible(true);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            deletePanel.setVisible(false);
            accountPanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);

        }
        if(e.getSource() == backFromSearch)
        {
            mainPanel.setVisible(true);
            searchpanel.setVisible(false);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            deletePanel.setVisible(false);


        }
        if(e.getSource() == searchBtn)
        {
            String username = searchTf.getText();
            JOptionPane.showMessageDialog(this, "Searching for account: " + username);
        }
        if(e.getSource() == bt4)
        {
            mainPanel.setVisible(false);
            deletePanel.setVisible(true);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            accountPanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
        }
        if(e.getSource() == backFromDelete)
        {
            mainPanel.setVisible(true);
            deletePanel.setVisible(false);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            accountPanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
        }
        if(e.getSource() == balanceBtn)
        {
            JOptionPane.showMessageDialog(this, "Current Balance: $1000");
        }
        if(e.getSource() == transferBtn)
        {
            mainPanel.setVisible(false);
            accountPanel.setVisible(false);
            transferPanel.setVisible(true);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            withdrawPanel.setVisible(false);
            addBalancePanel.setVisible(false);
        }
        if(e.getSource() == withdrawBtn)
        {
            mainPanel.setVisible(false);
            accountPanel.setVisible(false);
            withdrawPanel.setVisible(true);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
        }
        if(e.getSource() == addBalanceBtn)
        {
            mainPanel.setVisible(false);
            accountPanel.setVisible(false);
            addBalancePanel.setVisible(true);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
        }
        if(e.getSource() == logoutBtn)
        {
            mainPanel.setVisible(true);
            accountPanel.setVisible(false);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
        }
        if(e.getSource() == bt6)
        {
            System.exit(0);
        }
        if(e.getSource() == withdrawConfirmBtn)
        {
            String amount = withdrawTf.getText();
            JOptionPane.showMessageDialog(this, "Withdrawn: $" + amount);
        }
        if(e.getSource() == transferConfirmBtn)
        {
            String recipient = transferRecipientTf.getText();
            String amount = transferAmountTf.getText();
            JOptionPane.showMessageDialog(this, "Transferred $" + amount + " to " + recipient);
        }
        if(e.getSource() == addBalanceConfirmBtn)
        {
            String amount = addBalanceTf.getText();
            JOptionPane.showMessageDialog(this, "Added $" + amount + " to balance");
        }
        if(e.getSource() == backFromWithdraw)
        {
            accountPanel.setVisible(true);
            withdrawPanel.setVisible(false);
            mainPanel.setVisible(false);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
        }
        if(e.getSource() == backFromTransfer)
        {
            accountPanel.setVisible(true);
            transferPanel.setVisible(false);
            mainPanel.setVisible(false);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            withdrawPanel.setVisible(false);
            addBalancePanel.setVisible(false);
        }
        if(e.getSource() == backFromAddBalance)
        {
            accountPanel.setVisible(true);
            addBalancePanel.setVisible(false);
            mainPanel.setVisible(false);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
        }

    }
    
    public static void main(String[] args)
    {
        new Frame1();
    }
}
