package net.akimaybi.shadedarts.item.custom;

import net.akimaybi.shadedarts.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class ArtfulStaff extends Item {
    private static final Map<Block, Block> ARTFUL_MAP =
            Map.of(
                    Blocks.AMETHYST_BLOCK, ModBlocks.SHADE_TILE,
                    ModBlocks.SHADE_TILE, ModBlocks.PURPLE_SHADE_TILE,
                    ModBlocks.PURPLE_SHADE_TILE, ModBlocks.GREEN_SHADE_TILE,
                    ModBlocks.GREEN_SHADE_TILE, ModBlocks.YELLOW_SHADE_TILE,
                    ModBlocks.YELLOW_SHADE_TILE, ModBlocks.RED_SHADE_TILE,
                    ModBlocks.RED_SHADE_TILE, ModBlocks.SHADE_TILE
            );

    public ArtfulStaff(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        if (ARTFUL_MAP.containsKey(clickedBlock)) {
            if (!world.isClient()) {
                world.setBlockState(context.getBlockPos(), ARTFUL_MAP.get(clickedBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));
                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_AMETHYST_CLUSTER_BREAK, SoundCategory.BLOCKS);

            }
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if (Screen.hasAltDown()){
            tooltip.add(Text.translatable("tooltip.shadedarts.artfulstaff_altdown1"));
            tooltip.add(Text.translatable("tooltip.shadedarts.artfulstaff_altdown2"));
        } else {
            tooltip.add(Text.translatable("tooltip.shadedarts.artfulstaff_altup"));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
