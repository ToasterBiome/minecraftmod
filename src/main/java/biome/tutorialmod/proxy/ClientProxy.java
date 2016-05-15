package biome.tutorialmod.proxy;

import biome.tutorialmod.init.CustomBlocks;
import biome.tutorialmod.init.TutorialBlocks;
import biome.tutorialmod.init.TutorialCrafting;
import biome.tutorialmod.init.TutorialFood;
import biome.tutorialmod.init.TutorialItems;
import biome.tutorialmod.world.TutorialWorldGen;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy extends CommonProxy{
	

	@Override	
	public void preInit(FMLPreInitializationEvent event){
		super.preInit(event);
		TutorialItems.init();
		CustomBlocks.createBlocks();
		TutorialCrafting.init();
		
		
	}
	@Override	
	public void init(FMLInitializationEvent event){
		super.init(event);
		TutorialItems.registerRenders();
		CustomBlocks.registerBlockRenderer();
		GameRegistry.registerWorldGenerator(new TutorialWorldGen(), 0);
		
	}
	@Override	
	public void postInit(FMLPostInitializationEvent event){
		super.postInit(event);
	}

}

