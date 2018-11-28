
public class Assignment7 {

	public static void main(String[] args) {
		Product vino = new Product("ABC123", "Bottle red wine", 1.99, 200);
		Product pivo = new Product("DFG456", "Bottle IPA", 2.76, 500);
		Product scotch = new Product("YHJ967", "Jack Daniels", 10.98, 700);
		
		
		System.out.println(vino.getCode());
		System.out.println(vino.getDescription());
		System.out.println(vino.getPrice());
		System.out.println(vino.getCount());
		
		System.out.println(pivo.getCode());
		System.out.println(pivo.getDescription());
		System.out.println(pivo.getPrice());
		System.out.println(pivo.getCount());
		
		System.out.println(scotch.getCode());
		System.out.println(scotch.getDescription());
		System.out.println(scotch.getPrice());
		System.out.println(scotch.getCount());
		
		vino.setCode("DEF456");
		vino.setDescription("CASE of red wine!");
		vino.setPrice(0.99);
		vino.setCount(1000);
		
		
		pivo.setCode("BJH567");
		pivo.setDescription("Box of the IPA");
		pivo.setPrice(2.34);
		pivo.setCount(596);
		
		scotch.setCode("HLD726");
		scotch.setDescription("Box of Scotch");
		scotch.setPrice(12.67);
		scotch.setCount(876);
		
		System.out.println(vino.getCode());
		System.out.println(vino.getDescription());
		System.out.println(vino.getPrice());
		System.out.println(vino.getCount());
		
		System.out.println(pivo.getCode());
		System.out.println(pivo.getDescription());
		System.out.println(pivo.getPrice());
		System.out.println(pivo.getCount());
		
		System.out.println(scotch.getCode());
		System.out.println(scotch.getDescription());
		System.out.println(scotch.getPrice());
		System.out.println(scotch.getCount());
		
		System.out.println("Formatted price: " + vino.getPriceFormatted());
		System.out.println(vino.toString());
		
		System.out.println("Formatted price: " + pivo.getPriceFormatted());
		System.out.println(pivo.toString());
		
		System.out.println("Formatted price: " + scotch.getPriceFormatted());
		System.out.println(scotch.toString());
	}

}