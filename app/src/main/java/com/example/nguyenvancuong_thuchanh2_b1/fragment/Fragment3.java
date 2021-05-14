package com.example.nguyenvancuong_thuchanh2_b1.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nguyenvancuong_thuchanh2_b1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_3, container, false);
        TextView tv = v.findViewById(R.id.tv);
        tv.setText(Html.fromHtml("Cherry\n" +
                "Cherry gồm có 2 giống chính là Liberica và Exelsa. Loại này không được phổ biến, nhưng đây là loại có khả năng chống chịu sâu bệnh rất tốt và năng suất rất cao. Được trồng ở những vùng đất khô đầy gió và nắng của vùng cao nguyên.\n" +
                "\n" +
                "Cherry có một đặc điểm và hương vị rất khác lạ. Hạt cà phê vàng, sáng bóng rất đẹp. Khi pha tạo ra mùi thơm thoang thoảng, đặc biệt là vị chua của cherry tạo ra một cảm giác thật sảng khoái. Cherry rất thích hợp với sở thích của phái nữ với sự hòa quyện giữa mùi và vị tạo ra một cảm giác dân dã, cao sang quý phái hòa quyện nhau thât sâu sắc."));
        return v;
    }
}