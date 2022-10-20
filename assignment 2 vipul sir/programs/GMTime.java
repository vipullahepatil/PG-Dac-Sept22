import java.util.Scanner;
class GMTime {

    public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input the time zone offset to GMT: ");
        long offsetTZ = input.nextInt();

        long TMS = System.currentTimeMillis();  //1664740858884
		System.out.println("TOTAL MILI SEC:"+TMS);
        long TS = TMS / 1000;  //1664740858  sec

        long CS = TS % 60;  

        long TM = TS / 60;

        long CM = TM % 60;

        long TH = TM / 60;

        long CH = ((TH + offsetTZ) % 24);

        System.out.println("Current time is " + CH + ":" + CM + ":" + CS);
    }
}