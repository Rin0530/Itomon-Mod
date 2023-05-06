package net.rin.itomon.init;

import net.minecraftforge.registries.RegistryObject;
import net.rin.itomon.ItomonMod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ItomonModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS,
			ItomonMod.MODID);
	public static final RegistryObject<Item> TUMURISU = REGISTRY.register("tumurisu_spawn_egg",
			() -> new ForgeSpawnEggItem(ItomonModEntities.TUMURISU, -52225, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MIZUMARO = REGISTRY.register("mizumaro_spawn_egg",
			() -> new ForgeSpawnEggItem(ItomonModEntities.MIZUMARO, -16711681, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> POKONOHA = REGISTRY.register("pokonoha_spawn_egg",
			() -> new ForgeSpawnEggItem(ItomonModEntities.POKONOHA, -16738048, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TOROBI = REGISTRY.register("torobi_spawn_egg",
			() -> new ForgeSpawnEggItem(ItomonModEntities.TOROBI, -65485, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> KONSAINU = REGISTRY.register("konsainu_spawn_egg",
			() -> new ForgeSpawnEggItem(ItomonModEntities.KONSAINU, -13395712, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> NYAFUKA = REGISTRY.register("nyafuka_spawn_egg",
			() -> new ForgeSpawnEggItem(ItomonModEntities.NYAFUKA, -6711040, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ELEPIYO = REGISTRY.register("elepiyo_spawn_egg",
			() -> new ForgeSpawnEggItem(ItomonModEntities.ELEPIYO, -256, -1,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
