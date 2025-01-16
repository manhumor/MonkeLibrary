package ua.manhumor

import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.interactions.IntegrationType
import net.dv8tion.jda.api.interactions.InteractionContextType
import net.dv8tion.jda.api.interactions.commands.Command
import net.dv8tion.jda.api.interactions.commands.OptionType
import net.dv8tion.jda.api.interactions.commands.build.Commands
import net.dv8tion.jda.api.interactions.commands.build.OptionData
import org.slf4j.LoggerFactory

fun main() {
    val logger = LoggerFactory.getLogger("Main")

    val jda = JDABuilder.createDefault("HERE_TOKEN")
        .addEventListeners(Listener(logger))
        .build()

    val commands = jda.updateCommands();
    commands.addCommands(

    )

    commands.addCommands(
        Commands.slash("info", "Information about this bot")
            .setContexts(InteractionContextType.ALL)
            .setIntegrationTypes(IntegrationType.ALL),
        Commands.slash("vutuv", "GIF's with Vutuv")
            .setContexts(InteractionContextType.ALL)
            .setIntegrationTypes(IntegrationType.ALL)
            .addOptions(
                OptionData(OptionType.STRING, "gif", "Choose the GIF")
                    .addChoices(
                        listOf(
                            Command.Choice("Thinking", "Thinking"),
                            Command.Choice("Displeased", "Displeased"),
                            Command.Choice("When his govnocode not works", "GCNW"),
                            Command.Choice("Chasing a banana", "CAB"),
                            Command.Choice("Spinning", "Spinning"),
                            Command.Choice("Games", "Games"),
                            Command.Choice("Schizophrenia", "Schizophrenia")
                        )
                    )
            ),
        Commands.slash("bobobo", "GIF's with Bobobo")
            .setContexts(InteractionContextType.ALL)
            .setIntegrationTypes(IntegrationType.ALL)
            .addOptions(
                OptionData(OptionType.STRING, "gif", "Choose the GIF")
                    .addChoices(
                        listOf(
                            Command.Choice("So fucked up", "SFU"),
                            Command.Choice("When website was dropped", "WWWD"),
                            Command.Choice("Works", "Works"),
                            Command.Choice("When no matrix update.", "WNMU")
                        )
                    )
            ),
        Commands.slash("man_humor", "GIF's with man_humor")
            .setContexts(InteractionContextType.ALL)
            .setIntegrationTypes(IntegrationType.ALL)
            .addOptions(
                OptionData(OptionType.STRING, "gif", "Choose the GIF")
                    .addChoices(
                        listOf(
                            Command.Choice("Being told where he took a shit", "BTWHTS"),
                            Command.Choice("Thinking of something to shit in the chat", "TOSTSITC"),
                            Command.Choice("Hyperactive", "Hyperactive"),
                            Command.Choice("Beats shit code for workability", "BSCFW"),
                            Command.Choice("Earned from shit code", "EFSC"),
                            Command.Choice("So fucked up", "SFU")
                        )
                    )
            ),
        Commands.slash("overwrite", "GIF's with Overwrite")
            .setContexts(InteractionContextType.ALL)
            .setIntegrationTypes(IntegrationType.ALL)
            .addOptions(
                OptionData(OptionType.STRING, "gif", "Choose the GIF")
                    .addChoices(
                        listOf(
                            Command.Choice("Confession", "Confession"),
                            Command.Choice("Realized he was a monkey", "RHWAM"),
                            Command.Choice("Beats shit code for workability", "BSCFW"),
                            Command.Choice("Trying to escape from the military recruitment office", "TTEFTMRO"),
                            Command.Choice("Thinks about why he is himself", "TWHH")
                        )
                    )
            ),
        Commands.slash("graphicscard", "GIF's with 1050ti")
            .setContexts(InteractionContextType.ALL)
            .setIntegrationTypes(IntegrationType.ALL)
            .addOptions(
                OptionData(OptionType.STRING, "gif", "Choose the GIF")
                    .addChoices(
                        listOf(
                            Command.Choice("Chasing a banana", "CAB"),
                            Command.Choice("Being optimized", "BOptimized"),
                            Command.Choice("So fucked up", "SFU"),
                            Command.Choice("Got a deportation order", "GODO"),
                            Command.Choice("Produced a mess of garbage code", "PAMOGC")
                        )
                    )
            )
    )
    commands.queue()
}