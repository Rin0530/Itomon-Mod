package net.rin.itomon.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class ItomonModTab {
    public static CreativeModeTab TAB_ITOMON;

    public static void load() {
        TAB_ITOMON = new CreativeModeTab("tabitomon") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(Items.BEEF);
            }
        };
    }

}
