public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR  = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCdoe;

    public Movie(String _title, int _priceCdoe) {
        this._title = _title;
        this._priceCdoe = _priceCdoe;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public int get_priceCdoe() {
        return _priceCdoe;
    }

    public void set_priceCdoe(int _priceCdoe) {
        this._priceCdoe = _priceCdoe;
    }
}
