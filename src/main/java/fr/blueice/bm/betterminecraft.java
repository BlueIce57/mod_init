package fr.blueice.bm;

import fr.blueice.bm.items.ModItems;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.data.Main;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(betterminecraft.MODID)
public class betterminecraft {
    public static final String MODID = "betterminecraft";

    public betterminecraft() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);

    }

    private void setup(FMLCommonSetupEvent e)
    {

    }

    private void clientSetup(FMLClientSetupEvent e)
    {
        ItemProperties.register(ModItems.COPPER_STICK.get(), new ResourceLocation("betterminecraft", "oxydation"), (stack, level, livingEntity, id) -> {
            return stack.getOrCreateTag().getBoolean("oxydation") ? 1.0f : 0.0f;
    });
    }
}