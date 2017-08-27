package lk.mu;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin implements Listener
{	
	FileConfiguration config = getConfig();
	Inventory inv = Bukkit.createInventory(null , 27  , config.getString("menu"));
   public void onEnable()
  {
	   Bukkit.getPluginManager().registerEvents(this,this); 
		Bukkit.getConsoleSender().sendMessage("§e[MusicPlus]"+ChatColor.GREEN+ "插件加载成功");
		saveDefaultConfig();
  }
   public void onDisable()
  {
		Bukkit.getConsoleSender().sendMessage("§e[MusicPlus]"+ChatColor.RED+ "插件卸载成功");
  }
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ) 
   {      
	      if ((sender instanceof Player))
	      {
	        Player p = ((Player)sender).getPlayer();
	        if (((p.hasPermission("music.admin")) || (p.isOp())) && 
	          (cmd.getName().equalsIgnoreCase("mreload")))
	        {
	          p.sendMessage("§e[MusicPlus]§c插件重载成功！"); 
	          reloadConfig();
	          return true;
	        }
	        if (((p.hasPermission("music.use")) || (p.isOp())) && 
	          (cmd.getName().equalsIgnoreCase("music")))
	        {
	        String open = config.getString("open");
		      ItemStack item1= new ItemStack(Material.WOOL, 1 ,(short)14);
		      ItemMeta i1 = item1.getItemMeta();
		      i1.setDisplayName(config.getString("m1name"));
		      List<String> lore1 = config.getStringList("m1lore");
		      i1.setLore(lore1); 
		      item1.setItemMeta(i1);
		      inv.setItem(0, item1);
		      //——————————————————
		      ItemStack stop1= new ItemStack(Material.BARRIER, 1);
		      ItemMeta s1 = stop1.getItemMeta();
		      s1.setDisplayName(config.getString("stop"));
		      List<String> st1 = config.getStringList("stoplore");
		      s1.setLore(st1); 
		      stop1.setItemMeta(s1);
		      inv.setItem(22, stop1);
		      //——————————————————
		      ItemStack stop2= new ItemStack(Material.APPLE, 1);
		      ItemMeta s2 = stop2.getItemMeta();
		      s2.setDisplayName(config.getString("stop2"));
		      List<String> st2 = config.getStringList("stoplore2");
		      s2.setLore(st2); 
		      stop2.setItemMeta(s2);
		      inv.setItem(26, stop2);
		      //——————————————————
		      ItemStack item2 = new ItemStack(Material.WOOL, 1 ,(short)1);
		      ItemMeta i2 = item2.getItemMeta();
		      i2.setDisplayName(config.getString("m2name"));
		      List<String> lore2 = config.getStringList("m2lore");
		      i2.setLore(lore2); 
		      item2.setItemMeta(i2);
		      inv.setItem(1, item2);
		      //——————————————————
		      ItemStack item3 = new ItemStack(Material.WOOL, 1 ,(short)4);
		      ItemMeta i3 = item3.getItemMeta();
		      i3.setDisplayName(config.getString("m3name"));
		      List<String> lore3 = config.getStringList("m3lore");
		      i3.setLore(lore3); 
		      item3.setItemMeta(i3);
		      inv.setItem(2, item3);
		      //——————————————————
		      ItemStack item4 = new ItemStack(Material.WOOL, 1 ,(short)5);
		      ItemMeta i4 = item4.getItemMeta();
		      i4.setDisplayName(config.getString("m4name"));
		      List<String> lore4 = config.getStringList("m4lore");
		      i4.setLore(lore4); 
		      item4.setItemMeta(i4);
		      inv.setItem(3, item4);
		      //——————————————————
		      ItemStack item5 = new ItemStack(Material.WOOL, 1 ,(short)13);
		      ItemMeta i5 = item5.getItemMeta();
		      i5.setDisplayName(config.getString("m5name"));
		      List<String> lore5 = config.getStringList("m5lore");
		      i5.setLore(lore5); 
		      item5.setItemMeta(i5);
		      inv.setItem(4, item5);
		      //——————————————————
		      ItemStack item6 = new ItemStack(Material.WOOL, 1 ,(short)9);
		      ItemMeta i6= item6.getItemMeta();
		      i6.setDisplayName(config.getString("m6name"));
		      List<String> lore6 = config.getStringList("m6lore");
		      i6.setLore(lore6); 
		      item6.setItemMeta(i6);
		      inv.setItem(5, item6);
		      //——————————————————
		      ItemStack item7 = new ItemStack(Material.WOOL, 1 ,(short)3);
		      ItemMeta i7= item7.getItemMeta();
		      i7.setDisplayName(config.getString("m7name"));
		      List<String> lore7 = config.getStringList("m7lore");
		      i7.setLore(lore7); 
		      item7.setItemMeta(i7);
		      inv.setItem(6, item7);
		      //——————————————————
		      ItemStack item8 = new ItemStack(Material.WOOL, 1 ,(short)11);
		      ItemMeta i8= item8.getItemMeta();
		      i8.setDisplayName(config.getString("m8name"));
		      List<String> lore8 = config.getStringList("m8lore");
		      i8.setLore(lore8); 
		      item8.setItemMeta(i8);
		      inv.setItem(7, item8);
		      //——————————————————
		      ItemStack item9 = new ItemStack(Material.WOOL, 1 ,(short)10);
		      ItemMeta i9= item9.getItemMeta();
		      i9.setDisplayName(config.getString("m9name"));
		      List<String> lore9 = config.getStringList("m9lore");
		      i9.setLore(lore9); 
		      item9.setItemMeta(i9);
		      inv.setItem(8, item9);
		      //——————————————————
		      ItemStack item10 = new ItemStack(Material.WOOL, 1 ,(short)2);
		      ItemMeta i10= item10.getItemMeta();
		      i10.setDisplayName(config.getString("m10name"));
		      List<String> lore10 = config.getStringList("m10lore");
		      i10.setLore(lore10); 
		      item10.setItemMeta(i10);
		      inv.setItem(9, item10);
		      //——————————————————
		      ItemStack item11 = new ItemStack(Material.WOOL, 1 ,(short)6);
		      ItemMeta i11= item11.getItemMeta();
		      i11.setDisplayName(config.getString("m11name"));
		      List<String> lore11 = config.getStringList("m11lore");
		      i11.setLore(lore11); 
		      item11.setItemMeta(i11);
		      inv.setItem(10, item11);
		      //——————————————————
		      ItemStack item12 = new ItemStack(Material.WOOL, 1 ,(short)15);
		      ItemMeta i12= item12.getItemMeta();
		      i12.setDisplayName(config.getString("m12name"));
		      List<String> lore12 = config.getStringList("m12lore");
		      i12.setLore(lore12); 
		      item12.setItemMeta(i12);
		      inv.setItem(11, item12);
		      //——————————————————
		      ItemStack item13 = new ItemStack(Material.STAINED_GLASS, 1  ,(short)14);
		      ItemMeta i13= item13.getItemMeta();
		      i13.setDisplayName(config.getString("m13name"));
		      List<String> lore13 = config.getStringList("m13lore");
		      i13.setLore(lore13); 
		      item13.setItemMeta(i13);
		      inv.setItem(12, item13);
		      //——————————————————
		      ItemStack item14 = new ItemStack(Material.STAINED_GLASS, 1  ,(short)1);
		      ItemMeta i14= item14.getItemMeta();
		      i14.setDisplayName(config.getString("m14name"));
		      List<String> lore14 = config.getStringList("m14lore");
		      i14.setLore(lore14); 
		      item14.setItemMeta(i14);
		      inv.setItem(13, item14);
		      //——————————————————
		      ItemStack item15 = new ItemStack(Material.STAINED_GLASS, 1  ,(short)4);
		      ItemMeta i15= item15.getItemMeta();
		      i15.setDisplayName(config.getString("m15name"));
		      List<String> lore15 = config.getStringList("m15lore");
		      i15.setLore(lore15); 
		      item15.setItemMeta(i15);
		      inv.setItem(14, item15);
		      //——————————————————
		      ItemStack item16 = new ItemStack(Material.STAINED_GLASS, 1  ,(short)5);
		      ItemMeta i16= item16.getItemMeta();
		      i16.setDisplayName(config.getString("m16name"));
		      List<String> lore16 = config.getStringList("m16lore");
		      i16.setLore(lore16); 
		      item16.setItemMeta(i16);
		      inv.setItem(15, item16);
		      //——————————————————
		      ItemStack item17 = new ItemStack(Material.STAINED_GLASS, 1  ,(short)3);
		      ItemMeta i17= item17.getItemMeta();
		      i17.setDisplayName(config.getString("m17name"));
		      List<String> lore17 = config.getStringList("m17lore");
		      i17.setLore(lore17); 
		      item17.setItemMeta(i17);
		      inv.setItem(16, item17);
		      //——————————————————
		      ItemStack item18 = new ItemStack(Material.STAINED_GLASS, 1  ,(short)2);
		      ItemMeta i18= item18.getItemMeta();
		      i18.setDisplayName(config.getString("m18name"));
		      List<String> lore18 = config.getStringList("m18lore");
		      i18.setLore(lore18); 
		      item18.setItemMeta(i18);
		      inv.setItem(17, item18);
	          p.sendMessage(open);
	          p.closeInventory();
	          p.openInventory(this.inv);
	          return true;
	        }
	        p.sendMessage("§c你没有使用该命令的权限");
	        return true;
	      }
	      Bukkit.getConsoleSender().sendMessage("§c只有玩家才能使用此命令！");
	      return true;
	    }
	  

   @EventHandler
   public void onInventoryClick(InventoryClickEvent e)
   {
     if (!(e.getWhoClicked() instanceof Player)) {
       return;
     }
     Player p = (Player)e.getWhoClicked();
     if (e.getInventory().getTitle().equalsIgnoreCase(config.getString("menu")))
     {
         Location loc = p.getLocation();
       e.setCancelled(true);
       p.updateInventory();
       if (e.getRawSlot() == 0)
       {
           p.stopSound(Sound.RECORD_13);
        p.playSound(loc, Sound.RECORD_13, 1, 1);
         p.closeInventory();
         p.openInventory(inv);
	        p.sendMessage("§b正在播放："+config.getString("m1name"));
	        return;
       }
       if (e.getRawSlot() == 22)
       {
        p.stopSound(Sound.RECORD_13);
        p.stopSound(Sound.RECORD_CAT);
        p.stopSound(Sound.RECORD_BLOCKS);
        p.stopSound(Sound.RECORD_CHIRP);
        p.stopSound(Sound.RECORD_FAR);
        p.stopSound(Sound.RECORD_MALL);
        p.stopSound(Sound.RECORD_MELLOHI);
        p.stopSound(Sound.RECORD_STAL);
        p.stopSound(Sound.RECORD_STRAD);
        p.stopSound(Sound.RECORD_WARD);
        p.stopSound(Sound.RECORD_11);
        p.stopSound(Sound.RECORD_WAIT);
         p.closeInventory();
         p.openInventory(this.inv);
	        p.sendMessage("§c你关闭了音乐播放");
	        return;
       }
       //——————————————————
       if (e.getRawSlot() == 26)
       {
        p.stopSound(Sound.MUSIC_GAME );
        p.stopSound(Sound.MUSIC_CREATIVE);
        p.stopSound(Sound.MUSIC_CREDITS);
        p.stopSound(Sound.MUSIC_END);
        p.stopSound(Sound.MUSIC_MENU);
        p.stopSound(Sound.MUSIC_NETHER);
        p.sendMessage("§c你关闭了音乐播放");
         p.closeInventory();
         p.openInventory(this.inv);
         return;
       }
       //——————————————————
       if (e.getRawSlot() == 1)
       {
           p.stopSound(Sound.RECORD_CAT);
        p.playSound(loc, Sound.RECORD_CAT, 1, 1);
        p.sendMessage("§b正在播放："+config.getString("m2name"));
         p.closeInventory();
         p.openInventory(this.inv);
         return;
       }
       //——————————————————
       if (e.getRawSlot() == 2)
       {
           p.stopSound(Sound.RECORD_BLOCKS);
        p.playSound(loc, Sound.RECORD_BLOCKS, 1, 1);
        p.sendMessage("§b正在播放："+config.getString("m3name"));
         p.closeInventory();
         p.openInventory(this.inv);
         return;
       }
       //——————————————————
       if (e.getRawSlot() == 3)
       {
           p.stopSound(Sound.RECORD_CHIRP);
        p.playSound(loc, Sound.RECORD_CHIRP, 1, 1);
        p.sendMessage("§b正在播放："+config.getString("m4name"));
         p.closeInventory();
         p.openInventory(this.inv);
         return;
       }
       //——————————————————
       if (e.getRawSlot() == 4)
       {
           p.stopSound(Sound.RECORD_FAR);
        p.playSound(loc, Sound.RECORD_FAR, 1, 1);
        p.sendMessage("§b正在播放："+config.getString("m5name"));
         p.closeInventory();
         p.openInventory(this.inv);
         return;
       }
       //——————————————————
       if (e.getRawSlot() == 5)
       {
           p.stopSound(Sound.RECORD_MALL);
        p.playSound(loc, Sound.RECORD_MALL, 1, 1);
        p.sendMessage("§b正在播放："+config.getString("m6name"));
         p.closeInventory();
         p.openInventory(this.inv);
         return;
       }
       //——————————————————
       if (e.getRawSlot() == 6)
       {
           p.stopSound(Sound.RECORD_MELLOHI);
        p.playSound(loc, Sound.RECORD_MELLOHI, 1, 1);
        p.sendMessage("§b正在播放："+config.getString("m7name"));
         p.closeInventory();
         p.openInventory(this.inv);
         return;
       }
       //——————————————————
       if (e.getRawSlot() == 7)
       {
           p.stopSound(Sound.RECORD_STAL);
        p.playSound(loc, Sound.RECORD_STAL, 1, 1);
        p.sendMessage("§b正在播放："+config.getString("m8name"));
         p.closeInventory();
         p.openInventory(this.inv);
         return;
       }
       //——————————————————
       if (e.getRawSlot() == 8)
       {
           p.stopSound(Sound.RECORD_STRAD);
        p.playSound(loc, Sound.RECORD_STRAD, 1, 1);
        p.sendMessage("§b正在播放："+config.getString("m9name"));
         p.closeInventory();
         p.openInventory(this.inv);
         return;
       }
         //——————————————————
         if (e.getRawSlot() == 9)
         {
             p.stopSound(Sound.RECORD_WARD);
          p.playSound(loc, Sound.RECORD_WARD, 1, 1);
	        p.sendMessage("§b正在播放："+config.getString("m10name"));
           p.closeInventory();
           p.openInventory(this.inv);
           return;
         }
           //——————————————————
           if (e.getRawSlot() == 10)
           {
               p.stopSound(Sound.RECORD_11);
            p.playSound(loc, Sound.RECORD_11, 1, 1);
	        p.sendMessage("§b正在播放："+config.getString("m11name"));
             p.closeInventory();
             p.openInventory(this.inv);
             return;
           }
             //——————————————————
             if (e.getRawSlot() == 11)
             {
                 p.stopSound(Sound.RECORD_WAIT);
              p.playSound(loc, Sound.RECORD_WAIT, 1, 1);
  	        p.sendMessage("§b正在播放："+config.getString("m12name"));
               p.closeInventory();
               p.openInventory(this.inv);
               return;
             }
             //——————————————————
             if (e.getRawSlot() == 12)
             {
                 p.stopSound(Sound.MUSIC_CREATIVE);
              p.playSound(loc, Sound.MUSIC_CREATIVE , 1, 1);
  	        p.sendMessage("§b正在播放："+config.getString("m13name"));
               p.closeInventory();
               p.openInventory(this.inv);
               return;
             }
             //——————————————————
             if (e.getRawSlot() == 13)
             {
                 p.stopSound(Sound.MUSIC_NETHER);
              p.playSound(loc, Sound.MUSIC_NETHER , 1, 1);
  	        p.sendMessage("§b正在播放："+config.getString("m14name"));
               p.closeInventory();
               p.openInventory(this.inv);
               return;
             }
             //——————————————————
             if (e.getRawSlot() == 14)
             {
                 p.stopSound(Sound.MUSIC_MENU);
              p.playSound(loc, Sound.MUSIC_MENU , 1, 1);
  	        p.sendMessage("§b正在播放："+config.getString("m15name"));
               p.closeInventory();
               p.openInventory(this.inv);
               return;
             }
             //——————————————————
             if (e.getRawSlot() == 15)
             {
                 p.stopSound(Sound.MUSIC_END );
              p.playSound(loc, Sound.MUSIC_END  , 1, 1);
  	        p.sendMessage("§b正在播放："+config.getString("m16name"));
               p.closeInventory();
               p.openInventory(this.inv);
               return;
             }
             //——————————————————
             if (e.getRawSlot() == 16)
             {
                 p.stopSound(Sound.MUSIC_CREDITS );
              p.playSound(loc, Sound.MUSIC_CREDITS  , 1, 1);
  	        p.sendMessage("§b正在播放："+config.getString("m17name"));
               p.closeInventory();
               p.openInventory(this.inv);
               return;
             }
             //——————————————————
             if (e.getRawSlot() == 17)
             {
                 p.stopSound(Sound.MUSIC_GAME);
              p.playSound(loc, Sound.MUSIC_GAME , 1, 1);
  	        p.sendMessage("§b正在播放："+config.getString("m18name"));
               p.closeInventory();
               p.openInventory(this.inv);
               return;
             }
             }
   }
         }
   


