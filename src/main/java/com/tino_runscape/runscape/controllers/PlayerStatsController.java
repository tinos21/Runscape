
//package com.tino_runscape.runscape.controllers;
package com.tino_runscape.runscape.controllers;



import com.tino_runscape.runscape.model.PlayerStats;
import com.tino_runscape.runscape.service.PlayerStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerStatsController {

    private final PlayerStatsService playerStatsService;

    @Autowired
    public PlayerStatsController(PlayerStatsService playerStatsService) {
        this.playerStatsService = playerStatsService;
    }

    @GetMapping("/player-stats")
    public String getPlayerStats(@RequestParam String username, Model model) {
        // Call the service to fetch player stats asynchronously
        PlayerStats playerStats = playerStatsService.getPlayerStats(username).block();  // Block here for simplicity, though it should be async in real use.

        if (playerStats == null) {
            model.addAttribute("error", "No stats found for this username.");
            return "error";  // Returns the error view (error.html)
        }

        // Add the stats to the model for Thymeleaf rendering
        model.addAttribute("playerStats", playerStats);

        return "player-stats";  // Returns the view name, which will be rendered as player-stats.html
    }




}
