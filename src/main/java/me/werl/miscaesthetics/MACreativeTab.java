package me.werl.miscaesthetics;

import me.werl.miscaesthetics.misc.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MACreativeTab extends CreativeTabs {

    public MACreativeTab() {
        super(Constants.MOD_ID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.EMERALD);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void displayAllRelevantItems(final NonNullList<ItemStack> items) {
        super.displayAllRelevantItems(items);
    }
}