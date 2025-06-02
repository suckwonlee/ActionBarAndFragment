package kr.ac.kopo.actionbarandfragment;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MyTabFragment extends Fragment {

    String tabName;

    @Override
    public void onCreate(@Nullable Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        Bundle data = getArguments();
        tabName = data.getString("tabName");
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout baseLayout = new LinearLayout(super.getActivity());
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT);
        baseLayout.setLayoutParams(params);
        baseLayout.setGravity(Gravity.CENTER);

        ImageView img1=new ImageView(super.getActivity());
        img1.setImageResource(R.drawable.spring);
        img1.setAdjustViewBounds(true);

        baseLayout.addView(img1);

        if (tabName.equals("spring")){
            baseLayout.setBackgroundColor(Color.parseColor("#ADFF2F"));
            img1.setImageResource(R.drawable.spring);}
        if (tabName.equals("summer")) {
            baseLayout.setBackgroundColor(Color.parseColor("#DC143C"));
            img1.setImageResource(R.drawable.summer);}
        if (tabName.equals("fall")) {
            baseLayout.setBackgroundColor(Color.parseColor("#A52A2A"));
            img1.setImageResource(R.drawable.fall);}


        return baseLayout;
    }
}