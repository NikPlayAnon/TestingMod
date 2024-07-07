package net.nikplayanon.testmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nikplayanon.testmod.TestMod;

import java.util.Collection;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("test_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.Coffee.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
//                output.accept(ModItems.Coffee.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
                ModItems.ITEMS.getEntries().forEach(n -> output.accept(n.get()));
            }).build());

        public static void register(IEventBus eventBus){
            CREATIVE_MODE_TABS.register(eventBus);
        }

}
