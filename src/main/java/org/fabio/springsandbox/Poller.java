package org.fabio.springsandbox;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class Poller {

    private final CountryService countryService;

    @Scheduled(fixedDelay = 10000)
    public void scheduledTask() {
        var result = countryService.findByCustomParameter("%ra%");
        log.info("Response size: %s".formatted(String.valueOf(result.getContent().size())));
    }
}
