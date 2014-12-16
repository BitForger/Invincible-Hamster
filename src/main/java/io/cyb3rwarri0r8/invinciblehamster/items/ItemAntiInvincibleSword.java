package io.cyb3rwarri0r8.invinciblehamster.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Invincible Hamster - A Minecraft Modification
 * Copyright (C) 2014 Cyb3rWarri0r8
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class ItemAntiInvincibleSword extends ItemSword {
    public ItemAntiInvincibleSword()
    {
        super(ToolMaterial.IRON);
        setUnlocalizedName("antiInvincibleSword");
        setCreativeTab(CreativeTabs.tabCombat);
    }


}
