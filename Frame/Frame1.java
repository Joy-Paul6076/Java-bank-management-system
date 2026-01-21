package Frame;

import javax.swing.*; //package for GUI components
import java.awt.*; //package for Font and Color
import java.awt.event.*; //package for Interfaces
import java.io.*; //for File IO
import Entity.Account; //import Account class from Entity package
public class Frame1 extends JFrame implements ActionListener
{
    private JLabel label1;
    private JButton button1, bt2, bt3, bt4, bt5, bt6, backBtn, backToMainFromLogin, exitBtn, backFromSearch, searchBtn, deleteBtn, backFromDelete, balanceBtn, transferBtn, withdrawBtn, addBalanceBtn, logoutBtn, loginBtn, withdrawConfirmBtn, transferConfirmBtn, addBalanceConfirmBtn, backFromWithdraw, backFromTransfer, backFromAddBalance, backFromShowAll;
    private Font f1,f2;
    private Color c1;
    private JPanel mainPanel, createPanel, loginPanel, searchpanel, deletePanel, accountPanel, withdrawPanel, transferPanel, addBalancePanel, showAllPanel;
    private JTextField tf1, tf2, tf3, tf4, tf5, tf7, searchTf, deleteTf, withdrawTf, transferRecipientTf, transferAmountTf, addBalanceTf, userTf;
    private JPasswordField pf1, deletePf, passPf;
    private JLabel l1,l2,l3,l4,l5,l6;
	private JRadioButton savingsRadio, currentRadio;
	private JTextArea showAllTextArea;
	private String loggedInUsername = null;
	private double userBalance = 0.0;
	private JTextArea searchResultTextArea;
	
    public Frame1()
    {
        // main frame setup
        super("ABC Bank Management System");           // Set frame title
        super.setSize(900,1250);                       // Set frame dimensions
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit
        super.setLocationRelativeTo(null);             // Center window on screen
        super.setResizable(false);                     // Prevent resizing
        this.setLayout(null);                          // Use absolute positioning for components
        
        // FONT AND COLOR SETUP
        f1 = new Font("Arial", Font.BOLD, 48);         //font for main buttons
		f2 = new Font("Arial", Font.BOLD, 24);         //font for labels and inputs
        c1 = new Color(255, 193, 7);                   //color for buttons
        
        // MAIN PANEL SETUP
        mainPanel = new JPanel();
        mainPanel.setLayout(null);                     
        mainPanel.setBounds(0,0,900,1250);             // Full window size
        mainPanel.setBackground(new Color(20, 30, 48)); // Dark blue background
        ImageIcon image1 = new ImageIcon("logo.png");   // Load application logo
        this.setIconImage(image1.getImage());           // Set icon

        // Welcome label for main panel
        label1 = new JLabel("Welcome to ABC Bank Management System");
        label1.setFont(f2);                            
        label1.setForeground(Color.WHITE);             
        label1.setBounds(180, 15, 500, 30);           
        label1.setHorizontalAlignment(JLabel.CENTER);  // Center align text
        label1.setVerticalAlignment(JLabel.TOP);       // Align to top
        mainPanel.add(label1);                         // Add to main panel

        // CREATE ACCOUNT button 
        button1 = new JButton("CREATE ACCOUNT");
        button1.addActionListener(this);               // ActionLisener
        button1.setBounds(200,90,500,100);            // Position and size
        button1.setFont(f1);                           // Large font
        button1.setBackground(c1);                     // Golden background
        mainPanel.add(button1);                        // Add to main panel

        // LOG IN button
        bt2 = new JButton("LOG IN");
        bt2.addActionListener(this);
        bt2.setBounds(200,280,500,100);
        bt2.setFont(f1);
        bt2.setBackground(c1);
        mainPanel.add(bt2);

        // SEARCH ACCOUNT button 
        bt3 = new JButton("SEARCH ACCOUNT");
        bt3.addActionListener(this);
        bt3.setBounds(200,470,500,100);
        bt3.setFont(f1);
        bt3.setBackground(c1);
        mainPanel.add(bt3);

        // DELETE ACCOUNT button
        bt4 = new JButton("DELETE ACCOUNT");
        bt4.addActionListener(this);
        bt4.setBounds(200,660,500,100);
        bt4.setFont(f1);
        bt4.setBackground(c1);
        mainPanel.add(bt4);
        
        // SHOW ALL ACCOUNTS button 
        bt5 = new JButton("SHOW ALL ACCOUNTS");
        bt5.addActionListener(this);
        bt5.setBounds(200,850,500,100);
        bt5.setFont(f1);
        bt5.setBackground(c1);
        mainPanel.add(bt5);

        // EXIT button
        bt6 = new JButton("Exit");
        bt6.addActionListener(this);
        bt6.setBounds(200,1040,500,100);
        bt6.setFont(f1);
        bt6.setBackground(c1);
        mainPanel.add(bt6);
        this.add(mainPanel);                
        
        // CREATE ACCOUNT PANEL SETUP
        createPanel = new JPanel();
        createPanel.setLayout(null);
        createPanel.setBounds(0,0,900,1250);
        createPanel.setBackground(new Color(20, 30, 48));
        ImageIcon image2 = new ImageIcon("logo.png");
        this.setIconImage(image2.getImage());

        // Panel title label
        JLabel createLabel = new JLabel("Creating An Account");
        createLabel.setFont(f2);
        createLabel.setForeground(Color.BLACK);
        createLabel.setOpaque(true);
        createLabel.setBackground(Color.LIGHT_GRAY);
        createLabel.setHorizontalAlignment(JLabel.CENTER);
        createLabel.setBounds(275, 10, 350, 50);
        createPanel.add(createLabel);
        
        // CREATE ACCOUNT button
        backBtn = new JButton("Create Account");
        backBtn.addActionListener(this);
        backBtn.setBounds(350, 850, 200, 50);
        createPanel.add(backBtn);        
        
        // EXIT button
        exitBtn = new JButton("Exit");
        exitBtn.addActionListener(this);
        exitBtn.setBounds(570, 850, 200, 50);
        createPanel.add(exitBtn);        
        
        this.add(createPanel);
        // ACCOUNT CREATION FORM FIELDS
        
        // Name field
        l1= new JLabel("Name:");
        l1.setFont(f2);
        l1.setForeground(Color.BLACK);
        l1.setOpaque(true);
        l1.setBackground(Color.LIGHT_GRAY);
        l1.setBounds(165,100,150,40);
        createPanel.add(l1);

        tf1= new JTextField();                         // Customer's full name input
        tf1.setFont(f2);
        tf1.setBounds(335,100,400,40);
        createPanel.add(tf1);

        // Address field
        l2= new JLabel("Address:");
        l2.setFont(f2);
        l2.setForeground(Color.BLACK);
        l2.setOpaque(true);
        l2.setBackground(Color.LIGHT_GRAY);
        l2.setBounds(165,180,150,40);
        createPanel.add(l2);

        tf2= new JTextField();                         // Customer's address input
        tf2.setFont(f2);
        tf2.setBounds(335,180,400,40);
        createPanel.add(tf2);

        // Phone field
        l3= new JLabel("Phone:");
        l3.setFont(f2);
        l3.setForeground(Color.BLACK);
        l3.setOpaque(true);
        l3.setBackground(Color.LIGHT_GRAY);
        l3.setBounds(165,260,150,40);   
        createPanel.add(l3);

        tf3= new JTextField();                         // Customer's phone number input
        tf3.setFont(f2);
        tf3.setBounds(335,260,400,40);
        createPanel.add(tf3);

        // Email field
        l4= new JLabel("Email:");
        l4.setFont(f2); 
        l4.setForeground(Color.BLACK);
        l4.setOpaque(true);
        l4.setBackground(Color.LIGHT_GRAY);
        l4.setBounds(165,340,150,40);
        createPanel.add(l4);

        tf4= new JTextField();                         // Customer's email input
        tf4.setFont(f2);
        tf4.setBounds(335,340,400,40);
        createPanel.add(tf4);

        // Username field
        l5= new JLabel("Username:");
        l5.setFont(f2);
        l5.setForeground(Color.BLACK);
        l5.setOpaque(true);
        l5.setBackground(Color.LIGHT_GRAY);
        l5.setBounds(165,420,150,40);
        createPanel.add(l5);

        tf5= new JTextField();                         // Login username input
        tf5.setFont(f2);
        tf5.setBounds(335,420,400,40);
        createPanel.add(tf5);

        this.setVisible(true);                         // Make window visible

        // Password field
        l6= new JLabel("Password:");
        l6.setFont(f2);
        l6.setForeground(Color.BLACK);
        l6.setOpaque(true);
        l6.setBackground(Color.LIGHT_GRAY);
        l6.setBounds(165,500,150,40);
        createPanel.add(l6);

        pf1= new JPasswordField();                     // Login password input (masked)
        pf1.setFont(f2);
        pf1.setBounds(335,500,400,40);
        createPanel.add(pf1);

        // Account type selection
        JLabel accountTypeLabel = new JLabel("Account Type:");
        accountTypeLabel.setFont(f2);
        accountTypeLabel.setForeground(Color.BLACK);
        accountTypeLabel.setOpaque(true);
        accountTypeLabel.setBackground(Color.LIGHT_GRAY);
        accountTypeLabel.setBounds(165,580,150,40);
        createPanel.add(accountTypeLabel);

        savingsRadio = new JRadioButton("Savings");   // Savings account option
        savingsRadio.setFont(f2);
        savingsRadio.setForeground(Color.BLACK);
        savingsRadio.setBackground(Color.LIGHT_GRAY);
        savingsRadio.setBounds(335,580,150,40);
        savingsRadio.setSelected(true);                // Default selection
        createPanel.add(savingsRadio);

        currentRadio = new JRadioButton("Current");    // Current account option
        currentRadio.setFont(f2);
        currentRadio.setForeground(Color.BLACK);
        currentRadio.setBackground(Color.LIGHT_GRAY);
        currentRadio.setBounds(500,580,150,40);
        createPanel.add(currentRadio);

        ButtonGroup accountTypeGroup = new ButtonGroup(); // Group radio buttons for single selection
        accountTypeGroup.add(savingsRadio);
        accountTypeGroup.add(currentRadio);

        // Description field
        JLabel l7 = new JLabel("Description:");
        l7.setFont(f2);
        l7.setForeground(Color.BLACK);
        l7.setOpaque(true);
        l7.setBackground(Color.LIGHT_GRAY);
        l7.setBounds(165,660,150,40);
        createPanel.add(l7);

        tf7= new JTextField();                         // Account description
        tf7.setFont(f2);
        tf7.setBounds(335,660,400,150);               // Larger text area for description
        createPanel.add(tf7);

        
        // LOGIN PANEL SETUP - User authentication screen
        loginPanel = new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setBounds(0,0,900,1250);
        loginPanel.setBackground(new Color(20, 30, 48));

        // Panel title
        JLabel loginLabel = new JLabel("Log In");
        loginLabel.setFont(f2);
        loginLabel.setForeground(Color.WHITE);
        loginLabel.setBounds(350, 50, 200, 50);
        loginPanel.add(loginLabel);

        // Username input section
        JLabel userLabel = new JLabel("Username:");
        userLabel.setFont(f2);
        userLabel.setForeground(Color.WHITE);
        userLabel.setBounds(200, 150, 150, 40);
        loginPanel.add(userLabel);

        userTf = new JTextField();                     // Username input field
        userTf.setFont(f2);
        userTf.setBounds(350, 150, 300, 40);
        loginPanel.add(userTf);

        // Password input section
        JLabel passLabel = new JLabel("Password:");
        passLabel.setFont(f2);
        passLabel.setForeground(Color.WHITE);
        passLabel.setBounds(200, 250, 150, 40);
        loginPanel.add(passLabel);

        passPf = new JPasswordField();                 // Password input field (masked)
        passPf.setFont(f2);
        passPf.setBounds(350, 250, 300, 40);
        loginPanel.add(passPf);

        // LOGIN button
        loginBtn = new JButton("Log In");
        loginBtn.addActionListener(this);
        loginBtn.setBounds(350, 350, 200, 50);
        loginPanel.add(loginBtn);

        // BACK TO MAIN button
        backToMainFromLogin = new JButton("Back to Main");
        backToMainFromLogin.addActionListener(this);
        backToMainFromLogin.setBounds(350, 450, 200, 50);
        loginPanel.add(backToMainFromLogin);

        this.add(loginPanel);

        // SEARCH PANEL SETUP
        searchpanel = new JPanel();
        searchpanel.setLayout(null);
        searchpanel.setBounds(0,0,900,1250);
        searchpanel.setBackground(new Color(20, 30, 48));

        // Panel title
        JLabel searchLabel = new JLabel("Search Account");
        searchLabel.setFont(f2);
        searchLabel.setForeground(Color.WHITE);
        searchLabel.setBounds(350, 50, 200, 50);
        searchpanel.add(searchLabel);

        // Search input section
        JLabel searchUserLabel = new JLabel("Username:");
        searchUserLabel.setFont(f2);
        searchUserLabel.setForeground(Color.WHITE);
        searchUserLabel.setBounds(200, 150, 150, 40);
        searchpanel.add(searchUserLabel);

        searchTf = new JTextField();                   // Username search input
        searchTf.setFont(f2);
        searchTf.setBounds(350, 150, 300, 40);
        searchpanel.add(searchTf);

        // SEARCH button 
        searchBtn = new JButton("Search");
        searchBtn.addActionListener(this);
        searchBtn.setBounds(350, 250, 200, 50);
        searchpanel.add(searchBtn);

        // BACK TO MAIN button
        backFromSearch = new JButton("Back to Main");
        backFromSearch.addActionListener(this);
        backFromSearch.setBounds(350, 350, 200, 50);
        searchpanel.add(backFromSearch);

        // Results display area with scroll pane
        searchResultTextArea = new JTextArea();        // Displays search results
        searchResultTextArea.setFont(f2);
        searchResultTextArea.setEditable(false);       // Read-only display
        JScrollPane searchScrollPane = new JScrollPane(searchResultTextArea);
        searchScrollPane.setBounds(50, 420, 800, 700);
        searchpanel.add(searchScrollPane);

        this.add(searchpanel);
        // DELETE PANEL SETUP
        deletePanel = new JPanel();
        deletePanel.setLayout(null);
        deletePanel.setBounds(0,0,900,1250);
        deletePanel.setBackground(new Color(20, 30, 48));

        // Panel title
        JLabel deleteLabel = new JLabel("Delete Account");
        deleteLabel.setFont(f2);
        deleteLabel.setForeground(Color.WHITE);
        deleteLabel.setBounds(350, 50, 200, 50);
        deletePanel.add(deleteLabel);

        // Delete input section
        JLabel deleteUserLabel = new JLabel("Username:");
        deleteUserLabel.setFont(f2);
        deleteUserLabel.setForeground(Color.WHITE);
        deleteUserLabel.setBounds(200, 150, 150, 40);
        deletePanel.add(deleteUserLabel);

        deleteTf = new JTextField();                   // Username for deletion
        deleteTf.setFont(f2);
        deleteTf.setBounds(350, 150, 300, 40);
        deletePanel.add(deleteTf);

        // Password confirmation for deletion
        JLabel deletePassLabel = new JLabel("Password:");
        deletePassLabel.setFont(f2);
        deletePassLabel.setForeground(Color.WHITE);
        deletePassLabel.setBounds(200, 250, 150, 40);
        deletePanel.add(deletePassLabel);

        deletePf = new JPasswordField();               // Password confirmation input
        deletePf.setFont(f2);
        deletePf.setBounds(350, 250, 300, 40);
        deletePanel.add(deletePf);

        // DELETE ACCOUNT button
        deleteBtn = new JButton("Delete Account");
        deleteBtn.addActionListener(this);
        deleteBtn.setBounds(350, 350, 200, 50);
        deletePanel.add(deleteBtn);

        // BACK TO MAIN button
        backFromDelete = new JButton("Back to Main");
        backFromDelete.addActionListener(this);
        backFromDelete.setBounds(350, 450, 200, 50);
        deletePanel.add(backFromDelete);

        this.add(deletePanel);

        // ACCOUNT PANEL SETUP - Logged-in user dashboard
        accountPanel = new JPanel();
        accountPanel.setLayout(null);
        accountPanel.setBounds(0,0,900,1250);
        accountPanel.setBackground(new Color(20, 30, 48));

        // Panel title
        JLabel accountLabel = new JLabel("Account Options");
        accountLabel.setFont(f2);
        accountLabel.setForeground(Color.WHITE);
        accountLabel.setBounds(350, 50, 200, 50);
        accountPanel.add(accountLabel);

        // SHOW BALANCE button
        balanceBtn = new JButton("Show Balance");
        balanceBtn.addActionListener(this);
        balanceBtn.setBounds(200, 150, 500, 100);
        balanceBtn.setFont(f1);
        balanceBtn.setBackground(c1);
        accountPanel.add(balanceBtn);

        // TRANSFER button
        transferBtn = new JButton("Transfer");
        transferBtn.addActionListener(this);
        transferBtn.setBounds(200, 280, 500, 100);
        transferBtn.setFont(f1);
        transferBtn.setBackground(c1);
        accountPanel.add(transferBtn);

        // WITHDRAW button - navigates to withdrawal interface
        withdrawBtn = new JButton("Withdraw");
        withdrawBtn.addActionListener(this);
        withdrawBtn.setBounds(200, 410, 500, 100);
        withdrawBtn.setFont(f1);
        withdrawBtn.setBackground(c1);
        accountPanel.add(withdrawBtn);

        // ADD BALANCE button
        addBalanceBtn = new JButton("Add Balance");
        addBalanceBtn.addActionListener(this);
        addBalanceBtn.setBounds(200, 540, 500, 100);
        addBalanceBtn.setFont(f1);
        addBalanceBtn.setBackground(c1);
        accountPanel.add(addBalanceBtn);

        // LOGOUT button
        logoutBtn = new JButton("Logout");
        logoutBtn.addActionListener(this);
        logoutBtn.setBounds(200, 670, 500, 100);
        logoutBtn.setFont(f1);
        logoutBtn.setBackground(c1);
        accountPanel.add(logoutBtn);

        this.add(accountPanel);

        
        // WITHDRAW PANEL SETUP 
        withdrawPanel = new JPanel();
        withdrawPanel.setLayout(null);
        withdrawPanel.setBounds(0,0,900,1250);
        withdrawPanel.setBackground(new Color(20, 30, 48));

        // Panel title
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

        addBalanceTf = new JTextField();               // Deposit amount input
        addBalanceTf.setFont(f2);
        addBalanceTf.setBounds(350, 150, 300, 40);
        addBalancePanel.add(addBalanceTf);

        // ADD BALANCE button
        addBalanceConfirmBtn = new JButton("Add Balance");
        addBalanceConfirmBtn.addActionListener(this);
        addBalanceConfirmBtn.setBounds(350, 250, 200, 50);
        addBalancePanel.add(addBalanceConfirmBtn);

        // BACK TO ACCOUNT button
        backFromAddBalance = new JButton("Back to Account");
        backFromAddBalance.addActionListener(this);
        backFromAddBalance.setBounds(350, 350, 200, 50);
        addBalancePanel.add(backFromAddBalance);

        this.add(addBalancePanel);

        
        // SHOW ALL PANEL SETUP
        showAllPanel = new JPanel();
        showAllPanel.setLayout(null);
        showAllPanel.setBounds(0,0,900,1250);
        showAllPanel.setBackground(new Color(20, 30, 48));

        // Panel title
        JLabel showAllLabel = new JLabel("All Accounts");
        showAllLabel.setFont(f2);
        showAllLabel.setForeground(Color.WHITE);
        showAllLabel.setBounds(350, 50, 200, 50);
        showAllPanel.add(showAllLabel);

        // Account display area with scroll pane
        showAllTextArea = new JTextArea();             // Displays all account information
        showAllTextArea.setFont(f2);
        showAllTextArea.setEditable(false);            // Read-only display
        JScrollPane scrollPane = new JScrollPane(showAllTextArea);
        scrollPane.setBounds(50, 120, 800, 1000);
        showAllPanel.add(scrollPane);

        // BACK TO MAIN button
        backFromShowAll = new JButton("Back to Main");
        backFromShowAll.addActionListener(this);
        backFromShowAll.setBounds(350, 1130, 200, 50);
        showAllPanel.add(backFromShowAll);

        this.add(showAllPanel);

        
        // INITIAL PANEL VISIBILITY SETUP
        
        mainPanel.setVisible(true);                    
        createPanel.setVisible(false);                 
        loginPanel.setVisible(false);
        searchpanel.setVisible(false);
        deletePanel.setVisible(false);
        accountPanel.setVisible(false);
        withdrawPanel.setVisible(false);
        transferPanel.setVisible(false);
        addBalancePanel.setVisible(false);
        showAllPanel.setVisible(false);

    }
    
    
    public void actionPerformed(ActionEvent e)
    {
         // CREATE ACCOUNT button clicked 
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
            showAllPanel.setVisible(false);
			
		}
        // LOG IN button clicked
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
           showAllPanel.setVisible(false);
        }
        // CREATE ACCOUNT button clicked
        if(e.getSource() == backBtn)                    
        {
			// Collect form data from input fields
			String s1, s2, s3, s4, s5, s6, s7, s8;
			
			s1 = tf1.getText().trim();  // Name
			s2 = tf2.getText().trim();  // Address
			s3 = tf3.getText().trim();  // Phone
			s4 = tf4.getText().trim();  // Email
			s5 = tf5.getText().trim();  // Username
			s6 = pf1.getText().trim();  // Password
			
			// Determine account type from radio buttons
			if(savingsRadio.isSelected())
			{
			   s7 = savingsRadio.getText();
			}
			
			else if(currentRadio.isSelected())
			{
			   s7 = currentRadio.getText();
			}
			
			else 
			{
		      s7 = "Others" ;
			}
			
			s8 = tf7.getText().trim();  // Description
			
			// Validate that all required fields are filled
			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty() || s8.isEmpty())
			{
				JOptionPane.showMessageDialog(this,"Please fill up all the information");
			}
			
			else
			{
              // Create new account and save to file
              Account obj1 = new Account(s1, s2, s3, s4, s5, s6, s7, s8);
				obj1.insertInfo();
				JOptionPane.showMessageDialog(this,"Thanks for fill up the information");
			}
       
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            accountPanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
            loginPanel.setVisible(false);
            createPanel.setVisible(true);
            mainPanel.setVisible(false);
            showAllPanel.setVisible(false);
			
			
        }
        // EXIT button clicked (from create panel)
        if(e.getSource() == exitBtn)
        {
            mainPanel.setVisible(true);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            showAllPanel.setVisible(false);
        }
        // BACK TO MAIN button clicked (from login panel)
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
            showAllPanel.setVisible(false);
            userTf.setText("");        
            passPf.setText("");        
        }
        // LOG IN button clicked
        if(e.getSource() == loginBtn)
        {
            String username = userTf.getText().trim();
            String password = new String(passPf.getPassword()).trim();
            try {
                File file = new File("Data/userdata.txt");
                if (!file.exists()) {
                    JOptionPane.showMessageDialog(this, "No accounts found.");
                    return;
                }
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                boolean found = false;
                String currentUsername = "";
                String currentPassword = "";
                double currentBalance = 0.0;
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("User Name: ")) {
                        currentUsername = line.substring(11).trim();
                    } else if (line.startsWith("Password: ")) {
                        currentPassword = line.substring(10).trim();
                        if (currentUsername.equals(username) && currentPassword.equals(password)) {
                            found = true;
                        }
                    } else if (line.startsWith("Balance: ") && found) {
                        currentBalance = Double.parseDouble(line.substring(9).trim());
                        loggedInUsername = currentUsername;
                        userBalance = currentBalance;
                        break;
                    }
                }
                br.close();
                if (found) {
                    mainPanel.setVisible(false);
                    loginPanel.setVisible(false);
                    createPanel.setVisible(false);
                    searchpanel.setVisible(false);
                    deletePanel.setVisible(false);
                    accountPanel.setVisible(true);
                    withdrawPanel.setVisible(false);
                    transferPanel.setVisible(false);
                    addBalancePanel.setVisible(false);
                    showAllPanel.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect username or password");
                }
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(this, "Error reading file.");
            }
        }
        // SEARCH ACCOUNT button clicked
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
        // BACK FROM SEARCH button clicked 
        if(e.getSource() == backFromSearch)
        {
            mainPanel.setVisible(true);
            searchpanel.setVisible(false);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            deletePanel.setVisible(false);
            showAllPanel.setVisible(false);
            searchTf.setText("");                    
            searchResultTextArea.setText("");       
        }
        // SEARCH button clicked 
        if(e.getSource() == searchBtn)
        {
            String username = searchTf.getText().trim();
            if (username.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a username to search");
                return;
            }
            
            try {
                File file = new File("Data/userdata.txt");
                if (!file.exists()) {
                    JOptionPane.showMessageDialog(this, "No accounts found.");
                    return;
                }
                
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                StringBuilder accountInfo = new StringBuilder();
                boolean found = false;
                boolean inUserBlock = false;
                
                // Parse file to find matching account
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("User Name: ")) {
                        String currentUsername = line.substring(11).trim();
                        if (currentUsername.equals(username)) {
                            found = true;
                            inUserBlock = true;
                            accountInfo.append("========================================" + "\n");
                        }
                    }
                    
                    if (inUserBlock && !line.startsWith("Password:")) {
                        accountInfo.append(line).append("\n");
                    }
                    
                    if (line.startsWith("========================================") && inUserBlock) {
                        inUserBlock = false;
                    }
                }
                br.close();
                
                if (found) {
                    searchResultTextArea.setText(accountInfo.toString());
                } else {
                    searchResultTextArea.setText("Account not found for username: " + username);
                }
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(this, "Error reading file.");
            }
        }
        // It hides all other panels and shows only the deletePanel
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
            showAllPanel.setVisible(false);        
        }
        // bt5 - Show All Accounts Panel
        if(e.getSource() == bt5)
        {
            try {
                File file = new File("Data/userdata.txt");
                if (!file.exists()) {
                    JOptionPane.showMessageDialog(this, "No accounts found.");
                    return;
                }
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                StringBuilder sb = new StringBuilder();
                while ((line = br.readLine()) != null) {
                    if (!line.startsWith("Password:")) {
                        sb.append(line).append("\n");
                    }
                }
                br.close();
                showAllTextArea.setText(sb.toString());
                mainPanel.setVisible(false);
                showAllPanel.setVisible(true);
                createPanel.setVisible(false);
                loginPanel.setVisible(false);
                searchpanel.setVisible(false);
                deletePanel.setVisible(false);
                accountPanel.setVisible(false);
                withdrawPanel.setVisible(false);
                transferPanel.setVisible(false);
                addBalancePanel.setVisible(false);
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(this, "Error reading file.");
            }
        }
        // backFromDelete - Return to Main Panel from Delete Panel
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
            showAllPanel.setVisible(false);
            deleteTf.setText("");
            deletePf.setText("");
        }
        // deleteBtn - Delete Account Confirmation
    
        if(e.getSource() == deleteBtn)
        {
            String username = deleteTf.getText().trim();
            String password = new String(deletePf.getPassword()).trim();
            
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both username and password");
                return;
            }
            
            try {
                File file = new File("Data/userdata.txt");
                if (!file.exists()) {
                    JOptionPane.showMessageDialog(this, "No accounts found.");
                    return;
                }
                
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                StringBuilder fileContent = new StringBuilder();
                boolean found = false;
                boolean inUserBlock = false;
                boolean skipBlock = false;
                String currentUsername = "";
                String currentPassword = "";
                
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("User Name: ")) {
                        currentUsername = line.substring(11).trim();
                        inUserBlock = true;
                        skipBlock = false;
                    } else if (line.startsWith("Password: ")) {
                        currentPassword = line.substring(10).trim();
                        if (currentUsername.equals(username) && currentPassword.equals(password)) {
                            found = true;
                            skipBlock = true;
                            inUserBlock = false;
                        }
                    } else if (line.startsWith("========================================")) {
                        if (inUserBlock) {
                            inUserBlock = false;
                        }
                        if (skipBlock) {
                            skipBlock = false;
                            continue; // Skip adding the separator for deleted account
                        }
                    }
                    
                    if (!skipBlock) {
                        fileContent.append(line).append("\n");
                    }
                }
                br.close();
                
                if (found) {
                    // Write the updated content back to file
                    FileWriter fw = new FileWriter(file);
                    fw.write(fileContent.toString().trim());
                    fw.close();
                    
                    JOptionPane.showMessageDialog(this, "Account deleted successfully!");
                    deleteTf.setText("");
                    deletePf.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Account not found or incorrect password.");
                }
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(this, "Error deleting account.");
            }
        }
        // balanceBtn - Show Current Balance
        
        if(e.getSource() == balanceBtn)
        {
            JOptionPane.showMessageDialog(this, "Current Balance: $" + String.format("%.2f", userBalance));
        }
        // transferBtn - Navigate to Transfer Panel
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
            showAllPanel.setVisible(false);
        }
        // withdrawBtn - Navigate to Withdraw Panel
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
            showAllPanel.setVisible(false);
        }
        // addBalanceBtn - Navigate to Add Balance Panel
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
            showAllPanel.setVisible(false);
        }
        // logoutBtn - Logout and Return to Main Menu
        if(e.getSource() == logoutBtn)
        {
            loggedInUsername = null;
            userBalance = 0.0;
            mainPanel.setVisible(true);
            accountPanel.setVisible(false);
            loginPanel.setVisible(false);
            createPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
            showAllPanel.setVisible(false);
        }
        // bt6 - Exit Application
        if(e.getSource() == bt6)
        {
            System.exit(0);
        }
        // withdrawConfirmBtn - Process Withdrawal
        if(e.getSource() == withdrawConfirmBtn)
        {
            String amountStr = withdrawTf.getText().trim();
            if (amountStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter an amount");
                return;
            }
            try {
                double amount = Double.parseDouble(amountStr);
                if (amount <= 0) {
                    JOptionPane.showMessageDialog(this, "Amount must be greater than 0");
                    return;
                }
                if (amount > userBalance) {
                    JOptionPane.showMessageDialog(this, "Insufficient balance. Current balance: $" + String.format("%.2f", userBalance));
                    return;
                }
                // Update balance in memory
                userBalance -= amount;
                // Update file
                updateBalanceInFile(loggedInUsername, userBalance);
                JOptionPane.showMessageDialog(this, "Successfully withdrawn: $" + String.format("%.2f", amount) + "\nNew Balance: $" + String.format("%.2f", userBalance));
                withdrawTf.setText("");
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Please enter a valid amount");
            }
        }
        // transferConfirmBtn - Process Transfer
        if(e.getSource() == transferConfirmBtn)
        {
            String recipientUsername = transferRecipientTf.getText().trim();
            String amountStr = transferAmountTf.getText().trim();
            
            if (recipientUsername.isEmpty() || amountStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both recipient username and amount");
                return;
            }
            
            if (recipientUsername.equals(loggedInUsername)) {
                JOptionPane.showMessageDialog(this, "Cannot transfer to yourself");
                return;
            }
            
            try {
                double amount = Double.parseDouble(amountStr);
                if (amount <= 0) {
                    JOptionPane.showMessageDialog(this, "Amount must be greater than 0");
                    return;
                }
                if (amount > userBalance) {
                    JOptionPane.showMessageDialog(this, "Insufficient balance. Current balance: $" + String.format("%.2f", userBalance));
                    return;
                }
                
                // Check if recipient exists
                File file = new File("Data/userdata.txt");
                if (!file.exists()) {
                    JOptionPane.showMessageDialog(this, "No accounts found.");
                    return;
                }
                
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                boolean recipientFound = false;
                //StringBuilder fileContent = new StringBuilder();
                boolean inUserBlock = false;
                String currentUsername = "";
                double recipientBalance = 0.0;
                
                // First pass: find recipient and get their balance
                while ((line = br.readLine()) != null) {
                    if (line.startsWith("User Name: ")) {
                        currentUsername = line.substring(11).trim();
                        inUserBlock = true;
                    } else if (line.startsWith("Balance: ") && inUserBlock && currentUsername.equals(recipientUsername)) {
                        recipientBalance = Double.parseDouble(line.substring(9).trim());
                        recipientFound = true;
                        break;
                    } else if (line.startsWith("========================================")) {
                        inUserBlock = false;
                    }
                }
                br.close();
                
                if (!recipientFound) {
                    JOptionPane.showMessageDialog(this, "Recipient account not found");
                    return;
                }
                
                // Update balances
                userBalance -= amount;
                recipientBalance += amount;
                
                // Update sender's balance in file
                updateBalanceInFile(loggedInUsername, userBalance);
                
                // Update recipient's balance in file
                updateBalanceInFile(recipientUsername, recipientBalance);
                
                JOptionPane.showMessageDialog(this, "Successfully transferred $" + String.format("%.2f", amount) + " to " + recipientUsername + "\nNew Balance: $" + String.format("%.2f", userBalance));
                transferRecipientTf.setText("");
                transferAmountTf.setText("");
                
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Please enter a valid amount");
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(this, "Error processing transfer");
            }
        }
        // addBalanceConfirmBtn - Process Deposit
        if(e.getSource() == addBalanceConfirmBtn)
        {
            String amountStr = addBalanceTf.getText().trim();
            if (amountStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter an amount");
                return;
            }
            try {
                double amount = Double.parseDouble(amountStr);
                if (amount <= 0) {
                    JOptionPane.showMessageDialog(this, "Amount must be greater than 0");
                    return;
                }
                // Update balance in memory
                userBalance += amount;
                // Update file
                updateBalanceInFile(loggedInUsername, userBalance);
                JOptionPane.showMessageDialog(this, "Successfully added: $" + String.format("%.2f", amount) + "\nNew Balance: $" + String.format("%.2f", userBalance));
                addBalanceTf.setText("");
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Please enter a valid amount");
            }
        }
        // backFromWithdraw - Return to Account Panel from Withdraw Panel
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
            showAllPanel.setVisible(false);
            withdrawTf.setText("");
        }
        // backFromTransfer - Return to Account Panel from Transfer Panel
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
            showAllPanel.setVisible(false);
            transferRecipientTf.setText("");
            transferAmountTf.setText("");
        }
        // backFromAddBalance - Return to Account Panel from Add Balance Panel
    
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
            showAllPanel.setVisible(false);
            addBalanceTf.setText("");
        }
        // backFromShowAll - Return to Main Panel from Show All Panel
        if(e.getSource() == backFromShowAll)
        {
            mainPanel.setVisible(true);
            showAllPanel.setVisible(false);
            createPanel.setVisible(false);
            loginPanel.setVisible(false);
            searchpanel.setVisible(false);
            deletePanel.setVisible(false);
            accountPanel.setVisible(false);
            withdrawPanel.setVisible(false);
            transferPanel.setVisible(false);
            addBalancePanel.setVisible(false);
        }

    }
    
    // Helper method to update balance in the userdata.txt file
    private void updateBalanceInFile(String username, double newBalance) {
        try {
            File file = new File("Data/userdata.txt");
            if (!file.exists()) {
                return;
            }
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line;
            boolean inUserBlock = false;
            String currentUsername = "";
            
            while ((line = br.readLine()) != null) {
                if (line.startsWith("User Name: ")) {
                    currentUsername = line.substring(11).trim();
                    inUserBlock = true;
                    sb.append(line).append("\n");
                } else if (line.startsWith("Balance: ") && inUserBlock && currentUsername.equals(username)) {
                    sb.append("Balance: ").append(newBalance).append("\n");
                    inUserBlock = false;
                } else if (line.startsWith("========================================")) {
                    if (inUserBlock) {
                        inUserBlock = false;
                    }
                    sb.append(line).append("\n");
                } else {
                    sb.append(line).append("\n");
                }
            }
            br.close();
            
            FileWriter fw = new FileWriter(file);
            fw.write(sb.toString());
            fw.close();
        } catch (IOException ioException) {
            JOptionPane.showMessageDialog(null, "Error updating balance");
        }
    }
   
}