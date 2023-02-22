package net.markustheslime.twosidesmod.datagen;

import net.markustheslime.twosidesmod.TwoSidesModUpdated;
import net.markustheslime.twosidesmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TwoSidesModUpdated.MOD_ID, exFileHelper);
        blockWithItem(ModBlocks.DM_Block);
        blockWithItem(ModBlocks.DM_Ore);
        blockWithItem(ModBlocks.Deepslate_DM_Ore);
        blockWithItem(ModBlocks.End_DM_Ore);
        blockWithItem(ModBlocks.Nether_DM_Ore);
    }

    @Override
    protected void registerStatesAndModels() {

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
