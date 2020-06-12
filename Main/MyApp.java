package Main;
import Calculation.*;
import java.util.Scanner;
/**
 * 여기에 MyApp 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class MyApp
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isOldMovie = true;
        System.out.println("구작인 가요?");
        int age = 0;
        System.out.print("나이를 입력하세요 : ");
        age = sc.nextInt();
        RentalDVDService R = new RentalDVDService();
        R.discountCalculation(age, isOldMovie);
    }
} 
