package calendar_project;

public class Calendar {

	public static void main(String[] args) {

		System.out.println("Hello, Calendar!");
		System.out.println("일  월  화  수  목  금  토");
		System.out.println("----------------");

		for (int i = 0; i <= 21; i += 7) {
			for (int j = 1; j <= 7; j++) {
				System.out.print(i + j + " ");

			}
			System.out.println();

		}
	}

}
