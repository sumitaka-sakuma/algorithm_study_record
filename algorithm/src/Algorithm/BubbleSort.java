package Algorithm;

public class BubbleSort {

	public static void main(String[] args) {

		int[] data = {4, 5, 1, 3, 2, 6};

		for (int i = 0; i + 1 < data.length; i++) {

			for (int j = 0; j + 1 < data.length - i; j++) {

				if (data[j] > data[j + 1]) {
					int tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
				for (int n = 0; n < data.length; n++) {
					System.out.print(data[n]);
				}
				System.out.println("");
			}
			System.out.println("----------");
		}
	}
}
