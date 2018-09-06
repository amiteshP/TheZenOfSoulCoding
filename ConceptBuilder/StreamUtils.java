import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException

import java.io.FileReader;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.PrintWriter;

//Byte Streams
class ByteReaderWriter{
	public void readWriteFromFile(String inputFile, String outputFile) throws IOException{
		FileInputStream inReader;
		FileOutputWriter outWriter;

		try{
			inReader = new FileInputStream(inputFile);
			outWriter = new FileOutputWriter(outputFile);
			int c;
			while((c=inReader.read())!=-1)
			{
				outWriter.write(c);
			}
		}
		finally{
			if(inReader!=null)
				inReader.close();
			if(outWriter!=null)
				outWriter.close();
		}
	}
}

//Character Streams

class CharacterReaderWriter{
	public void readWriteFromFile(String inputFile, String outputFile) throws IOException{
		FileReader inReader;
		FileWriter outWriter;

		try{
			inReader = new FileReader(inputFile);
			outWriter = new FileWriter(outputFile);

			int c;

			while((c=inReader.read())!=-1)
			{
				outWriter.write(c);
			}
		}
		finally{
			if(inReader!=null)
				inReader.close();
			if(outWriter!=null)
				outWriter.close();
		}	
	}
}

//Buffered Streams

class BufferedReaderWriter{
	public void readWriteFromFile(String inputFile, String outputFile) throws IOException{
		BufferedReader inReader;
		PrintWriter outWriter;
		try{
			inReader = new BufferedReader(new FileReader(inputFile));
			outWriter = new PrintWriter(new FileWriter(outputFile));

			String line;
			while((l=inReader.readLine())!=null){
				outWriter.println(line);
			}
		}
		finally{
			if(inReader!=null)
				inReader.close();
			if(outWriter!=null)
				outWriter.close();
		}
	}
}
