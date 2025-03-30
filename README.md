# TeleBot

Based on [https://github.com/natanimn/Telebof](https://github.com/natanimn/Telebof)  

All about bots [https://core.telegram.org/bots](https://core.telegram.org/bots)  

From BotFather to 'Hello World' [https://core.telegram.org/bots/tutorial](https://core.telegram.org/bots/tutorial)  

Sending messages [https://core.telegram.org/bots/tutorial#sending-messages](https://core.telegram.org/bots/tutorial#sending-messages)  

```
To send a private text message, you generally need three things:

1. The user must have contacted your bot first.
   (Unless the user sent a join request to a group where your bot is an admin, but that's a more advanced scenario).
2. You must have previously saved the User ID (user.getId())
3. A String object containing the message text, 1-4096 characters.
```

## Create a bot & get your token

```
To get started, message @BotFather on Telegram to register your bot and receive its authentication token.

Obtain Your Bot Token
In this context, a token is a string that authenticates your bot (not your account) on the bot API. Each bot has a unique token which can also be revoked at any time via @BotFather.

Obtaining a token is as simple as contacting @BotFather, issuing the /newbot command and following the steps until you're given a new token. You can find a step-by-step guide here.

Your token will look something like this:

4839574812:AAFD39kkdpWt3ywyRZergyOLMaJhac60qc
```

## Config your token & build

```
# config
# ./src/main/java/dev/bot/App.java#L11
# set your token
static final String TOKEN = "YOUR_BOT_TOKEN_HERE";

# build
mvn install
```

## run & test

```
java -jar target/tele-dev-bot-1.0-SNAPSHOT-jar-with-dependencies.jar
```

message your bot on https://web.telegram.org/k/#@YourBotUsername
