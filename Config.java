package com.looksmaxxing;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    private static final ForgeConfigSpec.Builder B = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.DoubleValue W_FACIAL = B
            .comment("Rating formula weight: facial harmony")
            .defineInRange("weights.facialHarmony", 0.25, 0.0, 10.0);
    public static final ForgeConfigSpec.DoubleValue W_GROOMING = B
            .comment("Rating formula weight: grooming")
            .defineInRange("weights.grooming", 0.15, 0.0, 10.0);
    public static final ForgeConfigSpec.DoubleValue W_PHYSIQUE = B
            .comment("Rating formula weight: physique (average of strength and endurance)")
            .defineInRange("weights.physique", 0.30, 0.0, 10.0);
    public static final ForgeConfigSpec.DoubleValue W_POSTURE = B
            .comment("Rating formula weight: posture")
            .defineInRange("weights.posture", 0.10, 0.0, 10.0);
    public static final ForgeConfigSpec.DoubleValue W_BATTLE = B
            .comment("Rating formula weight: battle performance")
            .defineInRange("weights.battle", 0.20, 0.0, 10.0);

    public static final ForgeConfigSpec.DoubleValue TRAINING_SPEED = B
            .comment("Multiplier for all training gains")
            .defineInRange("training.speed", 1.0, 0.1, 10.0);
    public static final ForgeConfigSpec.DoubleValue DAILY_ENDURANCE_CAP = B
            .comment("Max endurance points one player can gain per Minecraft day from running")
            .defineInRange("training.dailyEnduranceCap", 12.0, 1.0, 100.0);

    public static final ForgeConfigSpec.DoubleValue DAILY_STRENGTH_CAP = B
            .comment("Max strength points one player can gain per Minecraft day from gym training")
            .defineInRange("training.dailyStrengthCap", 15.0, 1.0, 100.0);

    public static final ForgeConfigSpec.DoubleValue RANK_DIFFICULTY = B
            .comment("Rank thresholds multiplier. Lower = easier. (max 1.05, otherwise TRUE ADAM is impossible)")
            .defineInRange("ranks.difficulty", 1.0, 0.5, 1.05);

    public static final ForgeConfigSpec SPEC = B.build();
}
