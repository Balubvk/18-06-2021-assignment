import java.io.*;

public class first
{
public static void main(String[] args) throws IOException
{
	File in=new File("C:/Users/balav/OneDrive/Documents/assign/input.txt");
	File out=new File("C:/Users/balav/OneDrive/Documents/assign/output.txt");
	FileReader fr=new FileReader(in);
	FileWriter fw=new FileWriter(out);
	BufferedReader br=new BufferedReader(fr);
	vowels v=new vowels();
	String st;
	while((st=br.readLine())!=null)
	{
		
		fw.write(v.issamp(st)+"\n");
	}
	fw.flush();
	fw.close();
} 
}
class vowels
{
	public  StringBuilder issamp(String str)
	{
	
		StringBuilder sb=new StringBuilder();
		String[] s=str.split(" ");
		for(String i:s)
		{
			if(i.length()>1)
			{
				char t=i.charAt(1);
				if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u')
				{
					sb.append(i +" ,");
				}
			}
		}
		return sb;
	}
	
}
