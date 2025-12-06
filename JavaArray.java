public class JavaArray {
    public class Array {
    public static void main(String[] args) {
		// 1D int array: declaration, initialization, traversal
		int[] nums = {5, 2, 8, 3, 9};
		System.out.println("Original int array: " + java.util.Arrays.toString(nums));

		// Modify an element
		nums[2] = 42;
		System.out.println("After modification: " + java.util.Arrays.toString(nums));

		// Sort the array using Arrays utility
		java.util.Arrays.sort(nums);
		System.out.println("Sorted int array: " + java.util.Arrays.toString(nums));

		// String array example
		String[] fruits = new String[]{"Apple", "Banana", "Cherry"};
		System.out.println("Fruits: " + java.util.Arrays.toString(fruits));

		// Multidimensional array (2D)
		int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		System.out.println("2D matrix:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// Array of objects
		Person[] people = { new Person("Alice", 21), new Person("Bob", 22) };
		System.out.println("People:");
		for (Person p : people) {
			System.out.println("- " + p);
		}

		// Length property
		System.out.println("nums length: " + nums.length);
	}

	// Small helper class used in the object-array example
	static class Person {
		String name;
		int age;

		Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return name + " (" + age + ")";
		}
	}
}
}
