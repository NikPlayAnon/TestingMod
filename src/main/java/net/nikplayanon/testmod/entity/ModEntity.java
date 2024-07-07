package net.nikplayanon.testmod.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.nikplayanon.testmod.TestMod;

public class ModEntity {
    public static final DeferredRegister<Block> ENTITYS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, TestMod.MOD_ID);

}
