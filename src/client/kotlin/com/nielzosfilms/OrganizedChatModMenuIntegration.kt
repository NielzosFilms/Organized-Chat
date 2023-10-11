package com.nielzosfilms

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import me.shedaniel.clothconfig2.api.ConfigBuilder
import me.shedaniel.clothconfig2.api.ConfigCategory
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.tooltip.Tooltip
import net.minecraft.client.gui.widget.ButtonWidget
import net.minecraft.text.Text
import org.slf4j.LoggerFactory

class OrganizedChatModMenuIntegration : ModMenuApi {

    private val screenBuilder = ConfigBuilder.create()
        .setTitle(Text.literal("Organized Chat Settings"))

    override fun getModConfigScreenFactory(): ConfigScreenFactory<*> {
        val category = screenBuilder.getOrCreateCategory(Text.literal("Organized Chat"))
        screenBuilder.setFallbackCategory(category)
        return ConfigScreenFactory { parent ->
            screenBuilder.setParentScreen(parent)
            screenBuilder.build()
        }
    }
}