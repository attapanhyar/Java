import java.io.*;  
public class AppendTexttoFile {

public void writetoFile(String filepath, String Text){
	FileWriter fw;
	BufferedWriter bw;
	PrintWriter out;
	try
{
	fw = new FileWriter(filepath, true);
    bw = new BufferedWriter(fw);
    out = new PrintWriter(bw);
    out.println(Text);
    bw.close();
	fw.close();
} catch (IOException e) {
    System.out.println(e);
}
	
		
	
	
}
public void readfromfile(String filepath){
	FileReader fr;
	BufferedReader br;
	
	try{
			fr=new FileReader(filepath);    
			br = new BufferedReader(fr);
			String line = br.readLine();
          while(line!=null)    {
			  System.out.println(line);
			  
			  
			  line = br.readLine();
			  
		  }
	br.close();
	fr.close();  }catch(Exception ae){System.out.println("Exception Caught");}
	
}	
public static void main(String[] args) throws Exception {     
  
		String filePath = "D:\\scripts\\test.txt";
		String Text = "THis is fresh text in the file just compiled";
		AppendTexttoFile tf = new AppendTexttoFile();
		tf.writetoFile(filePath,Text);
		tf.readfromfile(filePath);

    }  
}  



//
