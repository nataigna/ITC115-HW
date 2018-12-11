
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryItem[]items =new LibraryItem [4];
		items[0]=new Book(345, "Harry Potter", "NO", "10th of August", "20th of August", 10.00);
		items[1]=new Magazine(456, "National Geographic", "YES", "28th of April", "16th of May", 5.00);
		items[2]=new CD(245, "Pink", "NO", "19th of February", "8th of March", 12.00);
		items[3]=new DVD(567, "Lincoln lawyer", "YES", "10th of September", "06th of October", 10.00);
		
		for (int i=0; i<4;i++) {
		   System.out.println(items[i]);
		}
	}
}
	

