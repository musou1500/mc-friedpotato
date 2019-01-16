package net.musou1500.firstmod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = FirstMod.MOD_ID, name = FirstMod.MOD_NAME, version = FirstMod.MOD_VERSION)
@Mod.EventBusSubscriber
public class FirstMod {
    public static final String MOD_ID = "firstmod";
    public static final String MOD_NAME = "first mod";
    public static final String MOD_VERSION = "0.0.1";

    @GameRegistry.ObjectHolder("firstmod:friedpotato")
    public static final Item friedPotato = null;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new FriedPotato());
    }

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        GameRegistry.addShapedRecipe(
                friedPotato.getRegistryName(),
                friedPotato.getRegistryName(),
                new ItemStack(friedPotato, 8),
                "   ",
                " P ",
                "   ",
                'P', Items.POTATO);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(friedPotato, 0, new ModelResourceLocation(friedPotato.getRegistryName(), "inventory"));
    }

}
