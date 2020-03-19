package Lesson_11;

public class Main {

	public static void main(String[] args) {

		MyHashtable table = new MyHashtable();

		table.put("John Smith", "641-712-1111");
		table.put("Navin Paudel", "621-777-8970");
		table.put("Pradip Acharya", "651-713-4444");
		table.put("Bishwash Mishra", "991-714-5555");
		table.put("Gilbert", "561-812-6666");
		table.put("Rock", "561-812-6666");
		table.put("Rock", "561-812-6666");   //Allow duplicate
		table.put("Ram", "761-823-7777");
		table.put("Shyam", "861-712-8888");
		table.put("Rita", "961-635-9999");
		table.put("Gita", "461-786-5555");
		table.put("Babita", "361-982-6666");

				System.out.println("All Datas :\n"+table.toString());
				System.out.println("------------------");
				System.out.println("Total number of entry:"+table.countEntry());
				System.out.println("------------------");
				System.out.println("Total number elements in largest LinkedList:\n"+table.getElementsInLongestLinkedList());
				System.out.println("------------------");
				System.out.println("Total number empty cells in the table:"+table.getNumberOfEmptyCell());
				
				
			}
		}