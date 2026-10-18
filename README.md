# LOOKSMAXXING: From SUB3 to TRUE ADAM — Stage 1 (Forge 1.20.1)

## Build (Windows / Linux / macOS)
1. Install **JDK 17** (e.g. Temurin 17) and **Gradle 8.1.1** (https://gradle.org/releases/).
2. In this folder run:  `gradle build`   (first run downloads Minecraft + Forge, takes several minutes, needs internet)
3. The mod is at `build/libs/looksmaxxing-0.1.0.jar` -> copy it into `.minecraft/mods`.
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
