import java.util.*;
public class Guessing_game {

	public static void main(String[] args) {int count=1,f=0,num=0,score=0;
		double rate=0.000;
		Scanner in=new Scanner(System.in);
		System.out.println("*******************************Welcome to Guessing game******************************\n\n");
		System.out.println("Enter the number of rounds");
		int rounds=in.nextInt();
		while(count<=rounds) {
			if(count==1||f==1) {
				num=(int)(Math.random()*(99)+1);
				//System.out.println("Actual Number "+num);
				f=0;
			}
			System.out.println("\nRound no. "+count+"-------------------------------------------------------\nEnter the number of your choice ranging from 1 to 100");
			int ch=in.nextInt();
			if(ch==num) {
				System.out.println("Congratulations!!\t Correct guess.\n");
				f=1;
				count++;
				score++;
			}
			else if(ch<num) {
				System.out.println("Nice try!\tBut the number is greater than "+ch+".\n");
				count++;
			}
			else if(ch>num) {
				System.out.println("Nice try!\tBut the number is lesser than "+ch+".\n");
				count++;
			}
			else {
				System.out.println("Please enter a valid number (1-100).\n");
				count++;
			}
		}
		rate=((double)(score/rounds))*100.000;
		System.out.println("-----------------------------------------------------\nActual numner was "+num+"\n");
		System.out.println("-----------------------------------------------------\nTotal score is "+score);
		System.out.println("\n");
		System.out.println("Thank you!--------------------------------------------\nHave a good day");
	}
}