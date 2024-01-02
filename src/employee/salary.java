package employee;

import java.util.Random;

public class salary {
	
	public static void main(String[] args) {
		Random random = new Random();
		int randomNum = random.nextInt(2);
		if(randomNum == 1)
			   System.out.println("ispresent");
			else
				System.out.println("isabsent");
	}

}
