# LOOKSMAXXING: From SUB3 to TRUE ADAM — Stage 2 (Forge 1.20.1)

## Build (Windows / Linux / macOS)
1. Install **JDK 17** (e.g. Temurin 17) and **Gradle 8.1.1** (https://gradle.org/releases/).
2. In this folder run:  `gradle build`   (first run downloads Minecraft + Forge, takes several minutes, needs internet)
3. The mod is at `build/libs/looksmaxxing-0.2.0.jar` -> copy it into `.minecraft/mods`.
4. Play with **Forge 1.20.1 (47.2.0 or newer)**.

Alternative: download the official Forge 1.20.1-47.2.0 MDK, and copy the `src/` folder from here over its `src/`
(replace its example code), then run `gradlew build`.

Test in IDE: `gradle genIntellijRuns` / `gradle genEclipseRuns`, then `runClient`.

## What Stage 1 does
- Character creation screen on first join (7 face/body sliders, skin tone, hairstyle, hair color, rotating preview). Data is validated and saved on the server.
- 8 ranks SUB3 -> TRUE ADAM with colors and progress bar; fictional 1-8 rating from a configurable weighted formula.
- HUD (rank, rating, progress, STR/END) and profile screen (key **K**).
- Progression source: sprinting on foot (server-validated, diminishing returns, daily cap).
- Rank-up effect: title, sound, totem particles, server broadcast.
- Rank-Up Token item (creative tab "Looksmaxxing", +3 to all attributes) for testing.
- Stats saved per player, survive death, work on dedicated servers.
- Config: `config/looksmaxxing-common.toml` (weights, training speed, daily cap, rank difficulty).

## Limitations (to be done in next stages)
- Appearance sliders are saved but NOT yet rendered on the player model (Stage 3).
- Only running gives progress; grooming/strength/posture/battle come with Stages 2-4.
  Until battles exist, max overall is ~80, so TRUE CHAD / TRUE ADAM are not reachable yet.
- No custom rank-up animation yet, no gym blocks, no mog battles, no structures.
- Not compiled/tested by the author (no network in the build environment): if Gradle shows an error, send it back.


## Stage 2 additions
- Height and frame sliders now change the real player model (scaled); muscle bulk grows with Strength. Visible to other players too. Skin tone, face and hair are NOT rendered yet.
- Stamina + fatigue system (HUD bars). Overtraining (fatigue 80+) blocks gains. Sleep in a bed to fully recover.
- Items: Resistance Dumbbells, Training Barbell (hold right-click for a set), Pull-Up Bar block (right-click), Protein Meal (+30 stamina, -10 fatigue). All have crafting recipes.
- Daily strength cap, diminishing returns, cooldown (config: training.dailyStrengthCap).
- Animations are vanilla arm swings + particles/sound (real custom animations need GeckoLib, planned for later).
- Not yet: push-ups/squats, mirror, grooming, hammer ritual, mog battles.
