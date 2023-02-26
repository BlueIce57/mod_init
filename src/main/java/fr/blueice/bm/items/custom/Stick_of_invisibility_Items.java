package fr.blueice.bm.items.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Stick_of_invisibility_Items extends Item {

    public Stick_of_invisibility_Items(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200));
        player.getCooldowns().addCooldown(this, 600);

        return super.use(level, player, hand);
    }
}
