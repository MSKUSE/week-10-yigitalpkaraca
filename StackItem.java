public class StackItem {
    private Object item;
    private StackItem next;

    public StackItem(){


    }

    public StackItem(Object item, StackItem next) {
        this.item = item;
        this.next = next;
    }

    public StackItem(Object item) {
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public StackItem getNext() {
        return next;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }


}
