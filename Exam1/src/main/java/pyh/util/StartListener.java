package pyh.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class StartListener implements ApplicationListener<ContextRefreshedEvent> {

    private final Logger logger = LoggerFactory.getLogger(StartListener.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        logger.info("ContextStart");
    }
}
