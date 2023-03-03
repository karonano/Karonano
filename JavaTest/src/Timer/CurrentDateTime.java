package Timer;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
 
public class CurrentDateTime {
    public static void main(String[] args) {
 
        // 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
        LocalDate now = LocalDate.now();
 
        // 현재 날짜 구하기(USA newyork)
        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        
        // 런던시간
        ZonedDateTime londonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        
        //도쿄 시간
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
 
        // 결과 출력
        System.out.println(now + " 현재 한국시간");      
        System.out.println(nyTime + " 현재 뉴욕시간"); 
        System.out.println(londonTime + " 현재 런던시간");
        System.out.println(tokyoTime + " 현재 도쿄시간");
    }
}