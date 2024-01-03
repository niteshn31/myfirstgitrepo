package inheritance;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		// Create an ArrayList object
		ArrayList<Integer> arrayList = new ArrayList<>();

		// Get the Class object for ArrayList
		Class<?> arrayListClass = arrayList.getClass();

		// Get all methods (including inherited ones) of the ArrayList class
		Method[] methods = arrayListClass.getMethods();

		// Display selected methods
		System.out.println("Selected Methods in ArrayList class:");

		for (Method method : methods) {
			String methodName = method.getName();

			if (methodName.startsWith("get") || methodName.startsWith("set") || methodName.startsWith("remove")
					|| methodName.equals("clear") || methodName.equals("sort")) {
				System.out.println(methodName);
			}
		}
	}
}
