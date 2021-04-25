public enum WindowSize {

    HSIZE(600), VSIZE(900);

    private final int size;

    WindowSize(int i) {
        this.size = i;
    }
    public int getSize ()
    {
        return size;
    }

}
