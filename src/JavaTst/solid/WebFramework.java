package JavaTst.solid;

public class WebFramework {

    public void save(IForm frm) {
        ISQL db = new MySQL();
        db.save(frm);
    }
}
