package me.abstention.flightplease;

import me.abstention.flightplease.commands.FlightCommand;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class FlightPlease extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println(ChatColor.GREEN + "FlightPlease has been ENABLED!");
        Objects.requireNonNull(getCommand("fly")).setExecutor(new FlightCommand());
        getConfig().options().copyDefaults();
        saveDefaultConfig();
    }}
