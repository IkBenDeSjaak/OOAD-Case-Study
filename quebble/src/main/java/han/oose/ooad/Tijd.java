package han.oose.ooad;

import java.time.Duration;
import java.time.LocalDateTime;

public class Tijd {
    private LocalDateTime tijdstip;

    public Tijd() {
        this.tijdstip = LocalDateTime.now();
    }

    int getDurationInSeconds(Tijd tijd) {
        Duration speeltijd = Duration.between(tijd.tijdstip, tijdstip);

        int speeltijdInSecondes = (int) speeltijd.getSeconds();

        return speeltijdInSecondes;
    }
}
