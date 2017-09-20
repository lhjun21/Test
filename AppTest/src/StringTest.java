
public class StringTest {

	public static void main(String args[]) {
		String str = "http://the300.mt.co.kr/newsView.html?no=2015103111087635579";
		String kWord = "?no=";
		int sIdx = str.indexOf(kWord) + kWord.length();
		int eIdx = str.indexOf("&", sIdx);
		System.out.println(str.substring(sIdx, sIdx+12));
		//System.out.println(str.substring(0, str.indexOf(kWord)+kWord.length()));
	}

}
