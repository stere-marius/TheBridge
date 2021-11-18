package ro.marius.thebridge;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public abstract class AbstractCommand extends BukkitCommand {

    public AbstractCommand(String name) {
        super(name);
    }

    public abstract void onCommand(CommandSender sender, String[] args);

    public abstract List<String> tabComplete(@NotNull CommandSender sender, @NotNull String[] args);

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        this.onCommand(sender, args);
        return false;
    }

    @Override
    public @NotNull List<String> tabComplete(@NotNull CommandSender sender, @NotNull String alias, @NotNull String[] args) throws IllegalArgumentException {
        return tabComplete(sender, args);
    }
}
