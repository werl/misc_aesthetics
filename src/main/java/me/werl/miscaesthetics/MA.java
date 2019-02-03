package me.werl.miscaesthetics;


import me.werl.miscaesthetics.misc.Constants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, version = "@VERSION@")
public class MA {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Logger.setLogger(event.getModLog());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

}
