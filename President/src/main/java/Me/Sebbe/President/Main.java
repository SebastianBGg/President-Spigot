package Me.Sebbe.President;

import org.bukkit.plugin.java.JavaPlugin;

import Me.Sebbe.President.Commands.CheckCommand;
import Me.Sebbe.President.Commands.PresidentCommand;

public class Main extends JavaPlugin{
    private PresidentCommand presidentCommand;
    private CheckCommand checkCommand;

    public void onEnable() {
        presidentCommand = new PresidentCommand();
        checkCommand = new CheckCommand(presidentCommand);
        getCommand("president").setExecutor(presidentCommand);
        getCommand("election").setExecutor(checkCommand);
    }
}