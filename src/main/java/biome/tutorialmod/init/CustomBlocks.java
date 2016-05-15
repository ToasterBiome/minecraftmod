package biome.tutorialmod.init;

import biome.tutorialmod.init.blocks.BasicBlock;
import biome.tutorialmod.init.blocks.CustomOre;
import biome.tutorialmod.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class CustomBlocks {
	
	public static Block tutorial_block;
	public static Block ruby_ore;
	public static Block ruby_block;
	public static Block lemon_log;
	public static Block lemon_sapling;

	
	public static void createBlocks() {
		GameRegistry.registerBlock(tutorial_block = new BasicBlock("tutorial_block").setLightLevel(1.0f), "tutorial_block");
		GameRegistry.registerBlock(ruby_ore = new CustomOre("ruby_ore", Material.rock, TutorialItems.ruby_item, 1, 3));
		GameRegistry.registerBlock(ruby_block = new BasicBlock("ruby_block"), "ruby_block");
		GameRegistry.registerBlock(lemon_log = new CustomLog("lemon_log"), "lemon_log");
		GameRegistry.registerBlock(lemon_sapling = new BasicBlock("lemon_sapling"), "lemon_sapling");
    }
	
	
	
	public static String modid = Reference.MODID;

	public static void registerBlockRenderer() {
	    reg(tutorial_block);
	    reg(ruby_ore);
	    reg(ruby_block);
	    reg(lemon_log);
	    reg(lemon_sapling);
	}

	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MODID + ":" + Item.getItemFromBlock(block).getUnlocalizedName().substring(5), "inventory"));
	}

}
