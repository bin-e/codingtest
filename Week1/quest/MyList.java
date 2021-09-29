public class MyList<E> {
    MyNode<E> node;
    int size = 0;

    public void add(E data) {
        if (size <= 0) {
            node = new MyNode<>(data);
        } else {
            MyNode<E> e = new MyNode<>(data);
            e.setPrev(node);
            node.setNext(e);
            ++size;
        }
    }

    public MyNode<E> getPrev() {
        return null;
    }

    public E get(int index) {
        this.checkSize(index);

        E returnData = null;
        MyNode<E> pointer = this.node;
        while( index != this.size )
        {
            pointer = pointer.getPrev();
        }

        return pointer.getData();
    }

    public void remove(int index) {

    }

    private void checkSize(int index) {
        if ( index > this.size ) throw new StackOverflowError();
    }
}
