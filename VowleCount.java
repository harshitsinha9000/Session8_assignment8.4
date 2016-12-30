//assignment 8.4
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class VowleCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C:\\java\\",filename;
		int vowelcount=0,i;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enterfile name(stored at loaction C:\\java\\)");
		filename = sc.next();
		path = path+filename;
		
		FileReader fr = new FileReader(path);
		
			while((i=fr.read())!=-1)
				{
					ch=(char)i;
					if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
					{
						vowelcount=vowelcount+1;
					}
				}
			fr.close();
			System.out.println("Total vowel in file ="+vowelcount);
	}

}
