package framework;

public abstract class ItemCreator {
    public Item create() {
        Item item = null;
        requestItemsInfo();
        item = createItem();
        createItemLog();

        return item;
    }

    abstract protected void requestItemsInfo();
    abstract protected void createItemLog();
    abstract protected Item createItem();
}
