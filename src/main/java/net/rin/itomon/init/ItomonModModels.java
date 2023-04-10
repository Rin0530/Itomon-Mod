package net.rin.itomon.init;

import net.minecraftforge.fml.common.Mod;
import net.rin.itomon.client.model.KonsainuModel;
import net.rin.itomon.client.model.MizumaroModel;
import net.rin.itomon.client.model.PokonohaModel;
import net.rin.itomon.client.model.TorobiModel;
import net.rin.itomon.client.model.TumurisuModel;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ItomonModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(TumurisuModel.LAYER_LOCATION, TumurisuModel::createBodyLayer);
		event.registerLayerDefinition(MizumaroModel.LAYER_LOCATION, MizumaroModel::createBodyLayer);
		event.registerLayerDefinition(TorobiModel.LAYER_LOCATION, TorobiModel::createBodyLayer);
		event.registerLayerDefinition(PokonohaModel.LAYER_LOCATION, PokonohaModel::createBodyLayer);
		event.registerLayerDefinition(KonsainuModel.LAYER_LOCATION, KonsainuModel::createBodyLayer);
	}
}
