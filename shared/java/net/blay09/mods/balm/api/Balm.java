package net.blay09.mods.balm.api;

import net.blay09.mods.balm.api.block.BalmBlockEntities;
import net.blay09.mods.balm.api.block.BalmBlocks;
import net.blay09.mods.balm.api.command.BalmCommands;
import net.blay09.mods.balm.api.config.BalmConfig;
import net.blay09.mods.balm.api.entity.BalmEntities;
import net.blay09.mods.balm.api.event.BalmEvents;
import net.blay09.mods.balm.api.item.BalmItems;
import net.blay09.mods.balm.api.menu.BalmMenus;
import net.blay09.mods.balm.api.network.BalmNetworking;
import net.blay09.mods.balm.api.provider.BalmProviders;
import net.blay09.mods.balm.api.sound.BalmSounds;
import net.blay09.mods.balm.api.world.BalmWorldGen;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.ResourceManager;

import java.util.function.Consumer;

public class Balm {
    private static final BalmRuntime runtime = BalmRuntimeFactory.create();

    public static void initialize(String modId) {
        runtime.initialize(modId);
    }

    public static boolean isModLoaded(String modId) {
        return runtime.isModLoaded(modId);
    }

    public static void initializeIfLoaded(String modId, String className) {
        runtime.initializeIfLoaded(modId, className);
    }

    public static void addServerReloadListener(ResourceLocation identifier, PreparableReloadListener reloadListener) {
        runtime.addServerReloadListener(identifier, reloadListener);
    }

    public static void addServerReloadListener(ResourceLocation identifier, Consumer<ResourceManager> reloadListener) {
        runtime.addServerReloadListener(identifier, reloadListener);
    }

    public static BalmEvents getEvents() {
        return runtime.getEvents();
    }

    public static BalmConfig getConfig() {
        return runtime.getConfig();
    }

    public static BalmNetworking getNetworking() {
        return runtime.getNetworking();
    }

    public static BalmWorldGen getWorldGen() {
        return runtime.getWorldGen();
    }

    public static BalmBlocks getBlocks() {
        return runtime.getBlocks();
    }

    public static BalmBlockEntities getBlockEntities() {
        return runtime.getBlockEntities();
    }

    public static BalmItems getItems() {
        return runtime.getItems();
    }

    public static BalmMenus getMenus() {
        return runtime.getMenus();
    }

    public static BalmHooks getHooks() {
        return runtime.getHooks();
    }

    public static BalmRegistries getRegistries() {
        return runtime.getRegistries();
    }

    public static BalmSounds getSounds() {
        return runtime.getSounds();
    }

    public static BalmEntities getEntities() {
        return runtime.getEntities();
    }

    public static BalmProviders getProviders() {
        return runtime.getProviders();
    }

    public static BalmCommands getCommands() {
        return runtime.getCommands();
    }
}
