
import java.util.Random;
import java.util.Scanner;
public class New{
	public static void main(String args[]) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("以下から一つ入力してください");
			System.out.println("グー、チョキ、パー");
			String myhands = scanner.nextLine();
			//scanner.close();
			
			Random rand = new Random();
			
			int hands = rand.nextInt(3);
			
			String s = new String();
			
			switch(hands) {
			case 0:
				s = "グー";
				break;
			case 1:
				s = "チョキ";
				break;
			case 2:
				s = "パー";
				break;
			}
			
			System.out.println("あいては" + s);
			
			if (myhands.equals("グー")) {
				switch(hands) {
				case 0:
					System.out.println("あいこ");
					break;
				case 1:
					System.out.println("あなたの勝ち");
					break;
				case 2:
					System.out.println("あなたの負け");
					break;
				default
					:System.out.println("error");
					break;
				}
			}
			else if(myhands.equals("チョキ")) {
				switch(hands) {
				case 0:
					System.out.println("あなたの負け");
					break;
				case 1:
					System.out.println("あいこ");
					break;
				case 2:
					System.out.println("あなたの勝ち");
					break;
				default
					:System.out.println("error");
					break;
			}
		}
			else if(myhands.equals("パー")) {
				switch(hands) {
				case 0:
					System.out.println("あなたの勝ち");
					break;
				case 1:
					System.out.println("あなたの負け");
					break;
				case 2:
					System.out.println("あいこ");
					break;
				default
					:System.out.println("error");
					break;
		}
			}
			else {
				System.out.println("error");
		
		}
			System.out.println("もう一回じゃんけんする？ はい/いいえ");
			String onemore = scanner.nextLine();
			
			if (onemore.equals("はい")){
				System.out.println("もう一回じゃんけんをします");
			}
			else {
				System.out.println("じゃんけんを終了します");
				scanner.close();
				break;
			}
			}
	}
}
