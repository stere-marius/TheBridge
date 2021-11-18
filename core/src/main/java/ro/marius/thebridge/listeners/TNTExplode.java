package ro.marius.thebridge.listeners;

import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.craftbukkit.v1_16_R2.CraftWorld;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.BlockIterator;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;
import ro.marius.thebridge.TheBridgePlugin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class TNTExplode implements Listener {

//    @EventHandler
//    public void onInteractTNT(PlayerInteractEvent e){
//
//        if(!e.hasItem())
//            return;
//
//        if(e.getClickedBlock() == null)
//            return;
//
//        if(e.getItem().getType() != Material.TNT)
//            return;
//
//        TNTPrimed tnt = e.getClickedBlock().getLocation().getWorld().spawn(e.getClickedBlock().getLocation().add(0.5D, 1.25, 0.5D), TNTPrimed.class);
//        tnt.setFuseTicks(40);
//        e.setCancelled(true);
//    }

    public static final BlockFace[] axis = {BlockFace.NORTH, BlockFace.EAST, BlockFace.SOUTH, BlockFace.WEST};
    public static final BlockFace[] radial = {BlockFace.NORTH, BlockFace.NORTH_EAST, BlockFace.EAST, BlockFace.SOUTH_EAST, BlockFace.SOUTH, BlockFace.SOUTH_WEST, BlockFace.WEST, BlockFace.NORTH_WEST};
    private static final BlockFace[] FACES = {BlockFace.NORTH, BlockFace.EAST, BlockFace.SOUTH, BlockFace.WEST};

    public static Vector f(Location loc1, Location loc2) {
        double vecX = (loc1.getX() - loc2.getX()) * -1.0D;
        double vecY = (loc1.getY() - loc2.getY()) * -1.0D;
        double vecZ = (loc1.getZ() - loc2.getZ()) * -1.0D;
        return new Vector(vecX, vecY, vecZ).normalize();
    }

    public static RayTraceResult rayTraceResult(Location location, Vector direction, int range) {
        if (range < 0)
            return null;
        RayTraceResult result = Objects.requireNonNull(location.getWorld()).rayTraceBlocks(location, direction, range);

        if ((result != null && result.getHitBlock() != null && result.getHitBlock().getType() != Material.GLASS))
            return rayTraceResult(location.clone().add(direction), direction, range - 1);
        return result;
    }

    /**
     * Gets the horizontal Block Face from a given yaw angle<br>
     * This includes the NORTH_WEST faces
     *
     * @param yaw angle
     * @return The Block Face of the angle
     */
    public static BlockFace yawToFace(float yaw) {
        return yawToFace(yaw, false);
    }

    /**
     * Gets the horizontal Block Face from a given yaw angle
     *
     * @param yaw                      angle
     * @param useSubCardinalDirections setting, True to allow NORTH_WEST to be returned
     * @return The Block Face of the angle
     */
    public static BlockFace yawToFace(float yaw, boolean useSubCardinalDirections) {
        if (useSubCardinalDirections) {
            return radial[Math.round(yaw / 45f) & 0x7];
        } else {
            return axis[Math.round(yaw / 90f) & 0x3];
        }
    }

    @EventHandler
    public void onExplode(EntityExplodeEvent e) {

        if (e.getEntityType() != EntityType.PRIMED_TNT)
            return;



        e.blockList()
                .stream()
                .filter(block -> block.getType().name().endsWith("WOOL"))
                .collect(Collectors.toList())
                .forEach(block -> {
                    Location tntLocation = e.getEntity().getLocation().clone();
                    tntLocation.add(block.getLocation().toVector().subtract(tntLocation.toVector()));
                    Bukkit.broadcastMessage(tntLocation.getBlock().getType().name());
                    tntLocation.getBlock().setType(Material.BEACON);
                });



        e.blockList().clear();

        // Fac subtract dintre tntLocation si blockLocation
        // Fac blockLocation.getDirection().add(. , . , .).toLocation().getBlock()



//        e.blockList().removeIf(b -> b.getType().name().endsWith("_GLASS"));
//
//
//        Location entityLocation = e.getEntity().getLocation().add(0.5, 0, 0.5);
//        Vector target = entityLocation.toVector();
//        Iterator<Block> blockIterator = e.blockList().iterator();

        // spawnez de la block-ul respectiv la tnt
        // daca gasesc glass pe acelasi y, ii dau remove la block

//        Map<Block, BlockIterator> blockIteratorMap = new HashMap<>();
//
//        while (blockIterator.hasNext()) {
//
//            Block block = blockIterator.next();
//            Location blockLocation = block.getLocation();
//
//            BlockIterator blocks = new BlockIterator(
//                    entityLocation.getWorld(),
//                    blockLocation.toVector(),
//                    blockLocation.toVector().subtract(entityLocation.toVector()),
//                    0,
//                    (int) Math.floor(entityLocation.distance(blockLocation)));
//
//            blockIteratorMap.put(block, blocks);
//
//            Bukkit.broadcastMessage("Distance between exploded block " + block.getType().name() + " and tnt " + ((int) Math.floor(entityLocation.distance(blockLocation))));
//            Bukkit.broadcastMessage("Vector: " + blockLocation.toVector().subtract(entityLocation.toVector()).normalize());
//            while (blocks.hasNext()) {
//                Block traceBlock = blocks.next();
//
//                Bukkit.broadcastMessage("Iterating through the blocks iterator " + traceBlock.getType().name());
//
//                if (traceBlock.getType().name().endsWith("_GLASS")) {
//                    blockIterator.remove();
//                    break;
//                }
//            }
//        }


//        for (Block block : e.blockList()) {
//
//            Bukkit.broadcastMessage("Block type " + block.getType().name());
//
//            if (!block.getType().name().endsWith("WOOL"))
//                continue;
//
//            spawnParticle(entityLocation, block.getLocation());
//        }
//
//            Location bLocation = block.getLocation();
//
//
//            BlockIterator blocksToAdd = new BlockIterator(
//                    entityLocation.getWorld(),
//                    entityLocation.toVector(),
//                    bLocation.toVector().subtract(entityLocation.toVector()),
//                    0,
//                    (int) Math.floor(entityLocation.distance(bLocation)));
//            Location blockToAdd;
//            while(blocksToAdd.hasNext()) {
//                blockToAdd = blocksToAdd.next().getLocation();
//
//                if(!blockToAdd.getBlock().getType().name().endsWith("_GLASS")){
//                    e.blockList().remove(blockToAdd.getBlock());
//                }
//
//                new Location(blockToAdd.getWorld(), blockToAdd.getBlockX(), blockToAdd.getBlockY(), blockToAdd.getBlockZ()).getBlock().setType(Material.BEACON);
//            }
//
//
//
//            Location blockLocation = lookAt(entityLocation, block.getLocation());
//            Bukkit.broadcastMessage("1. " + getDirectionFrom(entityLocation,blockLocation));
//            Bukkit.broadcastMessage("2. " + getDirectionFrom(blockLocation, entityLocation));
//            Bukkit.broadcastMessage("3. " + yawToFace(blockLocation.getYaw()));
//
//            if(block.getRelative(yawToFace(blockLocation.getYaw())).getType().name().endsWith("_GLASS")){
//                blockIterator.remove();
//                Bukkit.broadcastMessage("Removed a block from the blocks list");
//            }
//
//            for(BlockFace blockFace: BlockFace.values()){
//
//                if(block.getRelative(blockFace).getType().name().endsWith("_GLASS")){
//                    Bukkit.broadcastMessage("Found glass at block face " + blockFace.name());
//                }
//
//            }
//
//        }

    }

    public void spawnParticle(Location start, Location end) {

        new BukkitRunnable() {

            @Override
            public void run() {
                drawLine(start, end, 10);
            }
        }.runTaskTimer(TheBridgePlugin.INSTANCE, 20, 20);

    }

    public void drawLine(
            /* Would be your orange wool */Location point1,
            /* Your white wool */ Location point2,
            /*Space between each particle*/double space
    ) {

        World world = point1.getWorld();

        /*Throw an error if the points are in different worlds*/

        /*Distance between the two particles*/
        double distance = point1.distance(point2);

        /* The points as vectors */
        Vector p1 = point1.toVector();
        Vector p2 = point2.toVector();

        /* Subtract gives you a vector between the points, we multiply by the space*/
        Vector vector = p2.clone().subtract(p1).normalize().multiply(space);

        /*The distance covered*/
        double covered = 0;

        /* We run this code while we haven't covered the distance, we increase the point by the space every time*/
        for (; covered < distance; p1.add(vector)) {
            /*Spawn the particle at the point*/
            world.spawnParticle(Particle.DRIP_WATER, p1.getX(), p1.getY(), p1.getZ(), 1);

            /* We add the space covered */
            covered += space;
        }
    }

    public void makeParticleLine(Location from, Location to) {

        from.subtract(to);

        double distance = from.distance(to);
        Vector direction = from.subtract(to).toVector();

        for (double i = 0; i < distance; i += 0.1) {
            Location particle = from.add(direction.normalize().multiply(i));
            particle.getWorld().spawnParticle(Particle.CLOUD, particle, 20);
            //Display particle at location 'particle'
        }
    }

    public void spawnParticleAlongLine(Location start,
                                       Location end,
                                       Particle particle,
                                       int pointsPerLine,
                                       int particleCount,
                                       double offsetX,
                                       double offsetY,
                                       double offsetZ
    ) {
        double d = start.distance(end) / pointsPerLine;
        for (int i = 0; i < pointsPerLine; i++) {
            Location l = start.clone();
            Vector direction = end.toVector().subtract(start.toVector()).normalize();
            Vector v = direction.multiply(i * d);
            l.add(v.getX(), v.getY(), v.getZ());
            start.getWorld().spawnParticle(particle, l, particleCount, offsetX, offsetY, offsetZ);
        }
    }

    public BlockFace getDirectionFrom(Location loc1, Location loc2) {
        Vector difference = loc2.toVector().subtract(loc1.getDirection()).setY(0).normalize();
        for (BlockFace face : FACES) {
            if (face.getDirection().dot(difference) >= 0.5) {
                return face;
            }
        }

        return null;
    }

    public Location lookAt(Location loc, Location lookat) {
        //Clone the loc to prevent applied changes to the input loc
        loc = loc.clone();
        // Values of change in distance (make it relative)
        double dx = lookat.getX() - loc.getX();
        double dy = lookat.getY() - loc.getY();
        double dz = lookat.getZ() - loc.getZ();
        // Set yaw
        if (dx != 0) {
            // Set yaw start value based on dx
            if (dx < 0) {
                loc.setYaw((float) (1.5 * Math.PI));
            } else {
                loc.setYaw((float) (0.5 * Math.PI));
            }
            loc.setYaw((float) loc.getYaw() - (float) Math.atan(dz / dx));
        } else if (dz < 0) {
            loc.setYaw((float) Math.PI);
        }
        // Get the distance from dx/dz
        double dxz = Math.sqrt(Math.pow(dx, 2) + Math.pow(dz, 2));
        // Set pitch
        loc.setPitch((float) -Math.atan(dy / dxz));
        // Set values, convert to degrees (invert the yaw since Bukkit uses a different yaw dimension format)
        loc.setYaw(-loc.getYaw() * 180f / (float) Math.PI);
        loc.setPitch(loc.getPitch() * 180f / (float) Math.PI);
        return loc;
    }
//    public BlockFace getDirectionFrom(Location woolLocation, Location tntLocation) {
//        // TODO In construction
//        Location loc = woolLocation.subtract(tntLocation);
//        Vector vector = loc.toVector();
//
//        double yaw = Math.atan2(vector.getZ(), vector.getX());
//        double newYaw = Math.toDegrees(yaw + Math.PI);
//        final BlockFace[] axes = { BlockFace.NORTH, BlockFace.EAST, BlockFace.SOUTH, BlockFace.WEST };
//        return axes[(int) (newYaw / 90) % 4];
//    }

    private BlockFace getDirection(double rot) {
        if (0 <= rot && rot < 22.5) {
            return BlockFace.NORTH;
        } else if (22.5 <= rot && rot < 67.5) {
            return BlockFace.NORTH_EAST;
        } else if (67.5 <= rot && rot < 112.5) {
            return BlockFace.EAST;
        } else if (112.5 <= rot && rot < 157.5) {
            return BlockFace.SOUTH_EAST;
        } else if (157.5 <= rot && rot < 202.5) {
            return BlockFace.SOUTH;
        } else if (202.5 <= rot && rot < 247.5) {
            return BlockFace.SOUTH_WEST;
        } else if (247.5 <= rot && rot < 292.5) {
            return BlockFace.WEST;
        } else if (292.5 <= rot && rot < 337.5) {
            return BlockFace.NORTH_WEST;
        } else if (337.5 <= rot && rot < 360.0) {
            return BlockFace.NORTH;
        } else {
            return BlockFace.SELF;
        }
    }

    private final float getAngle(Vector point1, Vector point2) {
        double dx = point2.getX() - point1.getX();
        double dz = point2.getZ() - point1.getZ();
        float angle = (float) Math.toDegrees(Math.atan2(dz, dx)) - 90;
        if (angle < 0) {
            angle += 360.0F;
        }
        return angle;
    }

//    private BlockFace getDirection(Location woolLocation, Location tntLocation) {
//
//        if(woolLocation.getZ() > tntLocation.getZ()){
//
//        }
//
//    }

}
