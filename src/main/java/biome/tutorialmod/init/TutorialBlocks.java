package biome.tutorialmod.init;

import biome.tutorialmod.init.blocks.CustomOre;
import biome.tutorialmod.init.blocks.RubyBlock;
import biome.tutorialmod.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutorialBlocks {
	
	public static RubyBlock ruby_block;
	public static CustomOre	ruby_ore;
	public static CustomLog lemon_log;
	
	public static void init()
	{
		ruby_block = new RubyBlock();
		ruby_block.setUnlocalizedName("ruby_block");
		ruby_block.setCreativeTab(CreativeTabs.tabTools);
		
		
		
		
		
	}
	
	public static void registerRenders()
	{
		registerRender(ruby_block);
		registerRender(ruby_ore);
	}
	
	public static void registerRender(Block block)
	{
		
		Item item = Item.getItemFromBlock(block);
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

	}
}
