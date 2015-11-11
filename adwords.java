//package Adwords;
import java.sql.*;
import java.io.*;
import java.util.Scanner;


public class adwords {

    public static void main(String[] args) throws Exception
    {
        FileInputStream fstream;
        DataInputStream in;
        BufferedReader br;
        String myusername,mypassword;
        int[] K = new int[6];        

        try
        {

            fstream = new FileInputStream("system.in");
            in = new DataInputStream(fstream);
            br = new BufferedReader(new InputStreamReader(in));

            myusername=br.readLine().split(" ")[2];
//            myusername="system";
            mypassword=br.readLine().split(" ")[2];
  //          mypassword="sohamdas1";
            //mypassword=(new BufferedReader(new InputStreamReader(System.in))).readLine();
            

            int i=0;
            while (i<6)
                K[i++]=Integer.parseInt(br.readLine().split(" ")[3]);
        }
        catch(Exception f)
        {
            System.out.println("ERROR IN READING system.in!!!");
            return;
        }
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("JDBC DRIVER NOT FOUND!!!");
            e.printStackTrace();
            return;
        }

        Connection connection = null;
        try
        {
            connection = DriverManager.getConnection("jdbc:oracle:thin:hr/hr@oracle1.cise.ufl.edu:1521:orcl",myusername,mypassword);
			//connection = DriverManager.getConnection("jdbc:oracle:thin:@//127.0.0.1:1521/XE",myusername,mypassword);
			
        }
        catch (SQLException e)
        {
            System.out.println("DISCONNECTED!!!");
            e.printStackTrace();
            return;
        }
        if (connection != null)
        {
            System.out.println("CONNECTION SUCCESFUL!!!");
        }
        else
        {
            System.out.println("CONNECTION FAILED!!!");
        }
        
       
  
        try
        {            
            Scanner sc=new Scanner(new FileReader("table_loadsecond.sql"));
            String totalStr="";
            Statement s=connection.createStatement();
            while(sc.hasNextLine())            
                totalStr+=sc.nextLine()+"\n";
                
            s.executeUpdate(totalStr);
            
            CallableStatement cstmt = connection.prepareCall("{call table_loadsecond()}");            
            cstmt.executeQuery();
                        
            System.out.println("TABLE_LOAD DROPPED!!!");
        }
        catch(Exception e)
        {
            System.out.println("drop_table_load exception!!!");
            //return;
        }
                
                
        
        try
        {            
            Scanner sc=new Scanner(new FileReader("table_load.sql"));
            String totalStr="";
            Statement s=connection.createStatement();
            while(sc.hasNextLine())            
                totalStr+=sc.nextLine()+"\n";
                
            s.executeUpdate(totalStr);
            
            CallableStatement cstmt = connection.prepareCall("{call table_load()}");            
            cstmt.executeQuery();
                        
            System.out.println("TABLES CREATED!!!");
        }
        catch(Exception e)
        {
            System.out.println("TABLE ALREADY THERE!!!");
            //return;
        }
        
        /*
        try
        {
            Statement stmt = connection.createStatement();
            stmt.executeQuery("sqlldr control=queries.ctl userid="+myusername+"/"+mypassword+"@orcl");
        }
        catch(SQLException sq)
        {
            System.out.println("SQLLDR FOR QUERIES FAILED!!!");
            sq.printStackTrace();
        }

        try
        {
            Statement stmt = connection.createStatement();
            stmt.executeQuery("sqlldr control=adv.ctl userid="+myusername+"/"+mypassword+"@orcl");
        }
        catch(SQLException sq)
        {
            System.out.println("SQLLDR FOR ADVERTISERS FAILED!!!");
            sq.printStackTrace();
        }

        try
        {
            Statement stmt = connection.createStatement();
            stmt.executeQuery("sqlldr control=key.ctl userid="+myusername+"/"+mypassword+"@orcl");
        }
        catch(SQLException sq)
        {
            System.out.println("SQLLDR FOR KEYWORDS FAILED!!!");
            sq.printStackTrace();
        }  
        
        */ 
         
        // TASK1
        try
        {
            Scanner sc=new Scanner(new FileReader("task1.txt"));
            String totalStr="";
            Statement s=connection.createStatement();
            while(sc.hasNextLine())            
                totalStr+=sc.nextLine()+"\n";
                
            s.executeUpdate(totalStr);
            
        }
        catch(Exception e)
        {
            System.out.println("TASK1 LOAD FAILED!!!");
        }
        
        // TASK2
        try
        {
            Scanner sc=new Scanner(new FileReader("task2.txt"));
            String totalStr="";
            Statement s=connection.createStatement();
            while(sc.hasNextLine())            
                totalStr+=sc.nextLine()+"\n";
                
            s.executeUpdate(totalStr);            
        
        }
        catch(Exception e)
        {
            System.out.println("TASK2 LOAD FAILED!!!");
        }
        
        // TASK3
        try
        {
            Scanner sc=new Scanner(new FileReader("task3.txt"));
            String totalStr="";
            Statement s=connection.createStatement();
            while(sc.hasNextLine())            
                totalStr+=sc.nextLine()+"\n";
                
            s.executeUpdate(totalStr);            
        
        }
        catch(Exception e)
        {
            System.out.println("TASK3 LOAD FAILED!!!");
        }
        
        // TASK4
        try
        {
            Scanner sc=new Scanner(new FileReader("task4.txt"));
            String totalStr="";
            Statement s=connection.createStatement();
            while(sc.hasNextLine())            
                totalStr+=sc.nextLine()+"\n";
                
            s.executeUpdate(totalStr);            
        
        }
        catch(Exception e)
        {
            System.out.println("TASK4 LOAD FAILED!!!");
        }
        // TASK5
        try
        {
            Scanner sc=new Scanner(new FileReader("task5.txt"));
            String totalStr="";
            Statement s=connection.createStatement();
            while(sc.hasNextLine())            
                totalStr+=sc.nextLine()+"\n";
                
            s.executeUpdate(totalStr);            
        
        }
        catch(Exception e)
        {
            System.out.println("TASK5 LOAD FAILED!!!");
        }
        
        // TASK6
        try
        {
            Scanner sc=new Scanner(new FileReader("task6.txt"));
            String totalStr="";
            Statement s=connection.createStatement();
            while(sc.hasNextLine())            
                totalStr+=sc.nextLine()+"\n";
                
            s.executeUpdate(totalStr);            
        
        }
        catch(Exception e)
        {
            System.out.println("TASK6 LOAD FAILED!!!");
        }
        
        new ll(K[0],myusername,mypassword,"TASK1","TASKONE","OUTONE","system.out.1").start();
        new ll(K[1],myusername,mypassword,"TASK2","TASKTWO","OUTTWO","system.out.2").start();
	new ll(K[2],myusername,mypassword,"TASK3","TASKTHREE","OUTTHREE","system.out.3").start();
	new ll(K[3],myusername,mypassword,"TASK4","TASKFOUR","OUTFOUR","system.out.4").start();
	new ll(K[4],myusername,mypassword,"TASK5","TASKFIVE","OUTFIVE","system.out.5").start();
	new ll(K[5],myusername,mypassword,"TASK6","TASKSIX","OUTSIX","system.out.6").start();
        
        try
        {
            connection.close(); // ** IMPORTANT : Close connections when done **
        }
        catch(SQLException e)
        {
            System.out.println("CONNECTION CANNOT BE CLOSED!!!");
            e.printStackTrace();
        }
        
        try
        {
            br.close();
            in.close();
            fstream.close();
        }
        catch(Exception e)
        {
            System.out.println("ERROR IN CLOSING FILE!!!");
        }

    }
}

class ll extends Thread
{
    int k;
    Connection connection;
    String algoName,procName,tableName,outFileName;
    
    public ll(int num_ads, String myusername,String mypassword,String algoName, String procName, String tableName, String outFileName)
    {
        k=num_ads;        
        this.algoName=algoName;
        this.procName=procName;
        this.tableName=tableName;
        this.outFileName=outFileName;
        try
        {
            connection = DriverManager.getConnection("jdbc:oracle:thin:hr/hr@oracle1.cise.ufl.edu:1521:orcl",myusername,mypassword);
			//connection = DriverManager.getConnection("jdbc:oracle:thin:@//127.0.0.1:1521/XE",myusername,mypassword);
        }
        catch (SQLException e)
        {
            System.out.println("CONNECTION FAILED!!!");
            e.printStackTrace();
            return;
        }
        if (connection != null)
        {
            System.out.println("DONE!!!");
        }
        else
        {
            System.out.println("CONNECTION FAILED!!!");
        }
    }
    public void run() 
    {
        try
        {            
            CallableStatement cstmt = connection.prepareCall("{call "+this.procName+"(?)}");   
            cstmt.setInt(1, k);
            cstmt.executeQuery();
            //System.out.println(algoName+" executed successfully");
        }
        catch(SQLException se)
        {
            System.out.println("ERROR IN EXECUTION OF "+ algoName);
            se.printStackTrace();
        }

        try
        {
            Statement stmt = connection.createStatement();
            ResultSet rq = stmt.executeQuery("select * from "+this.tableName+" order by qid,rank");            
            PrintWriter out = new PrintWriter(new FileWriter(this.outFileName));
            while(rq.next()) 
            {
                //System.out.println(rq.getInt(1)+", "+rq.getInt(2)+", "+rq.getInt(3)+", "+rq.getFloat(4)+", "+rq.getFloat(5));
                out.println(rq.getInt(1)+", "+rq.getInt(2)+", "+rq.getInt(3)+", "+rq.getFloat(4)+", "+rq.getFloat(5));
            }
            out.close();
            rq.close();
            stmt.close();      
            connection.close();
            System.out.println(algoName+" SUCCESSFUL EXECUTION");
        }
        catch(Exception e)
        {
            System.out.println("FAILED TO FETCH DATA!!!");
            e.printStackTrace();
        }
    }
    
    
}
