public class Main{
	public static void main(String[] args){
		FileStatistics file = new FileStatistics("file.txt");
		System.out.println("number of caracteres: "+file.getCharCount());
		System.out.println("number of words     : "+file.getWordCount());
		System.out.println("number of sentences : "+file.getSentenceCount());
		file.saveCounts("save_file.txt");
		file.getDictionary();
	}
}