package fr.blueice.bm.items;

import fr.blueice.bm.betterminecraft;
import fr.blueice.bm.items.custom.Stick_of_invisibility_Items;
import fr.blueice.bm.utils.CustomItemTiers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, betterminecraft.MODID);

    public static final RegistryObject<Item> COPPER_STICK = ITEMS.register("copper_stick", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(CustomItemTiers.COPPER, 2, 3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(CustomItemTiers.AMETHYSM, 2, 3f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    public static final RegistryObject<Item> STICK_OF_INVISIBILITY = ITEMS.register("stick_of_invisibility", () -> new Stick_of_invisibility_Items((new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).setNoRepair().stacksTo(1))));
}
