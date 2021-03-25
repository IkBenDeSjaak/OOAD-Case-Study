package han.oose.ooad;

import java.time.Duration;
import java.time.LocalDateTime;

public class Tijd {
    private LocalDateTime tijdstip;

    public Tijd() {
        this.tijdstip = LocalDateTime.now();
    }

    Duration getDuration(Tijd tijd) {
        return Duration.between(tijd.tijdstip, tijdstip);
    }
}
