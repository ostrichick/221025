package j0713_practice;

import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException {
		System.out.println("정렬방식 선택");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort");

		int ch = System.in.read();
		Sort sort = null;
		if (ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		} else if (ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		} else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		} else {
			System.out.println("지원되지 않는 기능입니다");
			return;
		}
		// 정렬 방식과 상관없이 Sort에 선언된 메서드 호출
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();

	}
}

interface Sort {
	void ascending(int[] arr);

	void descending(int[] arr);

	void description();
}

abstract class SuperSort implements Sort {

	public abstract void ascending(int[] arr);

	public abstract void descending(int[] arr);

	public abstract void description();

}

class QuickSort extends SuperSort {

	@Override
	public void ascending(int[] arr) {
	}

	@Override
	public void descending(int[] arr) {
	}

	@Override
	public void description() {
	}

}

class HeapSort extends SuperSort {

	@Override
	public void ascending(int[] arr) {
	}

	@Override
	public void descending(int[] arr) {
	}

	@Override
	public void description() {
	}
}

class BubbleSort extends SuperSort {

	@Override
	public void ascending(int[] arr) {
	}

	@Override
	public void descending(int[] arr) {
	}

	@Override
	public void description() {
	}

}