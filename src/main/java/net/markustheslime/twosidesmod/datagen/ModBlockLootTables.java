package net.markustheslime.twosidesmod.datagen;

import net.markustheslime.twosidesmod.block.ModBlocks;
import net.markustheslime.twosidesmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.DM_Block.get());

        add(ModBlocks.DM_Ore.get(),
                (block) -> createOreDrop(ModBlocks.DM_Ore.get(), ModItems.Raw_DM_Ore.get()));
        add(ModBlocks.Deepslate_DM_Ore.get(),
                (block) -> createOreDrop(ModBlocks.Deepslate_DM_Ore.get(), ModItems.Raw_DM_Ore.get()));
        add(ModBlocks.End_DM_Ore.get(),
                (block) -> createOreDrop(ModBlocks.End_DM_Ore.get(), ModItems.Raw_DM_Ore.get()));
        add(ModBlocks.Nether_DM_Ore.get(),
                (block) -> createOreDrop(ModBlocks.Nether_DM_Ore.get(), ModItems.Raw_DM_Ore.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
