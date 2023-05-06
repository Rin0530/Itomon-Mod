package net.rin.itomon.init;

import net.minecraftforge.fml.common.Mod;
import net.rin.itomon.client.renderer.ElepiyoRenderer;
import net.rin.itomon.client.renderer.KonsainuRenderer;
import net.rin.itomon.client.renderer.MizumaroRenderer;
import net.rin.itomon.client.renderer.NyafukaRenderer;
import net.rin.itomon.client.renderer.PokonohaRenderer;
import net.rin.itomon.client.renderer.TorobiRenderer;
import net.rin.itomon.client.renderer.TumurisuRenderer;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ItomonModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ItomonModEntities.TUMURISU.get(), TumurisuRenderer::new);
		event.registerEntityRenderer(ItomonModEntities.MIZUMARO.get(), MizumaroRenderer::new);
		event.registerEntityRenderer(ItomonModEntities.POKONOHA.get(), PokonohaRenderer::new);
		event.registerEntityRenderer(ItomonModEntities.TOROBI.get(), TorobiRenderer::new);
		event.registerEntityRenderer(ItomonModEntities.KONSAINU.get(), KonsainuRenderer::new);
		event.registerEntityRenderer(ItomonModEntities.NYAFUKA.get(), NyafukaRenderer::new);
		event.registerEntityRenderer(ItomonModEntities.ELEPIYO.get(), ElepiyoRenderer::new);
	}
}
