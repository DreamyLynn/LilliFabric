package net.amelynn.lilli;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class Cmd {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register(CommandManager.literal("spawn").executes(Cmd::run));
    }

    private static int run(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        ServerWorld world = context.getSource().getServer().getWorld(ServerWorld.OVERWORLD);
        if (world != null) {
            BlockPos pos = world.getSpawnPos();

            context.getSource().getPlayer().teleport(world, pos.getX(), pos.getY(), pos.getZ(), 0, 0);
            context.getSource().sendFeedback(Text.of(Main.prefix + Text.of("You have been teleported to the world spawn")), true);
        } else {
            context.getSource().sendFeedback(Text.of(Main.prefix + Text.of("No world found")), true);
        }
        return 0;
    }
}
