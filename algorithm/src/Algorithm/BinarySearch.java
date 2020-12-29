package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {

		List<Integer> numList = new ArrayList<>();

		for (int i = 1; i < 21; i++) {
			numList.add(i);
		}

		Collections.sort(numList);

		// 要素から16を検索する
		int searchForNum = 16;

		int result = Collections.binarySearch(numList, searchForNum);

		System.out.println(searchForNum + "は" + result + "番目の要素です");
	}
}
