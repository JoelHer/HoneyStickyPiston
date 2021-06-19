package de.herbst.honeystickypistons;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.NamespacedKey;

public final class HoneyStickyPistons extends JavaPlugin {

    public static String PREFIX = "§6[Sticky Pistons]: §2§o";


    @Override
    public void onEnable() {
        ItemStack item = new ItemStack(Material.STICKY_PISTON);
        ItemStack itemt = new ItemStack(Material.STICKY_PISTON);


        NamespacedKey key = new NamespacedKey(this, "sticky_piston");
        NamespacedKey keyt = new NamespacedKey(this, "sticky_piston_two");

        ShapedRecipe recipe = new ShapedRecipe(key, item);
        ShapedRecipe recipet = new ShapedRecipe(keyt, item);

        recipe.shape(" S ", " E ");
        recipet.shape(" S ", " E ");

        recipe.setIngredient('S', Material.HONEY_BOTTLE);
        recipe.setIngredient('E', Material.PISTON);
        recipet.setIngredient('S', Material.HONEYCOMB, 3);
        recipet.setIngredient('E', Material.PISTON);

        Bukkit.addRecipe(recipe);
        Bukkit.addRecipe(recipet);

        int pluginId = 10231;
        Metrics metrics = new Metrics(this, pluginId);



        log("Plugin successfully loaded");
    }

    @Override
    public void onDisable() {
        log("Plugin successfully unloaded");
        log("Goodbye!");
    }

    public void log(String text) {
        Bukkit.getConsoleSender().sendMessage(PREFIX + text);
    }
}
a