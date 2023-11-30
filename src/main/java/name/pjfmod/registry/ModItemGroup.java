package name.pjfmod.registry;

import name.pjfmod.Pjfmod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup PJFTEST = FabricItemGroup.builder(new Identifier(Pjfmod.MOD_ID,"pjftest"))
            .displayName(Text.translatable("itemgroup.pjfmod.pjftest"))
            .icon(() -> new ItemStack(ModItems.PJFTEST)).build();
    public static void  registerModItemGroup(){
        Pjfmod.LOGGER.debug("Pajang said that Registering mod item group for "+Pjfmod.MOD_ID);
    }
}


























