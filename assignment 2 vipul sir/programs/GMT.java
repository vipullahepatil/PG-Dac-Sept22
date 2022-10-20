import java.util.Scanner;
public class GMT {

    public static void main(String[] Strings) 
	{

        Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        //long timeZoneChange = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();

        System.out.println(totalMilliseconds);
	}
}