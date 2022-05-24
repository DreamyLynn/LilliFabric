package net.amelynn.lilli;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;





public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("lilli");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("  .---.    .-./`)   .---.     .---.    .-./`)  \n" +
				"  | ,_|    \\ .-.')  | ,_|     | ,_|    \\ .-.') \n" +
				",-./  )    / `-' \\,-./  )   ,-./  )    / `-' \\ \n" +
				"\\  '_ '`)   `-'`\"`\\  '_ '`) \\  '_ '`)   `-'`\"` \n" +
				" > (_)  )   .---.  > (_)  )  > (_)  )   .---.  \n" +
				"(  .  .-'   |   | (  .  .-' (  .  .-'   |   |  \n" +
				" `-'`-'|___ |   |  `-'`-'|___`-'`-'|___ |   |  \n" +
				"  |        \\|   |   |        \\|        \\|   |  \n" +
				"  `--------`'---'   `--------``--------`'---' ");
	}
}
