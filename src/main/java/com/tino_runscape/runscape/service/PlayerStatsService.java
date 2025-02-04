


package com.tino_runscape.runscape.service;

import com.tino_runscape.runscape.model.PlayerStats;
import reactor.core.publisher.Mono;

public interface PlayerStatsService {
    Mono<PlayerStats> getPlayerStats(String username);
}