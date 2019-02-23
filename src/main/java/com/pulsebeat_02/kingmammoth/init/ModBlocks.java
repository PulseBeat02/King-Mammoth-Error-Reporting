package com.pulsebeat_02.kingmammoth.init;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;
import com.pulsebeat_02.kingmammoth.King_Mammoth;
import com.pulsebeat_02.kingmammoth.blocks.Gold_Mammoth.Gold_Mammoth;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {

	public static Gold_Mammoth Gold_Mammoth;
	
	@Mod.EventBusSubscriber(modid = King_Mammoth.MOD_ID)
	public static class RegistrationHandler {
		
		public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();
		
		@SubscribeEvent
		public static void registerBlocks(final RegistryEvent.Register<Block> event) {
			
			final IForgeRegistry<Block> registry = event.getRegistry();

			final Block[] blocks = {
					
					Gold_Mammoth,
					
				};
			
				registry.registerAll(blocks);
			}
		
		@SubscribeEvent
		public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
			
			final ItemBlock[] items = {
					
				new ItemBlock(Gold_Mammoth),
					
			};
			
			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final ItemBlock item : items) {
				
					final Block block = item.getBlock();
					final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
					registry.register(item.setRegistryName(registryName));
					ITEM_BLOCKS.add(item);
					
				}
			
			}
			
		}
	
	


{
		
		/*
	
	public static void init() {

	    // Store resource location since we need it twice.
	    ResourceLocation location = new ResourceLocation(King_Mammoth.MOD_ID, Block_Names.King_Mammoth);
	    // Initialize the block and store the reference.
	    Gold_Mammoth = new Gold_Mammoth();
	    // Setting the registry name is how Forge tells blocks apart.
	    Gold_Mammoth.setRegistryName(location);
	    // Register the block. But we also need to...
	    GameRegistry.register(Gold_Mammoth);
	    // ...register an ItemBlock for the block as well!. An ItemBlock is an Item that represents a Block. When you mine a
	    // block and pick it up, you are actually getting an ItemBlock in your inventory. We are using the basic vanilla
	    // ItemBlock, but you could create your own if necessary.
	    GameRegistry.register(new ItemBlock(Gold_Mammoth), location);
	  }


	   * Here we should call the addRecipes method for all blocks that have one. Should be called during the init phase.

	  public static void initRecipes() {

	  }


	   The client-side initializer. Here we handle model registration. Don't forget the @SideOnly annotation! This should
	   be called during init.

	  @SideOnly(Side.CLIENT)
	  public static void initClient(ItemModelMesher mesher) {

	    // We can only register models for Items, so get the item for the block. Maybe you could save a reference to the
	    // ItemBlock in init? I haven't tried it, but we likely wouldn't use it anywhere else, so it's not worth doing.
	    Item item = Item.getItemFromBlock(Gold_Mammoth);
	    // Everything past this point is identical to registering models for items.
	    ModelResourceLocation model = new ModelResourceLocation(
	        King_Mammoth.RESOURCE_PREFIX + Block_Names.King_Mammoth, "inventory");
	    ModelLoader.registerItemVariants(item, model);
	    mesher.register(item, 0, model);
	  }
	  
	  */ // 1.11 Only
	  
	  
	
		}






	}
	



