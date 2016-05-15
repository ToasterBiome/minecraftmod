package biome.tutorialmod.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class CustomShovel extends ItemSpade{

	public CustomShovel(String unlocalizedName, ToolMaterial material) {
	    super(material);
	    this.setUnlocalizedName(unlocalizedName);
	}


	
	

}
