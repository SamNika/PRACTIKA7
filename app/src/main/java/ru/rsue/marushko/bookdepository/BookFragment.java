package ru.rsue.marushko.bookdepository;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.view.ViewGroup;

public class BookFragment extends Fragment {
    private Book mBook;
    private EditText mTitleField;
    private ViewGroup parent;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_book, parent, false);
        mTitleField = (EditText)v.findViewById(R.id.book_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(
                    CharSequence s, int start, int count, int after) {
// Здесь намеренно оставлено пустое место
            }
            @Override
            public void onTextChanged(
                    CharSequence s, int start, int before, int count) {
                mBook.setTitle(s.toString());
            }
            @Override
            public void afterTextChanged(Editable c) {
// И здесь тоже
            }
        });
        return v;
    }
}