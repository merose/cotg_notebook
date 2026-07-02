package com.codeonthego.notebook.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

public class GalleryFragment extends Fragment {

//    private FragmentGalleryBinding binding;
    private LinearLayout view;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

//        binding = FragmentGalleryBinding.inflate(inflater, container, false);
//        View root = binding.getRoot();
//
//        final TextView textView = binding.textGallery;
//        galleryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
//        return root;

        view = new LinearLayout(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        view.setOrientation(LinearLayout.LayoutParams.VERTICAL);

        var editText = new EditText(getContext());
        editText.setText("hello, world", TextView.BufferType.EDITABLE);
        view.addView(editText);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
//        binding = null;
    }
}