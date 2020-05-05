package by.gvu.jd2.bean;

import java.util.List;

public class CatalogInfo {
    private int id = 0;
    private int level = 0;
    private String name = null;
    private boolean isMenu = true;
    private GroupAttributes groupAttribute = null;
    private boolean isOpen = false;
    private List<CatalogInfo> subMenuItems = null;

    public CatalogInfo() {
    }

    public CatalogInfo(int id, int level, String name, boolean isMenu, GroupAttributes groupAttribute, boolean isOpen, List<CatalogInfo> subMenuItems) {
        this.id = id;
        this.level = level;
        this.name = name;
        this.isMenu = isMenu;
        this.groupAttribute = groupAttribute;
        this.isOpen = isOpen;
        this.subMenuItems = subMenuItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMenu() {
        return isMenu;
    }

    public void setMenu(boolean menu) {
        isMenu = menu;
    }

    public GroupAttributes getGroupAttribute() {
        return groupAttribute;
    }

    public void setGroupAttribute(GroupAttributes groupAttribute) {
        this.groupAttribute = groupAttribute;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public List<CatalogInfo> getSubMenuItems() {
        return subMenuItems;
    }

    public void setSubMenuItems(List<CatalogInfo> subMenuItems) {
        this.subMenuItems = subMenuItems;
    }
}
