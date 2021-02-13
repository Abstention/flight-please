package me.abstention.flightplease;

import me.abstention.flightplease.commands.FlightCommand;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class FlightPlease extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println(ChatColor.GREEN + "FlightPlease has been ENABLED!");
        getCommand("fly").setExecutor(new FlightCommand());
    }
}