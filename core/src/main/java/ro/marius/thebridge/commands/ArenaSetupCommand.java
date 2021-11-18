package ro.marius.thebridge.commands;

import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import ro.marius.thebridge.AbstractCommand;
import ro.marius.thebridge.ISubCommand;

import java.util.List;

public class ArenaSetupCommand implements ISubCommand {


    @Override
    public void onCommand(CommandSender sender, String[] args) {

        if("create".equalsIgnoreCase(args[0])){

        }


    }

    @Override
    public List<String> tabComplete(@NotNull CommandSender sender, @NotNull String[] args) {
        return null;
    }
}
