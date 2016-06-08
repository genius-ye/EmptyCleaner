package com.genius.emptycleaner;

import java.io.File;

/**
 * Created by genius-ye on 2016/6/6.
 */
public class DataBean {
    private File file;
    private boolean isSelected;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
