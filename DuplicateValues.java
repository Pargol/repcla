package test328;

public class DuplicateValues {

	public static void main(String[] args) {
		int[] my_array = { 1, 2, 5, 5, 6, 6, 7, 2 ,2};
		for (int i = 0; i < my_array.length; i++) {
			int counter = i + 1;
			for (int j = counter; j < my_array.length; j++) {
				if (my_array[i]==my_array[j]) {
					System.out.println("Duplicate Elements : " + my_array[i]);
					continue;
				}
			}
		}

	}

}

// System.out.println("Duplicate elements in the array are:");
//         for (int i = 0; i < my_array.length - 1; i++) {
//             for (int j = i + 1; j < my_array.length; j++) {
//                 if (my_array[i] == my_array[j]) {
//                     System.out.println(my_array[i]);
//                     break;
//                 }
//             }
//         }