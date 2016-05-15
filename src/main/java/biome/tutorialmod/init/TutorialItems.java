package biome.tutorialmod.init;

import biome.tutorialmod.main.Reference;
import biome.tutorialmod.main.TutorialMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.EnumHelperClient;

public class TutorialItems 
{
	//test items
	public static Item first_item;
	public static Item ruby_item;
	
	//foodstuffs
	public static Item lemons_item; //Lemon
	public static Item juicer;
	public static Item lemonade_bucket; //Lemonade in bucket
	public static Item empty_glass;
	public static Item lemonade_glass; //Lemonade in glass
	public static Item tristan_glass;
	
	//Metals
	public static Item cobalt_ingot;
	//Tool Materials
	public static ToolMaterial TUTORIALMATERIAL;
	public static ToolMaterial cobalt;
	//Tools
	public static Item tutorial_pickaxe;
	
	public static Item cobalt_pickaxe;
	public static Item cobalt_axe;
	public static Item cobalt_shovel;
	
	
	
	public static void init() 
	{
		first_item = registerItem(new Item(), "first_item").setUnlocalizedName("first_item").setCreativeTab(CreativeTabs.tabTools);
		ruby_item = registerItem(new Item(), "ruby_item").setUnlocalizedName("ruby_item").setCreativeTab(CreativeTabs.tabMaterials);
		lemons_item = registerItem(lemons_item = new TutorialFood("lemons_item", 2, 0.2f, false).setAlwaysEdible(), "lemons_item");
		TUTORIALMATERIAL = EnumHelperClient.addToolMaterial("TUTORIALMATERIAL", 3, 1000, 15.0F, 4.0F, 30);
		tutorial_pickaxe = registerItem(new CustomPickaxe("tutorial_pickaxe", TUTORIALMATERIAL), "tutorial_pickaxe");
		juicer = registerItem(new Item(), "juicer").setUnlocalizedName("juicer").setCreativeTab(CreativeTabs.tabTools);
		empty_glass = registerItem(new Item(), "empty_glass").setUnlocalizedName("empty_glass").setCreativeTab(CreativeTabs.tabTools);
		lemonade_glass = registerItem(lemonade_glass = new Drinkables("lemonade_glass", 2, 0.2f, false).setAlwaysEdible(), "lemonade_glass").setMaxStackSize(1);
		tristan_glass = registerItem(tristan_glass = new Drinkables("tristan_glass", 2, 0.2f, false).setAlwaysEdible(), "tristan_glass").setMaxStackSize(1);
		
		//Tools
		
		cobalt = EnumHelperClient.addToolMaterial("cobalt", 4, 1561, 12F, 4.0F, 30);
		cobalt_ingot = registerItem(new Item(), "cobalt_ingot").setUnlocalizedName("cobalt_ingot").setCreativeTab(CreativeTabs.tabMaterials);
		
		
		cobalt_pickaxe = registerItem(new CustomPickaxe("cobalt_pickaxe", cobalt), "cobalt_pickaxe").setCreativeTab(CreativeTabs.tabTools);
		cobalt_axe = registerItem(new CustomAxe("cobalt_axe", cobalt), "cobalt_axe").setCreativeTab(CreativeTabs.tabTools);
		cobalt_shovel = registerItem(new CustomShovel("cobalt_shovel", cobalt), "cobalt_shovel").setCreativeTab(CreativeTabs.tabTools);
		

	}
	
	public static void registerRenders()
	{
		registerRender(first_item);
		registerRender(ruby_item);
		registerRender(lemons_item);
		registerRender(tutorial_pickaxe);
		registerRender(empty_glass);
		registerRender(lemonade_glass);
		registerRender(juicer);
		registerRender(tristan_glass);
		
		//Tools
		registerRender(cobalt_pickaxe);
		registerRender(cobalt_axe);
		registerRender(cobalt_shovel);
		registerRender(cobalt_ingot);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	
	
	//registerItem START\\
	public static Item registerItem(Item item, String name)
	{
		return registerItem(item, name, null);
	}
	
	public static Item registerItem(Item item, String name, CreativeTabs tab)
	{
		GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
		return item;
	}
	
	//registerItem END\\

}
