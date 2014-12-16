package io.cyb3rwarri0r8.invinciblehamster.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import io.cyb3rwarri0r8.invinciblehamster.IHProxy;
import io.cyb3rwarri0r8.invinciblehamster.entities.EntityInvincibleHamster;
import io.cyb3rwarri0r8.invinciblehamster.client.rendering.RenderInvincibleHamster;

public class ClientProxy implements IHProxy
{
    @Override
    public void registerRenderers()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityInvincibleHamster.class, new RenderInvincibleHamster());
    }
}
