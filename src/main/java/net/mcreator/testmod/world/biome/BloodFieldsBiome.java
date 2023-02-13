
package net.mcreator.testmod.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import net.mcreator.testmod.init.TestModModEntities;

public class BloodFieldsBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(0.566666666667f, 0.900000000001f),
			Climate.Parameter.span(-1.166666666667f, -0.833333333333f), Climate.Parameter.span(0.343333333333f, 0.676666666667f),
			Climate.Parameter.span(0.333333333333f, 0.666666666667f), Climate.Parameter.point(0),
			Climate.Parameter.span(0.282060679548f, 0.615394012882f), 0);
	public static final Climate.ParameterPoint PARAMETER_POINT_UNDERGROUND = new Climate.ParameterPoint(Climate.Parameter.span(-1, 1),
			Climate.Parameter.span(-1, 1), Climate.Parameter.span(-0.49f, 1.51f), Climate.Parameter.span(-0.5f, 1.5f),
			Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.551272653785f, 1.448727346215f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-9109504).waterColor(-3394816).waterFogColor(-6737152)
				.skyColor(-9109504).foliageColorOverride(-6385777).grassColorOverride(-6737152).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCrystalFormations(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultMonsterRoom(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.AMBIENT, new MobSpawnSettings.SpawnerData(TestModModEntities.BLOOD_SLIME.get(), 20, 4, 4));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).temperature(1.6f).downfall(0f).specialEffects(effects)
				.mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
