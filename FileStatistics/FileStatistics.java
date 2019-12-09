import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.*;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;



public class FileStatistics{
	private String filename;
	public FileStatistics(String fn){
		filename = fn;
		File file = new File(filename);
	}
	public int getCharCount(){
		int nb = 0;
		try{
			File file = new File(filename);
			FileReader fr = new FileReader(file);
			while(fr.read()!=-1){
				nb++;
			}
		}catch(FileNotFoundException e){e.printStackTrace();}
		catch(IOException e){e.printStackTrace();}
		return nb;
	}
	public int getWordCount(){
		int wordCount=0;
		try{
			File f = new File(filename);
			FileReader fr = new FileReader(f);
	 		String str = "";
	 		int i;
			while((i=fr.read())!=-1){
				str+=(char)i;
			}
			String [] all = str.split(" ");
			wordCount = all.length;
		}catch(FileNotFoundException e){e.printStackTrace();}
		catch(IOException e){e.printStackTrace();}
		return wordCount;
	}

	public int getSentenceCount(){
		
		int nbSentences = 0;
		int n=0;
		String str = "";
		try{
			File f = new File(filename);
			FileReader fr = new FileReader(f);
			while((n=fr.read())!=-1){
			str+=(char)n;
			}
			String [] sentences = str.split("[!,;?.:]+");
			nbSentences = sentences.length;
		}catch(FileNotFoundException e){e.printStackTrace();}
		catch(IOException e){e.printStackTrace();}
		return nbSentences;
		
	}
	public void saveCounts(String fname){
		try{
			File file = new File(filename);
			File fsave = new File(fname);
			FileWriter fw = new FileWriter(fsave);
			fw.write("this saves all counts :)");
			fw.write("\nnumber of caracters: "+getCharCount());
			fw.write("\nnumber of words    : "+getWordCount());
			fw.write("\nnumber of sentences: "+getSentenceCount());
			fw.close();
		}catch(FileNotFoundException e){e.printStackTrace();}
		catch(IOException e){e.printStackTrace();}
	}

	public void getDictionary(){
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int length = 0;
		try{
			File f = new File(filename);
			FileReader fr = new FileReader(f);
			FileWriter fw = new FileWriter("dictionnaire.txt");
	 		String str = "";
	 		int i;
				while((i=fr.read())!=-1){
				str+=(char)i;
				}
			String [] allWords = str.split(" ");
			for(int n=0; n<allWords.length;n++){
				if(map.containsKey(allWords[n])) {
					map.replace(allWords[n],(map.get(allWords[n]))+1);
				}
				else {
					map.put(allWords[n],1);
				}
			}
			Set<Entry<String,Integer>> set = map.entrySet();
			Iterator<Entry<String,Integer>>  it = set.iterator();
		
			while(it.hasNext()){
			Entry<String,Integer> entry = it.next();

			fw.write(entry.getKey()+" : "+entry.getValue()+"\n");
		}
		fw.close();

		}catch(FileNotFoundException e){e.printStackTrace();}
		catch(IOException e){e.printStackTrace();}
	}
}