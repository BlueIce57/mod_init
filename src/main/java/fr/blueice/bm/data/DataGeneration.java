package fr.blueice.bm.data;

import fr.blueice.bm.betterminecraft;
import fr.blueice.bm.data.recipe.RecipeGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = betterminecraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneration {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent e)
    {
        DataGenerator generator = e.getGenerator();

        if (e.includeServer())
            generator.addProvider(true, new RecipeGenerator(generator));
    }
}
