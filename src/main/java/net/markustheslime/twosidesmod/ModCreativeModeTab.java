package net.markustheslime.twosidesmod;

import net.markustheslime.twosidesmod.block.ModBlocks;
import net.markustheslime.twosidesmod.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TwoSidesModUpdated.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTab {
    public static CreativeModeTab ORES;
    public static CreativeModeTab BLOCKS;

    @SubscribeEvent
    public static void registerCreativeModeTab(CreativeModeTabEvent.Register event) {
        ORES = event.registerCreativeModeTab(new ResourceLocation(TwoSidesModUpdated.MOD_ID, "ores_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.Raw_DM_Ore.get()))
                .title(Component.translatable("creativemodetab.ores_tab")));
        BLOCKS = event.registerCreativeModeTab(new ResourceLocation(TwoSidesModUpdated.MOD_ID, "blocks_tab"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.DM_Block.get()))
                .title(Component.translatable("creativemodetab.blocks_tab")));
    }
}
