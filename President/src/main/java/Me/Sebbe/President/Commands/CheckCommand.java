package Me.Sebbe.President.Commands;

import java.util.ArrayList;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CheckCommand implements CommandExecutor {
    private PresidentCommand presidentCommand;

    public CheckCommand(PresidentCommand presidentCommand) {
        this.presidentCommand = presidentCommand;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        ArrayList<Player> election = presidentCommand.election;
        String[] playerNames = new String[election.size()];
        for (int i = 0; i < election.size(); i++) {
            playerNames[i] = election.get(i).getName();
        }
        String message = String.join(", ", playerNames);
        if (command.getName().equalsIgnoreCase("election")) {
            sender.sendMessage(message);
        }
        return true;
    }
}

