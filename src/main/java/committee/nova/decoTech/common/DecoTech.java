package committee.nova.decoTech.common;

import committee.nova.decoTech.common.util.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(DecoTech.MODID)
public class DecoTech {
    public static final String MODID = "decotech";
    public static final Logger LOGGER = LogManager.getLogger();

    public DecoTech() {
        RegistryHandler.register();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
