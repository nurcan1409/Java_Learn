package j22_DateTime;

import java.time.Duration;
import java.time.LocalTime;

public class C06_Duration {
    public static void main(String[] args) {


        LocalTime gece=LocalTime.of(0,17);
LocalTime oglen=LocalTime.of(13,30);
        Duration fark=Duration.between(gece,oglen);// ogle zamnaı ıle gece zamanı arasındakı zaman farkı atanır
        System.out.println("fark = " + fark);

        System.out.println("fark.getSeconds() = " + fark.getSeconds());// fark bılgısındekı sanıye datası alındı
        System.out.println("fark.getNano() = " + fark.getNano());
        System.out.println("fark.toHours() = " + fark.toHours());
        System.out.println("fark.toMinutes() = " + fark.toMinutes());// fark bılgısı dakıkaya cevrıldı
        System.out.println("fark.toMillis() = " + fark.toMillis());

    }
}
