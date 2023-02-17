package net.markustheslime.twosidesmod.item;

import net.markustheslime.twosidesmod.TwoSidesModUpdated;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TwoSidesModUpdated.MOD_ID);

    //ores
    public static final RegistryObject<Item> DM_Ingot = ITEMS.register("dm_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> Raw_DM_Ore = ITEMS.register("raw_dm",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventbus){
        ITEMS.register(eventbus);
    }
}
