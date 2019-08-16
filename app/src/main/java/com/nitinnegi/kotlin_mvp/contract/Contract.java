package com.nitinnegi.kotlin_mvp.contract;

import com.nitinnegi.kotlin_mvp.view.adapter.BaseItem;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Contract {

    public interface View {

        void updateAdapterInformation(@NotNull ArrayList<BaseItem> baseItemList);
    }

    public interface Presenter {

        void fetchValues();
    }


}
