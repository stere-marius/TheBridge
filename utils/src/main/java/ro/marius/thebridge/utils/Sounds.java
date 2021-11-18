package ro.marius.thebridge.utils;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

/**
 * Version independent spigot sounds.
 */

public enum Sounds {
    AMBIENCE_CAVE("AMBIENCE_CAVE", "AMBIENT_CAVE"),
    AMBIENCE_RAIN("AMBIENCE_RAIN", "WEATHER_RAIN"),
    AMBIENCE_THUNDER("AMBIENCE_THUNDER", "ENTITY_LIGHTNING_THUNDER", "ENTITY_LIGHTNING_BOLT_THUNDER"),
    ANVIL_BREAK("ANVIL_BREAK", "BLOCK_ANVIL_BREAK"),
    ANVIL_LAND("ANVIL_LAND", "BLOCK_ANVIL_LAND"),
    ANVIL_USE("ANVIL_USE", "BLOCK_ANVIL_USE"),
    ARROW_HIT("ARROW_HIT", "ENTITY_ARROW_HIT"),
    BURP("BURP", "ENTITY_PLAYER_BURP"),
    CHEST_CLOSE("CHEST_CLOSE", "ENTITY_CHEST_CLOSE", "BLOCK_CHEST_CLOSE"),
    CHEST_OPEN("CHEST_OPEN", "ENTITY_CHEST_OPEN", "BLOCK_CHEST_OPEN"),
    CLICK("CLICK", "UI_BUTTON_CLICK"),
    DOOR_CLOSE("DOOR_CLOSE", "BLOCK_WOODEN_DOOR_CLOSE"),
    DOOR_OPEN("DOOR_OPEN", "BLOCK_WOODEN_DOOR_OPEN"),
    DRINK("DRINK", "ENTITY_GENERIC_DRINK"),
    EAT("EAT", "ENTITY_GENERIC_EAT"),
    EXPLODE("EXPLODE", "ENTITY_GENERIC_EXPLODE"),
    FALL_BIG("FALL_BIG", "ENTITY_GENERIC_BIG_FALL"),
    FALL_SMALL("FALL_SMALL", "ENTITY_GENERIC_SMALL_FALL"),
    FIRE("FIRE", "BLOCK_FIRE_AMBIENT"),
    FIRE_IGNITE("FIRE_IGNITE", "ITEM_FLINTANDSTEEL_USE"),
    FIZZ("FIZZ", "BLOCK_FIRE_EXTINGUISH"),
    FUSE("FUSE", "ENTITY_TNT_PRIMED"),
    GLASS("GLASS", "BLOCK_GLASS_BREAK"),
    HURT_FLESH("HURT_FLESH", "ENTITY_PLAYER_HURT"),
    ITEM_BREAK("ITEM_BREAK", "ENTITY_ITEM_BREAK"),
    ITEM_PICKUP("ITEM_PICKUP", "ENTITY_ITEM_PICKUP"),
    LAVA("LAVA", "BLOCK_LAVA_AMBIENT"),
    LAVA_POP("LAVA_POP", "BLOCK_LAVA_POP"),
    LEVEL_UP("LEVEL_UP", "ENTITY_PLAYER_LEVELUP"),
    MINECART_BASE("MINECART_BASE", "ENTITY_MINECART_RIDING"),
    MINECART_INSIDE("MINECART_INSIDE", "ENTITY_MINECART_RIDING", "ENTITY_MINECART_INSIDE"),
    NOTE_BASS("NOTE_BASS", "BLOCK_NOTE_BASS", "BLOCK_NOTE_BLOCK_BASS"),
    NOTE_PIANO("NOTE_PIANO", "BLOCK_NOTE_HARP", "BLOCK_NOTE_BLOCK_HARP"),
    NOTE_BASS_DRUM("NOTE_BASS_DRUM", "BLOCK_NOTE_BASEDRUM", "BLOCK_NOTE_BLOCK_BASEDRUM"),
    NOTE_STICKS("NOTE_STICKS", "BLOCK_NOTE_HAT", "BLOCK_NOTE_BLOCK_HAT"),
    NOTE_BASS_GUITAR("NOTE_BASS_GUITAR", "BLOCK_NOTE_BASS", "BLOCK_NOTE_BLOCK_BASS"),
    NOTE_SNARE_DRUM("NOTE_SNARE_DRUM", "BLOCK_NOTE_SNARE", "BLOCK_NOTE_BLOCK_SNARE"),
    NOTE_PLING("NOTE_PLING", "BLOCK_NOTE_PLING", "BLOCK_NOTE_BLOCK_PLING"),
    ORB_PICKUP("ORB_PICKUP", "ENTITY_EXPERIENCE_ORB_PICKUP"),
    PISTON_EXTEND("PISTON_EXTEND", "BLOCK_PISTON_EXTEND"),
    PISTON_RETRACT("PISTON_RETRACT", "BLOCK_PISTON_CONTRACT"),
    PORTAL("PORTAL", "BLOCK_PORTAL_AMBIENT"),
    PORTAL_TRAVEL("PORTAL_TRAVEL", "BLOCK_PORTAL_TRAVEL"),
    PORTAL_TRIGGER("PORTAL_TRIGGER", "BLOCK_PORTAL_TRIGGER"),
    SHOOT_ARROW("SHOOT_ARROW", "ENTITY_ARROW_SHOOT"),
    SPLASH("SPLASH", "ENTITY_GENERIC_SPLASH"),
    SPLASH2("SPLASH2", "ENTITY_BOBBER_SPLASH", "ENTITY_FISHING_BOBBER_SPLASH"),
    STEP_GRASS("STEP_GRASS", "BLOCK_GRASS_STEP"),
    STEP_GRAVEL("STEP_GRAVEL", "BLOCK_GRAVEL_STEP"),
    STEP_LADDER("STEP_LADDER", "BLOCK_LADDER_STEP"),
    STEP_SAND("STEP_SAND", "BLOCK_SAND_STEP"),
    STEP_SNOW("STEP_SNOW", "BLOCK_SNOW_STEP"),
    STEP_STONE("STEP_STONE", "BLOCK_STONE_STEP"),
    STEP_WOOD("STEP_WOOD", "BLOCK_WOOD_STEP"),
    STEP_WOOL("STEP_WOOL", "BLOCK_CLOTH_STEP", "BLOCK_WOOL_STEP"),
    SWIM("SWIM", "ENTITY_GENERIC_SWIM"),
    WATER("WATER", "BLOCK_WATER_AMBIENT"),
    WOOD_CLICK("WOOD_CLICK", "BLOCK_WOOD_BUTTON_CLICK_ON", "BLOCK_WOODEN_BUTTON_CLICK_ON"),
    BAT_DEATH("BAT_DEATH", "ENTITY_BAT_DEATH"),
    BAT_HURT("BAT_HURT", "ENTITY_BAT_HURT"),
    BAT_IDLE("BAT_IDLE", "ENTITY_BAT_AMBIENT"),
    BAT_LOOP("BAT_LOOP", "ENTITY_BAT_LOOP"),
    BAT_TAKEOFF("BAT_TAKEOFF", "ENTITY_BAT_TAKEOFF"),
    BLAZE_BREATH("BLAZE_BREATH", "ENTITY_BLAZE_AMBIENT"),
    BLAZE_DEATH("BLAZE_DEATH", "ENTITY_BLAZE_DEATH"),
    BLAZE_HIT("BLAZE_HIT", "ENTITY_BLAZE_HURT"),
    CAT_HISS("CAT_HISS", "ENTITY_CAT_HISS"),
    CAT_HIT("CAT_HIT", "ENTITY_CAT_HURT"),
    CAT_MEOW("CAT_MEOW", "ENTITY_CAT_AMBIENT"),
    CAT_PURR("CAT_PURR", "ENTITY_CAT_PURR"),
    CAT_PURREOW("CAT_PURREOW", "ENTITY_CAT_PURREOW"),
    CHICKEN_IDLE("CHICKEN_IDLE", "ENTITY_CHICKEN_AMBIENT"),
    CHICKEN_HURT("CHICKEN_HURT", "ENTITY_CHICKEN_HURT"),
    CHICKEN_EGG_POP("CHICKEN_EGG_POP", "ENTITY_CHICKEN_EGG"),
    CHICKEN_WALK("CHICKEN_WALK", "ENTITY_CHICKEN_STEP"),
    COW_IDLE("COW_IDLE", "ENTITY_COW_AMBIENT"),
    COW_HURT("COW_HURT", "ENTITY_COW_HURT"),
    COW_WALK("COW_WALK", "ENTITY_COW_STEP"),
    CREEPER_HISS("CREEPER_HISS", "ENTITY_CREEPER_PRIMED"),
    CREEPER_DEATH("CREEPER_DEATH", "ENTITY_CREEPER_DEATH"),
    DOLPHIN_IDLE("ENTITY_DOLPHIN_AMBIENT"),
    DOLPHIN_ATTACK("ENTITY_DOLPHIN_ATTACK"),
    DOLPHIN_DEATH("ENTITY_DOLPHIN_DEATH"),
    DOLPHIN_EAT("ENTITY_DOLPHIN_EAT"),
    DOLPHIN_HURT("ENTITY_DOLPHIN_HURT"),
    DOLPHIN_JUMP("ENTITY_DOLPHIN_JUMP"),
    DOLPHIN_PLAY("ENTITY_DOLPHIN_PLAY"),
    DOLPHIN_SPLASH("ENTITY_DOLPHIN_SPLASH"),
    DOLPHIN_SWIM("ENTITY_DOLPHIN_SWIM"),
    ELDERGUARDIAN_IDLE("ENTITY_ELDER_GUARDIAN_AMBIENT"),
    ELDERGUARDIAN_CURSE("ENTITY_ELDER_GUARDIAN_CURSE"),
    ELDERGUARDIAN_DEATH("ENTITY_ELDER_GUARDIAN_DEATH"),
    ELDERGUARDIAN_FLOP("ENTITY_ELDER_GUARDIAN_FLOP"),
    ELDERGUARDIAN_HURT("ENTITY_ELDER_GUARDIAN_HURT"),
    ENDERDRAGON_DEATH("ENDERDRAGON_DEATH", "ENTITY_ENDERDRAGON_DEATH", "ENTITY_ENDER_DRAGON_DEATH"),
    ENDERDRAGON_GROWL("ENDERDRAGON_GROWL", "ENTITY_ENDERDRAGON_GROWL", "ENTITY_ENDER_DRAGON_GROWL"),
    ENDERDRAGON_HIT("ENDERDRAGON_HIT", "ENTITY_ENDERDRAGON_HURT", "ENTITY_ENDER_DRAGON_HURT"),
    ENDERDRAGON_WINGS("ENDERDRAGON_WINGS", "ENTITY_ENDERDRAGON_FLAP", "ENTITY_ENDER_DRAGON_FLAP"),
    ENDERMAN_DEATH("ENDERMAN_DEATH", "ENTITY_ENDERMEN_DEATH", "ENTITY_ENDERMAN_DEATH"),
    ENDERMAN_HIT("ENDERMAN_HIT", "ENTITY_ENDERMEN_HURT", "ENTITY_ENDERMAN_HURT"),
    ENDERMAN_IDLE("ENDERMAN_IDLE", "ENTITY_ENDERMEN_AMBIENT", "ENTITY_ENDERMAN_AMBIENT"),
    ENDERMAN_TELEPORT("ENDERMAN_TELEPORT", "ENTITY_ENDERMEN_TELEPORT", "ENTITY_ENDERMAN_TELEPORT"),
    ENDERMAN_SCREAM("ENDERMAN_SCREAM", "ENTITY_ENDERMEN_SCREAM", "ENTITY_ENDERMAN_SCREAM"),
    ENDERMAN_STARE("ENDERMAN_STARE", "ENTITY_ENDERMEN_STARE", "ENTITY_ENDERMAN_STARE"),
    EVOKER_IDLE("ENTITY_EVOKER_AMBIENT"),
    EVOKER_CAST_SPELL("ENTITY_EVOKER_CAST_SPELL"),
    EVOKER_ATTACK("ENTITY_EVOKER_FANGS_ATTACK"),
    EVOKER_DEATH("ENTITY_EVOKER_DEATH"),
    EVOKER_HURT("ENTITY_EVOKER_HURT"),
    GHAST_SCREAM("GHAST_SCREAM", "ENTITY_GHAST_SCREAM"),
    GHAST_SCREAM2("GHAST_SCREAM2", "ENTITY_GHAST_HURT"),
    GHAST_CHARGE("GHAST_CHARGE", "ENTITY_GHAST_WARN"),
    GHAST_DEATH("GHAST_DEATH", "ENTITY_GHAST_DEATH"),
    GHAST_FIREBALL("GHAST_FIREBALL", "ENTITY_GHAST_SHOOT"),
    GHAST_MOAN("GHAST_MOAN", "ENTITY_GHAST_AMBIENT"),
    HUSK_IDLE("ENTITY_HUSK_AMBIENT"),
    HUSK_DEATH("ENTITY_HUSK_DEATH"),
    HUSK_HURT("ENTITY_HUSK_HURT"),
    HUSK_STEP("ENTITY_HUSK_STEP"),
    ILLUSIONER_IDLE("ENTITY_ILLUSIONER_AMBIENT"),
    ILLUSIONER_CAST_SPELL("ENTITY_ILLUSIONER_CAST_SPELL"),
    ILLUSIONER_DEATH("ENTITY_ILLUSIONER_DEATH"),
    ILLUSIONER_HURT("ENTITY_ILLUSIONER_HURT"),
    IRONGOLEM_DEATH("IRONGOLEM_DEATH", "ENTITY_IRONGOLEM_DEATH", "ENTITY_IRON_GOLEM_DEATH"),
    IRONGOLEM_HIT("IRONGOLEM_HIT", "ENTITY_IRONGOLEM_HURT", "ENTITY_IRON_GOLEM_HURT"),
    IRONGOLEM_THROW("IRONGOLEM_THROW", "ENTITY_IRONGOLEM_ATTACK", "ENTITY_IRON_GOLEM_ATTACK"),
    IRONGOLEM_WALK("IRONGOLEM_WALK", "ENTITY_IRONGOLEM_STEP", "ENTITY_IRON_GOLEM_STEP"),
    LLAMA_IDLE("ENTITY_LLAMA_AMBIENT"),
    LLAMA_ANGRY("ENTITY_LLAMA_ANGRY"),
    LLAMA_DEATH("ENTITY_LLAMA_DEATH"),
    LLAMA_EAT("ENTITY_LLAMA_EAT"),
    LLAMA_HURT("ENTITY_LLAMA_HURT"),
    LLAMA_SPIT("ENTITY_LLAMA_SPIT"),
    LLAMA_STEP("ENTITY_LLAMA_STEP"),
    LLAMA_SWAG("ENTITY_LLAMA_SWAG"),
    MAGMACUBE_WALK("MAGMACUBE_WALK", "ENTITY_MAGMACUBE_SQUISH", "ENTITY_MAGMA_CUBE_SQUISH"),
    MAGMACUBE_WALK2("MAGMACUBE_WALK2", "ENTITY_MAGMACUBE_SQUISH", "ENTITY_MAGMA_CUBE_SQUISH"),
    MAGMACUBE_JUMP("MAGMACUBE_JUMP", "ENTITY_MAGMACUBE_JUMP", "ENTITY_MAGMA_CUBE_JUMP"),
    PARROT_IDLE("ENTITY_PARROT_AMBIENT"),
    PARROT_DEATH("ENTITY_PARROT_DEATH"),
    PARROT_EAT("ENTITY_PARROT_EAT"),
    PARROT_FLY("ENTITY_PARROT_FLY"),
    PARROT_HURT("ENTITY_PARROT_HURT"),
    PARROT_STEP("ENTITY_PARROT_STEP"),
    PHANTOM_IDLE("ENTITY_PHANTOM_AMBIENT"),
    PHANTOM_BITE("ENTITY_PHANTOM_BITE"),
    PHANTOM_DEATH("ENTITY_PHANTOM_DEATH"),
    PHANTOM_FLAP("ENTITY_PHANTOM_FLAP"),
    PHANTOM_HURT("ENTITY_PHANTOM_HURT"),
    PHANTOM_SWOOP("ENTITY_PHANTOM_SWOOP"),
    PIG_IDLE("PIG_IDLE", "ENTITY_PIG_AMBIENT"),
    PIG_DEATH("PIG_DEATH", "ENTITY_PIG_DEATH"),
    PIG_WALK("PIG_WALK", "ENTITY_PIG_STEP"),
    SHEEP_IDLE("SHEEP_IDLE", "ENTITY_SHEEP_AMBIENT"),
    SHEEP_SHEAR("SHEEP_SHEAR", "ENTITY_SHEEP_SHEAR"),
    SHEEP_WALK("SHEEP_WALK", "ENTITY_SHEEP_STEP"),
    SILVERFISH_HIT("SILVERFISH_HIT", "ENTITY_SILVERFISH_HURT"),
    SILVERFISH_KILL("SILVERFISH_KILL", "ENTITY_SILVERFISH_DEATH"),
    SILVERFISH_IDLE("SILVERFISH_IDLE", "ENTITY_SILVERFISH_AMBIENT"),
    SILVERFISH_WALK("SILVERFISH_WALK", "ENTITY_SILVERFISH_STEP"),
    SKELETON_IDLE("SKELETON_IDLE", "ENTITY_SKELETON_AMBIENT"),
    SKELETON_DEATH("SKELETON_DEATH", "ENTITY_SKELETON_DEATH"),
    SKELETON_HURT("SKELETON_HURT", "ENTITY_SKELETON_HURT"),
    SKELETON_WALK("SKELETON_WALK", "ENTITY_SKELETON_STEP"),
    SLIME_ATTACK("SLIME_ATTACK", "ENTITY_SLIME_ATTACK"),
    SLIME_WALK("SLIME_WALK", "ENTITY_SLIME_JUMP"),
    SLIME_WALK2("SLIME_WALK2", "ENTITY_SLIME_SQUISH"),
    SPIDER_IDLE("SPIDER_IDLE", "ENTITY_SPIDER_AMBIENT"),
    SPIDER_DEATH("SPIDER_DEATH", "ENTITY_SPIDER_DEATH"),
    SPIDER_WALK("SPIDER_WALK", "ENTITY_SPIDER_STEP"),
    WITHER_DEATH("WITHER_DEATH", "ENTITY_WITHER_DEATH"),
    WITHER_HURT("WITHER_HURT", "ENTITY_WITHER_HURT"),
    WITHER_IDLE("WITHER_IDLE", "ENTITY_WITHER_AMBIENT"),
    WITHER_SHOOT("WITHER_SHOOT", "ENTITY_WITHER_SHOOT"),
    WITHER_SPAWN("WITHER_SPAWN", "ENTITY_WITHER_SPAWN"),
    WOLF_BARK("WOLF_BARK", "ENTITY_WOLF_AMBIENT"),
    WOLF_DEATH("WOLF_DEATH", "ENTITY_WOLF_DEATH"),
    WOLF_GROWL("WOLF_GROWL", "ENTITY_WOLF_GROWL"),
    WOLF_HOWL("WOLF_HOWL", "ENTITY_WOLF_HOWL"),
    WOLF_HURT("WOLF_HURT", "ENTITY_WOLF_HURT"),
    WOLF_PANT("WOLF_PANT", "ENTITY_WOLF_PANT"),
    WOLF_SHAKE("WOLF_SHAKE", "ENTITY_WOLF_SHAKE"),
    WOLF_WALK("WOLF_WALK", "ENTITY_WOLF_STEP"),
    WOLF_WHINE("WOLF_WHINE", "ENTITY_WOLF_WHINE"),
    ZOMBIE_METAL("ZOMBIE_METAL", "ENTITY_ZOMBIE_ATTACK_IRON_DOOR"),
    ZOMBIE_WOOD("ZOMBIE_WOOD", "ENTITY_ZOMBIE_ATTACK_DOOR_WOOD"),
    ZOMBIE_WOODBREAK("ZOMBIE_WOODBREAK", "ENTITY_ZOMBIE_BREAK_DOOR_WOOD"),
    ZOMBIE_IDLE("ZOMBIE_IDLE", "ENTITY_ZOMBIE_AMBIENT"),
    ZOMBIE_DEATH("ZOMBIE_DEATH", "ENTITY_ZOMBIE_DEATH"),
    ZOMBIE_HURT("ZOMBIE_HURT", "ENTITY_ZOMBIE_HURT"),
    ZOMBIE_INFECT("ZOMBIE_INFECT", "ENTITY_ZOMBIE_INFECT"),
    ZOMBIE_UNFECT("ZOMBIE_UNFECT", "ENTITY_ZOMBIE_VILLAGER_CONVERTED"),
    ZOMBIE_REMEDY("ZOMBIE_REMEDY", "ENTITY_ZOMBIE_VILLAGER_CURE"),
    ZOMBIE_WALK("ZOMBIE_WALK", "ENTITY_ZOMBIE_STEP"),
    ZOMBIE_PIG_IDLE("ZOMBIE_PIG_IDLE", "ENTITY_ZOMBIE_PIG_AMBIENT", "ENTITY_ZOMBIE_PIGMAN_AMBIENT"),
    ZOMBIE_PIG_ANGRY("ZOMBIE_PIG_ANGRY", "ENTITY_ZOMBIE_PIG_ANGRY", "ENTITY_ZOMBIE_PIGMAN_ANGRY"),
    ZOMBIE_PIG_DEATH("ZOMBIE_PIG_DEATH", "ENTITY_ZOMBIE_PIG_DEATH", "ENTITY_ZOMBIE_PIGMAN_DEATH"),
    ZOMBIE_PIG_HURT("ZOMBIE_PIG_HURT", "ENTITY_ZOMBIE_PIG_HURT", "ENTITY_ZOMBIE_PIGMAN_HURT"),
    DIG_WOOL("DIG_WOOL", "BLOCK_CLOTH_BREAK", "BLOCK_WOOL_BREAK"),
    DIG_GRASS("DIG_GRASS", "BLOCK_GRASS_BREAK"),
    DIG_GRAVEL("DIG_GRAVEL", "BLOCK_GRAVEL_BREAK"),
    DIG_SAND("DIG_SAND", "BLOCK_SAND_BREAK"),
    DIG_SNOW("DIG_SNOW", "BLOCK_SNOW_BREAK"),
    DIG_STONE("DIG_STONE", "BLOCK_STONE_BREAK"),
    DIG_WOOD("DIG_WOOD", "BLOCK_WOOD_BREAK"),
    FIREWORK_BLAST("FIREWORK_BLAST", "ENTITY_FIREWORK_BLAST", "ENTITY_FIREWORK_ROCKET_BLAST"),
    FIREWORK_BLAST2("FIREWORK_BLAST2", "ENTITY_FIREWORK_BLAST_FAR", "ENTITY_FIREWORK_ROCKET_BLAST_FAR"),
    FIREWORK_LARGE_BLAST("FIREWORK_LARGE_BLAST", "ENTITY_FIREWORK_LARGE_BLAST", "ENTITY_FIREWORK_ROCKET_LARGE_BLAST"),
    FIREWORK_LARGE_BLAST2("FIREWORK_LARGE_BLAST2", "ENTITY_FIREWORK_LARGE_BLAST_FAR",
            "ENTITY_FIREWORK_ROCKET_LARGE_BLAST_FAR"),
    FIREWORK_TWINKLE("FIREWORK_TWINKLE", "ENTITY_FIREWORK_TWINKLE", "ENTITY_FIREWORK_ROCKET_TWINKLE"),
    FIREWORK_LAUNCH("FIREWORK_LAUNCH", "ENTITY_FIREWORK_LAUNCH", "ENTITY_FIREWORK_ROCKET_LAUNCH"),
    SUCCESSFUL_HIT("SUCCESSFUL_HIT", "ENTITY_PLAYER_ATTACK_STRONG"),
    HORSE_ANGRY("HORSE_ANGRY", "ENTITY_HORSE_ANGRY"),
    HORSE_ARMOR("HORSE_ARMOR", "ENTITY_HORSE_ARMOR"),
    HORSE_BREATHE("HORSE_BREATHE", "ENTITY_HORSE_BREATHE"),
    HORSE_DEATH("HORSE_DEATH", "ENTITY_HORSE_DEATH"),
    HORSE_GALLOP("HORSE_GALLOP", "ENTITY_HORSE_GALLOP"),
    HORSE_HIT("HORSE_HIT", "ENTITY_HORSE_HURT"),
    HORSE_IDLE("HORSE_IDLE", "ENTITY_HORSE_AMBIENT"),
    HORSE_JUMP("HORSE_JUMP", "ENTITY_HORSE_JUMP"),
    HORSE_LAND("HORSE_LAND", "ENTITY_HORSE_LAND"),
    HORSE_SADDLE("HORSE_SADDLE", "ENTITY_HORSE_SADDLE"),
    HORSE_SOFT("HORSE_SOFT", "ENTITY_HORSE_STEP"),
    HORSE_WOOD("HORSE_WOOD", "ENTITY_HORSE_STEP_WOOD"),
    DONKEY_ANGRY("DONKEY_ANGRY", "ENTITY_DONKEY_ANGRY"),
    DONKEY_DEATH("DONKEY_DEATH", "ENTITY_DONKEY_DEATH"),
    DONKEY_HIT("DONKEY_HIT", "ENTITY_DONKEY_HURT"),
    DONKEY_IDLE("DONKEY_IDLE", "ENTITY_DONKEY_AMBIENT"),
    HORSE_SKELETON_DEATH("HORSE_SKELETON_DEATH", "ENTITY_SKELETON_HORSE_DEATH"),
    HORSE_SKELETON_HIT("HORSE_SKELETON_HIT", "ENTITY_SKELETON_HORSE_HURT"),
    HORSE_SKELETON_IDLE("HORSE_SKELETON_IDLE", "ENTITY_SKELETON_HORSE_AMBIENT"),
    HORSE_ZOMBIE_DEATH("HORSE_ZOMBIE_DEATH", "ENTITY_ZOMBIE_HORSE_DEATH"),
    HORSE_ZOMBIE_HIT("HORSE_ZOMBIE_HIT", "ENTITY_ZOMBIE_HORSE_HURT"),
    HORSE_ZOMBIE_IDLE("HORSE_ZOMBIE_IDLE", "ENTITY_ZOMBIE_HORSE_AMBIENT"),
    TURTLE_IDLE("ENTITY_TURTLE_AMBIENT_LAND"),
    TURTLE_DEATH("ENTITY_TURTLE_DEATH"),
    TURTLE_EGG_BREAK("ENTITY_TURTLE_EGG_BREAK"),
    TURTLE_EGG_CRACK("ENTITY_TURTLE_EGG_CRACK"),
    TURTLE_EGG_HATCH("ENTITY_TURTLE_EGG_HATCH"),
    TURTLE_HURT("ENTITY_TURTLE_HURT"),
    TURTLE_LAY_EGG("ENTITY_TURTLE_LAY_EGG"),
    TURTLE_SHAMBLE("ENTITY_TURTLE_SHAMBLE"),
    TURTLE_SWIM("ENTITY_TURTLE_SWIM"),
    TURTLE_BABY_DEATH("ENTITY_TURTLE_DEATH_BABY"),
    TURTLE_BABY_HURT("ENTITY_TURTLE_HURT_BABY"),
    TURTLE_BABY_SHAMBLE("ENTITY_TURTLE_SHAMBLE_BABY"),
    VEX_IDLE("ENTITY_VEX_AMBIENT"),
    VEX_CHARGE("ENTITY_VEX_CHARGE"),
    VEX_DEATH("ENTITY_VEX_DEATH"),
    VEX_HURT("ENTITY_VEX_HURT"),
    VILLAGER_DEATH("VILLAGER_DEATH", "ENTITY_VILLAGER_DEATH"),
    VILLAGER_HAGGLE("VILLAGER_HAGGLE", "ENTITY_VILLAGER_TRADING", "ENTITY_VILLAGER_TRADE"),
    VILLAGER_HIT("VILLAGER_HIT", "ENTITY_VILLAGER_HURT"),
    VILLAGER_IDLE("VILLAGER_IDLE", "ENTITY_VILLAGER_AMBIENT"),
    VILLAGER_NO("VILLAGER_NO", "ENTITY_VILLAGER_NO"),
    VILLAGER_YES("VILLAGER_YES", "ENTITY_VILLAGER_YES");

    public String sound8;
    public String sound912;
    public String sound13;
    private Sound cachedSound = null;
    private String version = Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3].replace("v", "")
            .replace("R", "").replace("_", ".");

    Sounds(String sound8, String sound912, String sound13) {
        this.sound8 = sound8;
        this.sound912 = sound912;
        this.sound13 = sound13;
    }

    Sounds(String sound8, String sound913) {
        this(sound8, sound913, sound913);
    }

    Sounds(String sound13) {
        this(null, null, sound13);
    }

    public static Sound getSound(String soundName) {

        for (Sounds sound : Sounds.values()) {

            if ((sound.sound13 != null) && sound.sound13.equalsIgnoreCase(soundName)) {
                return sound.getSound();
            }

            if ((sound.sound8 != null) && sound.sound8.equalsIgnoreCase(soundName)) {
                return sound.getSound();
            }

            if ((sound.sound912 != null) && sound.sound912.equalsIgnoreCase(soundName)) {
                return sound.getSound();
            }

//			if (Sound.valueOf(soundName) != null)
//				return Sound.valueOf(soundName);

        }

        return null;
    }

    public void play(Player player) {
        this.play(player, 0.25f, 1f);
    }

    public void play(Player player, float volume, float pitch) {
        player.playSound(player.getLocation(), this.getSound(), volume, pitch);
    }

    private Sound getSound() {
        if (this.cachedSound != null) {
            return this.cachedSound;
        }
        if (this.version.contains("1.8")) {
            return (this.cachedSound = (this.sound8 == null) ? Sound.valueOf("IRONGOLEM_DEATH") : Sound.valueOf(this.sound8));
        } else if (this.version.contains("1.9") || this.version.contains("1.10") || this.version.contains("1.11")
                || this.version.contains("1.12")) {
            return (this.cachedSound = (this.sound912 == null) ? Sound.valueOf("ENTITY_IRONGOLEM_DEATH") : Sound.valueOf(this.sound912));
        } else if (this.version.contains("1.13")) {
            return (this.cachedSound = (this.sound13 == null) ? Sound.valueOf("ENTITY_IRON_GOLEM_DEATH") : Sound.valueOf(this.sound13));
        } else {
            return null;
        }
    }
}
