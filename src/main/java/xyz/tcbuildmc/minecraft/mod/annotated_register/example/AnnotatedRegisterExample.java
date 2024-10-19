package xyz.tcbuildmc.minecraft.mod.annotated_register.example;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import xyz.tcbuildmc.minecraft.mod.annotated_register.AnnotatedRegisterMod;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.block.Composting;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.block.Flammable;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.item.Fuel;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.item.Group;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.vanilla.Register;
import xyz.tcbuildmc.minecraft.mod.annotated_register.annotation.ModId;

@ModId(AnnotatedRegisterMod.MOD_ID)
public class AnnotatedRegisterExample {
    @Register(id = "example_group", type = "item_group")
    public static final ItemGroup EXAMPLE_GROUP = FabricItemGroup.builder()
            .displayName(Text.literal("Test"))
            .icon(() -> new ItemStack(Items.CRAFTING_TABLE))
            .build();

    @Register(id = "example_block", type = "block")
    @Flammable(burn = 5, spread = 3)
    public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.create());

    @Register(id = "example_item", type = "item")
    @Fuel(1145)
    @Composting(0.8f)
    @Group("example_group")
    public static final Item EXAMPLE_ITEM = new BlockItem(EXAMPLE_BLOCK, new FabricItemSettings());
}
