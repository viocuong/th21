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
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
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
        View v = inflater.inflate(R.layout.fragment_2, container, false);
        TextView tv = v.findViewById(R.id.tv);
        tv.setText(Html.fromHtml("Moka\n" +
                "Moka thuộc chi Arabica, được người Pháp di thực từ những năm 30 của thế kỉ trước. Trồng ở Đà Lạt. Giống cà phê hạt này khó trồng, đòi hỏi công chăm sóc rất kỹ. Dễ bị sâu bệnh, cần có điều kiện môi trường lẫn kỹ thuận chăm bón đặc thù. Nhưng năng xuất lại rất ít. Cây cà phê hạt Moka chỉ có thể sinh truởng và phát triển ở độ cao từ 1500m. Càng lên cao, cộng thêm với điều kiện thổ nhưỡng. Canh tác phù hợp thì  hương vị và chất lượng của moka càng tuyệt vời. Có thể nói moka là hoàng hậu trong vương quốc café. Hạt moka lớn và đẹp hơn nhiều so với giống khác. Hương thơm của nó rất đặc biệt. Sang trọng, ngây ngất, vị hơi chua một cách thanh thoát, dành cho người sành điệu.\n" +
                "\n"));
        return v;
    }
}