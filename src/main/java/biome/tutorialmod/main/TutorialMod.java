package biome.tutorialmod.main;

import org.apache.logging.log4j.Logger;

import biome.tutorialmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TutorialMod {
	
	
	
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@Instance
	public static TutorialMod instance;
	
	public static Logger logger;
	
	@EventHandler	
	public void preInit(FMLPreInitializationEvent event){
		logger = event.getModLog();
		proxy.preInit(event);
		
		
		
		//Inits
	}
	@EventHandler	
	public void init(FMLInitializationEvent event){
		proxy.init(event);
		
		
		//RegistersRenders
	}
	@EventHandler	
	public void postInit(FMLPostInitializationEvent event){
		proxy.postInit(event);
	}
}
