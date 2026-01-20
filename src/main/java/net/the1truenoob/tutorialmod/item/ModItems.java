package net.the1truenoob.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.the1truenoob.tutorialmod.TutorialMod;

public class ModItems {
    // calls for all items in game - says to add the listed items in this mod
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TutorialMod.MODID);

    // registering an item
    public static final DeferredItem<Item> TestItem = ITEMS.register("testitem",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
