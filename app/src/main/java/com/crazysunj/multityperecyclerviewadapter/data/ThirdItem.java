package com.crazysunj.multityperecyclerviewadapter.data;

import com.crazysunj.multityperecyclerviewadapter.R;
import com.crazysunj.multityperecyclerviewadapter.helper.SimpleHelper;
import com.crazysunj.multityperecyclerviewadapter.sticky.ThirdStickyItem;

import java.util.UUID;

/**
 * Created by sunjian on 2017/3/28.
 */

public class ThirdItem implements ThirdStickyItem {

    private String name;
    private long id;
    private int img = R.mipmap.ic_launcher;
    private String stickyName = "第三条粘性";

    public ThirdItem(String name) {
        this.name = name;
    }

    public ThirdItem(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public int getImg() {
        return img;
    }

    public String getName() {
        return name;
    }

    @Override
    public long getId() {
        if (id == 0) {
            return id = UUID.nameUUIDFromBytes((name + stickyName).getBytes()).hashCode();
        }
        return id;
    }

    @Override
    public long getHeaderId() {
        return 3;
    }

    @Override
    public int getItemType() {
        return SimpleHelper.TYPE_FOUR;
    }

    @Override
    public String getStickyName() {
        return stickyName;
    }
}
