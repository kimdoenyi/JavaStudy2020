package assignment;

public class Test05 {

	public static void main(String[] args) {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				for(int l=1; l<=6; l++) {
					if(i*j*l % 3 == 0)
						System.out.println(i+"*"+j+"*"+l+"="+i*j*l);
				}
			}
		}
	}

}
