package count;
//created package name as count
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextCount {
	//created class name as TextCount 
	
	public static void main(String[]args) throws IOException{
		//created main method
		
		BufferedReader reader= null;
		//Creating BufferedReader object to read the input text file line by line
		//first initializing the charCount, wordCount and lineCount to zero
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		
	
		 // Here we create  BufferedReader object
		//and also given the path of a source file
		reader= new BufferedReader(new FileReader("D://java/count.txt"));
		
		// Here the code is reading the first line into currentLine
		String currentLine = reader.readLine();
		
		//by using  the while loop to iterate several times 
		while (currentLine != null){
			
			//giving the line count
			lineCount++;
			
			//Now getting the number of words
			String[]words= currentLine.split(" ");
			
			//Updating the word count
			wordCount= wordCount+words.length;
			
			//Iterating each word
			for(String word: words){
				 charCount = charCount + word.length();
            }
             
            //Reading next line into currentLine
             
            currentLine = reader.readLine();
        }
         
        // Printing charCount, wordCount and lineCount
         
        System.out.println("Number of Characters in a File : "+charCount);
         
        System.out.println("Number of Words in a File : "+wordCount);
        
        System.out.println("Number of Lines in a File : "+lineCount);
        
			}
		

}
