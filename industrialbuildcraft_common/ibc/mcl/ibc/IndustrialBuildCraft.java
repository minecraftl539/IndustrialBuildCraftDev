/*  IndustrialBuildCraft
 *  By minecraftl539
 *  This is the first class made in 2013.
 */
 



package ibc.mcl.ibc;

import ibc.mcl.ibc.item.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ibc.mcl.ibc.lib.Reference;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.Mod.Block;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.EventHandler;


@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class IndustrialBuildCraft {
    
    //instance of the mod
    @Instance(value = "IndustrialBuildCraftModID")
    public static IndustrialBuildCraft instance;
    
   @SidedProxy(clientSide="ibc.mcl.ibc.client.ClientProxy", serverSide="ibc.mcl.ibc.CommonProxy")
   public static CommonProxy proxy;
    
   
    @PreInit
    public void PreInit(FMLPreInitializationEvent event) {
        //everything thats loading before all the mods are loading 
        
    }
    @Init
    public void Init(FMLInitializationEvent event) {
        proxy.registerRenderers();
        CreativeTabs TabIBC = new CreativeTabs(CreativeTabs.getNextID(), "IndustrialBuildCraft");
        LanguageRegistry.instance().addStringLocalization("itemGroup.TabMcl" + "TabMcl", "en_US", "TabMcl");
        
    
    
    };
     // everything thats loading while all other mods are loading   
    
    @PostInit
    public void PostInit(FMLPostInitializationEvent event) {
      //everything thats loading after all mods loaded. Here will be the IC2 API loading and the BC API loading.  
    }
}

