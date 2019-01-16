package fr.wind_blade.b;

import fr.wind_blade.b.common.Common;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod.EventBusSubscriber
@Mod(modid = B.MODID, name = B.NAME, version = B.VERSION, acceptedMinecraftVersions = "[1.12.2]")
public class B {
	
    public static final String MODID = "b";
    public static final String NAME = "b";
    public static final String VERSION = "0.1";
    
	@Instance(B.MODID)
	public static B instance;
	
	@SidedProxy(clientSide = "fr.wind_blade.b.client.Client", serverSide = "fr.wind_blade.b.server.Server")
	public static Common proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
    
	@EventHandler
	public void onServerStart(FMLServerStartingEvent event){
		
	}
}
