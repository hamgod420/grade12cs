/**
 * 
 */
import java.util.*;
import java.io.*;
/**
 * @author hamgod
 *
 */
public class TwoPowerTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File twoPowerTable = new File("D:\\twoPowerTable.html");//Create file in directory
		
		//Used D drive because C wasn't able to get accessed...
		
		 try {//Try catch to allow buffered writer to work
			 BufferedWriter bw = new BufferedWriter(new FileWriter(twoPowerTable));
			 
			 Scanner in = new Scanner(System.in);
			 
			 int iTableSize = in.nextInt();//input of table lenght
			 
			 //Beginning of table
			 String html = "<html><head>\r\n"
			 		+ "\r\n"
			 		+ "<title>Powers of Two</title>\r\n"
			 		+ "\r\n"
			 		+ "</head>\r\n"
			 		+ "\r\n"
			 		+ "<body>\r\n"
			 		+ "\r\n"
			 		+ "<table border cellpadding=5>\r\n"
			 		+ "\r\n"
			 		+ "<tr><th>Power of 2</th><th>Value</th></tr>\r\n"
			 		+ "\r\n"
			 		+ "And end with: \r\n"
			 		+ "\r\n"
			 		+ "</table>\r\n"
			 		+ "\r\n"
			 		+ "</body></html>\r\n"
			 		+ "\r\n"
			 		+ "";
			 
			 //Loops to iTableSize and prints out all powers of 2 up to that number
			 for(int i = 0;i<=iTableSize;i++) {
				 int power = (int)Math.pow(2, i);
				 html += "\r\n<table>\r\n";//Next line
				 
				 String line = "<tr><td>"+i+"</td><td>"+power+"</td></tr>";
				 
				 html += line;//add to html
			 }
			 
			 html += "</table>\r\n"
			 		+ "\r\n"
			 		+ "</body></html>";
			 bw.write(html);//Writes the html
			 bw.close();
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	}

}
