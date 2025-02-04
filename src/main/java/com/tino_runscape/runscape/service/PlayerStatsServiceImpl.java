package com.tino_runscape.runscape.service;

import com.tino_runscape.runscape.model.PlayerStats;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class PlayerStatsServiceImpl implements PlayerStatsService {

    private static final String API_URL = "https://secure.runescape.com/m=hiscore_oldschool/index_lite.json?player=";

    private final WebClient webClient;

    public PlayerStatsServiceImpl(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(API_URL).build();
    }

    @Override
    public Mono<PlayerStats> getPlayerStats(String username) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder.path(API_URL + username).build())
                .retrieve()
                .bodyToMono(PlayerStats.class)
                .onErrorResume(e -> {
                    e.printStackTrace();
                    return Mono.empty();  // Return an empty Mono in case of an error
                });
    }
}
