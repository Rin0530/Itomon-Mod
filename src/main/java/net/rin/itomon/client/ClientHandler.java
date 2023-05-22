package net.rin.itomon.client;

import net.minecraftforge.forgespi.language.IModInfo;
import net.rin.itomon.ItomonMod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.VersionChecker;
import net.minecraftforge.fml.VersionChecker.Status;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ClientPlayerNetworkEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentContents;
import net.minecraft.network.chat.contents.TranslatableContents;

@Mod.EventBusSubscriber(modid = ItomonMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = { Dist.CLIENT })
public class ClientHandler {
    public static void init() {
    }

    @SubscribeEvent
    public void join(ClientPlayerNetworkEvent.LoggingIn event) {
        Status result = checkUpdate();
        if (result == Status.OUTDATED) {
            LocalPlayer player = event.getPlayer();
            String message = """
                    Update is available!
                    check https://github.com/Rin0530/Itomon-Mod/releases/latest
                    """;
            ComponentContents contents = new TranslatableContents(message);
            Component component = MutableComponent.create(contents);
            player.sendSystemMessage(component);
        }
    }

    public static Status checkUpdate() {
        IModInfo iModInfo = ModLoadingContext.get().getActiveContainer().getModInfo();
        return VersionChecker.getResult(iModInfo).status();
    }
}
