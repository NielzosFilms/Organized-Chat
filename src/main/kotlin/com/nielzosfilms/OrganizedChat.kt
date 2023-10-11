package com.nielzosfilms

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents
import org.slf4j.LoggerFactory

object OrganizedChat : ModInitializer {
    private val logger = LoggerFactory.getLogger("organized-chat")

    override fun onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.
        logger.info("Hello Fabric world!")

        ServerMessageEvents.CHAT_MESSAGE.register { msg, player, msgType ->
            logger.info("$msg")
        }


    }
}