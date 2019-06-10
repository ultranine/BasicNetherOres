package com.cscot.basicnetherores.util.handler;

import com.google.gson.JsonObject;
import net.minecraft.util.JSONUtils;
import net.minecraftforge.common.crafting.IConditionSerializer;


import java.util.function.BooleanSupplier;

public class RecipeHandler implements IConditionSerializer
{
    @Override
    public BooleanSupplier parse(JsonObject json)
    {
        boolean value = JSONUtils.getBoolean(json , "value", true);
        return () -> ConfigHandler.NuggetsIngotsBlocks.registerIngots.get() == value;
    }

}
