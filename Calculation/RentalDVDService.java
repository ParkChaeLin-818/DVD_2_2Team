package Calculation;

/**
 * 렌털DVD가계에서 DVD를 빌릴 때 고객의 나이와 빌리려고 하는 dvd가 
 * 구작품인지 아닌지에 다한 정보를 입력받아 할인요금을 계산하는 프로그램이다.
 * 
 * @author (2017605038스피겔 크릴 2018243144노무라 타카미치 2018315054 호즈미요시아키)
 * @version (2020/06/10)
 */
public class RentalDVDService
{
    /*
     * 나이 18세이하는 10%할인이고 65세이상은 20%할인하고 구작은 반액으로 하는 메소드 
     * 2가지 이상의 할인적용조건이 중복되는 경우는 할인율이 높은 조건을 우선함.
     * 가격(dvdPrice)은 기본으로 1000으로 설정되어 있다.  
     */
    public double discountCalculation(int age, boolean isOldMovie){
        double dvdPrice = 1000;    
        if (isOldMovie){
            dvdPrice = 1000 / 2;
                }
        else if( age >= 65){
            dvdPrice = 1000 * 0.8;
        }
        else if( age <= 18){
            dvdPrice = 1000 * 0.9;
        }
        return dvdPrice;
    }
}