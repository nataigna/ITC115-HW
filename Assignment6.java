
public class Assignment6 {

	public static void main(String[] args) {
		
		double []list1 = {16.1, 12.3, 22.2, 14.4};
		double []list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};

		isSorted(list1);
		isSorted(list2);
		System.out.println(isSorted(list1));
		System.out.println(isSorted(list2));
	}

	public static boolean isSorted(double[]list) {
		int i=0;
		while (i<list.length-1) {
			if (list[i]> list [i+1])
				return false;
		    i++	;
			
			
		}
		return true;
		
	}
   }
