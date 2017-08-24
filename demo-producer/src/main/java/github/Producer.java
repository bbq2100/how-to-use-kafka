package github.qabbasi;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;

import java.util.Random;

@EnableBinding(Source.class)
public class Producer {

    @InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay = "1000", maxMessagesPerPoll = "1"))
    public String message() {
        return "Hello earthling " + new Random().nextInt(100);
    }

}
