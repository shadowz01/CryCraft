package shadowz01.crycraft.Items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemPlatinumIngot extends Item{

	public ItemPlatinumIngot(int par1) {
		super(par1);
	}
	
	public void registerIcons(IconRegister par1)
	{
		itemIcon = par1.registerIcon("crycraft:platinumingot");
	}

}
