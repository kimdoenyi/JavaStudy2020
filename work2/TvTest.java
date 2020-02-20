package work2;

public class TvTest {

	public static void main(String[] args) {
//		Tv tvArray[] = new Tv[3];
//		
//		Tv ob = new Tv("INFINIA", 15000000, "LED TV");
//		Tv ob1 = new Tv("XCANVAS", 10000000, "LCD TV");
//		Tv ob2 = new Tv("CINEMA", 20000000, "3D TV");
//		
//		tvArray[0] = ob;
//		tvArray[1] = ob1;
//		tvArray[2] = ob2;
//		
//		String max="";
//		String min="";
//		
//		for(int i=0; i<tvArray.length; i++) {
//			System.out.println(tvArray[i]);
//		}
//	
//		if(ob.getPrice() > ob1.getPrice() && ob.getPrice() > ob2.getPrice())
//			max = ob.getName();
//		else if(ob1.getPrice() > ob.getPrice() && ob1.getPrice() > ob2.getPrice())
//			max = ob2.getName();
//		else if(ob2.getPrice() > ob.getPrice() && ob2.getPrice() > ob1.getPrice())
//			max = ob2.getName();
//		
//		if(ob.getPrice() < ob1.getPrice() && ob.getPrice() < ob2.getPrice())
//			min = ob.getName();
//		else if(ob1.getPrice() < ob.getPrice() && ob1.getPrice() < ob2.getPrice())
//			min = ob1.getName();
//		else if(ob2.getPrice() < ob.getPrice() && ob2.getPrice() < ob1.getPrice())
//			min = ob2.getName();
//
//		System.out.println("가격이 가장 비싼 제품 : "+max);
//		System.out.println("가격이 가장 저렴한 제품 : "+min);

		
		Tv tvArray[] = new Tv[3];
		
		Tv ob = new Tv("INFINIA", 15000000, "LED TV");
		Tv ob1 = new Tv("XCANVAS", 10000000, "LCD TV");
		Tv ob2 = new Tv("CINEMA", 20000000, "3D TV");
		
		tvArray[0] = ob;
		tvArray[1] = ob1;
		tvArray[2] = ob2;
		
		for(int i=0; i<tvArray.length; i++) {
			System.out.println(tvArray[i]);
		}
		int max = ob.getPrice();
		int min = ob.getPrice();
		String max1 = "";
		String min1 = "";
		for(int i=0; i<tvArray.length; i++) {
			if(max<tvArray[i].getPrice()) {
				max = tvArray[i].getPrice();
				max1 = tvArray[i].getName();
			}
				
			if(min>tvArray[i].getPrice()) {
				min = tvArray[i].getPrice();
				min1 = tvArray[i].getName();
			}
				
		}
		System.out.println("가격이 가장 비싼 제품 : "+max1);
		System.out.println("가격이 가장 저렴한 제품 : "+min1);
	}

}
