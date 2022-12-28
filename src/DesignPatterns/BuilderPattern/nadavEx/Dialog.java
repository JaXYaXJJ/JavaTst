package DesignPatterns.BuilderPattern.nadavEx;

interface DialogNegativeClickListener {
    void onCancel();
}

interface DialogPositiveClickListener {
    void onOkay();
}

public class Dialog {
    private DialogNegativeClickListener dialogNegativeClickListener;
    private DialogPositiveClickListener dialogPositiveClickListener;
    private String title;
    private String content;
    private Dialog() {}

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    static class Builder {

        private Dialog dialog;
        public Builder() {
            dialog = new Dialog();

        }

        public Builder setNegativeClickListener (DialogNegativeClickListener listener) {
            dialog.dialogNegativeClickListener = listener;
            return this;
        }

        public Builder setPositiveClickListener (DialogPositiveClickListener listener) {
            dialog.dialogPositiveClickListener = listener;
            return this;
        }

        //add title
        public Builder addTitle (String title) {
            dialog.title = title;
            return this;
        }

        //add content
        public Builder addContent (String content) {
            dialog.content = content;
            return this;
        }

        //add message

        //add text color

        //add background color

        //add positive button action

        //add negative button

        public Dialog build() {
            return dialog;
        }
    }
}
