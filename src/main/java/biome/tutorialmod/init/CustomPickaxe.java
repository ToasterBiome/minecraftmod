package biome.tutorialmod.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe{

	public CustomPickaxe(String unlocalizedName, ToolMaterial material) {
	    super(material);
	    this.setUnlocalizedName(unlocalizedName);
	}


	
	

}
