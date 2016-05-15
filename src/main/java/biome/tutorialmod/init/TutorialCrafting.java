package biome.tutorialmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry; 

public class TutorialCrafting {
	
	public static void init(){
		GameRegistry.addRecipe(new ItemStack(CustomBlocks.ruby_block), new Object[] {"###", "###", "###", '#', TutorialItems.ruby_item});
		GameRegistry.addShapelessRecipe(new ItemStack(TutorialItems.ruby_item,9), new Object[] {CustomBlocks.ruby_block});
		GameRegistry.addRecipe(new ItemStack(TutorialItems.tutorial_pickaxe), new Object[] {"###", " @ ", " @ ", '#', TutorialItems.ruby_item, '@', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TutorialItems.cobalt_pickaxe), new Object[] {"###", " @ ", " @ ", '#', TutorialItems.cobalt_ingot, '@', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TutorialItems.cobalt_axe), new Object[] {"## ", "#@ ", " @ ", '#', TutorialItems.cobalt_ingot, '@', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TutorialItems.cobalt_axe), new Object[] {" ##", " @#", " @ ", '#', TutorialItems.cobalt_ingot, '@', Items.stick});
		GameRegistry.addRecipe(new ItemStack(TutorialItems.cobalt_shovel), new Object[] {" # ", " @ ", " @ ", '#', TutorialItems.cobalt_ingot, '@', Items.stick});
		
		



	}

	

}
