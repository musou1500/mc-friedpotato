package net.musou1500.firstmod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FriedPotato extends ItemFood {
    public FriedPotato() {
        super(30, 30, false);
        setCreativeTab(CreativeTabs.FOOD);
        setUnlocalizedName("FriedPotato");
        setMaxStackSize(64);
        setAlwaysEdible();
        setRegistryName("friedpotato");
    }

}
