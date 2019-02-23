package com.pulsebeat_02.kingmammoth.proxy;

import com.pulsebeat_02.kingmammoth.King_Mammoth;
import com.pulsebeat_02.kingmammoth.init.ModBlocks;
import com.pulsebeat_02.kingmammoth.plot.GUIs.GuiHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.IGuiHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ClientProxy extends CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {

        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));

    }

    //GameRegistry.registerTileEntity(TileEntityKingMammoth.class, "tileKingMammoth");
    //ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKingMammoth.class, new RenderTileEntityKingMammoth());

    public void init() {

        NetworkRegistry.INSTANCE.registerGuiHandler(King_Mammoth.instance, (IGuiHandler) new GuiHandler());

    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        super.preInit(event);


    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        com.pulsebeat_02.kingmammoth.init.ModItems.initClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());

        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

        super.init(event);

        //ModBlocks.registerBlocks();

    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event) {

        super.postInit(event);


    }

}