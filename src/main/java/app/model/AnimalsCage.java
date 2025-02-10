package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class AnimalsCage {
    private static final Logger logger = LoggerFactory.getLogger(AnimalsCage.class);

    private final Animal animal;
    private final Timer timer;

    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal, @Qualifier("timer") Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        logger.info("Say: {}", animal);
        logger.info("At: {}", timer.getTime());
        logger.info("________________________");
    }

    public Timer getTimer() {
        return timer;
    }
}
