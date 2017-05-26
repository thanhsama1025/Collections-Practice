package highestfrequency;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

class Word implements Comparable<Word>{
	int time;
	String contents;
	
	public Word(int time, String contents) {
		super();
		this.time = time;
		this.contents = contents;
	}

	@Override
	public int compareTo(Word word) {
		if(time > word.time){
			return 1;
		} else if (time < word.time) {
			return -1;
		} else {
			return 0;
		}
	}
	
}
public class HighestFrequency {
	static Map<String, Integer> mapInput=new LinkedHashMap<String, Integer>();
	public static Map<String, Integer> getMap(String input){
		String[] inputArray=input.split(" ");
		for(int i=0;i<inputArray.length;i++){
			int value=0;
			if (mapInput.containsKey(inputArray[i])) {
				value=mapInput.get(inputArray[i]);
			}
			value++;
			mapInput.put(inputArray[i], value);
		}
		return mapInput;
	}
	
	public static TreeSet<Word> getQueue(Map<String, Integer> mapInput){
		TreeSet<Word> treeSetInput=new TreeSet<>();
		for(Map.Entry<String, Integer> entry : mapInput.entrySet()){
			Word word=new Word(entry.getValue(),entry.getKey());
			treeSetInput.add(word);
		}
		return treeSetInput;
	}
	
	public static Word getResult(TreeSet<Word> treeSetInput){
		return treeSetInput.last();
	}
	
	public static void main(String[] args) {
		String input=new String(" Nhìn từng làn gió theo nhau cuốn trôi về cuối trời Lòng nghe mênh mang bao muộn phiền phiêu lãng chốn xa vời Tìm đâu cho thấy dáng ai qua thướt tha một chiều xưa Muốn quay trở về tìm lại em dẫu xa một tiếng đàn Một lần gặp gỡ ta trao dấu yêu tình nào có ngờ Giờ em nơi đâu khi dòng đời gian dối lắm đổi thay Chờ nhau em nhé bước phong ba sẽ quay về tìm nhau Chốn xưa trở về giờ còn nghe nỗi sầu em ở đâu Tìm khắp chốn gió mưa thét gào nghe nỗi đau ngập tràn Ðời phong ba mình anh xót xa bao nhớ thương về em Ngàn tiếng vó câu vọng về giờ gặp lại nơi chốn yêu xưa Về bên anh người yêu dấu hỡi muôn đời ta sẽ gần bên nhau Ðời bể dâu tình mình sẽ muôn đời Em nơi đâu? thấu chăng lòng anh Này người yêu hỡi muôn đời ta sẽ gần bên nha ");
		Map<String, Integer> mapInput=HighestFrequency.getMap(input);
		TreeSet<Word> treeSetInput=HighestFrequency.getQueue(mapInput);
		Word result=HighestFrequency.getResult(treeSetInput);
		System.out.println(result.contents + " : " +result.time);
	}
}
