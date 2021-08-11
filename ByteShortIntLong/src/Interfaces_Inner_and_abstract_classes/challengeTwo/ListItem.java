package Interfaces_Inner_and_abstract_classes.challengeTwo;

public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;

    public ListItem(Object item){
        this.value = item;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem itemToCompare);

    public Object getValue(){
        return value;
    }

    public void setValue(Object inputValue){
        this.value = inputValue;
    }

}
