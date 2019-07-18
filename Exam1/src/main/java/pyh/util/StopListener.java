package pyh.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class StopListener implements ApplicationListener<ContextClosedEvent> {

    private final Logger logger = LoggerFactory.getLogger(StopListener.class);

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        logger.info("ContextStop");
    }
}
