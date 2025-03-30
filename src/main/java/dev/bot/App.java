package dev.bot;

import io.github.natanimn.BotClient;

/**
 * Hello world!
 *
 */
public class App 
{
  static final String TOKEN = "YOUR_BOT_TOKEN_HERE";

  public static void main(String[] args) {
    final BotClient bot = new BotClient(TOKEN);

    // Listening for /start command
    bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
        context.reply("Welcome!").exec();
    });

    // Listening for any incoming text
    bot.onMessage(filter -> filter.text(), (context, message) -> {
        context.reply(message.text).exec();
    });

    bot.run(); // finally run the bot
  }
}

