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
                "Cherry g???m c?? 2 gi???ng ch??nh l?? Liberica v?? Exelsa. Lo???i n??y kh??ng ???????c ph??? bi???n, nh??ng ????y l?? lo???i c?? kh??? n??ng ch???ng ch???u s??u b???nh r???t t???t v?? n??ng su???t r???t cao. ???????c tr???ng ??? nh???ng v??ng ?????t kh?? ?????y gi?? v?? n???ng c???a v??ng cao nguy??n.\n" +
                "\n" +
                "Cherry c?? m???t ?????c ??i???m v?? h????ng v??? r???t kh??c l???. H???t c?? ph?? v??ng, s??ng b??ng r???t ?????p. Khi pha t???o ra m??i th??m thoang tho???ng, ?????c bi???t l?? v??? chua c???a cherry t???o ra m???t c???m gi??c th???t s???ng kho??i. Cherry r???t th??ch h???p v???i s??? th??ch c???a ph??i n??? v???i s??? h??a quy???n gi???a m??i v?? v??? t???o ra m???t c???m gi??c d??n d??, cao sang qu?? ph??i h??a quy???n nhau th??t s??u s???c."));
        return v;
    }
}