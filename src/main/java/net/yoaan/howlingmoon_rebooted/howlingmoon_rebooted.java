package net.yoaan.howlingmoon_rebooted;

import net.fabricmc.api.ModInitializer;
import net.yoaan.howlingmoon_rebooted.block.ModBlocks;
import net.yoaan.howlingmoon_rebooted.item.ModItemGroups;
import net.yoaan.howlingmoon_rebooted.item.ModItems;
import net.yoaan.howlingmoon_rebooted.util.ModRegistries;
import net.yoaan.howlingmoon_rebooted.world.feature.ModConfiguredFeatures;
import net.yoaan.howlingmoon_rebooted.world.gen.ModWorldGen;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

public class howlingmoon_rebooted implements ModInitializer {

	public static final String MOD_ID = "howlingmoon_rebooted";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModStuffs();

		GeckoLib.initialize();

		ModWorldGen.generateModWorldGen();
	}
}