
public class MergeSort {

	public static void sort(double InputArray[], int start, int end) {
		if (end <= start) {
			return;
		}
		int mid = (start + end) / 2;
		sort(InputArray, start, mid);
		sort(InputArray, mid + 1, end);
		merge(InputArray, start, mid, end);
	}

	public void merge(double InputArray[], int start, int mid, int end) {
		double tmpArray[] = new double[end - start + 1];
		int leftSlot = start;
		int rightSlot = mid + 1;
		int k = 0;

		while (leftSlot <= mid && rightSlot <= end) {
			if (InputArray[leftSlot] < InputArray[rightSlot]) {
				tmpArray[k] = InputArray[leftSlot];
				leftSlot++;
			} else {
				tmpArray[k] = InputArray[rightSlot];
				rightSlot++;
			}
			k = k + 1;
		}
		if (leftSlot <= mid) {
			while (leftSlot <= mid) {
				tmpArray[k] = InputArray[leftSlot];
				leftSlot++;
				k++;
			}
		} else if (rightSlot <= end) {
			while (rightSlot <= end) {
				tmpArray[k] = InputArray[rightSlot];
				rightSlot++;
				k++;
			}
		}

		for (int i = 0; i < tmpArray.length; i++) {
			InputArray[start + i] = tmpArray[i];
		}
	}
}
