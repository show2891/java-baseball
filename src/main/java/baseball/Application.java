package baseball;
import java.util.Scanner;

public class Application {
    static String getThreeNumberByUser() {
        System.out.print("숫자를 입력해주세요 : ");
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        return userInput;
    }

    static Integer getRetryNumberByUser() {
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
        Scanner input = new Scanner(System.in);
        Integer userInput = input.nextInt();
        return userInput;
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현
            while (true) {
                System.out.print("숫자 야구 게임을 시작합니다.\n");
                String userThreeNumber = getThreeNumberByUser();


                Integer userRetryNumber = getRetryNumberByUser();
                if (userRetryNumber == 1) {
                    continue;
                } else if (userRetryNumber == 2) {
                    break;
                }

        }
    }
}
