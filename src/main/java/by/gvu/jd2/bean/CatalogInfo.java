package by.gvu.jd2.bean;

import java.io.Serializable;
import java.util.List;

public class CatalogInfo implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CatalogInfo)) return false;

        CatalogInfo that = (CatalogInfo) o;

        if (id != that.id) return false;
        if (level != that.level) return false;
        if (isMenu != that.isMenu) return false;
        if (isOpen != that.isOpen) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (groupAttribute != null ? !groupAttribute.equals(that.groupAttribute) : that.groupAttribute != null)
            return false;
        return subMenuItems != null ? subMenuItems.equals(that.subMenuItems) : that.subMenuItems == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + level;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (isMenu ? 1 : 0);
        result = 31 * result + (groupAttribute != null ? groupAttribute.hashCode() : 0);
        result = 31 * result + (isOpen ? 1 : 0);
        result = 31 * result + (subMenuItems != null ? subMenuItems.hashCode() : 0);
        return result;
    }
}
