import java.io.*; //for File IO
import javax.swing.*; 

public class Account
{
        private String s1, s2, s3, s4, s5, s6, s7, s8;
		private File file;
	    private FileWriter fwriter;
		
		
		public Account(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8)
		{
		     this.s1 = s1;
			 this.s2 = s2;
			 this.s3 = s3;
			 this.s4 = s4;
			 this.s5 = s5;
			 this.s6 = s6;
			 this.s7 = s7;
			 this.s8 = s8;
		}
		
	    public void insertInfo()
	   {
		try 
		{
			File dataDir = new File("data");
			if(!dataDir.exists())
			{
				dataDir.mkdirs();
			}
			
			file = new File("data/userdata.txt");
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			fwriter = new FileWriter(file, true); //ensure to not override the existing text
			fwriter.write("========================================"+"\n");
			fwriter.write("Name: "+s1+"\n");
			fwriter.write("Address: "+s2+"\n");
			fwriter.write("Phone: "+s3+"\n");
			fwriter.write("Email: "+s4+"\n");
			fwriter.write("Username: "+s5+"\n");
			fwriter.write("Password: "+s6+"\n");
			fwriter.write("Account Type: "+s7+"\n");
			fwriter.write("Description: "+s8+"\n");
			fwriter.write("========================================"+"\n");
			
			fwriter.flush(); //ensure all the data are saved 
			fwriter.close(); //ensure to close the file
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error occcurs");
		}
	   }
	   
	   public  static boolean loginCheck(String username, String password)
	   {
		   File file = new File("data/userdata.txt");
			
			if(!file.exists())
			{
				 JOptionPane.showMessageDialog(null, "No users found. Please create an account first.");
				 return false;
			}
			
		   try
		   {
			BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String fileUsername = "";
            String filePassword = "";
			
			while((line = br.readLine()) != null)
			{
				if (line.startsWith("Username: ")) 
				{
                    fileUsername = line.substring(10).trim();
                }
                if (line.startsWith("Password: ")) 
				{
                    filePassword = line.substring(10).trim();
                }
				
				if(!fileUsername.isEmpty() && !filePassword.isEmpty())
				{
					if(fileUsername.equals(username) && filePassword.equals(password))
					{
						br.close();
						return true;
					}
					
					fileUsername = "";
                    filePassword = "";
					
			   }
		   
            }
		   br.close();	
		}
      		
	   catch (IOException e) 
		{
            e.printStackTrace();
        }

            return false;
    }
}
	