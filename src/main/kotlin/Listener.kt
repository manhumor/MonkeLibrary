package ua.manhumor

import net.dv8tion.jda.api.EmbedBuilder
import net.dv8tion.jda.api.entities.MessageEmbed
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.interactions.components.buttons.Button
import org.slf4j.Logger
import java.awt.Color

class Listener(
    private val logger: Logger,
    private val manager: GifManager = GifManager(),
    private val embed: MessageEmbed = EmbedBuilder()
        .setTitle("MonkeLibrary bot")
        .setColor(Color.decode("#369F4D"))
        .build()
) : ListenerAdapter() {



    override fun onSlashCommandInteraction(e: SlashCommandInteractionEvent) {
        this.logger.info("INTERACTION: USER ${e.user.name} USE COMMAND ${e.name}")
        when (e.name) {
            "info" -> {
                e.replyEmbeds(this.embed)
                    .addActionRow(
                        Button.link("https://github.com/manhumor/MonkeLibrary", "Github"),
                        Button.link("https://discord.gg/jXekNtN6pz", "Discord"),
                        Button.link("https://discord.com/oauth2/authorize?client_id=1329204808833306706", "Add")
                    ).queue()
            }
            "vutuv" -> {
                val option = e.getOption("gif")?.asString
                if (option == null) {
                    e.replyFiles(manager.getValue(Users.VUTUV)).queue()
                    return
                }

                e.replyFiles(manager.getValue(option, Users.VUTUV)).queue()
            }
            "bobobo" -> {
                val option = e.getOption("gif")?.asString
                if (option == null) {
                    e.replyFiles(manager.getValue(Users.BOBOBO)).queue()
                    return
                }

                e.replyFiles(manager.getValue(option, Users.BOBOBO)).queue()
            }
            "man_humor" -> {
                val option = e.getOption("gif")?.asString
                if (option == null) {
                    e.replyFiles(manager.getValue(Users.MAN_HUMOR)).queue()
                    return
                }

                e.replyFiles(manager.getValue(option, Users.MAN_HUMOR)).queue()
            }
            "overwrite" -> {
                val option = e.getOption("gif")?.asString
                if (option == null) {
                    e.replyFiles(manager.getValue(Users.OVERWRITE)).queue()
                    return
                }

                e.replyFiles(manager.getValue(option, Users.OVERWRITE)).queue()
            }
            "graphicscard" -> {
                val option = e.getOption("gif")?.asString
                if (option == null) {
                    e.replyFiles(manager.getValue(Users.GRAPHICSCARD)).queue()
                    return
                }

                e.replyFiles(manager.getValue(option, Users.GRAPHICSCARD)).queue()
            }
            else -> e.reply("Bad arguments.").queue()
        }
    }
}