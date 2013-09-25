package ibc.mcl.ibc.client.tab;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class TabMcl extends CreativeTabs {
    
    public TabMcl(int id, String name) {
        super(id, name);
    }
    
    @Override
    public int getTabIconItemIndex() {
        return Item.eyeOfEnder.itemID;
        
    }
}
