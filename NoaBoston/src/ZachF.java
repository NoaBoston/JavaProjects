import java.util.ArrayList;
public class ZachF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int chipPulled=0, chipCount, y=0, chipSum=0;
		ArrayList bag = new ArrayList();
		for(int x=0;x<1000;x++)
		{
			bag.add(x);
		}
		chipCount=(int) bag.get(y);
		while(chipCount != 159)
		{
			chipCount=(int) bag.get(y++);
			chipSum=chipSum+chipCount;
			chipPulled=chipPulled++;
			y=y++;
		}
		System.out.println("Chip 159 was found");
		System.out.println(chipPulled + " is the number of guesses it took to find chip 159");
		
	}

}
